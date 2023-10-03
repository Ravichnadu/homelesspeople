package com.marolix.homeless.service;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marolix.homeless.dto.FuctionDto;
import com.marolix.homeless.entity.FuctionEntity;
import com.marolix.homeless.reposistry.FuctionReposistry;
import com.marolix.homeless.serviceint.FuctionServiceIn;

@Service
@Transactional
public class FuctionService implements FuctionServiceIn {

	@Autowired
	private FuctionReposistry fuctionReposistry;
	
	@Override 
	public List<FuctionDto> getAllFuction() {
		List<FuctionEntity> list=fuctionReposistry.findAll();
		return list.stream().map(fuctionEntity ->new FuctionDto(fuctionEntity.getId(),fuctionEntity.getLandmark(),fuctionEntity.getTime(),fuctionEntity.getTown(),fuctionEntity.getCreatedAt())).collect(Collectors.toList());
	}

	@Override
	public FuctionDto getById(int id) {
		FuctionEntity fuctionEntity= fuctionReposistry.getById(id);
		FuctionDto dto=new FuctionDto(fuctionEntity.getId(),fuctionEntity.getLandmark(),fuctionEntity.getTime(), fuctionEntity.getTown(),fuctionEntity.getCreatedAt());
		return dto;
	}

	@Override
	public FuctionDto saveAll(FuctionDto dto) {
		FuctionEntity fuctionEntity=new FuctionEntity();
		fuctionEntity.setId(dto.getId());
		fuctionEntity.setTime(dto.getTime());
		fuctionEntity.setTown(dto.getTown());
		fuctionEntity.setLandmark(dto.getLandmark());
		fuctionReposistry.save(fuctionEntity);
		return dto;
	}

	@Override
	public FuctionDto updateById(int id) {
		FuctionEntity fuctionEntity=new FuctionEntity();
		FuctionDto dto=new FuctionDto();
		
		fuctionEntity.setId(dto.getId());
		fuctionEntity.setTime(dto.getTime());
		fuctionEntity.setTown(dto.getTown());
		fuctionEntity.setLandmark(dto.getLandmark());
		fuctionReposistry.save(fuctionEntity);
		return dto;
	}

	@Scheduled(fixedRate = 60000)
	public void deleteById() {
		LocalDateTime cutoff =LocalDateTime.now().minusMinutes(1);
		
		fuctionReposistry.deleteByCreatedAtBefore(cutoff);
		
	}

	
	

	

	

}

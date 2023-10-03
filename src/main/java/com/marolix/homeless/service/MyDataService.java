package com.marolix.homeless.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marolix.homeless.dto.MyDataDto;
import com.marolix.homeless.entity.MyData;
import com.marolix.homeless.reposistry.MyDataReposistry;

@Transactional
public class MyDataService {

	@Autowired
	private MyDataReposistry dataReposistry;
	
	
	public MyDataDto saveAll(MyDataDto dto)
	{
		MyData  data=new MyData();
		
		data.setId(dto.getId());
		data.setName(dto.getName());
		data.setNum(dto.getNum());
		
		dataReposistry.save(data);
		return dto;
	}
	
	 @Scheduled(fixedRate = 60000) 
    public void deleteOldData() {
        LocalDateTime tenMinutesAgo = LocalDateTime.now().minusMinutes(1);
        dataReposistry.deleteBycreatedATBefore(tenMinutesAgo);
    }
	
	
}

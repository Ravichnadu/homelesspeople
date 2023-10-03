package com.marolix.homeless.reposistry;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marolix.homeless.entity.FuctionEntity;

public interface FuctionReposistry extends JpaRepository<FuctionEntity, Integer>{
	
	void deleteByCreatedAtBefore(LocalDateTime cutoff);

}

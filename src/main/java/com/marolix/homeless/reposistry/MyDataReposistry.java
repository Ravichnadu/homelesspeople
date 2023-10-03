package com.marolix.homeless.reposistry;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marolix.homeless.entity.MyData;

public interface MyDataReposistry  extends JpaRepository<MyData, Integer>{
	
	 void deleteBycreatedATBefore(LocalDateTime createdAt);

}

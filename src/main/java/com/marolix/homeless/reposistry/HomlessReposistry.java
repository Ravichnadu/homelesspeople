package com.marolix.homeless.reposistry;

import java.time.LocalDateTime;


import org.springframework.data.jpa.repository.JpaRepository;

import com.marolix.homeless.entity.HomelessEntity;

public interface HomlessReposistry  extends JpaRepository<HomelessEntity, Integer>{
	

}

package com.marolix.homeless.reposistry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marolix.homeless.entity.OrphanEntity;

public interface OrphanReposistry extends JpaRepository<OrphanEntity, Integer>{

}

package com.restapi.netflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.netflix.models.*;
public interface NetflixRepositiry extends JpaRepository<Netflix, Long>{

}

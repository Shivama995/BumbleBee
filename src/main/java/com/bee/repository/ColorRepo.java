package com.bee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bee.model.Color;

public interface ColorRepo extends JpaRepository<Color,Integer> {

}

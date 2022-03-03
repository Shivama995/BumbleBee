package com.bee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bee.model.Items;

public interface ItemsRepo extends JpaRepository<Items,Integer> {

}

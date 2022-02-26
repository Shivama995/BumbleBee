package com.bee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bee.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users,String>{
}

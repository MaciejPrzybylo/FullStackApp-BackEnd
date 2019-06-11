package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Task;
import com.boot.model.User;

public interface UserRepo extends JpaRepository <User, Integer> {

}

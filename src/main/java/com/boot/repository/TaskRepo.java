package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.boot.model.Task;

public interface TaskRepo extends JpaRepository<Task, Integer>{

}

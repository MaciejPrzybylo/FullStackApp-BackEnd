package com.boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.boot.model.Task;
import com.boot.repository.TaskRepo;

@RestController
@RequestMapping("api/v3/")
public class TaskController {
	@Autowired
	private TaskRepo taskRepo;
	
	@RequestMapping(value = "tasks", method = RequestMethod.GET)
    public List<Task> list(){
        return taskRepo.findAll();
    }
	
	@RequestMapping(value = "tasks", method = RequestMethod.POST)
    public Task create(@RequestBody Task task){
        return taskRepo.saveAndFlush(task);
    }

	@RequestMapping(value = "tasks/{id}", method = RequestMethod.GET)
    public Task get(@PathVariable Integer id){
        return taskRepo.findOne(id);
    }

	@RequestMapping(value = "tasks/{tid}", method = RequestMethod.PUT)
    public Task update(@PathVariable Integer tid, @RequestBody Task task){
        Task exisitngTask = taskRepo.findOne(tid);
        BeanUtils.copyProperties(task, exisitngTask);
        return taskRepo.saveAndFlush(task);
    }

	
	@RequestMapping(value = "tasks/{tid}", method = RequestMethod.DELETE)
    public Task delete(@PathVariable Integer tid){
        Task exisitngTask = taskRepo.findOne(tid);
        taskRepo.delete(exisitngTask);
        return exisitngTask;
    }

}

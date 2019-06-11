package com.boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.User;
import com.boot.repository.UserRepo;

@RestController
@RequestMapping("api/v2/")
public class UserController {

		@Autowired
		private UserRepo userRepo;
		
		@RequestMapping(value = "user", method = RequestMethod.GET)
	    public List<User> list(){
	        return userRepo.findAll();
	    }
		
		@RequestMapping(value = "user", method = RequestMethod.POST)
	    public User create(@RequestBody User task){
	        return userRepo.saveAndFlush(task);
	    }

		@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	    public User get(@PathVariable Integer id){
	        return userRepo.findOne(id);
	    }

		@RequestMapping(value = "user/{id}", method = RequestMethod.PUT)
	    public User update(@PathVariable Integer id, @RequestBody User task){
	        User exisitngUser = userRepo.findOne(id);
	        BeanUtils.copyProperties(task, exisitngUser);
	        return userRepo.saveAndFlush(task);
	    }

		
		@RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
	    public User delete(@PathVariable Integer id){
	        User exisitngUser = userRepo.findOne(id);
	        userRepo.delete(exisitngUser);
	        return exisitngUser;
	    }
}

package com.example.sample.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.Repository.repository;
import com.example.sample.Table.employee;

@RestController
public class controller {
	@Autowired
	repository r;
	@PostMapping("/post")
	public employee addDetails(@RequestBody employee e) {
		return r.save(e);
	}
	@GetMapping("/get")
	public List<employee> getDetails(){
		return r.findAll();
	}
	@GetMapping("/get/{id}")
	public Optional<employee> getDetailsById(@PathVariable int id){
		return r.findById(id);
	}
}

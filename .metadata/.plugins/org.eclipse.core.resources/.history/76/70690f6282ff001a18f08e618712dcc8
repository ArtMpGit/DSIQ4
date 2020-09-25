package com.si.dsi.questao4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.si.dsi.questao4.entity.Staff;
import com.si.dsi.questao4.service.StaffService;


@Controller
@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	private StaffService service;
	
	@GetMapping
	public ResponseEntity<List<Staff>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Staff> getById(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<Staff> add(@RequestBody Staff care) {
		return new ResponseEntity<Staff>(service.add(care), HttpStatus.CREATED);
	}

}

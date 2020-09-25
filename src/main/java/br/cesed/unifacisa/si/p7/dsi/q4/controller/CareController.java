package br.cesed.unifacisa.si.p7.dsi.q4.controller;

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

import br.cesed.unifacisa.si.p7.dsi.q4.entity.Care;
import br.cesed.unifacisa.si.p7.dsi.q4.service.CareService;

@Controller
@RequestMapping("/care")
public class CareController {

	@Autowired
	private CareService service;
	
	@GetMapping
	public ResponseEntity<List<Care>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Care> getById(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<Care> add(@RequestBody Care care) {
		return new ResponseEntity<Care>(service.add(care), HttpStatus.CREATED);
	}
}

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

import br.cesed.unifacisa.si.p7.dsi.q4.entity.StaffTypes;
import br.cesed.unifacisa.si.p7.dsi.q4.service.StaffTypesService;

@Controller
@RequestMapping("/supported-people")
public class SupportedPeopleController {
	
	@Autowired
	private StaffTypesService service;
	
	@GetMapping
	public ResponseEntity<List<StaffTypes>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StaffTypes> getById(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<StaffTypes> add(@RequestBody StaffTypes care) {
		return new ResponseEntity<StaffTypes>(service.add(care), HttpStatus.CREATED);
	}


}

package com.si.dsi.questao4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.si.dsi.questao4.entity.StaffTypes;
import com.si.dsi.questao4.respository.StaffTypesRepository;


public class StaffTypesService {
	
	@Autowired
	private StaffTypesRepository repository;
	
	public List<StaffTypes> getAll() {
		return repository.findAll();
	}
	
	public StaffTypes getById(Integer id) {
		Optional<StaffTypes> staff = repository.findById(id);
		
		if (staff.isPresent()) {
			return staff.get();
		}
		return new StaffTypes();
	}
	
	public StaffTypes add(StaffTypes staff) {
		return repository.save(staff);
	}

}

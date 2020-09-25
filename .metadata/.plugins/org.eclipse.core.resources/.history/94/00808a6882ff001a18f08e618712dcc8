package com.si.dsi.questao4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dsi.questao4.entity.Staff;
import com.si.dsi.questao4.respository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository repository;
	
	public List<Staff> getAll() {
		return repository.findAll();
	}
	
	public Staff getById(Integer id) {
		Optional<Staff> staff = repository.findById(id);
		
		if (staff.isPresent()) {
			return staff.get();
		}
		return new Staff();
	}
	
	public Staff add(Staff staff) {
		return repository.save(staff);
	}

}

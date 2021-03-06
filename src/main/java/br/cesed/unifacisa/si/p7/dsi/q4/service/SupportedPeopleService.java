package br.cesed.unifacisa.si.p7.dsi.q4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.unifacisa.si.p7.dsi.q4.entity.SupportedPeople;
import br.cesed.unifacisa.si.p7.dsi.q4.respository.SupportedPeopleRepository;

@Service
public class SupportedPeopleService {
	
	@Autowired
	private SupportedPeopleRepository repository;
	
	public List<SupportedPeople> getAll() {
		return repository.findAll();
	}
	
	public SupportedPeople getById(Integer id) {
		Optional<SupportedPeople> staff = repository.findById(id);
		
		if (staff.isPresent()) {
			return staff.get();
		}
		return new SupportedPeople();
	}
	
	public SupportedPeople add(SupportedPeople staff) {
		return repository.save(staff);
	}

}

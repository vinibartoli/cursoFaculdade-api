package com.bartoli.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartoli.domain.Faculdade;
import com.bartoli.repository.FaculdadeRepository;

@Service
public class FaculdadeService {

	
	@Autowired
	private FaculdadeRepository repo;
	
	public List<Faculdade> getAll() {
		List<Faculdade> list = repo.getAll();
		return list;
	}

	public Faculdade findByID(Integer id) {
		Faculdade obj = repo.getByID(id);
		return obj;
	}
	
	public Faculdade create(Faculdade obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer idFaculdade) {
		repo.deleteById(idFaculdade);
	}

	public Faculdade update(Faculdade obj) {
		Faculdade updatedobj = findByID(obj.getId());
		BeanUtils.copyProperties(obj, updatedobj, "id");
		return repo.save(updatedobj);
	}
	
}

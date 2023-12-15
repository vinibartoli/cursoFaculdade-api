package com.bartoli.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartoli.domain.Matricula;
import com.bartoli.repository.MatriculaRepository;

@Service
public class MatriculaService {

	@Autowired
	private MatriculaRepository repo;
	
	public List<Matricula> getAll() {
		List<Matricula> list = repo.getAll();
		return list;
	}

	public Matricula findByID(Integer id) {
		Matricula obj = repo.getByID(id);
		return obj;
	}
	
	public Matricula create(Matricula obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer idMatricula) {
		repo.deleteById(idMatricula);
	}

	public Matricula update(Matricula obj) {
		Matricula updatedobj = findByID(obj.getId());
		BeanUtils.copyProperties(obj, updatedobj, "id");
		return repo.save(updatedobj);
	}
	
}

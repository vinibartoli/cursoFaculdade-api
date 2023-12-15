package com.bartoli.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartoli.domain.Curso;
import com.bartoli.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository repo;
	
	public List<Curso> getAll() {
		List<Curso> list = repo.getAll();
		return list;
	}

	public Curso findByID(Integer id) {
		Curso obj = repo.getByID(id);
		return obj;
	}
	
	public Curso create(Curso obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public Curso update(Curso obj) {
		Curso updatedobj = findByID(obj.getId());
		BeanUtils.copyProperties(obj, updatedobj, "id");
		return repo.save(updatedobj);
	}
	
}

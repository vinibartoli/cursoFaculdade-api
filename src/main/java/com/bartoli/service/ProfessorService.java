package com.bartoli.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartoli.domain.Professor;
import com.bartoli.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository repo;
	
	public List<Professor> getAll() {
		List<Professor> list = repo.getAll();
		return list;
	}

	public Professor findByID(Integer id) {
		Professor obj = repo.getByID(id);
		return obj;
	}
	
	public Professor create(Professor obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer idProfessor) {
		repo.deleteById(idProfessor);
	}

	public Professor update(Professor obj) {
		Professor updatedobj = findByID(obj.getId());
		BeanUtils.copyProperties(obj, updatedobj, "id");
		return repo.save(updatedobj);
	}
	
}

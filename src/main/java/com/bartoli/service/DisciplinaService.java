package com.bartoli.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartoli.domain.Disciplina;
import com.bartoli.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaRepository repo;
	
	public List<Disciplina> getAll() {
		List<Disciplina> list = repo.getAll();
		return list;
	}

	public Disciplina findByID(Integer id) {
		Disciplina obj = repo.getByID(id);
		return obj;
	}
	
	public Disciplina create(Disciplina obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer idDisciplina) {
		repo.deleteById(idDisciplina);
	}

	public Disciplina update(Disciplina obj) {
		Disciplina updatedobj = findByID(obj.getId());
		BeanUtils.copyProperties(obj, updatedobj, "id");
		return repo.save(updatedobj);
	}
	
}

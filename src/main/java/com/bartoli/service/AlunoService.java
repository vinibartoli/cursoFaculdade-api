package com.bartoli.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartoli.domain.Aluno;
import com.bartoli.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repo;
	
	public List<Aluno> getAll() {
		List<Aluno> list = repo.getAll();
		return list;
	}

	public Aluno findByID(Integer id) {
		Aluno obj = repo.getByID(id);
		return obj;
	}
	
	public Aluno create(Aluno obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public Aluno update(Aluno obj) {
		Aluno updatedobj = findByID(obj.getId());
		BeanUtils.copyProperties(obj, updatedobj, "id");
		return repo.save(updatedobj);
	}
}






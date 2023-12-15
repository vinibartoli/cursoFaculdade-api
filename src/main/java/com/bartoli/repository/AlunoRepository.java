package com.bartoli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bartoli.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	
	@Query(value = "SELECT * FROM aluno", nativeQuery = true)
	List<Aluno> getAll();

	@Query(value = "SELECT * FROM aluno where id = ?", nativeQuery = true)
	Aluno getByID(Integer id);
	
	Aluno findByCpf(String cpf);
}

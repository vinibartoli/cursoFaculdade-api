package com.bartoli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bartoli.domain.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
	
	@Query(value = "SELECT * FROM disciplina", nativeQuery = true)
	List<Disciplina> getAll();

	@Query(value = "SELECT * FROM disciplina where id = ?", nativeQuery = true)
	Disciplina getByID(Integer id);
}

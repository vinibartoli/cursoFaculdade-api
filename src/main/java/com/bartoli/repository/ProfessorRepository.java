package com.bartoli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bartoli.domain.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
	
	@Query(value = "SELECT * FROM professor", nativeQuery = true)
	List<Professor> getAll();

	@Query(value = "SELECT * FROM professor where id = ?", nativeQuery = true)
	Professor getByID(Integer id);
}
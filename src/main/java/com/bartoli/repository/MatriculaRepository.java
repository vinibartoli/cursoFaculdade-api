package com.bartoli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bartoli.domain.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
	
	@Query(value = "SELECT * FROM matricula", nativeQuery = true)
	List<Matricula> getAll();

	@Query(value = "SELECT * FROM matricula where id = ?", nativeQuery = true)
	Matricula getByID(Integer id);
}
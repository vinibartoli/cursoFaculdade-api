package com.bartoli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bartoli.domain.Faculdade;

@Repository
public interface FaculdadeRepository extends JpaRepository<Faculdade, Integer> {
	
	@Query(value = "SELECT * FROM faculdade", nativeQuery = true)
	List<Faculdade> getAll();

	@Query(value = "SELECT * FROM faculdade where id = ?", nativeQuery = true)
	Faculdade getByID(Integer id);
}

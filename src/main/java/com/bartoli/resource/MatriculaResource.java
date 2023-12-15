package com.bartoli.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bartoli.domain.Matricula;
import com.bartoli.service.MatriculaService;

@RestController
@RequestMapping(value = "/matriculas")
public class MatriculaResource {

	@Autowired
	private MatriculaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getAll() {
		List<Matricula> list = service.getAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findByID(@PathVariable Integer id) {
		Matricula obj = service.findByID(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Matricula obj) {
		Matricula createdobj = service.create(obj);
		return ResponseEntity.created(null).body(createdobj);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable Integer id ,@RequestBody Matricula obj) {
		obj.setId(id);
		Matricula updatedObj = service.update(obj);
		return ResponseEntity.ok().body(updatedObj);
	}
	
}

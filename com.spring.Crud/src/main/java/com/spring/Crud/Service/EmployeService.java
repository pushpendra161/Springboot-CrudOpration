package com.spring.Crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Crud.Entity.Employe;
import com.spring.Crud.Repositry.EmployeRepositry;

@Service
public class EmployeService {

	@Autowired
	private EmployeRepositry emprepo;
	
	public void SaveEmploye(Employe employe) {
		emprepo.save(employe);
	}

	public List<Employe> listAll() {
		// TODO Auto-generated method stub
		List<Employe> findAll = emprepo.findAll();
		return findAll ;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		emprepo.deleteById(id);
	}

	public String UpdateEmploye(Long id) {
		Optional<Employe> findById = 
				emprepo.findById(id);
		Employe employe = findById.get();
		Employe save = emprepo.save(employe);
		return "save";
		
	   }
	
}

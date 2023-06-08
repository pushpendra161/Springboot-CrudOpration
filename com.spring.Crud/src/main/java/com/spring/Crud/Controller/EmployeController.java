package com.spring.Crud.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Crud.Dao.EmployeDao;
import com.spring.Crud.Entity.Employe;
import com.spring.Crud.Service.EmployeService;

@RestController
//@RequestMapping(value="/homeshow")
public class EmployeController {
	
	@Autowired
	private EmployeService empservice;
	
	@PostMapping(value="/saveEmp")
	public void save(@RequestBody Employe emplye) {
		empservice.SaveEmploye(emplye);
	}
//	public void add(@RequestBody Product product) {
//	    service.save(product);
//	}
//	
	@GetMapping("/getemp")
	public List<Employe> listEmp() {
	    return empservice.listAll();
	}
	
	@DeleteMapping("/Employe/{id}")
	public void delete(@PathVariable Long id) {
	    empservice.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public String UpdateEmp(@PathVariable Long id,@RequestBody Employe employe) {
		EmployeDao empdao = new EmployeDao();
		
		empdao.setId(employe.getId());
		empdao.setName(employe.getName());
		empdao.setCityName(employe.getCityName());
		
		String updateEmploye = empservice.UpdateEmploye(id);
		empservice.SaveEmploye(employe);
		return "updateEmploye";
	}
		
		
}

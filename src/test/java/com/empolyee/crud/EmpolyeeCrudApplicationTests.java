package com.empolyee.crud;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.empolyee.crud.entities.Empolyee;
import com.empolyee.crud.repostories.EmpolyeeRepository;

@SpringBootTest
class EmpolyeeCrudApplicationTests {
	@Autowired
private EmpolyeeRepository empolyeeRepo;
	/*@Test
	void saveEmpolyeeInfo() {
		Empolyee e=new Empolyee();
		e.setCourse("java");
		e.setName("zain");
		e.setFee(2000);
		e.setId(1);
		empolyeeRepo.save(e);
		
		
	}*/
	@Test
	void getEmpolyeeInfo() {
		
		Optional<Empolyee> findById = empolyeeRepo.findById(1L);
		Empolyee empolyee = findById.get();
		System.out.println(empolyee.getCourse());
		System.out.println(empolyee.getName());
		System.out.println(empolyee.getFee());
		System.out.println(empolyee.getId());
		
		
	}

}

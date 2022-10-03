package tn.esponline;


//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esponline.entities.Gender;
import tn.esponline.entities.Personne;
import tn.esponline.services.IPersonneServices;
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class PersonneServicesTest {
//	
//	@Autowired
//	IPersonneServices perservices;
//
//	@Test
//	public void testaddPersonne() throws ParseException {
//		
//		SimpleDateFormat df= new SimpleDateFormat("dd/mm/yyyy");
//		Date date= df.parse("21/05/1975");
//		
//		Personne personen= new Personne("Ali", date, Gender.Homme);
//		int i = perservices.getPersonnes().size();
//		perservices.addPersonne(personen);
//		assertEquals(i+1, perservices.getPersonnes().size());
////		
////		assertNull(perservices.addPersonne(personen).getNom());
//		
//		assertEquals(4, perservices.getPersonnes().size());
//		
//		
//	}

}

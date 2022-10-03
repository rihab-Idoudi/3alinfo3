package tn.esponline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;
import tn.esponline.entities.Etudiant;
import tn.esponline.entities.Gender;
import tn.esponline.entities.Personne;
import tn.esponline.services.IPersonneServices;
import tn.esponline.services.PersonneServices;
@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootApplication
public class TestApplication {
	@Autowired
	IPersonneServices services;
	Personne etudiant = new Personne();
	@Test
	@Order(0)
	public void ajouterEtudiant() {
		etudiant.setNom("Ahmed");
		etudiant = services.addPersonne(etudiant);
		log.info("---"+ etudiant.getNom());
		Assertions.assertNotNull(etudiant.getId());
			}
	
	@Test
	@Order(1)
	public void modifierEtudiant() {
		etudiant.setGender(Gender.Homme);
		etudiant = services.addPersonne(etudiant);
		log.info("---"+ etudiant.getNom());
		Assertions.assertEquals(etudiant.getGender().toString(), "Homme");
			}
	
	@Test
	@Order(2)
	public void compter()
	{
		long taille=(long)(services.getPersonnes().size());
		Assertions.assertNotEquals(taille, 0);
	}

}

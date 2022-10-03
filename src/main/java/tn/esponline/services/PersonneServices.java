package tn.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esponline.entities.Gender;
import tn.esponline.entities.Personne;
import tn.esponline.repository.IPersonneRepository;

@Service
public class PersonneServices implements IPersonneServices {
	
	@Autowired
	IPersonneRepository persrep;

	@Override
	public Personne addPersonne(Personne p) {
		// TODO Auto-generated method stub
		return persrep.save(p);
	}

	@Override
	public Personne getPersonne(String nom, int age, Gender gender) {
		// TODO Auto-generated method stub
		return persrep.findByNomAndAgeAndGender(nom, age, gender);
	}

	@Override
	public List<Personne> getPersonnes() {
		// TODO Auto-generated method stub
		return (List<Personne>) persrep.findAll();
	}

	@Override
	public void deletePersonne(int idp) {
		// TODO Auto-generated method stub
		 persrep.deleteById(idp);
	}

	@Override
	public Personne getPersonne(int idp) {
		// TODO Auto-generated method stub
		return persrep.findById(idp).orElse(null);
	}

}

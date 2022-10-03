package tn.esponline.services;

import java.util.List;

import tn.esponline.entities.Gender;
import tn.esponline.entities.Personne;

public interface IPersonneServices {
	
	
	public Personne addPersonne(Personne p);
	public Personne getPersonne(String nom,int age, Gender gender);
	public List<Personne> getPersonnes();
	public void deletePersonne (int idp);
	public Personne getPersonne(int idp);

}

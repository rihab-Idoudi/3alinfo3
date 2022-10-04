package tn.esponline.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Competence implements Serializable{
	@Id
	private int id;
	//un commentaire
	private String adresse;
	@ManyToMany(mappedBy = "competences")
	private List<Personne> lpersonnes;
	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

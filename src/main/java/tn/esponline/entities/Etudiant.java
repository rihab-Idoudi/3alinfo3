package tn.esponline.entities;

import javax.persistence.Entity;

@Entity
public class Etudiant extends Personne{
	
	private int numinscri;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNuminscri() {
		return numinscri;
	}

	public void setNuminscri(int numinscri) {
		this.numinscri = numinscri;
	}
	
	

}

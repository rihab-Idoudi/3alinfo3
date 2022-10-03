package tn.esponline.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "t_personne")
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name = "name")
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateofbirth;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private int age;
	@OneToOne
	private Contact contact;
	@ManyToMany
	private List<Competence> competences;
	@ManyToOne
	private Laboratoire labo;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}

	public Laboratoire getLabo() {
		return labo;
	}

	public void setLabo(Laboratoire labo) {
		this.labo = labo;
	}

	public Personne(String nom, Date dateofbirth, Gender gender) {
		super();
		this.nom = nom;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
	}
	

}

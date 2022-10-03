package tn.esponline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esponline.entities.Gender;
import tn.esponline.entities.Personne;

@Repository
public interface IPersonneRepository extends CrudRepository<Personne, Integer>{

	@Query("select p from Personne p where p.nom=?1 and p.gender=?2")
	public Personne getPersonne(String nom, Gender gender);
	
	public Personne findByNomAndAgeAndGender (String nom,int age, Gender gender );
	public List<Personne> findByAgeGreaterThan(int ageseuil);
}

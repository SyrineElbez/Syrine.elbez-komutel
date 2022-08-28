package com.syrine.komutel.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="contacts")
public class Contact implements Serializable
{	 private static final long serialVersionUID=-4572455422805600366L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	@Column(length=20)
	private  String Nom ;
	@Column(length=20)
	private  String Ville ;
@Column(length = 50)
private String Adresse;
	@Column(length=20)
	private  String Pays ;
	@Column(length=20)
	private  String Telephone ;
	@Column(length=20)
	private  String Poste ;
	@Column(length=20)
	private String Date;
	
	
	
	
	
	
	
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public String getPays() {
		return Pays;
	}
	public void setPays(String pays) {
		Pays = pays;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getPoste() {
		return Poste;
	}
	public void setPoste(String poste) {
		Poste = poste;
	}
	public Contact( String nom, String ville, String adresse, String pays, String telephone, String poste,
			String date) {
		super();
		
		Nom = nom;
		Ville = ville;
		Adresse = adresse;
		Pays = pays;
		Telephone = telephone;
		Poste = poste;
		Date = date;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

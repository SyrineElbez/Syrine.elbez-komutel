package com.syrine.komutel.dto;




public class ContactRequest  {
	
	private  String Nom ;
	
	private  String Adresse ;
	
	private  String Ville ;
	
	private  String Pays ;
	
	private  String Telephone ;
	
	private  String Poste ;
	
	private String Date ;
	
	

	

	public ContactRequest(String nom, String adresse, String ville, String pays, String telephone, String poste,
			String date) {
		super();
		Nom = nom;
		Adresse = adresse;
		Ville = ville;
		Pays = pays;
		Telephone = telephone;
		Poste = poste;
		Date = date;
	}

	

	public String getDate() {
		return Date;
	}



	public void setDate(String date) {
		Date = date;
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
	
	

}

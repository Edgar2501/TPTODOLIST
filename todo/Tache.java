package todo;

public class Tache {
	
	//Déclarations des attributs
	
	private String nom;
	private String description;
	private String etat;
	private String histoVers;
	
	
	//Creation du constructeur
	
	public Tache(String nom, String description,String etat, String histoVers) {
		
		this.nom= nom;
		this.description= description;
	    this.etat= etat;
		this.histoVers= histoVers;
	}
	
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getHistoVers() {
		return histoVers;
	}


	public void setHistoVers(String histoVers) {
		this.histoVers = histoVers;
	}


}

package fr.eni.bo;

import java.util.List;

public class Utilisateur {

	//****Variables	
	int noUtilisateur;
	String pseudo;
	String nom;
	String prenom;
	String email;
	int telephone;
	String rue;
	int codePostal;
	String ville;
	String motDePasse;
	float credit;
	boolean isAdmin;
	
	
	//****Association****
	List<ArticleVendu> articleVendus;
	List<Enchere> encheres;
	

	// Constructeurs, getters et setters
	    
	public List<ArticleVendu> getArticlesVendus() {
	        return articleVendus;
	    }

	public void setArticlesVendus(List<ArticleVendu> articlesVendus) {
	        this.articleVendus = articlesVendus;
	    }


	//****Constructeur par défaut 
	public Utilisateur() {
		super();
	}

	//****Constructeurs****
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone,
			String rue, int codePostal, String ville, String motDePasse, float credit, boolean isAdmin) {
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.isAdmin = isAdmin;
	}
	
	
	//****Constructeur sans ID
	public Utilisateur(String pseudo, String nom, String prenom, String email, int telephone, String rue,
			int codePostal, String ville, String motDePasse, float credit, boolean isAdmin,
			List<ArticleVendu> articleVendus, List<Enchere> encheres) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.isAdmin = isAdmin;
		this.articleVendus = articleVendus;
		this.encheres = encheres;
	}

	//Constructeur avec articleVendus 
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone,
			String rue, int codePostal, String ville, String motDePasse, float credit, boolean isAdmin,
			List<ArticleVendu> articlesVendus) {
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.isAdmin = isAdmin;
		this.articleVendus = articlesVendus;
	}

	//****Getters et setters****
	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public List<ArticleVendu> getArticleVendus() {
		return articleVendus;
	}

	public void setArticleVendus(List<ArticleVendu> articleVendus) {
		this.articleVendus = articleVendus;
	}

	public List<Enchere> getEncheres() {
		return encheres;
	}

	public void setEncheres(List<Enchere> encheres) {
		this.encheres = encheres;
	}
	
	
	
	
	
	
}

package com.doul.beans;

public class Utilisateur1 {
	
	private String nom;
	private String prenom;
	private String pseudo;
	private String email;
	private String pass;
	
	public Utilisateur1(String nom, String prenom, String pseudo, String email, String pass, String pass1) {
		this.nom=nom;
		this.prenom=prenom;
		this.pseudo=pseudo;
		this.email=email;
		this.pass=pass;
	}
	public void Utilisateur(String nom2, String prenom2, String pseudo2, String email2, String pass2, String pass1) {
		// TODO Auto-generated constructor stub
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
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}

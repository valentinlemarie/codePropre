package ex1;

import java.util.Date;

public class Entreprise {

	public int Siret;
	public String Nom;
	public String adresse;
	public Date date_Creation;
	
	public static final int capitalMax = 3000000;
	
	/*
	 * affiche le status de l'Objet entreprise
	 */
	public void Statut(){
		System.out.println(this.toString());
	}
	
}

package ex3;

import java.util.List;

public class SavaneAfricaine {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	/**
	 * Ajoute un Animal a l'objet SavanneAffricaine
	 * @param typeAnimal 
	 * 		espece de l'animal
	 * @param nomAnimal
	 * 		le nom donne a l'animal
	 * @param comportement
	 * 		le comportement observer de l'animal
	 */
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}

	/**
	 * Afficher le nom des animaux present dans la savane
	 */
	public void afficherListeNoms(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	/**
	 * Recupere le nombre animaux dans la savane
	 * @return un entier animaux
	 */
	public int compterAnimaux(){
		return noms.size();
	}
	
	/**
	 * Recuperer la nouriture mange par les animaux de la savane par jour
	 * @return les Kgs manges en entier
	 */
	public int calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}

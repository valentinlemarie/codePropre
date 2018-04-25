package ex3;

import java.util.List;

public class Aquarium {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	/**
	 * Ajoute un Animal a l'Aquarium
	 * @param typeAnimal
	 * 			l'espece de l'animal
	 * @param nomAnimal
	 * 			le nom de cet animal
	 * @param comportement
	 * 			le comportement observer de cet animal
	 */
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	/**
	 * affiche la liste des noms des animaux de l'Aquarium
	 */
	public void getListNomAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	/**
	 * recuperer la nouriture mange habituellement par les animaux de l'aquarium
	 * @return
	 * 		les Kgs manger par les animaux
	 */
	public double calculerKgsNourritureParJour(){
		return noms.size() * 0.2;
	}
}

package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;
	
	/**
	 * Construit un Objet CompteBancaire
	 * @param solde
	 * 				le sode / l'argent sur le compte
	 * @param decouvert
	 * 				le d�passement autoris� pour une solde n�gative
	 * @param type
	 * 				le nom du type de Compte cr�e
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 * 			Valeur a ajouter au solde de l'objet CompteBancaire
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Debite un montant au solde
	 * @param montant
	 * 			Valeur a enleve au solde de l'objet CompteBancaire
	 */
	public void debiterMontant(double montant){
		if (type.equals("CC")){
			if (this.solde - montant > decouvert){
				this.solde = solde - montant;
			}	
		}
		else if (type.equals("LA")){
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}	
		}
	}
	
	/**
	 * mise a jour de la solde pour prendre en compte la remuneration anunelle
	 */
	public void appliquerRemuAnnuelle(){
		if (type.equals("LA")){
			this.solde = solde + solde*tauxRemuneration/100;
		}
	}
	
	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Recuperer la solde
	 * @return 
	 * 		la solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde
	 * 			la solde � definir
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** recuperer le decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert
	 * 		le decouvert � definir
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	/** Recuperer le tauxRemuneration
	 * @return le tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration 
	 * 			the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	/** Recuperer le type
	 * @return le type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type
	 * 		 le type � definir
	 */
	public void setType(String type) {
		this.type = type;
	}
}

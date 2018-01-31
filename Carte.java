import javax.swing.Icon;

/*
 * Repr�sente une carte � jouer.
 * 
 * Sp�cial : Contient l'image correspondante � afficher.
 * 
 * Auteur: Pierre B�lisle
 * Version : copyright H2018
 * R�vision : Fr�d�rick Simard et Simon Pichette 
 */
public class Carte {
	
	public int numero;  // Le num�ro de carte de Constantes.AS � Constantes.ROI.
	
	public Constantes.Sorte couleur;  // COEUR � PIQUE.
	
	public Icon image; // L'image de la carte � montrer.
	
	public boolean visible = true; // Vrai si la carte est tourn�e vers le haut.

	// DEBUG
	public String toString() {
		return numero + image.toString() + couleur.toString();
	}
}

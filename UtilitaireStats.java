import javax.swing.JOptionPane;


public class UtilitaireStats {

	public static void ajusterStatsNouvellePartie(Stats stats) {
		// TODO Auto-generated method stub
		
	}

	/*Affiche les stats de la partie courante
	 * 
	 * @param stats: les statitstiques de la partie courante
	 */
	public static void montrerStats(Stats stats) {
		/*
		 * 			Strategie:
		 * 
		 * Verifier les statistiques courantes en 
		 */
		
		
		JOptionPane.showMessageDialog(null, 
				"Statistiques\n " + "\nVotre plus grande sequence: " + stats.grandeSequence +
						"\nVotre nombre de reussites consecutives: " + stats.nbReussites +
						"\nNumero de l'essai actuel: " + stats.nbEssaieActuel + "\nVotre nombre d'essais total: " + stats.nbEssaiesTotal);
	}
	
	
	
	
}

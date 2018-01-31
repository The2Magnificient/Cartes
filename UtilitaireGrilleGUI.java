
public class UtilitaireGrilleGUI {

	
	/*Affiche les cartes du jeu
	*
	*@param cartesAffichees: 	les cartes du jeu a afficher et leur etat
	*@param gui: 				la grille graphique du display
	*/
	 
	public static void afficherCartes(Carte[] cartesAffichees, GrilleGui gui){
	/*
	 *			Strategie:
	 *
	 *On cree un boucle for pour les positions dans les colonnes, et une autre pour celles des rangees.
	 *On effectue ensuite une verification pour voir si la carte en question est visible ou non, determinant
	 *le cote que l'on voit
	 *
	 */
		int i;
		int j;
			
		for(i=0;i<4;i++){
			
			for(j=0;j<13;j++){
				
				if(cartesAffichees[13*i+j].visible==true){	//si la carte est visible
					
					gui.setImage(i,j,cartesAffichees[13*i+j].image);	//image de la carte visible
			
				}
				else{	//si la carte n'est pas visible
					
					gui.setImage(i,j,null);	//on voit l'endos de la carte
					
				}
			}
		}
	}
}
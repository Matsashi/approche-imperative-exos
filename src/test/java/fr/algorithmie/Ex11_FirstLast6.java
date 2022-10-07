package fr.algorithmie;


import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 *  
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="FirstLast6")
public class Ex11_FirstLast6 {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 6 };
	int[] tab4 = { 1, 6 };
	int[] tab5 = { 6, 2 };
	int[] tab6 = { 0, 6, 2 };

	/**
	 * Ne pas modifier les informations portées par l'annotation. AU TOTAL : 6
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Calculez une valeur booléenne qui contrôle le tableau de la sorte :
		//  o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		//  o elle vaut false dans les autres cas
		boolean tabLast6;
		int[][] arrayOfArray = {tab1, tab2, tab3, tab4, tab5, tab6};
		for (int i=0; i<=arrayOfArray.length-1; i++) {
			if((arrayOfArray[i].length>0) && ((arrayOfArray[i][arrayOfArray[i].length-1]==6) || (arrayOfArray[i][0]==6))) {
				tabLast6 = true;
			}else {
				tabLast6 = false;
			}
			Resultat.log(tabLast6);
		}


		// TODO LOGUEZ la valeur obtenue pour chacun des 6 tableaux tab1 à tab6

	}

}

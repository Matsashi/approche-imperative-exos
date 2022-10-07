package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="CalculMoyenne")
public class Ex08_CalculMoyenne {
	
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void calculMoyenne() {
		
		//TODO Calculez et LOGUEZ la moyenne des valeurs du tableau (la moyenne doit être une valeur décimale).
		double average = 0;
		for(int i=0; i<=array.length-1; i++) {
			average += array[i];
		}
		average = average/array.length;
		Resultat.log(average);
	}
	
	@Test
	@Question(numero=2)
	public void calculMoyenneValeursPositives() {
		System.out.println("Exercice2");
		//TODO Calculez et LOGUEZ la moyenne des valeurs POSITIVES du tableau
		double averagePositive = 0;
		int counter = 0;
		for(int i=0; i<=array.length-1; i++) {
			if(array[i]>=0) {
				averagePositive += array[i];
				counter++;
			}
		}
		averagePositive = averagePositive/counter;
		Resultat.log(averagePositive);
	}

}

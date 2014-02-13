/**
 * \file calculDate.java
 * \brief Programme pour Calculer une Date
 * \author Dean Winchester
 * \version 0.1
 * \date 13 Février 2014
 * javac calculDate.java
 */
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * \class calculDate 
 * \brief Objet chaîne de caractères du type "dd/MM/yyyy"
 * 
 * calculDate est une petite classe pour afficher la date, et ajouter un nombre
 * de jour défini.
 */
public class calculDate {

	public static void main(String args[]) {
		// Initialise la variable maDate de type Date
		Date maDate = null;
		// Crée une date avec le format dd/MM/yyyy
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		try {
			maDate = simpleDateFormat.parse(args[0]);
			System.out.println(simpleDateFormat.format(maDate));
			Date dateAjouter = ajouterJour(maDate, 1);
			System.out.println(simpleDateFormat.format(dateAjouter));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * \fn calculDate calculDate::ajouterJour() 
	 * \brief Ajoute un nombre de Jour a un calendrier 
	 * \return retourne la date ajouté
	 * 
	 * Retourne la nouvelle date
	 * 
	 */
	public static Date ajouterJour(Date date, int nbJour) {
		// Instance de la Classe Calendar
		Calendar cal = Calendar.getInstance();
		// On set la date du jour
		cal.setTime(date);
		// On ajoute le nombre de jour a notre objet
		cal.add(Calendar.DATE, nbJour);
		// On apelle geTime, qui nous retourne la nouvelle date
		return cal.geTime();
	}

}
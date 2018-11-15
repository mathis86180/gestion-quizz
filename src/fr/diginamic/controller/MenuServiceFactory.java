package fr.diginamic.controller;

import java.util.Scanner;

import fr.diginamic.exception.StockageException;
import fr.diginamic.interfaces.QuestionDAO;

public class MenuServiceFactory {
	
	static ListerQuestionsService listerQuestionService = new ListerQuestionsService();
	static AjouterQuestionService ajouterQuestionService = new AjouterQuestionService();
	static SupprimerQuestionService supprimerQuestionService = new SupprimerQuestionService(); 
	static ExecuterQuizzService executerQuizzService = new ExecuterQuizzService();
	
	public void choisirService(Scanner scanner, int choix, QuestionDAO dao) {
		switch (choix) {
		case 1:
			listerQuestionService.executeUC(scanner, dao);
			break;
		
		case 2:
			try {
				ajouterQuestionService.executeUC(scanner, dao);
			} catch (StockageException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			break;
		
		case 3:
			listerQuestionService.executeUC(scanner, dao);
			try {
				supprimerQuestionService.executeUC(scanner, dao);
			} catch (StockageException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			break;
		case 4:
			executerQuizzService.executeUC(scanner, dao);
			break;
		case 99:
			System.out.println("Au revoir!");
			System.exit(0);
			break;
		}
	}
	
	public void afficherMenu() {
		System.out.println("***** Quizz Administration *****");
	
		System.out.println("1. Lister les questions");
		System.out.println("2. Ajouter une question");
		System.out.println("3. Supprimer une question");
		System.out.println("4. Exécuter le quizz");
		System.out.println("99. Sortir");
	
}

}

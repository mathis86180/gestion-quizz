package fr.diginamic.console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.data.QuestionDAO;
import fr.diginamic.model.Question;

public class QuizzAdminConsoleApp {

	static List<Question> lq = QuestionDAO.lsterQuestions();;
	static Scanner questionUser = new Scanner(System.in);
	public static void main(String[] args) {
		int choix = 0;
		do {
			afficherMenu();
			choix = questionUser.nextInt();
		
		switch (choix) {
			case 1:
				int i = 1;
				for (Question question : lq) {
					System.out.println(i + ") " + question.getIntitule());
					i++;
				}
				break;
			
			case 2:
				Question q = new Question();
				System.out.println("Veuillez saisir l'intitulé de la question");
				questionUser = new Scanner(System.in) ;
				String intitule = questionUser.next();
				q.setIntitule(intitule);
				System.out.println("Veuillez saisir le nombre de réponses possibles");
				List<String> ls = new ArrayList<>();
				q.setPropositions(ls);
				questionUser = new Scanner(System.in) ;
				int nbReponses = questionUser.nextInt();
					for (int j = nbReponses; j > 0 ; j--) {
						int indexQ = 1;
						System.out.println("Veuillez écrire la réponse " + indexQ);
						questionUser = new Scanner(System.in) ;
						String reponse = questionUser.next();
						ls.add(reponse);
						indexQ++;
					}
				System.out.println("Veuillez saisir la bonne réponse");
				questionUser = new Scanner(System.in) ;
				String bonneReponse = questionUser.next();
				q.setBonneReponse(bonneReponse);
				lq.add(q);

				break;
			
			case 3:
			
				break;
			case 4:
			
				break;
			case 99:
			
				break;
			}
		}while(choix != 99);
		
	}
	
	static void afficherMenu() {
			System.out.println("***** Quizz Administration *****");
		
			System.out.println("1. Lister les questions");
			System.out.println("2. Ajouter une question");
			System.out.println("3. Supprimer une question");
			System.out.println("4. Exécuter le quizz");
			System.out.println("99. Sortir");
		
	}

}

package fr.diginamic.controller;

import java.util.Scanner;

import fr.diginamic.interfaces.QuestionDAO;
import fr.diginamic.model.Question;
import fr.diginamic.model.TypeQuestion;

public class ExecuterQuizzService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDAO dao) {
		boolean ok = false;
		int indexQuestion = 1;
		int score = 0;
		for (Question question : dao.findAll()) {
			System.out.println(question.getIntitule());
			for(String reponse : question.getPropositions()) {
				System.out.println(indexQuestion + " - " + reponse);
				indexQuestion++;
			}
			System.out.println("Veuillez écrire la réponse");
			scanner = new Scanner(System.in) ;
			String rep = scanner.next();
			ok = question.verifierReponse(rep);
			if(ok) {
				if(question.getType().equals(TypeQuestion.BONUS)) {
					score +=2;
				}else {
					score ++;
				}
				System.out.println("bonne réponse");
			}else {
				System.out.println("mauvaise réponse");
			}
		}
		System.out.println("Votre score est de " + score);
		
	}

}

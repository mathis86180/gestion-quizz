package fr.diginamic.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.exception.AjouterQuestionException;
import fr.diginamic.exception.StockageException;
import fr.diginamic.interfaces.QuestionDAO;
import fr.diginamic.model.Question;
import fr.diginamic.model.TypeQuestion;

public class AjouterQuestionService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDAO dao) throws StockageException {
		Question question = new Question();
		System.out.println("Veuillez saisir l'intitulé de la question");
		//scanner = new Scanner(System.in);
		String intitule = scanner.next();
		question.setIntitule(intitule);
		System.out.println("Veuillez saisir le nombre de réponses possibles");
		List<String> ls = new ArrayList<>();
		question.setPropositions(ls);
		int nbReponses = scanner.nextInt();
		if (nbReponses < 2){
			throw new AjouterQuestionException("Il faut plus de 2 réponses possibles !!");
		}
		int indexQuestion = 1;
			for (int j = nbReponses; j > 0 ; j--) {
				System.out.println("Veuillez écrire la réponse " + indexQuestion);
				String reponse = scanner.next();
				ls.add(reponse);
				indexQuestion++;
			}
		System.out.println("Veuillez saisir la bonne réponse");
		String bonneReponse = scanner.next();
		question.setBonneReponse(bonneReponse);
		System.out.println("Veuillez indiquer s'il sagit d'une question SIMPLE ou BONUS");
		String type = scanner.next();
		question.setType(TypeQuestion.valueOf(type));
		dao.save(question);
		
	}
	
	

}

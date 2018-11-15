package fr.diginamic.controller;

import java.util.Scanner;

import fr.diginamic.exception.StockageException;
import fr.diginamic.exception.SupprimerQuestionException;
import fr.diginamic.interfaces.QuestionDAO;

public class SupprimerQuestionService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDAO dao) throws StockageException{
		if(dao.findAll().size() > 0) {
			System.out.println("Veuillez choisir le numéro de la question que vous voulez supprimer");
			int questionSuppr = scanner.nextInt();
			if(questionSuppr <= 0 || questionSuppr > dao.findAll().size()) {
				throw new SupprimerQuestionException("Le numéro demandé n'existe pas");
			}
			dao.delete(questionSuppr);
		}else {
			System.out.println("Il n'y a aucun élément à supprimer !");
		}
	}

}

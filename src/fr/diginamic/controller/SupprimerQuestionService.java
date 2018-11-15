package fr.diginamic.controller;

import java.util.Scanner;

import fr.diginamic.exception.StockageException;
import fr.diginamic.exception.SupprimerQuestionException;
import fr.diginamic.interfaces.QuestionDAO;

public class SupprimerQuestionService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDAO dao) throws StockageException{
		String questionSuppr = "";
		if(dao.findAll().size() > 0) {
			 do{
				System.out.println("Veuillez choisir le numéro de la question que vous voulez supprimer");
				questionSuppr = scanner.next();
			}while(!questionSuppr.matches("[0-9]*"));
			if(Integer.parseInt(questionSuppr) <= 0 || Integer.parseInt(questionSuppr) > dao.findAll().size()) {
				throw new SupprimerQuestionException("Le numéro demandé n'existe pas");
			}
			dao.delete(Integer.parseInt(questionSuppr));
		}else {
			System.out.println("Il n'y a aucun élément à supprimer !");
		}
	}

}

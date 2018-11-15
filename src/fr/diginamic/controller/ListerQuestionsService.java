package fr.diginamic.controller;

import java.util.Scanner;

import fr.diginamic.interfaces.QuestionDAO;
import fr.diginamic.model.Question;

public class ListerQuestionsService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDAO dao) {
		int index = 1;
		if(dao.findAll().size() > 0) {
			for(Question question : dao.findAll()) {
				System.out.println(index + ") " + question.getIntitule());
				index++;
			}
		}else {
			System.out.println("La liste est vide");
		}
	}
	
}

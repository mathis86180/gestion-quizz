package fr.diginamic.console;

import java.util.Scanner;
import fr.diginamic.controller.*;
import fr.diginamic.data.QuestionMemDAO;

public class QuizzAdminConsoleApp {
	
		static Scanner questionUser = new Scanner(System.in) ;
		static QuestionMemDAO questionMemDao = new QuestionMemDAO();
		
		public static void main(String[] args) {
			
			MenuServiceFactory menuServiceFactory = new MenuServiceFactory();
			int choix = 0;
			do {
				menuServiceFactory.afficherMenu();
				choix = questionUser.nextInt();
				menuServiceFactory.choisirService(questionUser, choix, questionMemDao);
			}while(choix != 99);
	}

}

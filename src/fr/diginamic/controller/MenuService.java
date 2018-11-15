package fr.diginamic.controller;

import java.util.Scanner;

import fr.diginamic.exception.StockageException;
import fr.diginamic.interfaces.*;

public abstract class MenuService {
	
	abstract void executeUC(Scanner scanner, QuestionDAO dao) throws StockageException;
}

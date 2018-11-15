package fr.diginamic.data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.interfaces.QuestionDAO;
import fr.diginamic.model.Question;

public class QuestionMemDAO implements QuestionDAO{
	
	private static List<Question> listQuestions = new ArrayList<>();
	
	public static List<Question> getLq() {
		return listQuestions;
	}

	@Override
	public List<Question> findAll() {
		return listQuestions;
	}


	@Override
	public void save(Question question) {
		listQuestions.add(question);
		
	}


	@Override
	public void delete(int index) {
		listQuestions.remove(index - 1);
		
	}

}

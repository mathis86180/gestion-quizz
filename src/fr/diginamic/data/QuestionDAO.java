package fr.diginamic.data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.diginamic.model.*;
public class QuestionDAO {
	
	public static List<Question> lsterQuestions(){
		List<Question> lq = new ArrayList<>();
		Question q1 = new Question("Quel est mon prénom ?", Arrays.asList("mathis","corentin"));
		q1.setBonneReponse("mathis");
		Question q2 = new Question("Quel est mon nom ?", Arrays.asList("Seigle","Clercq"));
		q1.setBonneReponse("Seigle");
		lq.add(q1);
		lq.add(q2);
		return lq;
	}

}

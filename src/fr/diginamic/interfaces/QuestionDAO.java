package fr.diginamic.interfaces;
import java.util.List;

import fr.diginamic.model.*;
public interface QuestionDAO {
	
	List<Question> findAll();
	void save(Question question);
	void delete(int index);

}

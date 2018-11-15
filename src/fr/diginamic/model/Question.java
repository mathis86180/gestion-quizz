package fr.diginamic.model;

import java.util.List;

public class Question {
	
	private String intitule;
	private List<String> propositions;
	private String bonneReponse;
	private TypeQuestion type;
	
	
	public Question() {
		
	}
	
	public Question(String intitule, List<String> propositions, String bonneReponse) {
		super();
		this.intitule = intitule;
		this.propositions = propositions;
		this.bonneReponse = bonneReponse;
	}
	
	public Question(String intitule, List<String> propositions, String bonneReponse, TypeQuestion type) {
		super();
		this.intitule = intitule;
		this.propositions = propositions;
		this.bonneReponse = bonneReponse;
		this.type = type;
	}
	
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public List<String> getPropositions() {
		return propositions;
	}

	public void setPropositions(List<String> propositions) {
		this.propositions = propositions;
	}

	public String getBonneReponse() {
		return bonneReponse;
	}

	public void setBonneReponse(String bonneReponse) {
		this.bonneReponse = bonneReponse;
	}
	
	public TypeQuestion getType() {
		return type;
	}

	public void setType(TypeQuestion type) {
		this.type = type;
	}

	public boolean verifierReponse(String reponse) {
		boolean reponseOK = false;
		if(reponse.equals(this.bonneReponse)) {
			reponseOK = true;
		}
		return reponseOK;
	}
	
	public void addProposition(String proposition) {
		this.propositions.add(proposition);
	}

}

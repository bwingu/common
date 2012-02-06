package models.common;

public class Exception{

	public int codeRetour;
	
	public String description;
	
	public Exception(int codeRetour, String description){
		this.codeRetour = codeRetour;
		this.description = description;
	}
}
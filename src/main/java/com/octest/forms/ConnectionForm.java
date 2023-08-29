package com.octest.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {

	private int resultat;
	
	public void verifierResultat(HttpServletRequest request) {
		
		int nbr1= Integer.parseInt(request.getParameter("nombre1"));
		int nbr2=Integer.parseInt(request.getParameter("nombre2"));
		String operation=request.getParameter("opera");
		
			 if(operation.equals("+")) {resultat=nbr1+nbr2;}
		else if(operation.equals("-")) {resultat=nbr1-nbr2;}
		else if(operation.equals("*")) {resultat=nbr1*nbr2;}
		else if(operation.equals("/")) {resultat=nbr1/nbr2;}
	}

	public int getResultat() {
		return resultat;
	}

	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	
	
}

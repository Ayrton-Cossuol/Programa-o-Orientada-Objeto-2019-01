package com.calendariodata;

import java.lang.Object;

//import aluno.Data;

public class Data {
	private int d, m, a;
	String data="";
	
	//CONSTRUTORES
	
	//First
	public Data(int d, int m, int a) throws Exception {
		this.setData(d,m,a);
	}
	
	//Default
	public Data() throws Exception {
		this(1,1,1900);
	}
	
	//FIM CONSTRUTORES
	
	// Equals
	public boolean equals(Object objeto) {
		Data aux = (Data)objeto;
		if( this.getDia() == (aux.getDia()) &&
				this.getMes() == (aux.getMes()) &&
				this.getAno() == (aux.getAno()) ) {
			return true;
		}
		return false;
	}
	
	// Validez
	public static boolean isDataValida(int d, int m, int a) {
		if(d<1 || d>31) return false;
		
		if(m<1 || m>12) return false;
			
		if(a < 1582) return false;
		
		if((m==4 || m==6 || m==9 || m==11) && (d>30)) return false;
		
		if(m==2 && d>=29) {
			if(d>29) return false;
			if(isBissexto(a)==false) return false;
		}
		return true;
	}
	
	public static boolean isBissexto(int a) {
		if(a%4==0) {
			if(a%100!=0) return true;
			else {
				if(a%400==0) return true;
			}
		}
		return false;
	}
	
	public String incrementa() throws Exception{
		try{
			setData(getDia()+1, getMes(), getAno());
		}
		catch(Exception dia){
			try{
				setData(1, getMes()+1, getAno());
			}
			catch(Exception mes){
				try{
					setData(1, 1, getAno()+1);
				}
				catch(Exception ano){
					setData(getDia(), getMes(),getAno());
					System.out.println("Data invalida.");
				}
			}
		}
		return this.data;
	}
	
	public String incrementa(int x) throws Exception{
		while(x > 0){
			incrementa();
			x--;
		}
		return this.data;
	}
	
	public String toString(int d, int m, int a) {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return(dados.toString());
	}
		
	// GET and SET
	public int getDia() {
		return this.d;
	}
	
	public int getMes() {
		return this.m;
	}
	
	public int getAno() {
		return this.a;
	}
	
	// Metodo de Interface Principal
	@SuppressWarnings("static-access")
	public void setData(int d, int m, int a) throws Exception {
		this.d = d;
		this.m = m;
		this.a = a;
		if(this.isDataValida(d,m,a)) {
			this.data = this.toString(d,m,a);
		}else {
			throw new Exception("Data inv�lida.");
		}
	}
	public static void verificarECriaData(int d, int m, int a) throws Exception{
		
	}
	
	public void setData() throws Exception {
		setData(1,1,1900);
	}
	
	// dia como inteiro, o nome do m�s como String e o ano como inteiro.
	public void setData(int d, String m, int a) throws Exception {
		int m_int = 0;
		if(m.equals("janeiro")) m = "1" ;
		if(m.equals("fevereiro")) m = "2" ;
		if(m.equals("mar�o")) m = "3";
		if(m.equals("abril")) m = "4";
		if(m.equals("maio")) m = "5";
		if(m.equals("junho")) m = "6";
		if(m.equals("julho")) m = "7";
		if(m.equals("agosto")) m = "8";
		if(m.equals("setembro")) m = "9";
		if(m.equals("outubro")) m = "10";
		if(m.equals("novembro")) m = "11";
		if(m.equals("dezembro")) m = "12";
		m_int = Integer.parseInt(m);
		this.setData(d,m_int,a);
	}
	
	// de uma data contendo somente o m�s e ano (neste caso o dia receber� 1)
	public void setData(int m, int a) throws Exception {
		this.setData(1,m,a);
	}

	// de uma data completa  no formato String �dd/mm/aaaa�, sendo poss�vel dia e m�s com dois ou apenas 1 caractere.  Veja as dicas sobre a classe string a seguir.
	public void setData(String str) throws Exception {
		int dia;	
		int mes;
		int ano;
		if(str.indexOf("/")==2) {	// Formato: "dd/mm/aaaa"
			dia = Integer.parseInt(str.substring(0,2));
			mes = Integer.parseInt(str.substring(3,5));
			ano = Integer.parseInt(str.substring(6,10));
		}else {		// Formato: "d/m/aaaa"
			dia = Integer.parseInt(str.substring(0,1));
			mes = Integer.parseInt(str.substring(2,3));
			ano = Integer.parseInt(str.substring(4,8));
		}	
		this.setData(dia,mes,ano);
	}
	
	public int compareTo(Object objeto) {
  		Data aux = (Data) objeto;
  		if (this.getAno() > aux.getAno()) return 1;
  		else if (this.getAno() < aux.getAno()) return -1;
  		else {
  			if (this.getMes() > aux.getMes()) return 1;
  			else if (this.getMes() < aux.getMes()) return -1;
  			else {
  				if (this.getDia() > aux.getDia()) return 1;
  				else if (this.getDia() < aux.getDia()) return -1;
  				else {
  					return 0;
  				}
  			}
  		}
	}
	
	//Metodo para verificar e criar a data passada pelo usuario. (Exercicio 6)
	public static Data verificaECriaData(int d, int m, int a) {
		try {
			if (Data.isDataValida(d, m, a)) {
				return new Data(d, m, a);
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}
}
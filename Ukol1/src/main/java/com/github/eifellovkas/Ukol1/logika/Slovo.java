package com.github.eifellovkas.Ukol1.logika;

public class Slovo {
	private String nazevEn; 
	private String nazevCz;
	private String obr;
	
	public Slovo(String nazevEn, String nazevCz, String obr){
		this.nazevEn = nazevEn;
		this.nazevCz = nazevCz;
		this.obr = obr;
	}
	
	public String getNazevEn() {
		return nazevEn;
	}
	
	public String getNazevCz() {
		return nazevCz;
	}
	
	public String getObr() {
		return obr;
	}
}

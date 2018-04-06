package com.github.eifellovkas.Ukol1.logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.eifellovkas.Ukol1.logika.Slovo;

public class Hra {
	private boolean konecHry = false;
	private List<Slovo> slovicka;
	private String hadane;
	
	
	public Hra() {
		slovicka = new ArrayList<Slovo>();
		Slovo bull = new Slovo("bull", "býk", "/ui/bull.png");
		slovicka.add(bull);
		Slovo elephant = new Slovo("elephant", "slon", "/ui/elephant.png");
		slovicka.add(elephant);
		Slovo dog = new Slovo("dog", "pes", "/ui/dog.png");
		slovicka.add(dog);
		Slovo owl = new Slovo("owl", "sova", "/ui/owl.png");
		slovicka.add(owl);
		Slovo fox = new Slovo("fox", "liška", "/ui/fox.png");
		slovicka.add(fox);
		Slovo pig = new Slovo("pig", "prasátko", "/ui/pig.png");
		slovicka.add(pig);
		
		
		
	}
	public List<Slovo> getSlovicka(){
		return slovicka;
	}
	
    public boolean konecHry() {
        return konecHry;
    }
    
    public void vyberSlovo() {
    	Random nahodneSlovo = new Random();
    	hadane = slovicka.get(nahodneSlovo.nextInt(slovicka.size())).getNazevEn();
    }
    
    public String getHadane() {
    	return hadane;
    }

}
package org.generation.italy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Negozio {
	
	Scanner sc = new Scanner(System.in);
	public HashMap<Integer, Prodotto> catalogo = new HashMap<>(); //da rivedere se private o public
	private ArrayList <Prodotto> carrello = new ArrayList<>();
	private int cont=0,quantita, codiceScelto;
	
	public Negozio () {
		catalogo.put(++cont,new Prodotto("AB101","maglia",30f,10f,10));
		catalogo.put(++cont,new Prodotto("AB102","cappello",10f,5f,10));
		catalogo.put(++cont,new Prodotto("AB103","asciugamano",6f,10f,10));
		catalogo.put(++cont,new Prodotto("AB104","scarpa",40f,25f,10));
		catalogo.put(++cont,new Prodotto("AB105","portafoglio",5f,5f,10));
	}
	
	public void visualizzaCatalogo() {
		for (Integer p:catalogo.keySet()) {
			System.out.println(p+" "+catalogo.get(p).getCodice()+" "+catalogo.get(p).getDescrizione()+" "+catalogo.get(p).getPrezzo()+" euro"+" "+catalogo.get(p).getSconto()+"% di sconto"+" "+catalogo.get(p).getQuantitadisp()+" disponibili");
		}
	}
	
	public void controlloProdotto(int codiceScelto) {
		if (catalogo.containsKey(codiceScelto)) {
			System.out.println(codiceScelto+" "+catalogo.get(codiceScelto).getCodice()+" "+catalogo.get(codiceScelto).getDescrizione()+" "+catalogo.get(codiceScelto).getSconto()+" "+catalogo.get(codiceScelto).getSconto()+" "+catalogo.get(codiceScelto).getQuantitadisp());
		}
		else {
			System.out.println("Prodotto non disponibile");
		}
	}
	
	public void visualizzaCarrello () {
		for (int i=0;i<carrello.size();i++) {
			System.out.println(carrello.get(i).getDescrizione());
		}
	}
	
	public boolean controlloquantita(int codiceScelto, int quantita) {
		if(quantita<catalogo.get(codiceScelto).getQuantitadisp()) {
			return true;
		}
		else {
			return false;
		}
	} 
	
	
	public HashMap<Integer, Prodotto> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(HashMap<Integer, Prodotto> catalogo) {
		this.catalogo = catalogo;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public int getCodiceScelto() {
		return codiceScelto;
	}

	public void setCodiceScelto(int codiceScelto) {
		this.codiceScelto = codiceScelto;
	}
	
	
	
}

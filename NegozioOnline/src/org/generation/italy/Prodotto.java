package org.generation.italy;

public class Prodotto {
	
	private String codice,descrizione;
	private float prezzo,sconto;
	private int quantitadisp;
	
	public Prodotto (String codice,String descrizione,float prezzo,float sconto,int quantitadisp) {
		this.codice=codice;
		this.descrizione=descrizione;
		this.prezzo=prezzo;
		this.sconto=sconto;
		this.quantitadisp=quantitadisp;
	}
	
	public void applicaSconto() {
		prezzo=prezzo-(prezzo*sconto/100);
	}
	
	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getSconto() {
		return sconto;
	}

	public void setSconto(float sconto) {
		this.sconto = sconto;
	}

	public int getQuantitadisp() {
		return quantitadisp;
	}

	public void setQuantitadisp(int quantitadisp) {
		this.quantitadisp = quantitadisp;
	}
	
	
	
}

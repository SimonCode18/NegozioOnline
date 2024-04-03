package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int quantita;
		int codiceScelto;
		
		Negozio negozio = new Negozio();
		Prodotto prodotto = new Prodotto("AB101","maglia",30f,10f,10);
		negozio.visualizzaCatalogo();
		
		System.out.println("Scegliere un prodotto dal catalogo inserendo il codice: 1/2/3/4/52");
		codiceScelto=Integer.parseInt(sc.nextLine());
		negozio.controlloProdotto(codiceScelto);
		
		System.out.println("Indicare la quantita da acquistare: ");
		quantita=Integer.parseInt(sc.nextLine());
		if (negozio.controlloquantita(codiceScelto,quantita)) {
			System.out.println("La quantita selezionata e disponibile");
		}
		else {
			System.out.println("La quantita selezionata non e disponibile");
		}
		
		
		
		
		
		
		sc.close();
	}

}

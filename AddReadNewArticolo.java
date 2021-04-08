package it.objectmethod.ripasso.cvs;

import java.util.Scanner;

public class AddReadNewArticolo {
	private Scanner tastiera;
	public AddReadNewArticolo(Scanner tastiera) {
		this.tastiera = tastiera;
	}

	public Articolo getNewArticolo() {

		int id = 0;
		String codice = null;
		String descrizione = null;
		int quantita = 0;
		boolean invalidInput = false;

		do {		
			invalidInput =false;
			id++;//problema riscrive sullo stesso id, parte sempre da 1
			
			System.out.println("Inserisci dati articolo:\nCodice");
			codice = tastiera.nextLine();

			System.out.println("Descrizione");
			descrizione = tastiera.nextLine();

			System.out.println("Quantità");
			quantita = tastiera.nextInt();
			tastiera.nextLine();



		}while (invalidInput);
		return Articolo.costruttoreArticolo(id, codice, descrizione, quantita);



	}
}

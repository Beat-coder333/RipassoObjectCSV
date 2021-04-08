package it.objectmethod.ripasso.cvs;

import java.util.List;
import java.util.Scanner;

public class ArticoliMain {

	public static void main(String[] args) throws Exception {

		System.out.println("Scegli un operazione:\n"
				+ "1: leggere lista articoli originale\n"
				+ "2: aggiungere un nuovo articolo a una nuova lista");
		Scanner tastiera = new Scanner(System.in);
		int input=tastiera.nextInt();

		switch (input) {
		case 1:
			CSVReader reader = new CSVReader();
			List<Articolo> list = reader.readFile();

			System.out.print(list);
			break;
		case 2:
			
			CSVReader readerA = new CSVReader();
			List<Articolo> listA = readerA.readFile();
			AddReadNewArticolo articoloReader = new AddReadNewArticolo(tastiera);
			
			listA.add(articoloReader.getNewArticolo());

			CSVWriter writer= new CSVWriter();
			writer.writeFile(listA);

			break;


		}

		tastiera.close();

	}

}

package it.objectmethod.ripasso.cvs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class CSVReader {

	public List<Articolo> readFile() {

		String pathReader="C:\\Users\\straz\\Desktop\\Object/articoli.csv";
		String line="";
		List<Articolo> articoliList = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(pathReader));

			while((line=br.readLine())!=null && !line.isEmpty()) {
			articoliList.add(Articolo.costruttoreArticoloFromCsv(line));
			}
			br.close();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return articoliList;
		
	}

}

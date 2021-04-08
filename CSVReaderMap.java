package it.objectmethod.ripasso.cvs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

public class CSVReaderMap {
	
	public List<Articolo> readFile() {

		String pathReader="C:\\Users\\straz\\Desktop\\Object/articoli.csv";
		String line="";
		
		//Map<String,List<Articolo>> articoloByCodice = new HashMap<>();
		
		List<Articolo> articoliList = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(pathReader));

			while((line=br.readLine())!=null && !line.isEmpty()) {
			articoliList.add(Articolo.costruttoreArticoloFromCsv(line));
			//articoloByCodice.put(codice, articoliList);//codice da articolo 
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

package it.objectmethod.ripasso.cvs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;



public class CSVWriter {
	
	String pathWriter="C:\\Users\\straz\\Desktop\\Object/articoli-nuovi.csv";
	String line="";
	
	public void writeFile(List<Articolo> articoliList) throws Exception {
		File f = new File(pathWriter);
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for (Articolo a : articoliList) {
			bw.write(a.prepareForCsv());
		}
		bw.close();
	}

}

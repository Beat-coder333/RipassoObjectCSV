package it.objectmethod.ripasso.cvs;

public class Articolo {

	private int id;
	private String codice;
	private String descrizione;
	private int quantita;
	
	
public Articolo() {}
	
	public static Articolo costruttoreArticolo(int id,String codice,String descrizione,int quantita){
		Articolo a= new Articolo();
		a.id = id;
		a.codice=codice;
		a.descrizione=descrizione;
		a.quantita=quantita;
		return a;
	}
	
	public static Articolo costruttoreArticoloFromCsv(String line) {
		String [] lineSplitted = line.split(";");
		Articolo a = new Articolo();
		a.id = (int) Long.parseLong(lineSplitted[0]);
		a.codice = lineSplitted[1];
		a.descrizione = lineSplitted[2];
		a.quantita = (int) Long.parseLong(lineSplitted[3]);
		return a;
	}
	
	public String prepareForCsv() {
		return this.id + ";"
				+ this.codice + ";"
				+ this.descrizione + ";"
				+ this.quantita + "\n";
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}


	public String toString() {

		return "Dati Articolo: \n" 
				+"ID: " + id +"\n"
				+"Codice: " + codice +"\n" 
				+"Descrizione: " + descrizione +"\n" 
				+"Quantità: "+ quantita +"\n" ;
	}

	
}

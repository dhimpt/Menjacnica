import java.util.LinkedList;

import menjacnica.Kurs;
import menjacnica.Poslovnica;
import menjacnica.Valuta;
import specifikacija.Menjacnica;

public class Implementacija extends Poslovnica implements Menjacnica {

	public Implementacija(LinkedList<Valuta> valute) {
		super(valute);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean dodajKursValute(String puniNazivValute, String skraceniNazivValute, Kurs kursValute) {
		if(puniNazivValute == null && skraceniNazivValute == null)
			return false;
		if (getValute().add(new Valuta(puniNazivValute, skraceniNazivValute, kursValute)))
			return true;
		return false;
	}

	@Override
	public boolean obrisiKursValute(String puniNazivValute, String skraceniNazivValute, Kurs kursValute) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Kurs vratiKursValute(String puniNazivValute, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		return null;
	}



}

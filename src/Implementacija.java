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
		if (puniNazivValute == null || skraceniNazivValute == null)
			return false;
		if (getValute().add(new Valuta(puniNazivValute, skraceniNazivValute, kursValute)))
			return true;
		return false;
	}

	@Override
	public boolean obrisiKursValute(String puniNazivValute, String skraceniNazivValute, Kurs kursValute) {
		if (puniNazivValute == null || skraceniNazivValute == null)
			return false;
		if (getValute().remove(new Valuta(puniNazivValute, skraceniNazivValute, kursValute)))
			return true;
		return false;
	}

	@Override
	public Kurs vratiKursValute(String puniNazivValute, String skraceniNazivValute) {
		if (puniNazivValute == null || skraceniNazivValute == null)
			return null;
		for (int i = 0; i < getValute().size(); i++) {
			if (getValute().get(i).getPunNaziv().equals(puniNazivValute)
					&& getValute().get(i).getSkraceniNaziv().equals(skraceniNazivValute))
				return getValute().get(i).getKursValute();
		}
		return null;
	}

}

package specifikacija;

import menjacnica.Kurs;

public interface Menjacnica {

	public boolean dodajKursValute(String puniNazivValute, String skraceniNazivValute, Kurs kursValute);
	public boolean obrisiKursValute(String puniNazivValute, String skraceniNazivValute, Kurs kursValute);
	public Kurs vratiKursValute(String puniNazivValute, String skraceniNazivValute);
	
}

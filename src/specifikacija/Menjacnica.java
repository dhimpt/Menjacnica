package specifikacija;

import menjacnica.Kurs;

public interface Menjacnica {

	public boolean dodajKursValute(String punNazivValute, String skraceniNazivValute, Kurs kursValute);
	public boolean obrisiKursValute(String punNazivValute, String skraceniNazivValute, Kurs kursValute);
	public Kurs vratiKursValute(String punNazivValute, String skraceniNazivValute);
	
}

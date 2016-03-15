package menjacnica;

public class Valuta {
	private String punNaziv;
	private String skraceniNaziv;
	Kurs kursValute;

	public Valuta(String punNaziv, String skraceniNaziv, Kurs kursValute) {
		super();
		this.punNaziv = punNaziv;
		this.skraceniNaziv = skraceniNaziv;
		this.kursValute = kursValute;
	}

	public String getPunNaziv() {
		return punNaziv;
	}

	public void setPunNaziv(String punNaziv) {
		this.punNaziv = punNaziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public Kurs getKursValute() {
		return kursValute;
	}

	public void setKursValute(Kurs kursValute) {
		this.kursValute = kursValute;
	}

}

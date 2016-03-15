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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursValute == null) ? 0 : kursValute.hashCode());
		result = prime * result + ((punNaziv == null) ? 0 : punNaziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kursValute == null) {
			if (other.kursValute != null)
				return false;
		} else if (!kursValute.equals(other.kursValute))
			return false;
		if (punNaziv == null) {
			if (other.punNaziv != null)
				return false;
		} else if (!punNaziv.equals(other.punNaziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [punNaziv=" + punNaziv + ", skraceniNaziv=" + skraceniNaziv + ", kursValute=" + kursValute + "]";
	}

}

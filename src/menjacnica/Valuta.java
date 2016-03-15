package menjacnica;

public class Valuta {
	private String punNazivValute;
	private String skraceniNazivValute;
	Kurs trenutniKursValute;

	public Valuta(String punNaziv, String skraceniNaziv, Kurs kursValute) {
		super();
		this.punNazivValute = punNaziv;
		this.skraceniNazivValute = skraceniNaziv;
		this.trenutniKursValute = kursValute;
	}

	public String getPunNaziv() {
		return punNazivValute;
	}

	public void setPunNaziv(String punNazivValute) {
		if (punNazivValute.matches("[a-zA-Z]+"))
			this.punNazivValute = punNazivValute;
		else
			throw new RuntimeException("Pun naziv valute moze sadrzati samo slova");
	}

	public String getSkraceniNaziv() {
		return skraceniNazivValute;
	}

	public void setSkraceniNaziv(String skraceniNazivValute) {
		if (skraceniNazivValute.matches("[a-zA-Z]+"))
			this.skraceniNazivValute = skraceniNazivValute;
		else
			throw new RuntimeException("Skraceni naziv valute moze sadrzati samo slova");
	}

	public Kurs getKursValute() {
		return trenutniKursValute;
	}

	public void setKursValute(Kurs trenutniKursValute) {
		if (trenutniKursValute != null)
			this.trenutniKursValute = trenutniKursValute;
		else
			throw new RuntimeException("Kurs valute ne sme biti null");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trenutniKursValute == null) ? 0 : trenutniKursValute.hashCode());
		result = prime * result + ((punNazivValute == null) ? 0 : punNazivValute.hashCode());
		result = prime * result + ((skraceniNazivValute == null) ? 0 : skraceniNazivValute.hashCode());
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
		
		if (punNazivValute == null) {
			if (other.punNazivValute != null)
				return false;
		} else if (!punNazivValute.equals(other.punNazivValute))
			return false;
		if (skraceniNazivValute == null) {
			if (other.skraceniNazivValute != null)
				return false;
		} else if (!skraceniNazivValute.equals(other.skraceniNazivValute))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [punNaziv=" + punNazivValute + ", skraceniNaziv=" + skraceniNazivValute + ", kursValute=" + trenutniKursValute + "]";
	}

}

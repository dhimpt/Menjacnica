package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private double vrednostProdajnogKursa;
	private double vrednostKupovnogKursa;
	private double vrednostSrednjegKursa;
	GregorianCalendar datumPoslednjegAzuriranjaKursa;

	public Kurs(int prodajniKurs, int kupovniKurs, int srednjiKurs, GregorianCalendar datumKursa) {
		super();
		this.vrednostProdajnogKursa = prodajniKurs;
		this.vrednostKupovnogKursa = kupovniKurs;
		this.vrednostSrednjegKursa = srednjiKurs;
		this.datumPoslednjegAzuriranjaKursa = datumKursa;
	}

	public double getProdajniKurs() {
		return vrednostProdajnogKursa;
	}

	public void setProdajniKurs(int vrednostProdajnogKursa) {
		if (vrednostProdajnogKursa >= 0)
			this.vrednostProdajnogKursa = vrednostProdajnogKursa;
		else
			throw new RuntimeException("Prodajni kurs ne sme biti negativan");
	}

	public double getKupovniKurs() {
		return vrednostKupovnogKursa;
	}

	public void setKupovniKurs(int vrednostKupovnogKursa) {
		if (vrednostKupovnogKursa >= 0)
			this.vrednostKupovnogKursa = vrednostKupovnogKursa;
		else
			throw new RuntimeException("Kupovni kurs ne sme biti negativan");
	}

	public double getSrednjiKurs() {
		return vrednostSrednjegKursa;
	}

	public void setSrednjiKurs(int vrednostSrednjegKursa) {
		if (vrednostSrednjegKursa >= 0)
			this.vrednostSrednjegKursa = vrednostSrednjegKursa;
		else
			throw new RuntimeException("Srednji kurs ne sme biti negativan");
	}

	public GregorianCalendar getDatumKursa() {
		return datumPoslednjegAzuriranjaKursa;
	}

	public void setDatumKursa(GregorianCalendar datumPoslednjegAzuriranjaKursa) {
		if (datumPoslednjegAzuriranjaKursa.after(new GregorianCalendar()))
			this.datumPoslednjegAzuriranjaKursa = datumPoslednjegAzuriranjaKursa;
		else
			throw new RuntimeException("Uneti datum kursa ne sme bti pre danasnjeg datuma");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumPoslednjegAzuriranjaKursa == null) ? 0 : datumPoslednjegAzuriranjaKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(vrednostKupovnogKursa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(vrednostProdajnogKursa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(vrednostSrednjegKursa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Kurs other = (Kurs) obj;
		if (datumPoslednjegAzuriranjaKursa == null) {
			if (other.datumPoslednjegAzuriranjaKursa != null)
				return false;
		} else if (!datumPoslednjegAzuriranjaKursa.equals(other.datumPoslednjegAzuriranjaKursa))
			return false;
		if (Double.doubleToLongBits(vrednostKupovnogKursa) != Double.doubleToLongBits(other.vrednostKupovnogKursa))
			return false;
		if (Double.doubleToLongBits(vrednostProdajnogKursa) != Double.doubleToLongBits(other.vrednostProdajnogKursa))
			return false;
		if (Double.doubleToLongBits(vrednostSrednjegKursa) != Double.doubleToLongBits(other.vrednostSrednjegKursa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kurs [prodajniKurs=" + vrednostProdajnogKursa + ", kupovniKurs=" + vrednostKupovnogKursa + ", srednjiKurs=" + vrednostSrednjegKursa
				+ ", datumKursa=" + datumPoslednjegAzuriranjaKursa + "]";
	}

}

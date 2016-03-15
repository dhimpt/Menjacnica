package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	GregorianCalendar datumKursa;

	public Kurs(int prodajniKurs, int kupovniKurs, int srednjiKurs, GregorianCalendar datumKursa) {
		super();
		this.prodajniKurs = prodajniKurs;
		this.kupovniKurs = kupovniKurs;
		this.srednjiKurs = srednjiKurs;
		this.datumKursa = datumKursa;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(int prodajniKurs) {
		if (prodajniKurs >= 0)
			this.prodajniKurs = prodajniKurs;
		else
			throw new RuntimeException("Prodajni kurs ne sme biti negativan");
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(int kupovniKurs) {
		if (kupovniKurs >= 0)
			this.kupovniKurs = kupovniKurs;
		else
			throw new RuntimeException("Kupovni kurs ne sme biti negativan");
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(int srednjiKurs) {
		if (srednjiKurs >= 0)
			this.srednjiKurs = srednjiKurs;
		else
			throw new RuntimeException("Srednji kurs ne sme biti negativan");
	}

	public GregorianCalendar getDatumKursa() {
		return datumKursa;
	}

	public void setDatumKursa(GregorianCalendar datumKursa) {
		if (datumKursa.after(new GregorianCalendar()))
			this.datumKursa = datumKursa;
		else
			throw new RuntimeException("Uneti datum kursa ne sme bti pre danasnjeg datuma");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumKursa == null) ? 0 : datumKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
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
		if (datumKursa == null) {
			if (other.datumKursa != null)
				return false;
		} else if (!datumKursa.equals(other.datumKursa))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kurs [prodajniKurs=" + prodajniKurs + ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs
				+ ", datumKursa=" + datumKursa + "]";
	}

}

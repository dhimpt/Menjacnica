package menjacnica;

import java.util.LinkedList;

public class Poslovnica {
	private LinkedList<Valuta> valute;

	public Poslovnica(LinkedList<Valuta> valute) {
		super();
		this.valute = valute;
	}

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		if (valute != null)
			this.valute = valute;
		else
			throw new RuntimeException("Prosledjena je nepostojeca (null) lista");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
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
		Poslovnica other = (Poslovnica) obj;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Menjacnica [valute=" + valute + "]";
	}

}

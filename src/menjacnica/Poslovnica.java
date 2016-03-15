package menjacnica;

import java.util.LinkedList;

public class Poslovnica {
	private LinkedList<Valuta> listaValute;

	public Poslovnica(LinkedList<Valuta> valute) {
		super();
		this.listaValute = valute;
	}

	public LinkedList<Valuta> getValute() {
		return listaValute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		if (valute != null)
			this.listaValute = valute;
		else
			throw new RuntimeException("Prosledjena je nepostojeca (null) lista");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaValute == null) ? 0 : listaValute.hashCode());
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
		if (listaValute == null) {
			if (other.listaValute != null)
				return false;
		} else if (!listaValute.equals(other.listaValute))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Menjacnica [valute=" + listaValute + "]";
	}

}

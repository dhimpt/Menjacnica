package menjacnica;

import java.util.LinkedList;

public class Menjacnica {
	private LinkedList<Valuta> valute;

	public Menjacnica(LinkedList<Valuta> valute) {
		super();
		this.valute = valute;
	}

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}

}

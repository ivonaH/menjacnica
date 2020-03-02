package menjacnica;

import java.util.LinkedList;

public class Valuta {

	String naziv;
	String skraceniNaziv;
	LinkedList<ValutaNaDan> valutaNaDan;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv==null)
			throw new RuntimeException();
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv==null)
			throw new RuntimeException();
		this.skraceniNaziv = skraceniNaziv;
	}

	public LinkedList<ValutaNaDan> getValutaNaDan() {
		return valutaNaDan;
	}

	public void setValutaNaDan(LinkedList<ValutaNaDan> valutaNaDan) {
		this.valutaNaDan = valutaNaDan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		result = prime * result + ((valutaNaDan == null) ? 0 : valutaNaDan.hashCode());
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
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (valutaNaDan == null) {
			if (other.valutaNaDan != null)
				return false;
		} else if (!valutaNaDan.equals(other.valutaNaDan))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", valutaNaDan=" + valutaNaDan + "]";
	}

	
	
}

package menjacnica;

import java.util.Date;

public class ValutaNaDan {
	Date datum;
	int prodajniKurs;
	int srednjiKurs;
	int kupovniKurs;

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public int getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(int prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}

	public int getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(int srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}

	public int getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(int kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + kupovniKurs;
		result = prime * result + prodajniKurs;
		result = prime * result + srednjiKurs;
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
		ValutaNaDan other = (ValutaNaDan) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kupovniKurs != other.kupovniKurs)
			return false;
		if (prodajniKurs != other.prodajniKurs)
			return false;
		if (srednjiKurs != other.srednjiKurs)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ValutaNaDan [datum=" + datum + ", prodajniKurs=" + prodajniKurs + ", srednjiKurs=" + srednjiKurs
				+ ", kupovniKurs=" + kupovniKurs + "]";
	}

	
	
}

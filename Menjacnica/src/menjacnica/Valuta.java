package menjacnica;

public class Valuta {

	String naziv;
	String skraceniNaziv;
	ValutaNaDan valutaNaDan;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public ValutaNaDan getValutaNaDan() {
		return valutaNaDan;
	}

	public void setValutaNaDan(ValutaNaDan valutaNaDan) {
		this.valutaNaDan = valutaNaDan;
	}

}

package menjacnica;

import java.util.Date;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKursValuteZaOdredjeniDan(Valuta valuta, ValutaNaDan valutaNaDan) {
		/*
<<<<<<< HEAD
		
		//tekst 17717271
=======*/
		valuta.getValutaNaDan().add(valutaNaDan);

	}

	@Override
	public void obrisiKursValuteZaOdredjeniDan(Valuta valuta, ValutaNaDan valutaNaDan) {
		/*
<<<<<<< HEAD
		//tekst 1212818
		
=======*/
		valuta.getValutaNaDan().remove(valutaNaDan);

	}

	@Override
	public ValutaNaDan pronadjiKursValteNaOredjeniDan(Valuta valuta, Date datum) {
/*<<<<<<< HEAD
		// neki tekst
=======
		// TODO Auto-generated method stub*/
		for (ValutaNaDan vd : valuta.getValutaNaDan()) {
			if (vd.getDatum().equals(datum))
				return vd;
		}

		return null;
	}

}

package menjacnica.interfejs;

import java.util.Date;

import menjacnica.Valuta;
import menjacnica.ValutaNaDan;

public interface MenjacnicaInterfejs {
	
	public void dodajKursValuteZaOdredjeniDan(Valuta valuta);

	public void obrisiKursValuteZaOdredjeniDan(Valuta valuta, ValutaNaDan valutaNaDan);

	public void pronadjiKursValteNaOredjeniDan(Valuta valuta, Date datum);
	
}

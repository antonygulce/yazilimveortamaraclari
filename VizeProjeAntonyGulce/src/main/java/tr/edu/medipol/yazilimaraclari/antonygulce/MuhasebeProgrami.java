package tr.edu.medipol.yazilimaraclari.antonygulce;

public class MuhasebeProgrami {

	public static void main(String[] args) {
		System.out.println(ucretHesapla(5, 25));
		}


// Bu metodun unit testini yaz�n (src/test/java alt�nda ayr� bir s�n�f olmal�)
	public static Ucret ucretHesapla(int calisilanSaat, int saatlikUcret) {
		return new Ucret(calisilanSaat, saatlikUcret);
	}

	public static class Ucret {
		int calisilanSaat;
		int saatlikUcret;
		public static int ucret;

		public Ucret(int calisilanSaat, int saatlikUcret) {
			this.calisilanSaat = calisilanSaat;
			this.saatlikUcret = saatlikUcret;
			this.ucret = calisilanSaat * saatlikUcret;
		}

		@Override
		public String toString() {
			return "" + calisilanSaat + " * " + saatlikUcret + " = " + ucret + "";
		}
	}

}
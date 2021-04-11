package tr.edu.medipol.yazilimaraclari.antonygulce;

import org.junit.Test;

import tr.edu.medipol.yazilimaraclari.antonygulce.MuhasebeProgrami.*;

import org.junit.*;

public class MuhasebeProgramiTest {

	@Test
	public void testUcretHesapla() {

		MuhasebeProgrami.ucretHesapla(2, 4);

		int sonuc = Ucret.ucret;
		Assert.assertEquals(8, sonuc);
		
		
		MuhasebeProgrami.ucretHesapla(0, 3);
		sonuc = Ucret.ucret;
		Assert.assertEquals(0, sonuc);
		
		MuhasebeProgrami.ucretHesapla(0, 0);
		sonuc = Ucret.ucret;
		Assert.assertEquals(0, sonuc);
		
		MuhasebeProgrami.ucretHesapla(555, 0);
		sonuc = Ucret.ucret;
		Assert.assertEquals(0, sonuc);
		
		MuhasebeProgrami.ucretHesapla(-5, 2);
		sonuc = Ucret.ucret;
		Assert.assertEquals(-10, sonuc);
		
		MuhasebeProgrami.ucretHesapla(5, -1);
		sonuc = Ucret.ucret;
		Assert.assertEquals(-5, sonuc);
		
		MuhasebeProgrami.ucretHesapla(-2, 0);
		sonuc = Ucret.ucret;
		Assert.assertEquals(0, sonuc);
		
		
	}

}

package test;

import static org.junit.Assert.assertEquals;
import Domain.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.Before;
import org.junit.Test;
public class AllTest {
	
	


	@RunWith(Suite.class)
	@SuiteClasses({ PuntTest.class, SpelerTest.class})
	public class AllTests {

	}
	
	private Cirkel test;
	private int straal;
	private Punt middelPuntTest = new Punt(6,300);
	private Punt middelPunt = new Punt(100,9);
	private Cirkel c;
	
	
	@Before	
	public void setUp() throws Exception {
		
		straal = 3;
		
		c = new Cirkel(middelPunt, straal);
	}
	
	@Test
	public void Cirkel_Aanmaken_Geldig_Middelpunt_straal() {
		test = new Cirkel(middelPuntTest,3);
		straal = test.getRadius();
		middelPunt = new Punt(5,432);
		assertEquals(this.straal,test.getRadius());
		assertEquals(this.middelPunt, test.getMiddelPunt());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void Cirkel_Gooit_Exception_Als_Middelpunt_is_Null() {
		test = new Cirkel(null,straal);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void Cirkel_Gooit_Exception_Als_Straal_Kleiner_Nul() {
		test = new Cirkel(middelPunt,-6);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void Cirkel_Gooit_Exception_Als_Straal_Gelijk_Aan_Nul() {
		test = new Cirkel(middelPunt,0);
	}
	
	@Test
	public void Twee_Cirkels_Gelijk_Dezelde_Straal_Middelpunt() {
		Cirkel c1 = new Cirkel(middelPunt, straal);
		assertEquals(c,c1);
	}
	
	
}

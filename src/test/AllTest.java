package test;

public class AllTest {
	
	import static org.junit.Assert.assertEquals;
	import Domain.*;
	import org.junit.runner.RunWith;
	import org.junit.runners.Suite;
	import org.junit.runners.Suite.SuiteClasses;
	import org.junit.Before;
	import org.junit.Test;


	@RunWith(Suite.class)
	@SuiteClasses({ PuntTest.class, SpelerTest.class})
	public class AllTests {

	}
	
	private Cirkel test;
	private int straal;
	private int middelpunt;
	
	
	@Before	
	public void setUp() throws Exception {
		Cirkel c = new Cirkel(9,6);
		straal = 3;
		middelpunt = 6;
	}
	
	@Test
	public void Cirkel_Aanmaken_Geldig_Middelpunt_straal() {
		test = new Cirkel(6,3);
		straal = test.getRadius();
		middelpunt = 3;
		assertEquals(this.straal,test.getRadius());
		assertEquals(this.middelpunt, test.getMiddelPunt());
	}
	
	@Test (expected = IllegalArgumentException)
	public void Cirkel_Gooit_Exception_Als_Middelpunt_is_Null() {
		test = new Cirkel(null);
	}
	
	@Test (expected = IllegalArgumentException)
	public void Cirkel_Gooit_Exception_Als_Straal_Kleiner_Nul() {
		test = new Cirkel(-6);
	}
	
	@Test (expected = IllegalArgumentException)
	public void Cirkel_Gooit_Exception_Als_Straal_Gelijk_Aan_Nul() {
		test = new Crikel(0);
	}
	
	@Test
	public void Twee_Cirkels_Gelijk_Dezelde_Straal_Middelpunt() {
		Cirkel c1 = new Cirkel(straal, middelpunt);
		assertEquals(c,c1);
	}
	
	
}

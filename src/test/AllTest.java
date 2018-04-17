package test;

public class AllTest {
	
	import static org.junit.Assert.assertEquals;
	import Domain.Cirkel;
	import Domain.Speler;
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
		Cirkel c = new Cirkel(6);
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
		Crikel test = new Cirkel(-6);
	}
	
	@Test 
}

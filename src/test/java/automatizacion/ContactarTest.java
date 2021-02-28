package automatizacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ContactarTest {

	private WebDriver driver;
	Contactar contactar;
	
	@Before
	public void setUp() throws Exception {
		contactar = new Contactar(driver);
		driver = contactar.chromeDriverConexion();
		contactar.visit("http://automationpractice.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		contactar.contactar();
	}

}

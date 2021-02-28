package automatizacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RecuperarContraseniaTest {

	private WebDriver driver;
	RecuperarContrasenia recuperarContrasenia;
	
	@Before
	public void setUp() throws Exception {
		recuperarContrasenia = new RecuperarContrasenia(driver);
		driver = recuperarContrasenia.chromeDriverConexion();
		recuperarContrasenia.visit("http://automationpractice.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		recuperarContrasenia.recuperarContrasenia();
	}

}

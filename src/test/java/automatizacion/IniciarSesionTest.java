package automatizacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class IniciarSesionTest {

	private WebDriver driver;
	IniciarSesion iniciarSesion;
	
	@Before
	public void setUp() throws Exception {
		iniciarSesion = new IniciarSesion(driver);
		driver = iniciarSesion.chromeDriverConexion();
		iniciarSesion.visit("http://automationpractice.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		iniciarSesion.iniciarSesion();
	}

}

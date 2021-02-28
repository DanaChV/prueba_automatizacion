package automatizacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegistrarUsuarioTest {

	private WebDriver driver;
	RegistrarUsuario registrarUsuario;
	
	@Before
	public void setUp() throws Exception {
		registrarUsuario = new RegistrarUsuario(driver);
		driver = registrarUsuario.chromeDriverConexion();
		registrarUsuario.visit("http://automationpractice.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		registrarUsuario.registrarUsuario();
	}

}

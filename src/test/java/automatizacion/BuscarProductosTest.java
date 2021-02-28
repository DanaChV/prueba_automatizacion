package automatizacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BuscarProductosTest {

	private WebDriver driver;
	BuscarProductos buscarProductos;
	
	@Before
	public void setUp() throws Exception {
		buscarProductos = new BuscarProductos(driver);
		driver = buscarProductos.chromeDriverConexion();
		buscarProductos.visit("http://automationpractice.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		buscarProductos.buscarProductos();
	}

}

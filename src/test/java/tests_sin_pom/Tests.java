package tests_sin_pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tests {

	private WebDriver driver;
	By registrar = By.linkText("Sign in");
	By logoRegistrar = By.xpath("//*[@id=\"header_logo\"]/a/img");
	
	//crear cuenta
	By emailRegistro = By.id("email_create");
	By crearCuenta = By.id("SubmitCreate");
	By formularioRegistro = By.id("account-creation_form");
	
	//completar registro
	By titulo = By.id("id_gender2");
	By primerNombre = By.id("customer_firstname");
	By apellido = By.id("customer_lastname");
	By contrasenia = By.id("passwd");
	By dia = By.id("days");
	By mes = By.id("months");
	By anio = By.id("years");
	By direccion = By.id("address1");
	By direccionComplemento = By.id("address2");
	By ciudad = By.id("city");
	By estado = By.id("id_state");
	By codigoPostal = By.id("postcode");
	By pais = By.id("id_country");
	By telefono = By.id("phone_mobile");
	By referencia = By.id("alias");
	By btnRegistrar = By.id("submitAccount");
	
	By registroExitoso = By.xpath("//*[@id=\"center_column\"]/h1");
	By cerrarSesion = By.linkText("Sign out");
	
	//iniciar sesion
	By formularioIniciarSesion = By.id("login_form");
	By emailInicioSesion = By.id("email");
	By contraseniaInicioSesion = By.id("passwd");
	By btnInicioSesion = By.id("SubmitLogin");
	
	//olvido contrasenia
	By olvideContrasenia = By.linkText("Forgot your password?");
	By formularioOlvidoContrasenia = By.xpath("//*[@id=\"center_column\"]/div/h1");
	By btnRecuperarContrasenia = By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button");
	By confirmacionRecuperacion = By.xpath("//*[@id=\"center_column\"]/div/p");
	
	//flujo de compra
	By vestido = By.xpath("//*[@id=\"homefeatured\"]/li[6]/div/div[1]/div/a[1]/img");
	By vestidoId = By.id("bigpic");
	By cantidad = By.id("quantity_wanted");
	By talla = By.id("group_1");
	By anadir = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	By confirmacionAnadido = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
	By continuarComprando = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span");
	By volverInicio = By.linkText("Return to Home");
	By vista = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/div[1]/a/i");
	By camisa = By.id("thumb_4");
	By color = By.linkText("Blue");
	By procederCompra = By.linkText("Proceed to checkout");
	By formularioCompra = By.id("cart_title");
	By aceptarTerminos = By.id("cgv");
	By pagoTransferencia = By.linkText("Pay by bank wire");
	By confirmarCompra = By.xpath("//*[@id=\"cart_navigation\"]/button");
	By confirmacion = By.xpath("//*[@id=\"center_column\"]/div/p/strong");
	
	//contactar
	By contactar = By.linkText("Contact us");
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		
	}

	
	  @Test public void recuperarContrasenia() throws InterruptedException {
	  driver.findElement(registrar).click(); Thread.sleep(2000);
	  if(driver.findElement(logoRegistrar).isDisplayed()) {
	  
	  driver.findElement(olvideContrasenia).click();
	  
	  Thread.sleep(3000);
	  
	  }else { System.out.print("no se pudo iniciar sesion, recuperar contrasenia");
	  }
	  
	  if(driver.findElement(formularioOlvidoContrasenia).isDisplayed()) {
	  driver.findElement(emailInicioSesion).sendKeys("anitadominguez27@gmail.com");
	  
	  driver.findElement(btnRecuperarContrasenia).click();
	  
	  Thread.sleep(3000);
	  
	  assertTrue(driver.findElement(confirmacionRecuperacion).isDisplayed());
	  System.out.print("se ha recuperado la contrasenia");
	  
	  }else {
	  
	  System.out.print("no se ha podido efectuar la accion"); } }
	  
	  @Test public void iniciarSesion() throws InterruptedException {
	  driver.findElement(registrar).click(); Thread.sleep(2000);
	  if(driver.findElement(logoRegistrar).isDisplayed()) {
	  driver.findElement(emailInicioSesion).sendKeys("anitadominguez911@gmail.com")
	  ; driver.findElement(contraseniaInicioSesion).sendKeys("123456");
	  
	  driver.findElement(btnInicioSesion).click();
	  
	  Thread.sleep(3000);
	  
	  }else { System.out.print("no se pudo iniciar sesion, recuperar contrasenia");
	  }
	  
	  if(driver.findElement(registroExitoso).isDisplayed()) { //driver.quit();
	  driver.findElement(cerrarSesion).click();
	  System.out.print("el inicio de sesion fue exitoso"); }else {
	  System.out.print("el inicio de sesion no fue exitoso"); }
	  
	  }
	  
	  @Test public void registrarUsuario() throws InterruptedException {
	  
	  driver.findElement(registrar).click(); Thread.sleep(2000);
	  if(driver.findElement(logoRegistrar).isDisplayed()) {
	  driver.findElement(emailRegistro).sendKeys("anitadominguez0804@gmail.com");
	  
	  driver.findElement(crearCuenta).click();
	  
	  Thread.sleep(3000);
	  
	  }else { System.out.print("la cuenta no fue creada exitosamente"); }
	  
	  if(driver.findElement(formularioRegistro).isDisplayed()) {
	  driver.findElement(titulo).click();
	  driver.findElement(primerNombre).sendKeys("Ana");
	  driver.findElement(apellido).sendKeys("Dominguez");
	  driver.findElement(contrasenia).sendKeys("123456");
	  driver.findElement(dia).sendKeys("4");
	  driver.findElement(mes).sendKeys("November");
	  driver.findElement(anio).sendKeys("1993");
	  driver.findElement(direccion).sendKeys("1959 NE 153 ST");
	  driver.findElement(ciudad).sendKeys("North Miami");
	  driver.findElement(codigoPostal).sendKeys("33162");
	  driver.findElement(estado).sendKeys("Florida");
	  driver.findElement(pais).sendKeys("United States");
	  driver.findElement(telefono).sendKeys("3056273474");
	  driver.findElement(referencia).clear();
	  driver.findElement(referencia).sendKeys("GL (Suite)");
	  
	  driver.findElement(btnRegistrar).click(); }else {
	  System.out.print("el registro no fue exitoso"); }
	  
	  if(driver.findElement(registroExitoso).isDisplayed()) { //driver.quit();
	  driver.findElement(cerrarSesion).click();
	  System.out.print("el registro fue exitoso"); }else {
	  System.out.print("el registro no fue exitoso"); } }
	 
	  
	  
	  @Test public void flujoCompra() throws InterruptedException {
	  
	  Thread.sleep(2000); 
	  
	  if(driver.findElement(logoRegistrar).isDisplayed()) {
	  
	  driver.findElement(vestido).click(); Thread.sleep(5000);
	  
	  assertTrue(driver.findElement(vestidoId).isDisplayed());
	  //driver.findElement(talla).isSelected(); driver.findElement(anadir).click();
	  
	  assertTrue(driver.findElement(confirmacionAnadido).isDisplayed());
	  
	  driver.findElement(continuarComprando).click();
	  driver.findElement(volverInicio).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(vista).click(); driver.findElement(camisa).click();
	  driver.findElement(color).click(); driver.findElement(anadir).click();
	  
	  assertTrue(driver.findElement(confirmacionAnadido).isDisplayed());
	  
	  driver.findElement(procederCompra).click();
	  
	  Thread.sleep(2000);
	  assertTrue(driver.findElement(formularioCompra).isDisplayed());
	  
	  driver.findElement(procederCompra).click();
	  
	  Thread.sleep(2000);
	  assertTrue(driver.findElement(formularioIniciarSesion).isDisplayed());
	  
	  //iniciarSesion();
	  driver.findElement(emailInicioSesion).sendKeys("anitadominguez911@gmail.com")
	  ; driver.findElement(contraseniaInicioSesion).sendKeys("123456");
	  
	  driver.findElement(btnInicioSesion).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(procederCompra).click();
	  driver.findElement(aceptarTerminos).click();
	  driver.findElement(pagoTransferencia).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(confirmarCompra).click();
	  
	  Thread.sleep(3000);
	  assertTrue(driver.findElement(confirmacion).isDisplayed());
	  
	  driver.findElement(cerrarSesion).click();
	  
	  }else { System.out.print("no se pudo iniciar sesion, recuperar contrasenia");
	  }
	  
	  }

		
}

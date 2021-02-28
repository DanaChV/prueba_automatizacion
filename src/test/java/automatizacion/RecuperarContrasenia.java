package automatizacion;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecuperarContrasenia extends Base{

	By registrar = By.linkText("Sign in");
	By logoRegistrar = By.xpath("//*[@id=\"header_logo\"]/a/img");
	
	By olvideContrasenia = By.linkText("Forgot your password?");
	By formularioOlvidoContrasenia = By.xpath("//*[@id=\"center_column\"]/div/h1");
	By btnRecuperarContrasenia = By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button");
	By confirmacionRecuperacion = By.xpath("//*[@id=\"center_column\"]/div/p");
	
	By emailInicioSesion = By.id("email");
	
	public RecuperarContrasenia(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void recuperarContrasenia() throws InterruptedException {
		  click(registrar); 
		  Thread.sleep(2000);
		  
		  if(isDisplayed(logoRegistrar)) {
		  
		  click(olvideContrasenia);
		  
		  Thread.sleep(3000);
		  
		  }else { 
			  System.out.print("ocurrio un error");
		  }
		  
		  if(isDisplayed(formularioOlvidoContrasenia)) {
		  type("anitadominguez27@gmail.com",emailInicioSesion);
		  
		  click(btnRecuperarContrasenia);
		  
		  Thread.sleep(3000);
		  
		  assertTrue(isDisplayed(confirmacionRecuperacion));
		  System.out.print("se ha recuperado la contrasenia");
		  
		  }else {
			  System.out.print("no se ha podido efectuar la accion"); 
		  } 
	}
	
}

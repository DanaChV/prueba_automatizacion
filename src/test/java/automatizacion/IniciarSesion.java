package automatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IniciarSesion extends Base{

	public IniciarSesion(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By registrar = By.linkText("Sign in");
	By logoRegistrar = By.xpath("//*[@id=\"header_logo\"]/a/img");
	
	By formularioIniciarSesion = By.id("login_form");
	By emailInicioSesion = By.id("email");
	By contraseniaInicioSesion = By.id("passwd");
	By btnInicioSesion = By.id("SubmitLogin");
	
	By registroExitoso = By.xpath("//*[@id=\"center_column\"]/h1");
	By cerrarSesion = By.linkText("Sign out");
	
	public void iniciarSesion() throws InterruptedException {
		  click(registrar); 
		  Thread.sleep(2000);
		  if(isDisplayed(logoRegistrar)) {
			  type("valeriareyes@gmail.com",emailInicioSesion);
			  type("123456",contraseniaInicioSesion);
		  
		  click(btnInicioSesion);
		  
		  Thread.sleep(3000);
		  System.out.print("inicio de sesion exitoso");
		  
		  }else { 
			  System.out.print("no se pudo iniciar sesion");
		  }
		  
		  if(isDisplayed(registroExitoso)) { 
		  click(cerrarSesion);
		  System.out.print("el inicio de sesion fue exitoso"); 
		  }else {
		  System.out.print("el inicio de sesion no fue exitoso"); }
		  
	}
	
}

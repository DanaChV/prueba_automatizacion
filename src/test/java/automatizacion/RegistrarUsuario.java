package automatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrarUsuario extends Base {

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
	
	public RegistrarUsuario(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void registrarUsuario() throws InterruptedException {
		click(registrar);
		Thread.sleep(2000);
		 if(isDisplayed(logoRegistrar)) {
			 type("valeriareyes@gmail.com",emailRegistro);
			 click(crearCuenta);
			  
			  Thread.sleep(3000);
			  
		}else { 
			System.out.print("la cuenta no fue creada exitosamente"); 
		}
		
		if(isDisplayed(formularioRegistro)) {
			click(titulo);
			type("Valeria",primerNombre);
			type("123456",contrasenia);
			type("8",dia);
			type("November",mes);
			type("1994",anio);
			type("1959 NE 153 ST",direccion);
			type("North Miami",ciudad);
			type("33162",codigoPostal);
			type("Florida",estado);
			type("United States",pais);
			type("3056273474",telefono);
			clear(referencia);
			type("GL (Suite)", referencia);
			
			click(btnRegistrar);
		}else {
			System.out.print("el registro no fue exitoso");
		}
		
		if(isDisplayed(registroExitoso)) { 
			  click(cerrarSesion);
			  System.out.print("se ha cerrado la sesion exitosamente"); 
		}else {
			  System.out.print("no se ha podido cerrar la sesion exitosamente"); 
		} 
	}
	
}

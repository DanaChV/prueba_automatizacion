package automatizacion;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Contactar extends Base{

	By logo = By.xpath("//*[@id=\"header_logo\"]/a/img");
	
	By contactar = By.linkText("Contact us");
	By formularioContacto = By.xpath("//*[@id=\"center_column\"]/form");
	By alertaConfirmacion = By.xpath("//*[@id=\"center_column\"]/p");
	By emailContacto = By.id("email");
	By mensaje = By.id("message");
	By btnEnviar = By.id("submitMessage");
	By ddlEscoger = By.id("id_contact");
	
	public Contactar(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String seleccionar() {
		Select seleccionarLista = new Select(findElement(ddlEscoger));
		seleccionarLista.deselectByVisibleText("Customer service");
		return getText(seleccionarLista.getFirstSelectedOption());
	}
	
	public void contactar() throws InterruptedException {
		if(isDisplayed(logo)) {
			 click(contactar);  
		}else { 
			System.out.print("ocurrio un error"); 
		}
		
		if(isDisplayed(formularioContacto)) {
			seleccionar();
			type("anitadominguez911@gmail.com", emailContacto);
			type("mi pedido ha llegado en mal estado",mensaje);
			click(btnEnviar);
			
			Thread.sleep(5000);
		}
		
		if(isDisplayed(alertaConfirmacion)) {
			System.out.print("mensaje enviado con exito"); 
		}else {
			System.out.print("ocurrio un error"); 
		}
	}
	
}

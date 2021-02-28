package automatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscarProductos extends Base{

	By logo = By.xpath("//*[@id=\"header_logo\"]/a/img");
	
	By caja = By.id("search_query_top");
	By busqueda = By.xpath("//*[@id=\"center_column\"]/h1/span[1]");
	By alerta = By.xpath("//*[@id=\"center_column\"]/p");
	
	public BuscarProductos(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void buscarProductos() throws InterruptedException {
		
		 if(isDisplayed(logo)) {
			 clear(caja);
			 type("casual dresses",caja);
			 submit(caja);
			 
			 System.out.print("busqueda exitosa"); 
			  
		}else { 
			System.out.print("la busqueda fallo"); 
		}
		 
		 if(isDisplayed(busqueda)) {
			 clear(caja);
			 type("pants",caja);
			 submit(caja);
			 
			 Thread.sleep(3000);
			 
			 if(isDisplayed(alerta)) {
				 System.out.print("alerta"); 
			 }
			  
		}else { 
			System.out.print("la busqueda fallo"); 
		} 
	}

}

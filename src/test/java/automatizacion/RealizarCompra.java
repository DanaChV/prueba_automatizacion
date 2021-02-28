package automatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RealizarCompra extends Base{

	public RealizarCompra(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

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
	
}

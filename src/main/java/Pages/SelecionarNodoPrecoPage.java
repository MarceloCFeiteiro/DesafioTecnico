package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelecionarNodoPrecoPage extends BasePage {

  private By BtnNext = By.id("nextsendquote");

    public void selecionarModo(String modo) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(pegarmodo(modo));
        elementoCarregado.click();
        irProximaPagina(BtnNext);
    }

    private By pegarmodo(String modo) {
        return By.xpath("//*[@value='" + modo + "']/../span");
    }
}

package Pages;

import Driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    protected static final int TempoEspera = 15;
    protected WebDriverWait wait;

    protected void preencherCampoTexto(String valor, By locator) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(locator);
        elementoCarregado.sendKeys(valor);
    }

    protected WebElement aguardaElementoFicarClicavel(By elemento) {
        wait = new WebDriverWait(Browser.driver, TempoEspera);
        return wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }


    protected void SelecionarPorvalor(String valor, WebElement elementoCarregado) {
        Select selectElement = new Select(elementoCarregado);
        selectElement.selectByValue(valor);
    }

    protected List<WebElement> pegarListaElementos(By seletor) {
        aguardaElementoFicarClicavel(seletor);
        return Browser.driver.findElements(seletor);
    }

    protected void enviarImagem(By txtNomeArquivo, By inputArquivo, String caminhoArquivo) {
        aguardaElementoFicarClicavel(txtNomeArquivo);
        Browser.driver.findElement(txtNomeArquivo).click();
        Browser.driver.findElement(inputArquivo).sendKeys(caminhoArquivo);
    }

    protected void irProximaPagina(By Bnt) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(Bnt);
        elementoCarregado.click();
    }

}

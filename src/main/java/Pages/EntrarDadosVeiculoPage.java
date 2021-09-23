package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EntrarDadosVeiculoPage extends BasePage {

    private By AbaAutomobile = By.id("nav_automobile");
    private By SelectMarca = By.id("make");
    private By TxtPerformanceMotor = By.id("engineperformance");
    private By TxtDataProducao = By.id("dateofmanufacture");
    private By SelectNumeroAcentos = By.id("numberofseats");
    private By SelectTipoCombustivel = By.id("fuel");
    private By TxtPreco = By.id("listprice");
    private By TxtPlaca = By.id("licenseplatenumber");
    private By TxtQuilometragem = By.id("annualmileage");
    private By BtnNext = By.id("nextenterinsurantdata");

    public void preencherCampos(String marca, String perfomanceMotor, String dataProducao,
                                String numeroAssentos, String tipoCombustivel,
                                String preco, String placa, String quilometragem) {

        acessarPaginaAutomobile();
        selecionarMarca(marca);
        prencherPerformanceMotor(perfomanceMotor);
        prencherDataFabricacao(dataProducao);
        selecionarNumeroAssentos(numeroAssentos);
        selecionarCombustivel(tipoCombustivel);
        preencherPreco(preco);
        preencherPlaca(placa);
        preencherQuilometragem(quilometragem);
        irProximaPagina(BtnNext);
    }

    public void acessarPaginaAutomobile() {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(AbaAutomobile);
        elementoCarregado.click();
    }

    private void selecionarMarca(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(SelectMarca);
        SelecionarPorvalor(valor, elementoCarregado);
    }

    private void prencherPerformanceMotor(String valor) {
        preencherCampoTexto(valor, TxtPerformanceMotor);
    }

    private void prencherDataFabricacao(String valor) {
        preencherCampoTexto(valor, TxtDataProducao);
    }

    private void selecionarNumeroAssentos(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(SelectNumeroAcentos);
        SelecionarPorvalor(valor, elementoCarregado);
    }

    private void selecionarCombustivel(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(SelectTipoCombustivel);
        SelecionarPorvalor(valor, elementoCarregado);
    }

    private void preencherPreco(String valor) {
        preencherCampoTexto(valor, TxtPreco);
    }

    private void preencherPlaca(String valor) {
        preencherCampoTexto(valor, TxtPlaca);
    }

    private void preencherQuilometragem(String valor) {
        preencherCampoTexto(valor, TxtQuilometragem);
    }

}

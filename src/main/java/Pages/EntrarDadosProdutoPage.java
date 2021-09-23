package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EntrarDadosProdutoPage extends BasePage {
    private By TxtDataInicio = By.id("startdate");
    private By SelectSomaSeguro = By.id("insurancesum");
    private By SelectClassificacao = By.id("meritrating");
    private By SelectSeguroDanos = By.id("damageinsurance");

    private By SelectCarroCortesia = By.id("courtesycar");
    private By BtnNext = By.id("nextselectpriceoption");

    public void preencherCampos(String dataInicio, String somaSeguro, String classiicacao, String danoSeguro, String produtosOpcionais, String carroCortesia) {

        prencherDataFabricacao(dataInicio);
        selecionarValorSeguro(somaSeguro);
        selecionarClassificacao(classiicacao);
        selecionarSeguroDamos(danoSeguro);
        selecionarProdutos(produtosOpcionais);
        selecionarCarroCortesia(carroCortesia);
        irProximaPagina(BtnNext);
    }

    private void prencherDataFabricacao(String valor) {
        preencherCampoTexto(valor, TxtDataInicio);
    }

    private void selecionarValorSeguro(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(SelectSomaSeguro);
        SelecionarPorvalor(valor, elementoCarregado);
    }

    private void selecionarClassificacao(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(SelectClassificacao);
        SelecionarPorvalor(valor, elementoCarregado);
    }

    private void selecionarSeguroDamos(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(SelectSeguroDanos);
        SelecionarPorvalor(valor, elementoCarregado);
    }

    private void selecionarCarroCortesia(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(SelectCarroCortesia);
        SelecionarPorvalor(valor, elementoCarregado);
    }

    private void selecionarProdutos(String produtos) {

        String[] arrayproduto = produtos.split(",");

        for (String produto : arrayproduto) {
            WebElement elementoCarregado = aguardaElementoFicarClicavel(pegarProduto(produto));
            elementoCarregado.click();
        }
    }

    private By pegarProduto(String produto) {
        return By.xpath("//*[text()='" + produto + "']/span");
    }

}

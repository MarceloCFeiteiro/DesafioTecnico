package StepDefinitions;

import Pages.SelecionarNodoPrecoPage;
import io.cucumber.java.pt.E;

public class SelecionarModoPrecoSteps {

private SelecionarNodoPrecoPage selecionarNodoPrecoPage;

    public SelecionarModoPrecoSteps(){
        this.selecionarNodoPrecoPage = new SelecionarNodoPrecoPage();
    }

    @E("seleciono o modo {string} de preco")
    public void selecionoOModoDePreco(String modo) {
        selecionarNodoPrecoPage.selecionarModo(modo);
    }
}

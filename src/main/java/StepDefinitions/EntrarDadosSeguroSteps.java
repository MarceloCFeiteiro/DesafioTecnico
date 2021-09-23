package StepDefinitions;

import Pages.EntrarDadosSeguroPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.E;
import java.util.List;
import java.util.Map;

public class EntrarDadosSeguroSteps {

    private EntrarDadosSeguroPage entrarDadosSeguroPage;

    public EntrarDadosSeguroSteps() {

        this.entrarDadosSeguroPage = new EntrarDadosSeguroPage();
    }

    @E("preencho os dados do seguro")
    public void preenchoOsDadosDoSeguro(DataTable table) {
        List<Map<String, String>> valores = table.asMaps();
        for (Map<String, String> mapa : valores) {

            entrarDadosSeguroPage.preencherCampos(mapa.get("PrimeiroNome"), mapa.get("UltimoNome"), mapa.get("DataNascimento")
                    , mapa.get("Genero"), mapa.get("Rua"), mapa.get("Pais"), mapa.get("Cep"), mapa.get("Cidade")
                    , mapa.get("Ocupacao"),mapa.get("Hobie"),mapa.get("WebSite"));
        }
    }
}


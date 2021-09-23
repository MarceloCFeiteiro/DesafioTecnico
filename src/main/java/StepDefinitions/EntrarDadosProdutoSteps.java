package StepDefinitions;

import Helpers.DataHelper;
import Pages.EntrarDadosProdutoPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.E;
import java.util.List;
import java.util.Map;

public class EntrarDadosProdutoSteps {

    private EntrarDadosProdutoPage entrarDadosProdutoPage;

    public EntrarDadosProdutoSteps() {
        this.entrarDadosProdutoPage = new EntrarDadosProdutoPage();
    }

    @E("preencho os dados do produto")
    public void preenchoOsDadosDoProduto(DataTable table) {

        List<Map<String, String>> valores = table.asMaps();
        for (Map<String, String> mapa : valores) {

            entrarDadosProdutoPage.preencherCampos(DataHelper.PegarDataHojeAdicionarDias(32), mapa.get("SomaSeguro"), mapa.get("Classiicacao")
                    , mapa.get("DanoSeguro"), mapa.get("ProdutosOpcionais"), mapa.get("CarroCortesia"));

        }
    }
}

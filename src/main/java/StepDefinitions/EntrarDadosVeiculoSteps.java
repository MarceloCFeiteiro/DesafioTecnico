package StepDefinitions;

import Driver.Browser;
import Pages.EntrarDadosVeiculoPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;

public class EntrarDadosVeiculoSteps {

    public static String URL = "http://sampleapp.tricentis.com/101/app.php";
    private EntrarDadosVeiculoPage entrarDadosVeiculoPage;

    public EntrarDadosVeiculoSteps() {
        entrarDadosVeiculoPage = new EntrarDadosVeiculoPage();
    }

    @Before
    public void before() {
        System.out.println("======>  This is before step  <======");
    }

    @After
    public void after() {
        System.out.println("======>  This is after step  <======");
        Browser.clean();
    }

    @Dado("que acesso o site na pagina Automobile")
    public void queAcessoOSiteNaPaginaAutomobile() {
        Browser.navegaParaPagina(URL);
        entrarDadosVeiculoPage.acessarPaginaAutomobile();
    }

    @E("preencho os dados do veiculo")
    public void preenchoOsDadosDoVeiculo(DataTable table) {
        List<Map<String, String>> valores = table.asMaps();
        for (Map<String, String> mapa : valores) {

            entrarDadosVeiculoPage.preencherCampos(mapa.get("Marca"), mapa.get("PerFormanceMotor"), mapa.get("DataFabricacao"),
                    mapa.get("NumeroAssentos"), mapa.get("TipoCombustivel"), mapa.get("Preco"),
                    mapa.get("Placa"), mapa.get("Quilometragem"));

        }
    }
}
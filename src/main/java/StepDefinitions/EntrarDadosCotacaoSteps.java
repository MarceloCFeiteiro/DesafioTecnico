package StepDefinitions;

import Pages.EntrarDadosCotacaoPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

public class EntrarDadosCotacaoSteps {

    private EntrarDadosCotacaoPage entrarDadosCotacaoPage;

    public EntrarDadosCotacaoSteps() {
        this.entrarDadosCotacaoPage = new EntrarDadosCotacaoPage();
    }

    @E("preencho os dados do para a cotacao")
    public void preenchoOsDadosDoParaACotacao(DataTable table) {
        List<Map<String, String>> valores = table.asMaps();
        for (Map<String, String> mapa : valores) {

            entrarDadosCotacaoPage.preencherCampos(mapa.get("Email"), mapa.get("Telefone"), mapa.get("UserName")
                    , mapa.get("Password"), mapa.get("ConfirmaPassword"), mapa.get("Comentarios"));
        }
    }

    @Quando("enviar o email")
    public void enviarOEmail() {
        entrarDadosCotacaoPage.enviarEmail();
    }

    @Entao("a mensagem {string} sera mostrada na tela")
    public void aMensagemSeraMostradaNaTela(String mensagem) {
        String mensagemRetornada = entrarDadosCotacaoPage.retornarMensagemSucesso();
        Assert.assertEquals(mensagemRetornada, mensagem);
    }
}

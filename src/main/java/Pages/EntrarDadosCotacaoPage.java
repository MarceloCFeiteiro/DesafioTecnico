package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EntrarDadosCotacaoPage extends BasePage {

    private By TxtEmail = By.id("email");
    private By TxtTelefone = By.id("phone");
    private By TxtNomeUsuario = By.id("username");
    private By TxtPassword = By.id("password");
    private By TxtConfirmarPassword = By.id("confirmpassword");
    private By TxtComentarios = By.id("Comments");
    private By BtnEnviar = By.id("sendemail");
    private By AlertaSucesso = By.xpath("//*[contains(@class, 'showSweetAlert visible')]/h2");

    public void preencherCampos(String email, String telefone, String userName
            , String password, String confirmaPassword, String comentarios) {

        prencherEmail(email);
        prencherTelefone(telefone);
        prencherNomeUsuario(userName);
        prenchePassword(password);
        prencherComfirmarPassword(confirmaPassword);
        prencherComntarios(comentarios);
    }

    public void enviarEmail(){
        WebElement elementoCarregado = aguardaElementoFicarClicavel(BtnEnviar);
        elementoCarregado.click();
    }

    public String retornarMensagemSucesso() {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(AlertaSucesso);
        return elementoCarregado.getText();
    }

    private void prencherEmail(String valor) {
        preencherCampoTexto(valor, TxtEmail);
    }

    private void prencherTelefone(String valor) {
        preencherCampoTexto(valor, TxtTelefone);
    }

    private void prencherNomeUsuario(String valor) {
        preencherCampoTexto(valor, TxtNomeUsuario);
    }

    private void prenchePassword(String valor) {
        preencherCampoTexto(valor, TxtPassword);
    }

    private void prencherComfirmarPassword(String valor) {
        preencherCampoTexto(valor, TxtConfirmarPassword);
    }

    private void prencherComntarios(String valor) {
        preencherCampoTexto(valor, TxtComentarios);
    }


}

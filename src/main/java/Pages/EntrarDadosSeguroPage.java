package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EntrarDadosSeguroPage extends BasePage {

    private  static final String caminhoImagem = System.getProperty("user.dir") + "\\src\\main\\resources\\images\\Accenture.png";

    private By TxtPrimeiroNome = By.id("firstname");
    private By TxtUltimoNome = By.id("lastname");
    private By TxtDataNascimento = By.id("birthdate");
    private By TxtRua = By.id("streetaddress");
    private By SelectPais = By.id("country");
    private By TxtCep = By.id("zipcode");
    private By TxtCidade = By.id("city");
    private By SelectOcupacao = By.id("occupation");
    private By TxtWebSite = By.id("website");
    private By TxtNomeArquivo = By.id("picture");
    private By InputArquivo = By.id("picturecontainer");
    private By BtnNext = By.id("nextenterproductdata");

    public void preencherCampos(String primeiroNome, String ultimoNome, String dataNascimento, String genero
            , String rua, String pais, String cep, String cidade, String ocupacao, String hobies, String website) {
        preencherPrimeiroNome(primeiroNome);
        preencherUltimoNome(ultimoNome);
        prencherDataNascimento(dataNascimento);
        escolherGenero(genero);
        preencherRua(rua);
        selecionarPais(pais);
        preencherCep(cep);
        preencherCidade(cidade);
        selecionarOcupacao(ocupacao);
        selecionarHobies(hobies);
        prencherWebSite(website);
        enviarImagem(TxtNomeArquivo,InputArquivo,caminhoImagem);
        irProximaPagina(BtnNext);
    }

    private void preencherPrimeiroNome(String valor) {
        preencherCampoTexto(valor, TxtPrimeiroNome);
    }

    private void preencherUltimoNome(String valor) {
        preencherCampoTexto(valor, TxtUltimoNome);
    }

    private void prencherDataNascimento(String valor) {
        preencherCampoTexto(valor, TxtDataNascimento);
    }

    private void escolherGenero(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(pegarGenero(valor));
        elementoCarregado.click();
    }

    private void preencherRua(String valor) {
        preencherCampoTexto(valor, TxtRua);
    }

    private void selecionarPais(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(SelectPais);
        SelecionarPorvalor(valor, elementoCarregado);
    }

    private void preencherCep(String valor) {
        preencherCampoTexto(valor, TxtCep);
    }

    private void preencherCidade(String valor) {
        preencherCampoTexto(valor, TxtCidade);
    }

    private void selecionarOcupacao(String valor) {
        WebElement elementoCarregado = aguardaElementoFicarClicavel(SelectOcupacao);
        SelecionarPorvalor(valor, elementoCarregado);
    }

    private void selecionarHobies(String hobies) {

        String[] arrayHobie = hobies.split(",");

        for (String hobie : arrayHobie) {
            WebElement elementoCarregado = aguardaElementoFicarClicavel(pegarHobie(hobie));
            elementoCarregado.click();
        }
    }

    private void prencherWebSite(String valor) {
        preencherCampoTexto(valor, TxtWebSite);
    }

    private By pegarGenero(String genero) {
        return By.xpath("//*[text()='" + genero + "']/span");
    }

    //Na página existe um espaço na frente do hobie que se esta procurando, por isso esse espaço foi adcionado no seletor
    private By pegarHobie(String hobie) {
        return By.xpath("//*[text()=' " + hobie + "']/span");
    }
}

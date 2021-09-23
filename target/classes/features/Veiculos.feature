# language: pt
Funcionalidade: Desafio tecnico

  Cenario: Simular o contrato de um serviço
    Dado que acesso o site na pagina Automobile
    E preencho os dados do veiculo
      | Marca  | PerFormanceMotor | DataFabricacao | NumeroAssentos | TipoCombustivel | Preco | Placa   | Quilometragem |
      | Toyota | 1000             | 02/10/2000     | 6              | Gas             | 5000  | IOR4567 | 3000          |
    E preencho os dados do seguro
      | PrimeiroNome | UltimoNome | DataNascimento | Genero | Rua       | Pais     | Cep      | Cidade | Ocupacao | Hobie                 | WebSite      |
      | Fulano       | Beltrano   | 02/10/2001     | Male   | Oliveiras | Suriname | 44334097 | Surin  | Farmer   | Speeding,Cliff Diving | www.site.com |
    E preencho os dados do produto
      | SomaSeguro | Classiicacao | DanoSeguro    | ProdutosOpcionais                       | CarroCortesia |
      | 5000000    | Bonus 4      | Full Coverage | Euro Protection,Legal Defense Insurance | Yes           |
    E seleciono o modo "Gold" de preco
    E preencho os dados do para a cotacao
      | Email           | Telefone | UserName  | Password   | ConfirmaPassword | Comentarios |
      | email@teste.com | 98787645 | Fulano_33 | Senh@Fort3 | Senh@Fort3      | Um texto    |
    Quando enviar o email
    Entao a mensagem "Sending e-mail success!" sera mostrada na tela
#Author: e2etreinamentos@e2etreinamentos.com.br


Feature: Pesquisar google
 Eu como usuario quero realizar pesquisa no google

  @nao
  Scenario Outline: Pesquisar google
   Given acessar a pagina do google "https://www.google.com.br"
    When pesquisar <pesquisa>
    Then visualizo as <informacoes>

    Examples: 
      | pesquisa            |informacoes         |
      | "E2E Treinamentos"  |"E2E Treinamentos"  |   
      | "Inovacao"          |"Inovacao"          |   
      | "Felicidade"        |"Felicidade"        |  
      
 @executa
 
 Scenario Outline: Pesquisar google
    Given acessar a pagina do google "https://www.google.com.br"
    When pesquisar <pesquisa>
    Then visualizo as <informacoes>
    
     Examples: 
      | pesquisa            |informacoes         |
      | "bacon"             |"bacon"             |   
     
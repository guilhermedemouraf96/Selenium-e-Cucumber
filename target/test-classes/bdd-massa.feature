#Author: e2etreinamentos@e2etreinamentos.com.br

@tag
Feature: Pesquisar google
 Eu como usuario quero realizar pesquisa no google

  
  Scenario Outline: Pesquisar google
   Given acessar a pagina do google "https://www.google.com.br"
    When pesquisar <pesquisa>
    Then valido informacoes

    Examples: 
      | pesquisa            |
      | "E2E Treinamentos"  |    
      | "Inovacao"          |    
      | "Felicidade"        |    
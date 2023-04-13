package tests;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("acessar a pagina do google {string}")
	public void acessar_a_pagina_do_google(String site) throws IOException {
		metodos.abrirNavegador(site, "Chrome ou Firefox", "Abrir navegador");
	    
	}

	@When("pesquisar {string}")
	public void pesquisar(String texto) throws IOException {
		metodos.escrever(texto,el.getPesquisar(), "Fazer pesquisa");
		metodos.submit(el.getPesquisar(), "ENTER!");
		
	    
	}
	
	@Then("visualizo as {string}")
	public void visualizo_as(String teste) throws IOException {
		metodos.screenShot(teste);
	    metodos.fecharNavegador();
	}
		

	}
	   
	

	



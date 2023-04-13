package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By pesquisar = By.xpath("//input[@name='q']");
	private By E2ETreinamentos = By.xpath("/html/body/div[7]/div/div[11]/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/h2/span");
	private By Inovacao = By.xpath("/html/body/div[7]/div/div[11]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/h2/span");
	private By Felicidade = By.xpath("/html/body/div[7]/div/div[11]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/h2/span");

	public By getE2ETreinamentos() {
		return E2ETreinamentos;
	}

	public By getInovacao() {
		return Inovacao;
	}

	public By getFelicidade() {
		return Felicidade;
	}

	public By getPesquisar() {
		return pesquisar;
	}

}

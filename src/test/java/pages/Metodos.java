package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl, String navegador, String descricaoPasso) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\driversjava\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();

	}

	public void escrever(String texto, By elemento, String passo) throws IOException {

		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {

			System.out.println("-- Erro ao executar " + passo + LocalDateTime.now());
			screenShot("./erros" + passo);

		}

	}

	public void submit(By elemento, String passo) throws IOException {
		try {
			driver.findElement(elemento).submit();

		} catch (Exception e) {
			System.out.println("Erro ao selecionar elemento " + passo);
			screenShot(passo);

		}

	}

	public void fecharNavegador() {

		driver.quit();

	}

	public void validarTexto(String textoEsperado, String passo, By elemento) throws IOException {
		
		try {
			String texto = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, texto);
			
		}catch (Exception e) {
			System.out.println("Não foi possivel realizar " + passo + LocalDateTime.now());
			screenShot(passo);
		}

		

	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

}

Package test;
import static org.junit.Assert.*;
import org.junit.Test;
import.org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class InformacoesdoUsuario {
     private WebDriver navegador;



	 @Before
	 public void setUp(){
	 //Abrindo o navegador
	 System.setProperty("webdriver.chrome.driver","C:\\users\\helloa\\drivers\\chromedriver.exe");
	     navegador =  new ChromeDriver();
		navegador.manage().timeouts().implicitlywait(|:5, timeUnit.SECONDS);
	
	
	@Test
	 public void testAdicionarUmainformacaoadicionaldoUsuario () {	
     // Navegando para a página de staging
	 navegador.get("http://k8s.homolog.enem.appprova.com.br/");
	 
	 //Clicar no link que possui o texto "Crie sua conta"
	  navegador.findElement(By.linkText("Crie sua conta")).click();
	 
	 // Clicar no campo com name " Nome completo" que está dentro do formulário de name "Crie sua conta"
	  WebElement formularioCriesuaConta = navegador.findElement(By.name("Crie sua conta"));
	  
	 //Digitar dentro do campo "Nome completo" que está dentro do formulário "Crie sua conta" o texto "Helloa martins dos santos"
	 formularioCriesuaConta.findElement(By.name("Nome completo")).sendKeys(...charSequences:"Helloa martins dos santos");
	 
	 // Clicar no campo "e-mail" que está dentro do formulário "Crie sua conta"
	 WebElement formularioCriesuaConta = navegador.findElement(By.name("e-mail"));
	 
	 //Digitar dentro do campo "e-mail" que está dentro do formulário "Crie sua conta" o texto "helloamartins@hotmail.com"
	 formularioCriesuaConta.findElement(By.name("e-mail")).sendKeys(...charSequences:"helloamartins@hotmail.com");
	 
	 // Clicar no campo "Senha" que está dentro do formulário "Crie sua conta"
	 WebElement formularioCriesuaConta = navegador.findElement(By.name("Senha"));
	 
	 //Digitar dentro do campo "Senha" que está dentro do formulário "Crie sua conta" o texto "123456"
	 formularioCriesuaConta.findElement(By.name("Senha")).sendKeys(...charSequences:"123456");
	 
	 //Clicar no campo "Confirme sua senha" que está dentro do formulário "Crie sua conta"
	 WebElement formularioCriesuaConta = navegador.findElement(By.name("Confirme sua senha"));
	 
	 //Digitar dentro do campo "Confirme sua senha" que está dentro do formulário "Crie sua conta" o texto"123456"
	 formularioCriesuaConta.findElement(By.name("Confirme sua senha")).sendKeys(...charSequences:"123456");
	 
	 // Clicar no link com o texto "Cadastrar"
	 navegador.findElement(By.linkText("Cadastrar")).click;
	 
	 // Validar que dentro do elemento com class "fa fa-home" está o texto "Início"
	 WebElement fa fa-home = navegador.findElement(By.className("fa fa-home"));
	 String textoNoElementonfa fa-home = fa fa-home.getText();
	 assertEquals( expected:"Início", textoNoElementonfafa-home);
	 
	 // Clicar em um link que possui a class "fa fa-home"
	 navegador.findElement(By.className("fa fa-home")).click();
	 
	 //Clicar em um link que possui o texto "Dados escolares"
	 navegador.findElement(By.linktext("Dados escolares")
	 
	 // Na combo de name "Estado" escolher a opção "Rio de janeiro"
	 WebElement campoestado =  popupDadosescolares.findElement(By.name"user[estado_id]"));
	 new Select(campoEstado).selectByVisibleText("Rio de janeiro");
	 
	// Na combo "Cidade" escolher a opção "Angra dos Reis"
	new Select(campoCidade).selectByVisibleText(Angra dos Reis);
	
	// No campo de "Escola" digitar "Colégio Jean Piaget"
	popupDadosescolares.findElement(By.name("Escola")).sendKeys(...charSequences:"Colégio Jean Piaget");
	
	// Na combo "Série" escolher a opção "EAD"
	new Select(campoSérie).selectByVisibleText(EAD);
	
	//Clicar no texto que está com name "Salvar dados"
	popupDadosescolares.findElement(By.linktext("Salvar dados")).click();
	
	//Na mensagem de ID "flash-message-box" validar que o texto é "Dados atualizados com sucesso!"
	WebElement mensagemPop = navegador.findElement(By.id("flash-message-box));
	String mensagem = mensagemPop.getText();
	assertEquals(expected:"Dados atualizados com sucesso!", mensagem);
	
	
	}
	
	@After
	publicvoid tearDown(){
	 //Fechar o navegador
	 navegador.quit();
	  }
	  
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
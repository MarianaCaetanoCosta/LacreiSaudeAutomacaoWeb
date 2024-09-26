package modulos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@DisplayName("Teste Web - Lacrei Saude")
public class ProfissionalTest {

    public WebDriver navegador = new ChromeDriver();

    @Test
    @DisplayName("Teste Login")
    public void testFazerLogin() {
        //Abrir navegador
        System.setProperty("webdrive.chrome.driver", "C:\\Workspace_Intellij\\LacreiSaudeAutomacaoWeb\\Drivers\\chromedriver-win64\\chromedriver.exe");

        //Vou maximizar a tela
        navegador.manage().window().maximize();

        //Definir tempo de espera padrão de 5 segundos
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Navegar para a pagina da lojinha web
        navegador.get("https://paciente-staging.lacreisaude.com.br/");

        //Fazer Login
        navegador.findElement(By.id("email")).sendKeys("mariana.cae.costa@gmail.com");
        navegador.findElement(By.id("password")).sendKeys("M@ri1987");
        navegador.findElement(By.xpath("/html//section[@id='main-section']//form//button[@type='submit']")).click();

        //Vou fechar o navegador
        navegador.quit();
    }

    @Test
    @DisplayName("Teste - Pesquisa Profissional Cadastrado")
    public void testPesquisaProfissional(){

        //Abrir navegador
        System.setProperty("webdrive.chrome.driver", "C:\\Workspace_Intellij\\LacreiSaudeAutomacaoWeb\\Drivers\\chromedriver-win64\\chromedriver.exe");

        //Vou maximizar a tela
        navegador.manage().window().maximize();

        //Definir tempo de espera padrão de 5 segundos
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navegar para a pagina da lojinha web
        navegador.get("https://paciente-staging.lacreisaude.com.br/");

        //Fazer Login
        navegador.findElement(By.id("email")).sendKeys("mariana.cae.costa@gmail.com");
        navegador.findElement(By.id("password")).sendKeys("M@ri1987");
        navegador.findElement(By.xpath("/html//section[@id='main-section']//form//button[@type='submit']")).click();

        //Tela de Boas Vindas > Pesquisar Profissional
        navegador.findElement(By.id("search")).sendKeys("médico");
        navegador.findElement(By.xpath("//main[@id='main-content']/form[@class='search-container']//button[@type='submit']")).click();

        //Selecionar Profissional > Atendimentos > Exibir Contato
        navegador.findElement(By.linkText("Mariana Teste"));
        navegador.findElement(By.xpath("/html//div[@id='main-section']/div[2]/div[3]//button[@type='button']")).click();
        navegador.findElement(By.xpath("/html//div[@id='__next']/div//a[@href='/contatar-profissional/55348c9a/?category=online']//button[@type='button']")).click();

        //Vou fechar o navegador
        navegador.quit();
    }

    @Test
    @DisplayName("Teste Perfil Usuário - Editar Descrição Foto")
    public void testVerPerfilEditarDescricaoDaFoto(){
        //Abrir navegador
        System.setProperty("webdrive.chrome.driver", "C:\\Workspace_Intellij\\LacreiSaudeAutomacaoWeb\\Drivers\\chromedriver-win64\\chromedriver.exe");

        //Vou maximizar a tela
        navegador.manage().window().maximize();

        //Definir tempo de espera padrão de 5 segundos
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navegar para a pagina da lojinha web
        navegador.get("https://paciente-staging.lacreisaude.com.br/");

        //Fazer Login
        navegador.findElement(By.id("email")).sendKeys("mariana.cae.costa@gmail.com");
        navegador.findElement(By.id("password")).sendKeys("M@ri1987");
        navegador.findElement(By.xpath("/html//section[@id='main-section']//form//button[@type='submit']")).click();

        //Ver Perfil
        navegador.findElement(By.xpath("/html//div[@id='__next']/div//a[@title='Ver Perfil']/img[@alt='Foto de perfil']")).click();

        //Editar Foto
        navegador.findElement(By.xpath("/html//section[@id='alternative-section']/section//div[@class='image-btns']/div/button[@type='button']")).click();

        //Faça a descrição da sua foto > Salvar
        navegador.findElement(By.xpath("/html//textarea[@id='text']")).clear();
        navegador.findElement(By.xpath("/html//textarea[@id='text']")).sendKeys("Adicionar Foto de Perfil");
        navegador.findElement(By.xpath("//section[@id='alternative-section']/section/form//button[@type='submit']")).click();

        //Vou fechar o navegador
        navegador.quit();
    }

    @Test
    @DisplayName("Teste Perfil Usuário - Editar Dados")
    public void testVerPerfilEditarDados(){

        //Abrir navegador
        System.setProperty("webdrive.chrome.driver", "C:\\Workspace_Intellij\\LacreiSaudeAutomacaoWeb\\Drivers\\chromedriver-win64\\chromedriver.exe");

        //Vou maximizar a tela
        navegador.manage().window().maximize();

        //Definir tempo de espera padrão de 5 segundos
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navegar para a pagina da lojinha web
        navegador.get("https://paciente-staging.lacreisaude.com.br/");

        //Fazer Login
        navegador.findElement(By.id("email")).sendKeys("mariana.cae.costa@gmail.com");
        navegador.findElement(By.id("password")).sendKeys("M@ri1987");
        navegador.findElement(By.xpath("/html//section[@id='main-section']//form//button[@type='submit']")).click();

        //Ver Perfil
        navegador.findElement(By.xpath("/html//div[@id='__next']/div//a[@title='Ver Perfil']/img[@alt='Foto de perfil']")).click();

        //Editar Foto
        navegador.findElement(By.xpath("/html//section[@id='alternative-section']/section//div[@class='image-btns']/div/button[@type='button']")).click();

        //Editar Dados
        navegador.findElement(By.xpath("//section[@id='alternative-section']/section/div[5]/div/button[@type='button']")).click();
        navegador.findElement(By.id("name")).clear();
        navegador.findElement(By.id("lastName")).clear();
        navegador.findElement(By.xpath("/html//input[@id='birth_date']")).clear();

        navegador.findElement(By.id("name")).sendKeys("Nome");
        navegador.findElement(By.id("lastName")).sendKeys("Sobrenome");
        navegador.findElement(By.xpath("/html//input[@id='birth_date']")).sendKeys("27/02/1987");
        navegador.findElement(By.xpath("//section[@id='alternative-section']/section//span[.='Seu pronome']")).findElement(By.xpath("/html//section[@id='alternative-section']/section/div[4]/div[3]/div/div[1]/div//span[.='a/Ela/Dela']")).click();
        navegador.findElement(By.xpath("//section[@id='alternative-section']/section//span[.='Sua etnia']")).findElement(By.xpath("/html//section[@id='alternative-section']/section/div[4]/div[4]/div/div[5]/div//span[.='Preta']")).click();;
        navegador.findElement(By.xpath("//section[@id='alternative-section']/section//span[.='Sua identidade de gênero ']")).findElement(By.xpath("/html//section[@id='alternative-section']/section/div[4]/div[5]/div/div[6]/div//span[.='Mulher Cis']")).click();;
        navegador.findElement(By.xpath("//section[@id='alternative-section']/section//span[.='Sua sexualidade']")).findElement(By.xpath("/html//section[@id='alternative-section']/section/div[4]/div[6]/div/div[5]/div//span[.='Heterossexual']")).click();;
        navegador.findElement(By.xpath("//section[@id='alternative-section']/section//span[.='Sua(s) deficiência(s)']")).findElement(By.xpath("/html//section[@id='alternative-section']/section/div[4]/div[7]/div/div[1]/div/div/div/span/span[.='Não possuo deficiência']")).click();;
        navegador.findElement(By.xpath("/html//section[@id='alternative-section']/section/div[5]/div[2]/div/button[@type='button']")).click();

        //Vou fechar o navegador
        navegador.quit();
    }

    @Test
    @DisplayName("Teste Cadastrar Usuario")
    public void testCriarContaUsuario(){
        //Abrir navegador
        System.setProperty("webdrive.chrome.driver", "C:\\Workspace_Intellij\\LacreiSaudeAutomacaoWeb\\Drivers\\chromedriver-win64\\chromedriver.exe");

        //Vou maximizar a tela
        navegador.manage().window().maximize();

        //Definir tempo de espera padrão de 5 segundos
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navegar para a pagina da lojinha web
        navegador.get("https://paciente-staging.lacreisaude.com.br/");

        //Criar Conta de Usuário
        navegador.findElement(By.xpath("/html//section[@id='main-section']//form//button[@type='button']")).click();

        //Nome civil ou social
        navegador.findElement(By.id("first_name")).sendKeys("Novo");
        //Sobrenome
        navegador.findElement(By.id("last_name")).sendKeys("Usuario");
        //E-mail
        navegador.findElement(By.id("email")).sendKeys("novousuario@gmail.com");
        //Confirme seu e-mail
        navegador.findElement(By.id("email2")).sendKeys("novousuario@gmail.com");
        //Senha
        navegador.findElement(By.id("password1")).sendKeys("Novo@123");
        //Confirme sua senha
        navegador.findElement(By.id("password2")).sendKeys("Novo@123");
        //Termos de uso
        navegador.findElement(By.xpath("/html//section[@id='main-section']/div[@class='content-container']/form/div[@class='checkbox-container']/div[1]/label/span[@class='check-container']/span")).click();
        //Tenho 18 anos ou mais
        navegador.findElement(By.xpath("/html//section[@id='main-section']/div[@class='content-container']/form/div[@class='checkbox-container']/div[2]/label/span[@class='check-container']/span")).click();
        //Cadastrar
        navegador.findElement(By.xpath("/html//section[@id='main-section']//form//button[@type='submit']")).click();

    }
}

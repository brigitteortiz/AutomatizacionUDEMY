package motoresdebusqueda.dogpile;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import motoresdebusqueda.dogpile.steps.UsuarioDogpile;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


@RunWith(SerenityRunner.class)
public class CuandoEjecutamosUnaBusqueda {

    @Managed(driver="chrome",uniqueSession=true)
    WebDriver driver;

    @Steps
    UsuarioDogpile brigitte;

        @Test
    public void deberiamos_ver_resultados_relevantes(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\TM70976476\\Desktop\\AUTOMATIZACION PRIMERA\\src\\test\\resources\\webdriver\\chromedriver.exe");


            brigitte.ingresar_a_dogpile();
            brigitte.busca_por_palabra_clave("Rock nacional");
            brigitte.deberia_ver_resultados_con_palabra("rock");
        }

}

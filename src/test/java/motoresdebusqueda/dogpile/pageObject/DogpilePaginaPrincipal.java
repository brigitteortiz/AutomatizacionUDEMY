package motoresdebusqueda.dogpile.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.dogpile.com/")
public class DogpilePaginaPrincipal extends PageObject {

    @FindBy(css = "#q")
    WebElementFacade cajaDeBusqueda;

    @FindBy(xpath = "//div[@class='txt']")
    WebElementFacade botonDeBusqueda;

    public void ingresarPalabraClave(String palabraClave) {
        cajaDeBusqueda.type(palabraClave);
    }

    public void realizarBusqueda() {
        botonDeBusqueda.click();
    }
}
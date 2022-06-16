package Localizadores;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class YopMailLocalizadores extends PageObject {

    @FindBy(xpath = "//input[@id='login']")
    public WebElementFacade casillaEmail;

    @FindBy(xpath = "//i[@class='material-icons-outlined f36']")
    public WebElementFacade iconoFlecha;

    @FindBy(xpath = "//a[text()='Verifica tu correo electrónico']")
    public WebElementFacade botonVerificaTuCorreoElectronico;
}
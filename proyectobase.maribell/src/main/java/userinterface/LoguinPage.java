package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoguinPage {


    public static final Target USER = Target.the("")
            .located(By.name("username"));
    public static final Target PASSWORD = Target.the("")
            .located(By.name("password"));
    public static final Target SIGN_IN = Target.the("")
            .located(By.xpath("//button[contains(text(),'Enviar')]"));
    public static final Target ANSWER = Target.the("")
            .located(By.xpath("//p[contains(text(),'Se encuentra en el ciclo 2 de 10')]"));
    public static final Target TEXTO = Target.the("")
            .located(By.xpath("//body/div[2]/form[1]/div[1]/div[1]/textarea[1]"));
    public static final Target NUMERO = Target.the("")
            .located(By.name("number"));
    public static final Target RADIO = Target.the("")
            .located(By.xpath("//body/div[2]/form[1]/div[1]/div[3]/div[1]/label[11]/input[1]"));
    public static final Target SELECT = Target.the("")
            .located(By.name("select"));

    public static final Target ENVIAR = Target.the("")
            .located(By.xpath("//button[contains(text(),'Enviar')]"));








}

package tasks;


import model.DataLoguin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.LoguinPage;

import java.util.List;

public class LoguinUser implements Task {

    private  List<DataLoguin> dataLoguin;

    public LoguinUser(List<DataLoguin> dataLoguin) {
        this.dataLoguin = dataLoguin;
    }

    public static LoguinUser user(List<DataLoguin> dataLoguin) {

        return Tasks.instrumented(LoguinUser.class,dataLoguin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        DataLoguin info = dataLoguin.get(0);

        actor.attemptsTo(
              //  WaitUntil.the(LoguinPage.ICON, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
              //  Click.on(LoguinPage.ICON),
                WaitUntil.the(LoguinPage.USER, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(info.getUserName()).into(LoguinPage.USER),
                Enter.theValue(info.getPassword()).into(LoguinPage.PASSWORD),
                WaitUntil.the(LoguinPage.SIGN_IN, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(LoguinPage.SIGN_IN),
                WaitUntil.the(LoguinPage.TEXTO, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(info.getTexto()).into(LoguinPage.TEXTO),
                Enter.theValue(info.getNumero()).into(LoguinPage.NUMERO),
                Click.on(LoguinPage.RADIO),
                SelectFromOptions.byVisibleText(info.getSelect()).from(LoguinPage.SELECT),
               // WaitUntil.the(LoguinPage.ENVIAR, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
               // Scroll.to(LoguinPage.ENVIAR),
                Click.on(LoguinPage.ENVIAR));



    }}
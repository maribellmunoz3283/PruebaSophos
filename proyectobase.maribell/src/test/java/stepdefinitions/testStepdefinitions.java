package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import model.DataLoguin;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.TheAnswerRegister;
import tasks.LoguinUser;
import tasks.OpenUp;

import java.util.List;


public class testStepdefinitions {

    @Dado("que maribell requiere autenticarse")
    public void queMaribellRequiereAutenticarse() {


       OnStage.theActorCalled("maribell").wasAbleTo(OpenUp.openUpPage());
    }

    @Cuando("ella ingresa usuario y contraseña en la plataforma")
    public void ellaIngresaUsuarioYContraseñaEnLaPlataforma(List<DataLoguin> dataLoguin) {

        OnStage.theActorInTheSpotlight().attemptsTo(LoguinUser.user(dataLoguin));

    }

    @Entonces("ella verifica respuesta exitosa (.*)")
    public void ellaVerificaRespuestaExitosaSeencuentraenelciclo2de10(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswerRegister.is(question)));

    }



}

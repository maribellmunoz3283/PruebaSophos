package tasks;


import userinterface.OpenUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenUp implements Task {

    private OpenUpPage openUpPage;

    public static OpenUp openUpPage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs( T actor) {

        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(openUpPage));
    }
}



package util;


import cucumber.api.java.Before;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Advantage {

    @Before
    public void initialsetup () {
        OnStage.setTheStage(new OnlineCast());
    }

}

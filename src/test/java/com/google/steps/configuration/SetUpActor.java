package com.google.steps.configuration;

import com.google.utils.WebDriverSupliter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUpActor {
    @Before
    public void setTheStage() {

        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Fernando")
                .can(BrowseTheWeb
                        .with(WebDriverSupliter.getChromeDriver()
                        ));
    }

    @After
    public void afterStep() {
        WebDriverSupliter.quitDriver();
    }
}

package com.google.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.google.views.GoogleSearch.SEARCH;

public class Search implements Task {

    private String search;

    public Search(String search) {
        this.search = search;
    }

    public static Search search(String search) {
        return Instrumented.instanceOf(Search.class).withProperties(search);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(SEARCH),
                Enter.theValue(this.search).into(SEARCH).thenHit(Keys.ENTER)
        );
    }
}

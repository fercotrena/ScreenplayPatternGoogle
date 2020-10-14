package com.google.views;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleSearch {

    public static Target SEARCH = Target.the("Search").located(By.name("q"));
}

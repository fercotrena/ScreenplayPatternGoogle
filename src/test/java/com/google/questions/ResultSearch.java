package com.google.questions;

import com.google.utils.WebDriverSupliter;
import net.serenitybdd.core.photography.PageSourceRecorder;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResultSearch {

    public static Question<Boolean> resultSearch(String search) {
        return actor -> WebDriverSupliter.driver.getPageSource().contains(search);
    }
}

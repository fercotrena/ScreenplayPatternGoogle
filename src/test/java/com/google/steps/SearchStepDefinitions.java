package com.google.steps;

import com.google.questions.ResultSearch;
import com.google.tasks.Search;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dada;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchStepDefinitions {

    @Dada("una lista de palabras provista")
    public void unaListaDePalabrasProvista() {

        theActorInTheSpotlight().remember("word", "java");
    }

    @Cuando("se busca por una palabra de la lista")
    public void seBuscaPorUnaPalabraDeLaLista() {
        theActorInTheSpotlight().attemptsTo(Search.search(theActorInTheSpotlight().recall("word")));
    }

    @Entonces("se muestra en el resultado una referencia a la palabra consultada")
    public void seMuestraEnElResultadoUnaReferenciaALaPalabraConsultada() {
        theActorInTheSpotlight().should(eventually(seeThat(ResultSearch.resultSearch(theActorInTheSpotlight().recall("word")))));
    }

    @Dada("una {string}  provista")
    public void unaProvista(String word) {
        theActorInTheSpotlight().remember("word", word);
    }

    @Dado("un usuario conectado en google.com")
    public void unUsuarioConectadoEnGoogleCom() {
        theActorInTheSpotlight().attemptsTo(Open.relativeUrl("https://www.google.com"));
    }
}

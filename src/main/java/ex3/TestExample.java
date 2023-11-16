package ex3;

import java.util.Optional;

public class TestExample {

    //Dodać test gdy repo nic nie zwróci: test_prepareGreeting_nonExistingLang_returnsGreetingWithFallbackLang

    private LangRepository langRepository;

    static final Lang FALLBACK_LANG = new Lang(1L, "Hello", "en");

    String prepareGreeting(String name){
        return prepareGreeting(name);
    }

}

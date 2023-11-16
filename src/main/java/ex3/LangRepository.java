package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LangRepository {
    private List<Lang> langs;

    LangRepository(){
        langs = new ArrayList<>();
        langs.add(new Lang(1L, "Hello", "en"));
        langs.add(new Lang(2L,"siema", "pl"));
    }

    Optional<Lang> findByID(Long id){
        return langs.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst();
    }

}

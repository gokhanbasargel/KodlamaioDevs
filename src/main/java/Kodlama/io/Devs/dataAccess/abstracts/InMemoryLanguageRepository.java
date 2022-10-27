package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.bussiness.abstracts.LanguageService;
import Kodlama.io.Devs.bussiness.concretes.LanguageManager;
import Kodlama.io.Devs.dataAccess.concretes.LanaguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanaguageRepository{

   List<Language> languages;
    @Autowired
    public InMemoryLanguageRepository() {

        languages = new ArrayList<>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"C"));
        languages.add(new Language(3,"Python"));
        languages.add(new Language(4,"JavaScript"));
        languages.add(new Language(5,"PHP"));
        languages.add(new Language(6,"R"));

    }


    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(Language language) {
        languages.remove(language);
    }

    @Override
    public void update(Language language,int id) {
        languages.set(id-1, language);


    }

    @Override
    public List<Language> getAll() {

        return languages;
    }
}

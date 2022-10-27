package Kodlama.io.Devs.bussiness.abstracts;

import Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    void add(Language language);
    void delete(Language language);
    void update(Language language,int id) throws Exception;
    List<Language> getAll();
}

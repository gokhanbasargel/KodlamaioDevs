package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanaguageRepository {
    void add(Language language);
    void delete(Language language);
    void update(Language language,int id);
    List<Language> getAll();
}

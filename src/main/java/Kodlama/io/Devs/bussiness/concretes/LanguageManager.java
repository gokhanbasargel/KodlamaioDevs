package Kodlama.io.Devs.bussiness.concretes;

import Kodlama.io.Devs.bussiness.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.concretes.LanaguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
     private LanaguageRepository lanaguageRepository;

    @Autowired
    public LanguageManager(LanaguageRepository lanaguageRepository) {

        this.lanaguageRepository = lanaguageRepository;
    }


    @Override
    public void add(Language language) {
        if(isNameExist(language)== false && !idInBoud(language.getId()) ){
            lanaguageRepository.add(language);

        }
        else {
            System.out.println("İsim tekrar ediyor veya ID geçersiz");
        }


    }

    @Override
    public void delete(Language language) {
        lanaguageRepository.delete(language);
    }

    @Override
    public void update(Language language,int id) throws Exception {
        if (isNameExist(language) == false && idInBoud(language.getId()) == true&& idInBoud(id) == true) {
            lanaguageRepository.update(language, id);

        } else {
            System.out.println("İsim tekrar ediyor veya ID geçersiz");
        }
    }









    @Override
    public List<Language> getAll() {
        return lanaguageRepository.getAll();

    }

    public boolean isNameExist(Language language){
        List<Language> languageList = lanaguageRepository.getAll();
        for (Language _language  : languageList){
            if(_language.getName().equalsIgnoreCase(language.getName())){
               return true;
            }



        }
        return false;

    }
    public boolean idInBoud(int id){
        if(id>0 && id <= getAll().size()){
            return true;
        }
        else {
            return false;

        }

    }
}

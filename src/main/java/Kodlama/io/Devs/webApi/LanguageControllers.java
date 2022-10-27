package Kodlama.io.Devs.webApi;

import Kodlama.io.Devs.bussiness.abstracts.LanguageService;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/languages")
public class LanguageControllers {
    private LanguageService languageService;
    @Autowired
    public LanguageControllers(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<Language> getAll(){

        return languageService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody Language language){
        languageService.add(language);
    }
    @DeleteMapping ("/delete")
    public void delete(@RequestBody Language language){

        languageService.delete(language);
    }
    @PutMapping("/update")
    public void update(@RequestBody Language language,int id) throws Exception {
        languageService.update(language,id);

    }



}

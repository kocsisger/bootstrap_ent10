package hu.unideb.inf.bootstrap_en.controller;

import hu.unideb.inf.bootstrap_en.model.Person;
import hu.unideb.inf.bootstrap_en.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("")
    public String showHomepage(){
        return "index";
    }

    @GetMapping("/persons")
    public String getAllPersons(Model model){
        List<Person> personsList = personRepository.findAll();
        model.addAttribute("personsList", personsList);
        return "persons";
    }

    @GetMapping("/persons/new")
    public String newPerson(Model model){
        model.addAttribute("newPerson", new Person());
        return "newPersonForm";
    }

    @PostMapping("/persons/save")
    public String savePerson(Person newPerson){
        personRepository.save(newPerson);
        return "redirect:/persons";
    }

    @GetMapping("/persons/delete/{id}")
    public String deletePersonById(@PathVariable Long id){
        personRepository.deleteById(id);
        return "redirect:/persons";
    }
}

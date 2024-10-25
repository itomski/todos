package de.lubowiecki.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private TodoRepository repo;

    @GetMapping("/")
    public String index(Model ui) {
        ui.addAttribute("headline", "Herzlich Willkommen");
        return "standard";
    }

    @GetMapping("/add")
    public String showForm(Model ui) {
        ui.addAttribute("headline","Neuer Eintrag");
        return "todo-form";
    }

    @PostMapping("/save")
    public String save(String titel, String beschreibung, boolean erledigt, Model ui) {
        Todo todo = new Todo(titel, beschreibung, erledigt);
        repo.save(todo);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String showList(Model ui) {
        ui.addAttribute("headline", "Deine Todos");
        ui.addAttribute("showTable", true);
        ui.addAttribute("todos", repo.findAll());
        return "standard";
    }

    @GetMapping("/delete/{id}")
    public String showList(@PathVariable int id) {
        repo.deleteById(id);
        return "redirect:/list";
    }
}

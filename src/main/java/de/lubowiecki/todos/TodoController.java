package de.lubowiecki.todos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    private List<Todo> todos = new ArrayList<>();

    @GetMapping("/")
    public String zeigeTodos(Model ui) {
        ui.addAttribute("headline", "Herzlich Willkommen");
        return "standard";
    }

    @GetMapping("/add")
    public String addTodo(Model ui) {
        todos.add(new Todo("Essen mit Carol", "Bla bla bla bla..."));
        ui.addAttribute("headline","Eintrag erstellt.");
        return "standard";
    }

    @GetMapping("/list")
    public String showList(Model ui) {
        ui.addAttribute("headline", "Deine Todos");
        ui.addAttribute("showTable", true);
        ui.addAttribute("todos", todos);
        return "standard";
    }
}

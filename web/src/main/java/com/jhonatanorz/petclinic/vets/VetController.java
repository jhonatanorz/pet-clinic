package com.jhonatanorz.petclinic.vets;

import com.jhonatanorz.petclinic.vets.domain.VetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetRepository repository;

    public VetController(VetRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String index(Model model) {

        model.addAttribute("vets", repository.find());
        return "vets/index";
    }

}

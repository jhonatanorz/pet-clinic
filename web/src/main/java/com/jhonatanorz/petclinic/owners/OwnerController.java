package com.jhonatanorz.petclinic.owners;

import com.jhonatanorz.petclinic.owners.domain.OwnerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerRepository repository;

    public OwnerController(OwnerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String index(Model model) {

        model.addAttribute("owners", repository.find());
        return "owners/index";
    }

}

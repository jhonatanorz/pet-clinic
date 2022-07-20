package com.jhonatanorz.petclinic.owners;

import com.jhonatanorz.petclinic.owners.application.OwnerFinder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerGetController {

    private final OwnerFinder ownerFinder;

    public OwnerGetController(OwnerFinder ownerFinder) {
        this.ownerFinder = ownerFinder;
    }

    @GetMapping
    public String index(Model model) {

        model.addAttribute("owners", ownerFinder.search());
        return "owners/index";
    }

}

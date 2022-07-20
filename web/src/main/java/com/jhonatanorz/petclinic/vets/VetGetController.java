package com.jhonatanorz.petclinic.vets;

import com.jhonatanorz.petclinic.vets.application.VetFinder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetGetController {

    private final VetFinder finder;

    public VetGetController(VetFinder finder) {
        this.finder = finder;
    }

    @GetMapping
    public String index(Model model) {

        model.addAttribute("vets", finder.search());
        return "vets/index";
    }

}

package com.tax.app.controllers;

import com.tax.app.repositories.MunicipalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author Aurimas
 * @created 2021-10-24
 */

@Controller
public class IndexController {

    @Autowired
    MunicipalityRepository municipalityRepository;

    @GetMapping({"", "/", "/index"})
    public String showAllData(Model model){
        model.addAttribute("municipalities", municipalityRepository.findAll());
        return "home/index";
    }
}

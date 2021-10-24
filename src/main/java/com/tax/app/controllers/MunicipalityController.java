package com.tax.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Aurimas
 * @created 2021-10-25
 */
@Controller
public class MunicipalityController {

    @GetMapping("/new")
    private String displayNewInvoiceInputForm() {
        return "home/municipality";
    }

}

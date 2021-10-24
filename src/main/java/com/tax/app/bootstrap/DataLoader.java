package com.tax.app.bootstrap;

import com.tax.app.domain.Municipality;
import com.tax.app.domain.Tax;
import com.tax.app.repositories.MunicipalityRepository;
import com.tax.app.repositories.TaxRepository;
import com.tax.app.services.MunicipalityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Aurimas
 * @created 2021-10-24
 */

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    TaxRepository taxRepository;

    @Autowired
    MunicipalityRepository municipalityRepository;

    @Override
    public void run(ApplicationArguments args) {
        loadBaseData();
    }

    private void loadBaseData(){
        Municipality municipality = new Municipality();
        municipality.setMunicipalityName("Copenhagen");
        municipality.setCreatedAt(new Date());
        municipality.setTax(new Tax(0.2, 0.4, 0.1, municipality));

        MunicipalityServiceImpl municipalityService = new MunicipalityServiceImpl(municipalityRepository);
        municipalityService.saveMunicipality(municipality);
    }
}

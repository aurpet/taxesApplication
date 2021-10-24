package com.tax.app.services;

import com.tax.app.domain.Municipality;
import com.tax.app.repositories.MunicipalityRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
@Service
public class MunicipalityServiceImpl implements MunicipalityService {
    private final MunicipalityRepository municipalityRepository;

    public MunicipalityServiceImpl(MunicipalityRepository municipalityRepository) {
        this.municipalityRepository = municipalityRepository;
    }

    @Override
    public Set<Municipality> getMunicipalities() {
        Set<Municipality> municipalitySet = new HashSet<>();
        municipalityRepository.findAll().iterator().forEachRemaining(municipalitySet::add);
        return municipalitySet;
    }

    @Override
    public Municipality findById(Long l) {
        return null;
    }

    @Override
    public void saveMunicipality(Municipality municipality) {
        municipalityRepository.save(municipality);
    }
}

package com.tax.app.services;

import com.tax.app.domain.Municipality;

import java.util.Set;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
public interface MunicipalityService {
    Set<Municipality> getMunicipalities();
    Municipality findById(Long l);
    void saveMunicipality(Municipality municipality);
}

package com.tax.app.services;

import com.tax.app.domain.Tax;

import java.util.Set;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
public interface TaxService {
    Set<Tax> getTaxes();
    Tax findById(Long l);
    void saveTax(Tax tax);
}

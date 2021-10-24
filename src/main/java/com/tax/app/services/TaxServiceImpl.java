package com.tax.app.services;

import com.tax.app.domain.Tax;
import com.tax.app.repositories.TaxRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aurimas
 * @created 2021-10-24
 */

@Slf4j
@Service
public class TaxServiceImpl implements TaxService {
    private final TaxRepository taxRepository;

    public TaxServiceImpl(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }

    @Override
    public Set<Tax> getTaxes() {
        Set<Tax> taxSet = new HashSet<>();
        taxRepository.findAll().iterator().forEachRemaining(taxSet::add);
        log.debug("data: " + taxSet);
        return taxSet;
    }

    @Override
    public Tax findById(Long l) {
        return null;
    }

    @Override
    public void saveTax(Tax tax) {
        if (tax!=null){
            taxRepository.save(tax);
        }
    }
}

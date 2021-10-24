package com.tax.app.repositories;

import com.tax.app.domain.Tax;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
public interface TaxRepository extends CrudRepository<Tax, Long> {

}

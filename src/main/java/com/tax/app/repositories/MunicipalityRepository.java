package com.tax.app.repositories;

import com.tax.app.domain.Municipality;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
public interface MunicipalityRepository extends CrudRepository<Municipality, Long> {
}

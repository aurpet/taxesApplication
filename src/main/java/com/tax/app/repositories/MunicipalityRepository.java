package com.tax.app.repositories;

import com.tax.app.domain.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {
}

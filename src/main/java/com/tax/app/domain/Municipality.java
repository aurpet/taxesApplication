package com.tax.app.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Municipalities")
public class Municipality extends BaseEntity {
    private String municipalityName;
    private Date createdAt;
}

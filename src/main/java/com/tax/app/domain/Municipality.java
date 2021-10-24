package com.tax.app.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    @NotNull
    private String municipalityName;
    private Date createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "municipality_tax_id", referencedColumnName = "id")
    private Tax tax;
}

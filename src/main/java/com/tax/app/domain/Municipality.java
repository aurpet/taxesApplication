package com.tax.app.domain;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "municipalities")
@Data
public class Municipality extends BaseEntity {
    @NotNull
    private String municipalityName;
    private Date createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "municipality_id")
    private Tax tax;
}

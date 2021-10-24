package com.tax.app.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "taxes")
@Data
public class Tax extends BaseEntity {
    private double yearlyTax;
    private double monthlyTax;
    private double dayTax;

    public Tax(double yearlyTax, double monthlyTax, double dayTax) {
        this.yearlyTax = yearlyTax;
        this.monthlyTax = monthlyTax;
        this.dayTax = dayTax;
    }

    @OneToOne(mappedBy = "tax")
    private Municipality municipality;
}

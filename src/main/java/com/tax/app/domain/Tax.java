package com.tax.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Aurimas
 * @created 2021-10-24
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Taxes")
public class Tax extends BaseEntity {
    private double yearlyTax;
    private double monthlyTax;
    private double dayTax;
}

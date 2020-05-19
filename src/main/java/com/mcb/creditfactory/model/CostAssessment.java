package com.mcb.creditfactory.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COST_ASSESSMENT")
public class CostAssessment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "assessed_value")
    private BigDecimal value;

    @Column(name = "cost_assessment_date")
    private LocalDate localDate = LocalDate.now();

}

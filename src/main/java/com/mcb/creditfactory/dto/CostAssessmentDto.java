package com.mcb.creditfactory.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("cost")

public class CostAssessmentDto implements Collateral{

    private Long id;
    private BigDecimal assessedValue;
    private LocalDate date;
}

package com.mcb.creditfactory.service.cost_assessment;

import com.mcb.creditfactory.dto.AirplaneDto;
import com.mcb.creditfactory.dto.CostAssessmentDto;
import com.mcb.creditfactory.external.CollateralObject;
import com.mcb.creditfactory.external.CollateralType;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor

public class CostAssessmentAdapter implements CollateralObject {
    private CostAssessmentDto cost;

    @Override
    public BigDecimal getValue() {
        return cost.getAssessedValue();
    }

    @Override
    public Short getYear() {
        return null;
    }

    @Override
    public LocalDate getDate() {
        return cost.getDate();
    }
     @Override
    public CollateralType getType() {
        return CollateralType.COST_ASSESSMENT;
    }

    @Override
    public Long getId(){
        return cost.getId();
    }

}

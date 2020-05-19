package com.mcb.creditfactory.service.cost_assessment;

import com.mcb.creditfactory.dto.CarDto;
import com.mcb.creditfactory.dto.CostAssessmentDto;
import com.mcb.creditfactory.external.ExternalApproveService;
import com.mcb.creditfactory.model.Car;
import com.mcb.creditfactory.model.CostAssessment;
import com.mcb.creditfactory.repository.CostAssessmentRepository;
import com.mcb.creditfactory.service.car.CarAdapter;
import com.mcb.creditfactory.service.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CostAssessmentServiceImpl implements CostAssessmentService {
    @Autowired
    private ExternalApproveService approveService;

    @Autowired
    private CostAssessmentRepository costRepository;

    @Override
    public boolean approve(CostAssessmentDto dto) {
        return approveService.approve(new CostAssessmentAdapter(dto)) == 0;
    }

    @Override
    public CostAssessment save(CostAssessment cost) {
        return costRepository.save(cost);
    }

    @Override
    public Optional<CostAssessment> load(Long id) {
        return costRepository.findById(id);
    }

    @Override
    public CostAssessment fromDto(CostAssessmentDto dto) {
        return new CostAssessment(
                dto.getId(),
                dto.getAssessedValue(),
                dto.getDate()
                );
    }

    @Override
    public CostAssessmentDto toDTO(CostAssessment cost) {
        return new CostAssessmentDto(
                cost.getId(),
                cost.getValue(),
                cost.getLocalDate()
        );
    }
    @Override
    public Long getId(CostAssessment cost) {
        return cost.getId();
    }


}

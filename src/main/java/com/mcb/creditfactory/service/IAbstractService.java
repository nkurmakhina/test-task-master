package com.mcb.creditfactory.service;

import java.util.Optional;

public interface IAbstractService<Dto, Model> {
    boolean approve(Dto dto);
    Model save(Model costAssessment);
    Optional<Model> load(Long id);
    Model fromDto(Dto dto);
    Dto toDTO(Model costAssessment);
    Long getId(Model costAssessment);
}

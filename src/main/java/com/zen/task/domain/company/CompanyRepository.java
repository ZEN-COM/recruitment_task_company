package com.zen.task.domain.company;

import java.util.List;
import java.util.UUID;

public interface CompanyRepository {

    Company findById(UUID id);

    Company save(Company company);

    List<Company> findAll();

}

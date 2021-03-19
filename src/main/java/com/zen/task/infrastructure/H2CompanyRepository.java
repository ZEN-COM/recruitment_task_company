package com.zen.task.infrastructure;

import com.zen.task.domain.company.Company;
import com.zen.task.domain.company.NoSuchCompanyFoundException;
import com.zen.task.domain.company.CompanyRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class H2CompanyRepository implements CompanyRepository {

    private final H2JpaCompanyRepository repository;

    public H2CompanyRepository(final H2JpaCompanyRepository repository) {
        this.repository = repository;
    }

    public Company findById(UUID id) {
        return repository.findById(id).orElseThrow(() -> new NoSuchCompanyFoundException("Not Found"));
    }

    public Company save(Company company) {
        return repository.save(company);
    }

    @Override
    public List<Company> findAll() {
        return repository.findAll();
    }
}

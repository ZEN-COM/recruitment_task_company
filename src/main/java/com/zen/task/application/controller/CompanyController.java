package com.zen.task.application.controller;

import com.zen.task.domain.company.Company;
import com.zen.task.domain.company.CompanyRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private CompanyRepository repository;

    public CompanyController(final CompanyRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/random")
    public Company addRandom() {
        Company t = new Company(UUID.randomUUID(), "Company_" + System.currentTimeMillis());
        repository.save(t);
        return t;
    }

    @GetMapping
    public List<Company> getAll() {
        return repository.findAll();
    }

}

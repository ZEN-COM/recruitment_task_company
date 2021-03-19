package com.zen.task.infrastructure;

import com.zen.task.domain.company.Company;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface H2JpaCompanyRepository extends JpaRepository<Company, UUID> {

}

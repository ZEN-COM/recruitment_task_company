package com.zen.task.domain.company;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table
public class Company {

    @Id
    @Column(columnDefinition = "uniqueidentifier")
    @Type(type = "uuid-char")
    private UUID id;
    @Column
    private String name;

    public Company(final UUID id, final String name) {
        this.id = id;
        this.name = name;
    }

    Company() {

    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

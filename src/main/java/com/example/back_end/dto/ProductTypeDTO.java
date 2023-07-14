package com.example.back_end.dto;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ProductTypeDTO {

    private Long id;

    @Size(max = 100, message = "Name cannot be longer than 100 characters")
    @NotBlank(message = "Please insert value")
    @Column(unique = true)
    private String name;


    public ProductTypeDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductTypeDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.back_end.model;

import javax.persistence.*;

@Entity

public class ContractStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;

    public ContractStatus() {
    }

    public ContractStatus(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ContractStatus(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public long setId(Long id) {
        this.id = id;
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
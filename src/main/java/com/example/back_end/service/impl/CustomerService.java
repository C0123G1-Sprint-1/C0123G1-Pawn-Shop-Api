package com.example.back_end.service.impl;


import com.example.back_end.dto.ICustomerDto;
import com.example.back_end.repository.ICustomerRepository;
import com.example.back_end.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;


    @Override
    public Page<ICustomerDto> findAllBySearchCustomer(Pageable pageable, String name) {
        return iCustomerRepository.findAllBySearchCustomer(pageable, name);
    }

    @Override
    public Page<ICustomerDto> findByCustomer(Pageable pageable, String name) {
        return iCustomerRepository.findByCustomer(pageable, name);
    }

    @Override
    public ICustomerDto findByIdCustomer(Long id) {
        return iCustomerRepository.findByIdCustomer(id);
    }


}

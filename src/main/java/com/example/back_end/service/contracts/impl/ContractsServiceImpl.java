package com.example.back_end.service.contracts.impl;

import com.example.back_end.dto.ContractsDto;
import com.example.back_end.repository.IContractsRepository;
import com.example.back_end.service.contracts.IContractsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractsServiceImpl implements IContractsService {
    @Autowired
    private IContractsRepository contractsRepository;
    @Override
    public Page<ContractsDto> findAllProduct(Pageable pageable) {
        return contractsRepository.finAllProduct(pageable);
    }
}

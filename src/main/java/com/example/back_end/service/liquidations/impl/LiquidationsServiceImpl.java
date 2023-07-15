package com.example.back_end.service.liquidations.impl;

import com.example.back_end.model.Liquidations;
import com.example.back_end.repository.ILiquidationsRepository;
import com.example.back_end.service.liquidations.ILiquidationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by: KhangPVA
 * Date created: 13/07/2023
 * Function: create liquidation
 *
 * @param LiquidationDto
 * @return Liquidation
 */

@Service
public class LiquidationsServiceImpl implements ILiquidationsService {
    @Autowired
    private ILiquidationsRepository liquidationsRepository;


    @Override
    public void save(Liquidations liquidations) {
        System.out.println(liquidations.getCustomers().getId());
        liquidationsRepository.createLiquidations(liquidations.getContracts().getId(),liquidations.getCustomers().getId(),liquidations.getTotalPrice());
    }
}
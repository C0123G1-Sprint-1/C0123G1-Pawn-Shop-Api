package com.example.back_end.repository;

import com.example.back_end.dto.ICustomerDto;
import com.example.back_end.model.Customers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customers, Long> {
    @Query(value = "SELECT c.id, c.name AS name, c.citizen_code AS citizenCode, c.quantity_contract AS quantityContract,c.email\n" +
            "FROM customers AS c\n" +
            "WHERE is_delete = FALSE AND c.name LIKE concat('%', :name, '%') ",
            nativeQuery = true)
    Page<ICustomerDto> findByCustomer(Pageable pageable, @Param("name") String name);

    @Query(value = "SELECT c.id AS customerId,c.name AS name,c.citizen_code AS citizenCode, c.quantity_contract AS quantityContract FROM customers AS c WHERE c.id=:id", nativeQuery = true)
    ICustomerDto findByIdCustomer(@Param("id") Long customerId);

    @Query(value = "SELECT c.id AS id,c.name AS name,c.citizen_code AS citizenCode, c.email AS email FROM customers AS c WHERE c.name LIKE concat('%',:name,'%') ",
            nativeQuery = true)
    Page<ICustomerDto> findAllBySearchCustomer(Pageable pageable, @Param("name") String name);


    @Query(value = "SELECT * FROM customers AS c WHERE c.is_delete = FALSE", nativeQuery = true)
    List<Customers> getAllCustomer();
}

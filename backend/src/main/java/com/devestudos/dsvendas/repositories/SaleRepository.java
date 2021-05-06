package com.devestudos.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devestudos.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

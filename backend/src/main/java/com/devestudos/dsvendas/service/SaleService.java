package com.devestudos.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devestudos.dsvendas.dto.SaleDTO;
import com.devestudos.dsvendas.entities.Sale;
import com.devestudos.dsvendas.repositories.SaleRepository;
import com.devestudos.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
    
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> resultado = repository.findAll(pageable);
		return resultado.map(x -> new SaleDTO(x));
		
	}
}

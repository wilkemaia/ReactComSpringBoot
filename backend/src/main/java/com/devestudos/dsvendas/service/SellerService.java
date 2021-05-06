package com.devestudos.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devestudos.dsvendas.dto.SellerDTO;
import com.devestudos.dsvendas.entities.Seller;
import com.devestudos.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
    
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> resultado = repository.findAll();
		return resultado.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
		
	}
}

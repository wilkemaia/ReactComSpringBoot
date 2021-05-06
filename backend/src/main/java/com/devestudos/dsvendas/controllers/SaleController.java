package com.devestudos.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devestudos.dsvendas.dto.SaleDTO;
import com.devestudos.dsvendas.dto.SaleSucessDTO;
import com.devestudos.dsvendas.dto.SaleSumDTO;
import com.devestudos.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>>findAll(Pageable pageable){
		Page<SaleDTO> list =  service.findAll(pageable);
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping("/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>>amountGroupBySeller(){
		List<SaleSumDTO> list =  service.amountGroupBySeller();
		return ResponseEntity.ok(list);
		
	}
	

	@GetMapping("/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>>sucessGroupBySeller(){
		List<SaleSucessDTO> list =  service.sucessGroupBySeller();
		return ResponseEntity.ok(list);
		
	}
	
}

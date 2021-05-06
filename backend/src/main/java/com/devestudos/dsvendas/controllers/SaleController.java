package com.devestudos.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devestudos.dsvendas.dto.SaleDTO;
import com.devestudos.dsvendas.service.SaleService;

@RestController
@RequestMapping
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping("/sales")
	public ResponseEntity<Page<SaleDTO>>findAll(Pageable pageable){
		Page<SaleDTO> list =  service.findAll(pageable);
		return ResponseEntity.ok(list);
		
	}
}

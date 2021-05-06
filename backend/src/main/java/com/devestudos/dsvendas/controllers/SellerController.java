package com.devestudos.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devestudos.dsvendas.dto.SellerDTO;
import com.devestudos.dsvendas.service.SellerService;

@RestController
@RequestMapping
public class SellerController {

	@Autowired
	private SellerService service;
	
	@GetMapping("/sellers")
	public ResponseEntity<List<SellerDTO>>findAll(){
		List<SellerDTO> list =  service.findAll();
		return ResponseEntity.ok(list);
		
	}
}

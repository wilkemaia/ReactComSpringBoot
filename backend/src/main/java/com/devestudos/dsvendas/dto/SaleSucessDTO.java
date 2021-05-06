package com.devestudos.dsvendas.dto;

import java.io.Serializable;

import com.devestudos.dsvendas.entities.Seller;

public class SaleSucessDTO implements Serializable {
		
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	

	public SaleSucessDTO() {
		
	}

	public SaleSucessDTO(Seller seller, Long visited, Long deals) {
		
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	
	
	

}

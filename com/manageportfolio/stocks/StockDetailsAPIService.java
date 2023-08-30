package com.manageportfolio.stocks;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/stockdetails")
public class StockDetailsAPIService {

	StockDetails details;
	
	@GetMapping("{stockId}")
	public StockDetails get_stockDetails(String stockId) {

		return details;
	}
	
	@PostMapping
	public String create_stockDetails(@RequestBody StockDetails details) {
		this.details = details;
		return "Stock Created Successfully";
	}
	

}
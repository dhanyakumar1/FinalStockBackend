//package com.stockapp.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.stockapp.model.Buyer;
//import com.stockapp.model.Stock;
//import com.stockapp.service.IBuyerService;
//
//@CrossOrigin("http://localhost:4200")
//@RestController
//@RequestMapping("stocks-api")
//public class BuyerController {
//
//	IBuyerService buyerService;
//
//	@Autowired
//	public void setBuyerService(IBuyerService buyerService) {
//		this.buyerService = buyerService;
//	}
//
//	// http://localhost:8081/stocks-api/buyers
//	@GetMapping("/buyers")
//	public ResponseEntity<List<Buyer>> getAll() {
//		// response body
//		List<Buyer> buyers = buyerService.getAll();
//		HttpHeaders headers = new HttpHeaders();
//		// response headers
//		headers.add("desc", "All buyers");
//		headers.add("info", "Getting buyers from db");
//		ResponseEntity<List<Buyer>> responseEntity = new ResponseEntity<List<Buyer>>(buyers, headers, HttpStatus.OK);
//		return responseEntity;
//	}
//
//	// http://localhost:8081/stocks-api/buyers/stockname/NIFTY50
//	@GetMapping("/buyers/stockname/{stockName}")
//	public ResponseEntity<List<Buyer>> findBuyersByStockName(@PathVariable("stockName") String stockName) {
//		// response body
//		List<Buyer> buyers = buyerService.getBuyersByStock(stockName);
//		HttpHeaders headers = new HttpHeaders();
//		// response headers
//		headers.add("desc", "All buyers");
//		headers.add("info", "Getting buyers from db");
//		ResponseEntity<List<Buyer>> responseEntity = new ResponseEntity<List<Buyer>>(buyers, headers, HttpStatus.OK);
//		return responseEntity;
//	}
//
//}

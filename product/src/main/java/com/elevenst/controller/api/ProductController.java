package com.elevenst.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@GetMapping("/{productId}")
	public String getProduct(@PathVariable String productId) {
		throw new RuntimeException("I/O Exception"); // 에러 상황 테스트
		// return "[product id = " + productId + " at " + System.currentTimeMillis() + "]";
	}
	
}

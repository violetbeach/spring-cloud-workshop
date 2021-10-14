package com.elevenst.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product")
public interface FeignProductRemoteService {
	
	@RequestMapping("/products/{productId}")
	String getProductInfo(@PathVariable("productId") String productId);
	
}

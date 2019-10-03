package com.ing.catalog.service;

import com.ing.catalog.dto.PurchesDetailsDto;
import com.ing.catalog.dto.UploadFileResponseDto;

public interface PurchaseService {
	
	
	
	UploadFileResponseDto purchaseProduct(PurchesDetailsDto purchesDetailsDto);

}

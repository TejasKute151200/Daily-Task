package com.pdf.controller;

import java.io.ByteArrayInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdf.service.PdfService;

@RestController
@RequestMapping("/pdf")
public class PdfController {
	
	@Autowired 
	private PdfService service;
	
	@GetMapping("/TejTechWorld")
	public ResponseEntity<InputStreamResource> createPdf() {
		
		ByteArrayInputStream pdf = service.createPdf();
		
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd_HH:mm:ss");
//		String currentDate = dateFormat.format(new Date());
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("CONTENT_DISPOSITION", "inline;file=lcwd.pdf");	
		
		return ResponseEntity.ok()
				.headers(httpHeaders)
				.contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(pdf));
		
	}
	

}
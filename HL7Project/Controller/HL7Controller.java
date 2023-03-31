package com.example.HL7Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HL7Project.HL7Dto.HL7MessageRequest;
import com.example.HL7Project.Service.HL7MessageService;

@RestController
@RequestMapping("/api/hl7")
@Controller
public class HL7Controller {

	@Autowired
	private HL7MessageService hl7MessageService;

	@PostMapping()
	@RequestMapping(value = "/edit", produces = { "application/json" })
	public String editHL7Message(@RequestBody HL7MessageRequest request) throws Exception {
		return hl7MessageService.checkIDExist(request);
	} 
	 
	
	
	
	
	
	
	
	
	
	
	
}

package com.example.HL7Project.Service;

import com.example.HL7Project.HL7Dto.HL7MessageRequest;

public interface HL7MessageHandlerItf {

	String checkIDExist(HL7MessageRequest request) throws Exception;

}

package com.example.HL7Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HL7Project.Entity.Acknowledgements;


	@Repository
	public interface AcknowledgementsRepo extends JpaRepository<Acknowledgements, String>
	{

		


		

	}
		

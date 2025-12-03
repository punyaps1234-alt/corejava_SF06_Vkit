package Com.tnsif.placementmanagement_certificate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.tnsif.placementmanagement_certificate.entity.Certificate_entity;
import Com.tnsif.placementmanagement_certificate.repository.Certificate_repo;

@Service
public class Certificate_Service {
	
	@Autowired
	private Certificate_repo sr;
	
	// create
	
	public Certificate_entity registercertificate(Certificate_entity s) {
		return sr.save(s);
	}
	
	// read
	
	public List<Certificate_entity> getcertificates () {
		return (List<Certificate_entity>) sr.findAll();
	}
	
	//delete
	
	public void deletecertificate(Integer year) {
	sr.deleteById(year);
	}
	
}



package Com.tnsif.placementmanagement_certificate.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.tnsif.placementmanagement_certificate.entity.Certificate_entity;
import Com.tnsif.placementmanagement_certificate.service.Certificate_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
// postman->controller->service->repository->database
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Certificate_controller {
	
	@Autowired
	private Certificate_Service ss;
	
	@PostMapping("/add") // save
	public Certificate_entity registercertificate(@RequestBody Certificate_entity s) {
		return ss.registercertificate (s);
	}
	
	@GetMapping("/getcertificate") // get
	public List<Certificate_entity> getcertificates ()
	{
		return ss.getcertificates();
	}
	
	@DeleteMapping("/deletecertificate/{year}") // delete
	public void deletecertificate (@PathVariable("year")  Integer id) {
	ss.deletecertificate(id);

}
}
// update - putmapping


package Com.tnsif.placementmanagement_certificate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.tnsif.placementmanagement_certificate.entity.Certificate_entity;

@Repository

public interface Certificate_repo extends JpaRepository<Certificate_entity, Integer>{
	

}

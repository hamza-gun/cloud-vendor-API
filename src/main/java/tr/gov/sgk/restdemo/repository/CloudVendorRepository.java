package tr.gov.sgk.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.gov.sgk.restdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}

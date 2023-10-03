package tr.gov.sgk.restdemo.service;

import org.springframework.stereotype.Service;
import tr.gov.sgk.restdemo.exception.CloudVendorNotFoundException;
import tr.gov.sgk.restdemo.model.CloudVendor;
import tr.gov.sgk.restdemo.repository.CloudVendorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CloudVendorService implements ICloudVendorService{
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorService(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public void createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
    }

    @Override
    public void updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
    }

    @Override
    public void deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        Optional<CloudVendor> optionalCloudVendor = cloudVendorRepository.findById(vendorId);
        if (optionalCloudVendor.isPresent()) {
            return optionalCloudVendor.get();
        } else {
            throw new CloudVendorNotFoundException("Requested cloud vendor does not exist!");
        }
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}

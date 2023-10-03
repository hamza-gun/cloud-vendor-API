package tr.gov.sgk.restdemo.service;

import tr.gov.sgk.restdemo.model.CloudVendor;

import java.util.List;

public interface ICloudVendorService {
    void createCloudVendor(CloudVendor cloudVendor);
    void updateCloudVendor(CloudVendor cloudVendor);
    void deleteCloudVendor(String vendorId);
    CloudVendor getCloudVendor(String vendorId);
    List<CloudVendor> getAllCloudVendors();
}

package com.example.app.service.impl;

import com.example.app.model.CloudVendor;
import com.example.app.repository.CloudVendorRepository;
import com.example.app.service.CloudVendorService;
import org.springframework.stereotype.Service;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String id) {
        return cloudVendorRepository.findById(id).get();

    }

    @Override
    public String deleteCloudVendor(String id) {
        cloudVendorRepository.deleteById(id);
        return "Success";
    }
}

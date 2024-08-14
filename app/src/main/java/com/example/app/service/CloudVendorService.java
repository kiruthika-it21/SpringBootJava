package com.example.app.service;

import com.example.app.model.CloudVendor;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public CloudVendor getCloudVendor(String id);
    public String deleteCloudVendor(String id);

}

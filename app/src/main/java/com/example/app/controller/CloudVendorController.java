package com.example.app.controller;

import com.example.app.model.CloudVendor;
import com.example.app.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CloudVendorController {
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{id}")
    public CloudVendor getCloudvendorDetails(@PathVariable("id") String id)
    {
        return cloudVendorService.getCloudVendor(id);
    }

    @PostMapping
    public String createCloudVendors(@RequestBody CloudVendor cloudvendor)
    {
        cloudVendorService.createCloudVendor(cloudvendor);
        return "Cloud Vendor is Succefully created";
    }

    @PutMapping
    public String UpdateCloudVendors(@RequestBody CloudVendor cloudvendor)
    {
        cloudVendorService.updateCloudVendor(cloudvendor);
        return "Cloud Vendor is Succefully updated";
    }
    @DeleteMapping("{id}")
    public String DeleteCloudVendors(@PathVariable("id") String id)
    {
        cloudVendorService.deleteCloudVendor(id);
        return "Cloud Vendor is Succefully deleted";
    }
}
package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;
import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
    CloudVendorService cloudVendorService;
    public CloudAPIService(CloudVendorService cloudVendorService)
    {
        this.cloudVendorService = cloudVendorService;
    }
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        return cloudVendorService.getCloudVendor(vendorId);

    }
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAllCloudVendors();

    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Sucessfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Created Sucessfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetailsh(@PathVariable("vendorId") String vectorId)
    {
        cloudVendorService.deleteCloudVendor(vectorId);
        return "Cloud Vendor Deleted Sucessfully";
    }
}
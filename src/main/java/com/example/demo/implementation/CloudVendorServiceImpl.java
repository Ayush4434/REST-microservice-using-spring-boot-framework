package com.example.demo.implementation;

import com.example.demo.repository.CloudVendorRepository;
import com.example.demo.service.CloudVendorService;
import com.example.demo.model.CloudVendor;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class CloudVendorServiceImpl implements CloudVendorService{
 CloudVendorRepository cloudVendorRepository;
 @Override
 public String createCloudVendor(CloudVendor cloudvendor)
 {
    cloudVendorRepository.save(cloudvendor);
    return "Success";
 } 
 @Override
 public String updateCloudVendor(CloudVendor cloudvendor)
 {
    cloudVendorRepository.save(cloudvendor);
    return "Success";
 } 
 @Override
 public CloudVendor getCloudVendor(String cloudvendorId)
 {
    return cloudVendorRepository.findById(cloudvendorId).get();
 } 
 @Override
 public List<CloudVendor> getAllCloudVendors()
 {
    return cloudVendorRepository.findAll();
 } 
 @Override
 public String deleteCloudVendor(String cloudvectorId)
 {
    cloudVendorRepository.deleteById(cloudvectorId);
    return null;
 } 
}

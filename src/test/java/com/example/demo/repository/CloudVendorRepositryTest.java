package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.implementation.CloudVendorServiceImpl;
import com.example.demo.model.CloudVendor;
// import com.example.demo.service.CloudVendorService;

@SpringBootTest(classes={CloudVendorRepositryTest.class})
public class CloudVendorRepositryTest  {
    @Mock
    CloudVendorRepository cloudVendorRepository;
    @InjectMocks
    CloudVendorServiceImpl cloudVendorService;
    @Test
    @Order(1)
    public void test_getAllCloudVendors() {
		List<CloudVendor> myvendors=new ArrayList<CloudVendor>();
		myvendors.add(new CloudVendor("C1","Ayush","Moradabad","798054"));
		myvendors.add(new CloudVendor("C1","Ayush","Moradabad","798054"));
		//Mocking
		when(cloudVendorRepository.findAll()).thenReturn(myvendors);
		assertEquals(2,cloudVendorService.getAllCloudVendors().size());
		
	}
}

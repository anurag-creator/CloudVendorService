package com.think.rest_demo.controller;

import com.think.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
//                new CloudVendor("C1",
//                "Vendor1", "Address one", "xxxxxxxxxx");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Created Successfully ";
    }
@PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud vendor updated successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteClodVendorDetails(String vendorId){
      this.cloudVendor=null;
      return "Cloud vendor Deleted successfully";
    }
}

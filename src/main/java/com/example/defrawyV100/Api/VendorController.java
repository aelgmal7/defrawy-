package com.example.defrawyV100.Api;

import com.example.defrawyV100.db.VendorRepo;
import com.example.defrawyV100.models.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class    VendorController {
    @Autowired
    private VendorRepo vendorRepo;

    @GetMapping("/vendors")
    public List<Vendor> getAllVendors(){
        return vendorRepo.findAll();
    }
    @PostMapping("/vendors/add")
    public List<Vendor> addVendor(@RequestBody Vendor vendor) {
        vendorRepo.save(vendor);
        return vendorRepo.findAll();
    }

}

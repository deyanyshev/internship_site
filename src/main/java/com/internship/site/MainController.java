package com.internship.site;

import com.internship.site.model.Product;
import com.internship.site.model.User;
import com.internship.site.repository.CountryRepo;
import com.internship.site.repository.ProductRepo;
import com.internship.site.repository.TypeRepo;
import com.internship.site.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MainController {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private TypeRepo typeRepo;

    @Autowired
    private CountryRepo countryRepo;


    @GetMapping("/products")
    public List getProducts() {
        return (List) productRepo.findAll();
    }

    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product product) {
        productRepo.save(product);
    }
}

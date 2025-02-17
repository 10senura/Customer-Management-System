package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService Service;

    @PostMapping("/add")
    public void addCustomer( @RequestBody Customer customer){
        Service.addCustomer(customer);
    }

    @GetMapping("/get-all")
    List<Customer> getAll(){
    return Service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        Service.deleteCustomer(id);
    }

    @PutMapping("/update-Customer")
    public void updateCustomer(@RequestBody Customer customer){
        Service.updateCustomer(customer);
    }

}


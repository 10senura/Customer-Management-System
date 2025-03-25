package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
@RequiredArgsConstructor
@CrossOrigin
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

    @GetMapping("/search-id/{id}")
    public Customer searchCustomer(@PathVariable Integer id){
        return Service.SearchCustomerById(id);
    }

    @GetMapping("/search-name/{name}")
    public List<Customer> findByName(@PathVariable String name){
        return Service.SearchCustomerByName(name);
    }

    @GetMapping("/search-address/{address}")
    public List<Customer> fineByAddress(@PathVariable String address){return Service.SearchCustomerByAddress(address);
    }
    @GetMapping("search-salary/{salary}")
    public List<Customer> findBySalary(@PathVariable Double salary){
        return Service.searchCustomerBySalary(salary);
    }

}


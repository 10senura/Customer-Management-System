package edu.icet.repository;

import edu.icet.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {

    List<CustomerEntity> findByName(String name);
    List<CustomerEntity> findByAddress(String address);
    List<CustomerEntity> findBySalary(Double salary);
}

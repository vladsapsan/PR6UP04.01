package com.example.edpr62022.repo;

import com.example.edpr62022.models.License;
import org.springframework.data.repository.CrudRepository;

public interface LicenseRepository extends CrudRepository<License, Long> {
    License findByLicense(String number);
}

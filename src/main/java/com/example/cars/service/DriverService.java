package com.example.cars.service;

import com.example.cars.domain.Driver;
import com.example.cars.exception.DriverNotFoundException;
import com.example.cars.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

/**
 * Created by TheSuperHomie on 1/8/17.
 */
@Service
public class DriverService {
    private final DriverRepository driverRepository;

    @Autowired
    DriverService(DriverRepository driverRepository) {
        Objects.nonNull(driverRepository);
        this.driverRepository = driverRepository;
    }

    public Driver getDriver(Long id) {
        return Optional.ofNullable(driverRepository.findOne(id)).orElseThrow(DriverNotFoundException::new);
    }
}

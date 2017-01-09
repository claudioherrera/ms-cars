package com.example.cars.repository;

import com.example.cars.domain.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by TheSuperHomie on 1/8/17.
 */
@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}

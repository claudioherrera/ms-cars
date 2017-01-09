package com.example.cars.resource;

import com.example.cars.domain.Driver;
import com.example.cars.service.DriverService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by TheSuperHomie on 1/8/17.
 */
@RestController
@RequestMapping(value = "/driver", produces = "application/json")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    @ApiOperation("Get a driver")
    public Driver get(@PathVariable("id") Long id) {
        return driverService.getDriver(id);
    }
}

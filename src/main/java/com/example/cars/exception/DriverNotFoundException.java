package com.example.cars.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by TheSuperHomie on 1/8/17.
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Driver not found.")
public class DriverNotFoundException extends IllegalStateException {
}

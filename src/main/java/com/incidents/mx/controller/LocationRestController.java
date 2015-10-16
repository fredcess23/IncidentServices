package com.incidents.mx.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incidents.mx.model.Location;;


@RestController
public class LocationRestController {

	@RequestMapping("/mensaje")
    public List<Location> message() {
		
        return null;
    }

}

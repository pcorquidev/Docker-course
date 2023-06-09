package com.example.dockerapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platillos")
public class PlatillosController {

    @Autowired
    private PlatillosService platillos;


    @GetMapping("/getPlatillos")
    public ResponseEntity getAll(){
        return new ResponseEntity<>(platillos.getAll(), HttpStatus.OK);
    }

}

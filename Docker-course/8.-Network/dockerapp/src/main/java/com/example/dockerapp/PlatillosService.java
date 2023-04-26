package com.example.dockerapp;

import com.example.dockerapp.entity.Platillos;
import com.example.dockerapp.repository.PlatillosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlatillosService {

    @Autowired
    private PlatillosRepository platillosRepository;

    public List<Platillos> getAll(){
        return (List<Platillos>) platillosRepository.findAll();
    }
}

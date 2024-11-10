package com.example.gestaoHospitalar.controller;

import com.example.gestaoHospitalar.pacientes.Paciente;
import com.example.gestaoHospitalar.pacientes.PacienteRepository;
import com.example.gestaoHospitalar.pacientes.PacienteRequestDTO;
import com.example.gestaoHospitalar.pacientes.PacienteResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @CrossOrigin(origins = "*", allowCredentials = "*")
    @PostMapping
    public void savePaciente(@RequestBody PacienteRequestDTO data){
        Paciente pacienteData = new Paciente(data);
        repository.save(pacienteData);
        return;

    }
    @CrossOrigin(origins = "*", allowCredentials = "*")
    @GetMapping
    public List<PacienteResponseDTO> getAll(){

        List<PacienteResponseDTO> pacienteList = repository.findAll().stream().map(PacienteResponseDTO::new).toList();
        return pacienteList;
    }
}

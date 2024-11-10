package com.example.gestaoHospitalar.pacientes;

public record PacienteResponseDTO(Long id, String nome, Integer idade) {
    public PacienteResponseDTO(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getIdade());
    }


}

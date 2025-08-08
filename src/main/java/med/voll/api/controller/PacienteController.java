package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.paciente.DatosRegistroPaciente;
import med.voll.api.paciente.PaacienteRepository;
import med.voll.api.paciente.Paciente;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PaacienteRepository repository;

    @PostMapping
    @Transactional
    public void registrar(@RequestBody @Valid DatosRegistroPaciente datos){
        repository.save(new Paciente(datos));
    }
}

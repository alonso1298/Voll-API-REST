package med.voll.api.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class GestorDeErrores {

    @ExceptionHandler(EntityNotFoundException.class) // Cuando halla un error de tipo EntityNotFoundException se llamara al metodo gestionarError404
    public ResponseEntity gestionarError404(){
        return ResponseEntity.notFound().build();
    }
}

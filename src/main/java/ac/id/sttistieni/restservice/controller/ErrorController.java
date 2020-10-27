package ac.id.sttistieni.restservice.controller;

import ac.id.sttistieni.restservice.model.WebResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(value = ConstraintViolationException.class)
    public WebResponse<String> validationHandler(ConstraintViolationException constraintViolationException){
        return new WebResponse<>(
                HttpStatus.BAD_REQUEST.value(),
                "BAD REQUEST",
                constraintViolationException.getMessage()
        );
    }
}

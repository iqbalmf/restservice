package ac.id.sttistieni.restservice.controller;

import ac.id.sttistieni.restservice.error.NotFoundException;
import ac.id.sttistieni.restservice.error.UnauthorizedException;
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

    @ExceptionHandler(value = NotFoundException.class)
    public WebResponse<String> notFound(NotFoundException constraintViolationException){
        return new WebResponse<>(
                HttpStatus.NOT_FOUND.value(),
                "NOT FOUND",
                constraintViolationException.getMessage()
        );
    }

    @ExceptionHandler(value = UnauthorizedException.class)
    public WebResponse<String> validationHandler(UnauthorizedException constraintViolationException){
        return new WebResponse<>(
                HttpStatus.UNAUTHORIZED.value(),
                "UNAUTHORIZED",
                constraintViolationException.getMessage()
        );
    }
}

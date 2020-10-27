package ac.id.sttistieni.restservice.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

@Component
public class ValidationUtil {
    private final Validator validator;

    public ValidationUtil(Validator validator) {
        this.validator = validator;
    }

    public void validate(Object object) {
        int size = validator.validate(object).size();


        if (size != 0) {
            throw new ConstraintViolationException(validator.validate(object));
        }


    }
}

package woowahan.anifarm.tecolearning.web.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import woowahan.anifarm.tecolearning.study.service.exception.StudyNotFoundException;
import woowahan.anifarm.tecolearning.web.advice.dto.ErrorMessage;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler({StudyNotFoundException.class})
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ErrorMessage notFound(Exception e) {
        return new ErrorMessage(e.getMessage());
    }
}

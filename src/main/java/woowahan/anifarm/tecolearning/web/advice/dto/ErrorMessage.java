package woowahan.anifarm.tecolearning.web.advice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class ErrorMessage {
    private int code;
    private String message;
    private String errorDescription;

    public ErrorMessage(int code, String message, String errorDescription) {
        this.code = code;
        this.message = message;
        this.errorDescription = errorDescription;
    }
}

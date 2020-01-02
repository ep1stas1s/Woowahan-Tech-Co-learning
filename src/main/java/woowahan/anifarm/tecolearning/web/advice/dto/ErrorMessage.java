package woowahan.anifarm.tecolearning.web.advice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class ErrorMessage {
    private String message;

    public ErrorMessage(String message) {
        this.message = message;
    }
}

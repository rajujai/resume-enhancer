package in.rajujangra.resume_enhancer.dto;

import lombok.Data;

import java.util.List;

@Data
public class OpenAIResponse {
    private List<Choice> choices;

    @Data
    static class Choice {
        private String text;
    }
}

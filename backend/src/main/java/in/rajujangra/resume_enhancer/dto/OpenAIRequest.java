package in.rajujangra.resume_enhancer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OpenAIRequest {
    private String model = "text-davinci-003"; // GPT-3.5 model

    private String prompt;

    @JsonProperty("max_tokens")
    private int maxTokens = 150;

    private double temperature = 0.7;

    public OpenAIRequest(String prompt) {
        this.prompt = prompt;
    }
}
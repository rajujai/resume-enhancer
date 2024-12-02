package in.rajujangra.resume_enhancer.service;

import in.rajujangra.resume_enhancer.dto.OpenAIRequest;
import in.rajujangra.resume_enhancer.dto.OpenAIResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class ResumeEnhancerService {
    @Value("${openai.api.key}")
    private String apiKey;

    private final RestClient restClient = RestClient.create("https://api.openai.com/v1/completions");

    public List<String> enhanceResume(String resumeText) {
        String prompt = "Improve the following resume text:\n" + resumeText;

        response = restClient.post()
                .header("Authorization", "Bearer " + apiKey)
                .body(new OpenAIRequest(prompt));
                .map(response -> response.getChoices().get(0).getText())
                .onErrorResume(WebClientResponseException.class, e -> Mono.just("Error calling OpenAI API: " + e.getMessage()));
    }
}

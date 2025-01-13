package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("sk-proj-EjCwuOob2Zlm6VNASZ_6MG_Ih8-D4u9XmyVy0hCuLNxk4konCQo4u3" +
                "hE0cqE0mihBxFLDdhOb0T3BlbkFJBlF0McHrDhUE2IJbkJ9NONMPLdi5bBG50KxxB7zhlqomhTYkS6ZnoslhN8tGR4rD-lcnTHNJwA");


        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}

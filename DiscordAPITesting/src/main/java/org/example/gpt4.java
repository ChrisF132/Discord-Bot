//KEY: DaAl5EX705X1VFrBISLDreWLrljpMbzg0hOv7KNV457WjFNkQEnBJQQJ99ALACHYHv6XJ3w3AAAAACOGERaJ
//ENDPOINT: https://ai-falconch0392ai606443841045.openai.azure.com/openai/deployments/gpt-4/chat/completions?api-version=2024-08-01-preview
package org.example;
import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.*;
import com.azure.core.credential.AzureKeyCredential;

import java.util.ArrayList;

public class gpt4 {
    static String azureOpenAiKey = System.getenv("KEYGPT");
    static String endpoint = "https://ai-falconch0392ai606443841045.openai.azure.com";
    static String deploymentOrModelId = "gpt-4";

    public String generateResponse(String prompt) {
        System.out.println("Attempting to respond...");
        String response = "";
        System.out.println("API Key: " + azureOpenAiKey);
        if (azureOpenAiKey == null || azureOpenAiKey.isEmpty()) {
            System.out.println("Error: API key is null or empty");
            return "Error: API key is null or empty";
        }

        try {
        OpenAIClient builder = new OpenAIClientBuilder()
                .endpoint(endpoint)
                .credential(new AzureKeyCredential(azureOpenAiKey))
                .buildClient();


            ArrayList<ChatRequestMessage> chatMessages = new ArrayList<>();

            chatMessages.add(new ChatRequestUserMessage(prompt));

            ChatCompletions chatCompletions = builder.getChatCompletions(deploymentOrModelId, new ChatCompletionsOptions(chatMessages));

            for(ChatChoice choice : chatCompletions.getChoices()) {
                ChatResponseMessage message = choice.getMessage();
                System.out.println("Message:");
                response = message.getContent();
                System.out.println(response);
            }

        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            response = "Error: " + e.getMessage();
        }
        return response;
    }

    public static class dalle {
        static String azureOpenAiKey = System.getenv("KEYDALLE");
        static String endpoint = "ENDPOINT";
        static String deploymentOrModelId = "dall-e-3";


        public String generateResponse(String prompt) {

            System.out.println("Attempting to generate image for '" + prompt + "'...");

            System.out.println("API Key: " + azureOpenAiKey);
            if (azureOpenAiKey == null || azureOpenAiKey.isEmpty()) {
                System.out.println("Error: API key is null or empty");
                return "Error: API key is null or empty";
            }

            try {
                OpenAIClient builder = new OpenAIClientBuilder()
                        .endpoint(endpoint)
                        .credential(new AzureKeyCredential(azureOpenAiKey))
                        .buildClient();

                ImageGenerationOptions options = new ImageGenerationOptions(prompt);

                ImageGenerations image = builder.getImageGenerations(deploymentOrModelId, options);
                System.out.println("Image successfully generated");
                return image.getData().get(0).getUrl();
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return "Error: " + e.getMessage();
            }
        }
    }
}

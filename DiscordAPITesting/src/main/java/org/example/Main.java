package org.example;
import listeners.MessageListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws Exception
    {

        System.out.println("Starting Bot...");


        JDA api = JDABuilder.createDefault("TOKEN")
                .enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new MessageListener())
                .build();

        api.awaitReady();

        System.out.println("Bot started!");


    }
}



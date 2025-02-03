package commands;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.time.*;
import java.io.File;
import java.util.Random;

public class pingCommand implements command {

    // PING-PONG PROMPT
    public void execute(MessageReceivedEvent event) {
        event.getChannel().sendMessage("Pong!").queue();
    }
}

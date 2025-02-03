package commands;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public interface multiLineCommand {
    void execute(MessageReceivedEvent event, String args);
}

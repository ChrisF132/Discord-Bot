package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public interface command {
    void execute(MessageReceivedEvent event);
}

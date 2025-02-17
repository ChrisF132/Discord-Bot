package commands;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.interactions.commands.Command;

import java.util.Objects;

public class selfAvatarCommand implements command {


    @Override
    public void execute(MessageReceivedEvent event) {
        User user = event.getAuthor();
        event.getChannel().sendMessage(Objects.requireNonNull(user.getAvatarUrl())).queue();
    }
}

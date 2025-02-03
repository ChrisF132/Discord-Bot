package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.interactions.commands.Command;

import java.util.Random;



public class diceCommand implements command {

    /**
     * Outputs a basic dice roll. The method contains a random number, which is
     * outputted when the command is inputted.
     * @param event Represents the message sent, and the details accompanying it, such as the channel it was sent in
     *
     */
    public void execute(MessageReceivedEvent event) {
        Random rand = new Random();
        int random = rand.nextInt(6) + 1;
        event.getChannel().sendMessage("You rolled a " + random).queue();
    }
}

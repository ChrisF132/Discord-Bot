package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.interactions.commands.Command;
import org.example.gpt4;

public class gptDalleCommand implements multiLineCommand {
    gpt4.dalle dalle;

    public gptDalleCommand(gpt4.dalle dalle) {
        this.dalle = dalle;
    }

    /**
     * Creates an image based on the prompt after the !dalle command, and outputs it to the respective channel the user
     * typed the prompt in. If there is no text after !dalle, the method will instead simply display a message prompting
     * the user to input a prompt after !dalle.
     *
     *
     * @param event Represents the message sent, and the details accompanying it, such as the channel it was sent in
     * @param args The text after the !dalle command, which details what the AI should create and output.
     */
    @Override
    public void execute(MessageReceivedEvent event, String args) {

        if (args.isEmpty()) {
            event.getChannel().sendMessage("Please provide a prompt after !dalle").queue();
            return;
        }

            event.getChannel().sendMessage("Response queued...").queue();
            event.getChannel().sendMessage(dalle.generateResponse(args)).queue();
            event.getChannel().sendMessage("Image successfully generated.").queue();

    }
}

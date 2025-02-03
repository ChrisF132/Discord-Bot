package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.example.gpt4;

public class gptPromptCommand implements multiLineCommand {
    gpt4 bot;

    public gptPromptCommand(gpt4 bot) {
        this.bot = bot;
    }


    /**
     * Outputs a response based on the text after the !prompt command, and outputs it to the respective channel the user
     * typed the text in. If there is no text after !prompt, the method will instead simply display a message prompting
     * the user to input a prompt after !prompt.
     *
     *
     * @param event Represents the message sent, and the details accompanying it, such as the channel it was sent in
     * @param args The text after the !prompt command, which details how the AI should respond.
     */
    @Override
    public void execute(MessageReceivedEvent event, String args) {

        //For debug
        System.out.println("Reached execute.");

        if (args.isEmpty()) {
            event.getChannel().sendMessage("Please provide a prompt after !prompt").queue();
            return;
        }

            event.getChannel().sendMessage("Response queued...").queue();
            event.getChannel().sendMessage(bot.generateResponse(args)).queue();

    }
}

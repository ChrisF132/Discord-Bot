package listeners;

import managers.CommandManager;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.time.*;

public class MessageListener extends ListenerAdapter {


    private final CommandManager commandManager = new CommandManager();


    LocalTime currentTime = LocalTime.now();


    /**
     * 
     * Outlines the protocol for how to handle a message. When a message it sent, the message first goes through
     * a check to see if the message was sent by a bot. If so, the message is rendered inert. Otherwise, the message is
     * logged in the console for debugging, and the message is split into two pieces if the prompt is more than two
     * @param event Represents the message sent, and the details accompanying it, such as the channel it was sent in
     */

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String command = "";
        String args = "";

        // Debugging message reception
        System.out.println("Received Message Event Fired");

        // Don't respond to messages sent by bots
        if (event.getAuthor().isBot()) return;

        // Log the raw message for debugging
        String rawContent = event.getMessage().getContentRaw();
        String displayContent = event.getMessage().getContentDisplay();

        // Debugging: print both raw and displayed content
        System.out.println("Received Message (Raw): " + rawContent);
        System.out.println("Received Message (Display): " + displayContent);

        String[] splitContent = rawContent.split(" ", 2);
        if(rawContent.contains("!prompt") || rawContent.contains("dalle")) {

            command = splitContent[0];
            args = splitContent.length > 1 ? splitContent[1] : "";
            commandManager.handleAICommand(command, event, args);
        }
        else {
            command = splitContent[0];
            args = splitContent.length > 1 ? splitContent[1] : "";

            if(args.isEmpty()) {
                commandManager.handleCommand(command, event);
            }
        }
    }


}

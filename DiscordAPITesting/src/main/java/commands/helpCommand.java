package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.io.File;

public class helpCommand implements command {
    @Override
    public void execute(MessageReceivedEvent event) {
        File gifWelcomeFile = new File("C:/Users/donna/Downloads/helpquongle.gif");
        event.getChannel().sendFiles(net.dv8tion.jda.api.utils.FileUpload.fromData(gifWelcomeFile)).queue();
        event.getChannel().sendMessage("**```QuongleBot Commands \n\n!help: displays commands \n" +
                "!ping: connection test, responds with 'Pong!' if successful \n" +
                "!rollDice: rolls a number between 1 and 6 \n" +
                "!laboriousFruit: Summons a great evil \n" +
                "!prompt (query): provides an AI response to the query. \n" +
                "!dalle (query): provides an AI image corresponding to the query. " +
                "\n\nNOTE: All commands are case-sensitive, for now.```**").queue();
    }
}

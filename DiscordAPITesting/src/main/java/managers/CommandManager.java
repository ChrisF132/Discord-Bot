package managers;
import commands.*;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.example.gpt4;

import java.util.HashMap;

public class CommandManager {

    HashMap<String, command> commands = new HashMap<>();
    HashMap<String, multiLineCommand> multiLineCommands = new HashMap<>();

    gpt4 bot = new gpt4();
    gpt4.dalle drawBot = new gpt4.dalle();


    public CommandManager() {
        commands.put("!ping", new pingCommand());
        commands.put("!rolldice", new diceCommand());
        commands.put("!help", new helpCommand());
        commands.put("!laboriousfruit", new fruitCommand());
        commands.put("!getselfavatar", new selfAvatarCommand());
        multiLineCommands.put("!prompt", new gptPromptCommand(bot));
        multiLineCommands.put("!dalle", new gptDalleCommand(drawBot));
        multiLineCommands.put("!getuseravatar", new getAvatarCommand());
    }

    public void handleCommand(String command, MessageReceivedEvent event) {
        command cmd = commands.get(command);
        if(cmd != null) {
            cmd.execute(event);
        }
    }
    public void handleAICommand(String command, MessageReceivedEvent event, String args) {
        multiLineCommand cmdMulti = multiLineCommands.get(command);
        if(cmdMulti != null) {
            cmdMulti.execute(event, args);
        }
    }
}

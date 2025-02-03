package commands;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.UserSnowflake;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class kickCommand implements multiLineCommand {

    @Override
    public void execute(MessageReceivedEvent event, String args) {
        System.out.println("Reached ban");

        Guild guild = event.getGuild();
        Member member = event.getMember();
        String message = event.getMessage().getContentRaw();

        if(!event.getMember().hasPermission(Permission.BAN_MEMBERS)) {
            event.getChannel().sendMessage("You don't have permission to use this command").queue();
            return;
        }

        if(member == null) {
            event.getChannel().sendMessage("That member does not exist.").queue();
            return;
        }
        if (args.isEmpty()) {
            event.getChannel().sendMessage("Please provide a member after !kick").queue();
            return;
        }


        guild.kick(member).queue();








    }


}

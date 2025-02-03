package listeners;

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;
import java.util.Objects;

public class WelcomeListener extends ListenerAdapter {

    //WELCOME MESSAGE
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        TextChannel welcomeChannel = Objects.requireNonNull(event.getGuild().getDefaultChannel()).asTextChannel();

        String welcomeMessage = "Welcome to Laborious Fruits," + event.getUser().getAsMention() + "!";

        File gifFile = new File("C:/Users/donna/Downloads/welcomequongle.gif");

        welcomeChannel.sendFiles(net.dv8tion.jda.api.utils.FileUpload.fromData(gifFile)).queue();
        welcomeChannel.sendMessage("**"+ welcomeMessage + "**").queue();
    }
}

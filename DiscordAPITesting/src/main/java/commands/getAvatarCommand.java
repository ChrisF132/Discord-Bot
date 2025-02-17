package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class getAvatarCommand implements multiLineCommand {

    @Override
    public void execute(MessageReceivedEvent event, String args) {

        try {
            String inputId = args.substring(1);
            System.out.println("Reached statement");



                String userID = inputId.substring(1, inputId.length()-1);
                System.out.println(userID);
                event.getJDA().retrieveUserById(userID).queue(user -> {
                    String avatar = user.getAvatarUrl();
                    assert avatar != null;
                    event.getChannel().sendMessage(avatar).queue();
                });

        } catch (Exception e) {
            event.getChannel().sendMessage("Invalid user. Please check for typos and try again.").queue();
        }



    }
}

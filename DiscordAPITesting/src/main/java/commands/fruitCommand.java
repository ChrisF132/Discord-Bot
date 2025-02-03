package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import java.io.File;
import java.util.Random;

public class fruitCommand implements command {

    /**
     * TODO: Refactor into hashmap? Could be easier less space, but may be less readable
     * <p>
     * Outputs a random image based on a random number from one to six. Each image is associated with a number, and if
     * the random number is equal to the image's respective number, the image is outputted to the channel in which the
     * command was typed.
     * @param event
     */
    @Override
    public void execute(MessageReceivedEvent event) {

        File fruit1 = new File("C:/Users/donna/Downloads/fruit1.png");
        File fruit2 = new File("C:/Users/donna/Downloads/fruit2.jpg");
        File fruit3 = new File("C:/Users/donna/Downloads/fruit3.jpg");
        File fruit4 = new File("C:/Users/donna/Downloads/fruit4.png");
        File fruit5 = new File("C:/Users/donna/Downloads/fruit5.png");
        File fruit6 = new File("C:/Users/donna/Downloads/fruit6.png");
        Random rand = new Random();
        int random = rand.nextInt(6) + 1;


        switch (random) {
            case 1:
                event.getChannel().sendFiles(net.dv8tion.jda.api.utils.FileUpload.fromData(fruit1)).queue();
                break;
            case 2:
                event.getChannel().sendFiles(net.dv8tion.jda.api.utils.FileUpload.fromData(fruit2)).queue();
                break;
            case 3:
                event.getChannel().sendFiles(net.dv8tion.jda.api.utils.FileUpload.fromData(fruit3)).queue();
                break;
            case 4:
                event.getChannel().sendFiles(net.dv8tion.jda.api.utils.FileUpload.fromData(fruit4)).queue();
                break;
            case 5:
                event.getChannel().sendFiles(net.dv8tion.jda.api.utils.FileUpload.fromData(fruit5)).queue();
                break;
            case 6:
                event.getChannel().sendFiles(net.dv8tion.jda.api.utils.FileUpload.fromData(fruit6)).queue();
                break;
        }
    }
}

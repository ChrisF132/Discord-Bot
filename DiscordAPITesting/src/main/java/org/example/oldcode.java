package org.example;

public class oldcode {
    /*
        //ROLLDICE PROMPT
        if (displayContent.trim().equals("!rollDice")) {
            Random rand = new Random();
            int random = rand.nextInt(6) + 1;
            event.getChannel().sendMessage("You rolled a " + random).queue();

        }
        //HELP PROMPT
        if (displayContent.trim().equals("!help")) {
            File gifWelcomeFile = new File("C:/Users/donna/Downloads/helpquongle.gif");
            event.getChannel().sendFiles(net.dv8tion.jda.api.utils.FileUpload.fromData(gifWelcomeFile)).queue();
            event.getChannel().sendMessage("**```QuongleBot Commands \n\n!help: displays commands \n!ping: connection test, responds with 'Pong!' if successful \n!rollDice: rolls a number between 1 and 6 \n!laboriousFruit: Summons a great evil \n!prompt (query): provides an AI response to the query. \n!dalle (query): provides an AI image corresponding to the query. \n\nNOTE: All commands are case-sensitive, for now.```**").queue();
        }

         */



    //CHATGPT PROMPT
        /*
        if (displayContent.trim().startsWith("!prompt")) {

            gpt4 bot = new gpt4();

            String userInput = displayContent.substring(8).trim();

            if (userInput.isEmpty()) {
                event.getChannel().sendMessage("Please provide a prompt after !prompt").queue();
                return;
            }
            event.getChannel().sendMessage("Response queued...").queue();

            event.getChannel().sendMessage(bot.generateResponse(userInput)).queue();
        }
        */

        /*
        if (displayContent.trim().startsWith("!dalle")) {
            gpt4.dalle dalle = new gpt4.dalle();

            String userInput = displayContent.substring(6).trim();

            if (userInput.isEmpty()) {
                event.getChannel().sendMessage("Please provide a prompt after !dalle").queue();
                return;
            }

            event.getChannel().sendMessage("Response queued...").queue();

            String response = dalle.generateResponse(userInput);
            if(response.startsWith("Error:") && !response.startsWith("200", 20)) {
                event.getChannel().sendMessage("Sorry, your message was rejected.").queue();
            }
            else {
                event.getChannel().sendMessage(dalle.generateResponse(userInput)).queue();
                event.getChannel().sendMessage("Image successfully generated.").queue();
            }
        }
        */
}

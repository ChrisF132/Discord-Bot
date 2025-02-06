This discord bot is built using the Java Discord API (JDA) and provides AI responses and images to user queries using Microsoft Azure API's models of GPT3 and Dall-E.

Main Commands

!prompt (query) Get a response to any question or prompt.	!prompt What's the weather today?
!dalle (query)	Generate an AI image based on a detailed prompt.	!dalle A futuristic cityscape at sunset

Set-Up:


1. Clone the Repository:
git clone https://github.com/your-username/discord-ai-bot.git  
cd discord-ai-bot  

2. Install Apache Maven

You'll need maven to install and utilize the packages in this bot. If you do not have Maven installed, installation instructions can be found here:
https://maven.apache.org/install.html

3.Add API Keys:

You'll need your own tokens for the API keys required for this bot. Generation of these tokens can be found for free on Microsoft Azure
and the Discord Developer Portal.

DISCORD_TOKEN=your-discord-bot-token  
AI_API_KEY=your-ai-api-key  

4. Build and Run the Bot:
Use your build tool to compile and run the bot. For example, with Maven:

mvn clean install  
java -jar target/discord-ai-bot.jar  

5. Invite the Bot to Your Server:
  Go to the Discord Developer Portal.
  Generate an OAuth2 invite link for your bot.
  Add it to your server of choosing.

Requirements

    - JDK 17 or higher
    - Discord Bot Token (from the Discord Developer Portal)
    - OpenAI/DALL·E API Key for responses and image generation


    






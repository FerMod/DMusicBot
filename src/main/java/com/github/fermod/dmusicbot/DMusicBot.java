package com.github.fermod.dmusicbot;

import discord4j.core.DiscordClient;
import discord4j.core.DiscordClientBuilder;

public class DMusicBot {

	public static void main(String[] args) {
		final DiscordClient client = new DiscordClientBuilder(args[0]).build();
		client.login().block();
	}

}

package com.baldev.messagify.domain.actions;

import com.baldev.messagify.domain.MessageService;
import com.baldev.messagify.domain.entities.Message;
import com.baldev.messagify.domain.entities.User;
import com.google.common.base.Preconditions;

import javax.inject.Inject;

public class SendMessageToUserAction {
	private final User user;
	private final Message message;
	private final MessageService messageService;

	@Inject
	public SendMessageToUserAction(Message message, User user, MessageService messageService) {
		Preconditions.checkNotNull(message);
		Preconditions.checkNotNull(user);
		Preconditions.checkNotNull(messageService);

		this.user = user;
		this.message = message;
		this.messageService = messageService;
	}

	public void execute() {
		messageService.sendMessageToUser(message, user);
	}
}

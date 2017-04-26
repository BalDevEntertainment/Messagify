package com.baldev.messagify.domain;

import com.baldev.messagify.domain.entities.Message;
import com.baldev.messagify.domain.entities.User;
import com.google.common.base.Preconditions;

public class MessageService {
	public void sendMessageToUser(Message message, User user) {
		Preconditions.checkNotNull(message);
		Preconditions.checkNotNull(user);
	}
}

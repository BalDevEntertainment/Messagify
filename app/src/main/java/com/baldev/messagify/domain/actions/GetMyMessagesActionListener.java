package com.baldev.messagify.domain.actions;

import com.baldev.messagify.domain.entities.Message;

import java.util.List;

public interface GetMyMessagesActionListener {
	void onMessagesRetrieved(List<Message> messages);
}

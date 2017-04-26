package com.baldev.messagify.domain.actions;

import com.google.common.base.Preconditions;

public class GetMyMessagesAction {
	public void execute(GetMyMessagesActionListener listener) {
		Preconditions.checkNotNull(listener);
	}
}

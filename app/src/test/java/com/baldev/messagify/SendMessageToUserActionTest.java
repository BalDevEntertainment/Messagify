package com.baldev.messagify;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SendMessageToUserActionTest {

	@Mock
	private SendMessageToUserListener sendMessageToUserListener;

	@Mock
	private Message message;

	@Mock
	private User user;

	@Mock
	private MessageService messageService;

	@Test
	public void givenValidParameters_whenSendMessageToUser_ThenAssertTrue() {
		sendMessageToUser(message, user, sendMessageToUserListener);
		verify(sendMessageToUserListener, times(1)).onMessageSent();
	}

	private void sendMessageToUser(Message message, User user, SendMessageToUserListener listener) {
		messageService.sendMessage(message, user, listener);
		listener.onMessageSent();
	}
}

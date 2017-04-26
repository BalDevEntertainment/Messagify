package com.baldev.messagify;


import com.baldev.messagify.domain.MessageService;
import com.baldev.messagify.domain.actions.SendMessageToUserAction;
import com.baldev.messagify.domain.entities.Message;
import com.baldev.messagify.domain.entities.User;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class SendMessageToUserActionTest {

	private MessageService messageService;

	@Before
	public void setup() {
		messageService = new MessageService();
	}

	@Test
	public void givenValidParametersWhenSendMessageToUserAssertTrue() {
		Message message = givenValidMessage();
		User user = givenValidUser();
		whenSendMessageToUser(message, user, messageService);
		assertTrue(true);
	}

	@Test(expected = NullPointerException.class)
	public void givenInvalidMessageParametersWhenSendMessageToUserThrowNullPointerException() {
		Message message = null;
		User user = givenValidUser();
		whenSendMessageToUser(message, user, messageService);
	}

	@Test(expected = NullPointerException.class)
	public void givenInvalidUserParametersWhenSendMessageToUserThrowNullPointerException() {
		Message message = givenValidMessage();
		User user = null;
		whenSendMessageToUser(message, user, messageService);
	}

	@Test(expected = NullPointerException.class)
	public void givenInvalidMessageServiceWhenSendMessageToUserThrowNullPointerException() {
		Message message = givenValidMessage();
		User user = givenValidUser();
		whenSendMessageToUser(message, user, null);
	}

	private void whenSendMessageToUser(Message message, User user, MessageService messageService) {
		new SendMessageToUserAction(message, user, messageService).execute();
	}

	private User givenValidUser() {
		return Mockito.mock(User.class);
	}

	private Message givenValidMessage() {
		return Mockito.mock(Message.class);
	}

}

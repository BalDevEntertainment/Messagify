package com.baldev.messagify;


import com.baldev.messagify.domain.actions.GetMyMessagesAction;
import com.baldev.messagify.domain.actions.GetMyMessagesActionListener;
import com.baldev.messagify.domain.entities.Message;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GetMyMessagesActionTest {

	private GetMyMessagesAction getMyMessagesAction;

	@Before
	public void setup() {
		getMyMessagesAction = new GetMyMessagesAction();
	}

	@Test
	public void givenValidListener_WhenGetMyMessages_ThenReturnMessages() {
		getMyMessagesAction.execute(messages -> {

		});
	}

	@Test
	public void xxx() {
		GetMyMessagesActionListener mock = Mockito.mock(GetMyMessagesActionListener.class);
		mock.onMessagesRetrieved(new ArrayList<>());
	}

	@Test(expected = NullPointerException.class)
	public void givenInvalidListener_WhenGetMyMessages_ThenThrowNullPointerException() {
		getMyMessagesAction.execute(null);
	}

}

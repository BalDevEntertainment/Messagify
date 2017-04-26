package com.baldev.messagify;

import com.baldev.messagify.login.LoginView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ExampleInstrumentedTest {

	@Mock
	private LoginView view;

	@Test
	public void useAppContext() throws Exception {
		view.getLayoutResource();
	}
}

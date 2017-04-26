package com.baldev.messagify.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;


public class LoginActivity extends AppCompatActivity implements LoginView {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(getLayoutResource());
		bindActivityToButterKnife();
	}

	private void bindActivityToButterKnife() {
		ButterKnife.bind(this);
	}

	@Override
	public int getLayoutResource() {
		return 0;
	}
}


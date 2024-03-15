package com.english;

import android.os.*;
import android.widget.*;
import android.util.*;
import java.util.*;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class InfoActivity extends Activity {

	private TextView infoTxt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);
		initialize();
		initializeLogic();
	}

	private void initialize() {
		infoTxt = findViewById(R.id.infoTxt);
	}

	private void initializeLogic() {
		infoTxt.setText("Contact the volunteers for information");
	}
}

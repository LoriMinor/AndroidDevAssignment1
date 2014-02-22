package com.assignment1.loriminorassignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author Lori Minor
 * 
 *This class contains the first screen that will be displayed to the user.  
 *The user will be provided with a hint to enter their name into the text field.  
 *If the user does not type in a name, then the user will be prompted to 
 *enter their name into the text field.
 */
public class LogonActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logon);

		//for edit text field edtEnterName, user will enter name here
		final EditText edtEnterName = (EditText) findViewById(R.id.edtEnterName);

		//initializes the button btnEnter, the Enter button
		Button btnEnter = (Button) findViewById(R.id.btnEnter);

		//setup on click listener for enter button
		btnEnter.setOnClickListener(new OnClickListener() {

			//onClick method to create and start intent, happens when user clicks enter button
			@Override
			public void onClick(View v) {
				//creating intent
				Intent enterNameIntent = new Intent(LogonActivity.this, ConfirmationActivity.class);
				enterNameIntent.putExtra("Name", edtEnterName.getText().toString());

				/*if test to determine if user typed in a name or not.  if user does not type in a name,
				 * then the user will receive a message, prompting to type a name into text field
				 */
				if (edtEnterName.length() == 0){
					Toast nothingEntered = Toast.makeText(LogonActivity.this, "You must enter your name in the name field", Toast.LENGTH_LONG);
					nothingEntered.show();

				} else {

					//start the activity if a name is submitted
					startActivity(enterNameIntent); 
				}
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.logon, menu);
		return true;
	}

}

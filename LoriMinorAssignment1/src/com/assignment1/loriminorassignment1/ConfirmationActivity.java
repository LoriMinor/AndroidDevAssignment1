package com.assignment1.loriminorassignment1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Lori Minor
 * 
 *	This class displays the results, the user's name, that the user types in during the LogonActivity. 
 *	It will also display a greeting, "Hello" and the user's name.  The user will also be thanked for using app.
 */
public class ConfirmationActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// onCreate method for ConfirmationActivity
		super.onCreate(savedInstanceState);

		//associate confirmation layout with ConfirmationActivity
		setContentView(R.layout.confirmation);

		//get the text view to display entered text
		TextView lblLogonActivityResults = (TextView) findViewById(R.id.lblLogonActivityResults);
		lblLogonActivityResults.setText(getIntent().getExtras().getString("Name"));

		//display toast message, thanking user for using this application
		Toast.makeText(this, "Thank you for using my app. Have a fantastic day!", Toast.LENGTH_LONG).show();
	}
}

package shreetulsimoviese_kartapp.com;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends ActionBarActivity implements
		View.OnClickListener {
	private TextView txtFirstname;
	private EditText edfirstname;
	private TextView txtMiddlename;
	private EditText edmiddlename;
	private TextView txtLastname;
	private EditText edlastname;
	private TextView txtEmailid;
	private View edemailid;
	private TextView txtPhoneno;
	private View edphoneno;
	private Button btnCreate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#008F09")));

		txtFirstname = (TextView) findViewById(R.id.f_name);
		edfirstname = (EditText) findViewById(R.id.reg_fname);
		txtMiddlename = (TextView) findViewById(R.id.m_name);
		edmiddlename = (EditText) findViewById(R.id.reg_mname);
		txtLastname = (TextView) findViewById(R.id.l_name);
		edlastname = (EditText) findViewById(R.id.reg_lname);
		txtEmailid = (TextView) findViewById(R.id.email_id);
		edemailid = findViewById(R.id.emailid);
		txtPhoneno = (TextView) findViewById(R.id.mobile_no);
		edphoneno = findViewById(R.id.phoneno);
		btnCreate = (Button) findViewById(R.id.createbtn);

		btnCreate.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.createbtn:
			String userfname = txtFirstname.getText().toString();
			String usermname = txtMiddlename.getText().toString();
			String userlname = txtMiddlename.getText().toString();
			String emailid = txtEmailid.getText().toString();
			String phoneno = txtPhoneno.getText().toString().trim();

			if (!phoneno.isEmpty()) {
				AlertDialog.Builder builder = new AlertDialog.Builder(
						Registration.this);
				// builder.setMessage(
				// "Please make sure you entered all the fields correctly.")
				// .setTitle("Oops!")
				// .setPositiveButton(android.R.string.ok, null);
				// AlertDialog dialog = builder.create();
				// dialog.show();

				Intent myIntent = new Intent(Registration.this,
						Hpslideview.class);
				startActivity(myIntent);

			}
		}

	}

}

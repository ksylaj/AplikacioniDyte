package com.example.kaltrina.aplikacionidyte;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText numriyt;
    private EditText numriPerdoruesit;
    private EditText mesazhi;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numriyt = (EditText)findViewById(R.id.numriyt);
        numriPerdoruesit = (EditText)findViewById(R.id.numriPranuesit);
        mesazhi = (EditText)findViewById(R.id.mesazhi);
        Button dergoBtn = (Button)findViewById(R.id.dergoBtn);

        //    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto: numriPerdoruesit"));
        //intent.putExtra("sms_body", mesazhi);
        //startActivity(intent);
        dergoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numriyt.getText().toString(), numriPerdoruesit.getText().toString(), mesazhi.getText().toString(), null, null);

            }
        });

    }
}

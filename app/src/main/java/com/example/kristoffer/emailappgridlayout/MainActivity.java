package com.example.kristoffer.emailappgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "This activity sends an e-mail to the developer!", Toast.LENGTH_LONG).show();

    }

    public void sendButton(View view){
        EditText msg = (EditText)findViewById(R.id.con_msg);
        EditText sbj = (EditText)findViewById(R.id.con_subj);
        EditText trg = (EditText)findViewById(R.id.con_send);
        String target = trg.getText().toString();
        String subject = sbj.getText().toString();
        String message = msg.getText().toString();
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[] {target});
        i.putExtra(Intent.EXTRA_SUBJECT, subject);
        i.putExtra(Intent.EXTRA_TEXT, message);

        Toast.makeText(this, "trying intent", Toast.LENGTH_SHORT).show();
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
}

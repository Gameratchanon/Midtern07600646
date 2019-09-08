package com.example.midtern07600646;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.widget.EditText;
import android.widget.Toast;

import com.example.midtern07600646.Model.Aunt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText usEdittext = findViewById(R.id.us_edit_text);
        EditText passwordEdittext = findViewById(R.id.password_edit_text);
        String inputuser = usEdittext.getText().toString();
        String inputpass = passwordEdittext.getText().toString();
        Aunt auth = new Aunt(inputuser, inputpass);
        boolean result = auth.check();
        if (result) {
            Intent intent = new Intent(MainActivity.this, ProfildeActivity.class);
            intent.putExtra("aaa", inputuser);
            startActivity(intent);
            finish();
            Toast.makeText(MainActivity.this, "ยินดีต้อนรับ", Toast.LENGTH_SHORT).show();
        } else {
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("Error");
            dialog.setMessage("Invalid email or password");
            dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }).show();
        }
    }
}
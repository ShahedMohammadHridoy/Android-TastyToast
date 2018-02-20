package com.callnsolution.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sdsmdg.tastytoast.TastyToast;

public class MainActivity extends AppCompatActivity {

    Button successButton, warningButton, errorButton, infoButton, defaultButton, confusionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        successButton = findViewById(R.id.successButton);
        warningButton = findViewById(R.id.warningButton);
        errorButton = findViewById(R.id.errorButton);
        infoButton = findViewById(R.id.infoButton);
        defaultButton = findViewById(R.id.defaultButton);
        confusionButton = findViewById(R.id.confusionButton);

        successButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TastyToast.makeText(MainActivity.this, "Download Successful", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS).show();
            }
        });

        warningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TastyToast.makeText(MainActivity.this, "Are you sure?", TastyToast.LENGTH_SHORT, TastyToast.WARNING).show();
            }
        });
        errorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TastyToast.makeText(MainActivity.this, "Download Failed!\nTry again later", TastyToast.LENGTH_SHORT, TastyToast.ERROR).show();
            }
        });
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TastyToast.makeText(MainActivity.this, "Searching for username:\n\'Shahed\'", TastyToast.LENGTH_SHORT, TastyToast.INFO).show();
            }
        });
        defaultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TastyToast.makeText(MainActivity.this, "This is Default Toast", TastyToast.LENGTH_SHORT, TastyToast.DEFAULT).show();

            }
        });
        confusionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TastyToast.makeText(MainActivity.this, "I don\n know!!!", TastyToast.LENGTH_SHORT, TastyToast.CONFUSING).show();
            }
        });

    }
}

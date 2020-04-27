package com.apps.andhika.latihansharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.apps.andhika.R;
import com.apps.andhika.utils.Preferences;

/*
    Developed by Andhika Putra Bagaskara - 10117167 - IF5
    on 27-04-2020
 */

public class HomeActivity extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clear set preferences
                Preferences.setLogout(getBaseContext());

                //Pindah halaman ke login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });
    }

    private void declareView(){
        txtKeluar = findViewById(R.id.txt_logout);
        txtNama = findViewById(R.id.txtName);

        txtNama.setText(Preferences.getRegisteredUsername(getBaseContext()));
    }
}

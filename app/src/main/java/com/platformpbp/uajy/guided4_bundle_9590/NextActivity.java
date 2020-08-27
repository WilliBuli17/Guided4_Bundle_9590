package com.platformpbp.uajy.guided4_bundle_9590;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class NextActivity extends AppCompatActivity {
    public EditText edtNama;
    public EditText edtNIM;
    public EditText edtFakultas;
    public EditText edtProdi;

    public String viewNama;
    public String viewNIM;
    public String viewFakultas;
    public String viewProdi;
    public Bundle mBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        edtNama = findViewById(R.id.viewNama);
        edtNIM = (EditText) findViewById(R.id.viewNIM);
        edtFakultas = (EditText) findViewById(R.id.viewFakultas);
        edtProdi = (EditText) findViewById(R.id.viewProdi);

        getBundle();
        setText();
    }

    public void getBundle(){
        mBundle = getIntent().getBundleExtra("register");
        viewNama = mBundle.getString("nama");
        viewNIM = mBundle.getString("nim");
        viewFakultas = mBundle.getString("fakultas");
        viewProdi = mBundle.getString("prodi");
    }

    public void setText(){
        edtNama.setText(viewNama);
        edtNIM.setText(viewNIM);
        edtFakultas.setText(viewFakultas);
        edtProdi.setText(viewProdi);
    }
}
package com.example.lspmobilecom;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEditLoc;
    private Button buttonLoc, buttonJualan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditLoc=findViewById(R.id.editTextOpenLoc);
    }

    public void location(View view) {
        Intent loc=new Intent(Intent.ACTION_VIEW);
        String address= mEditLoc.getText().toString();

        //geo: lat,lgn?q=this+address
        Uri uri= Uri.parse("geo:0,0?q="+address.replaceAll(" ","+"));
        loc.setData(uri);
        startActivity(loc);
    }

    public void Jualan(View view) {
        Intent jualan = new Intent(MainActivity.this,JualanActivity.class);
        startActivity(jualan);
        finish();
    }
}

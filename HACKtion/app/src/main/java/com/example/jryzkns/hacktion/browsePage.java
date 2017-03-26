package com.example.jryzkns.hacktion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class browsePage extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_page);
    }
    public void sex(View sampleReport){
        Intent intent=new Intent(this, sampleReport.class);
        startActivity(intent);
    }
}

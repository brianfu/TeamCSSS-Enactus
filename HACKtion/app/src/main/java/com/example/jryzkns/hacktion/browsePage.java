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
    public void sex(View MainActivity){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

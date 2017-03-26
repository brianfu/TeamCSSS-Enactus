package com.example.jryzkns.hacktion;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class report extends AppCompatActivity {

    /*public void sex(View sampleClass){
        Intent intent=new Intent(this, sampleClass.class);
        startActivity(intent);
    }
    This shit makes the app work*/

    //declare
    Button myReports;
    Button myTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        setTitle("Activities");
    }

    //standarize button views for their methods
    //myReports = (Button) findViewById(R.id.myReports);
    //myTasks = (Button) findViewById(R.id.myTasks);

    public void myReportsex(View sampleReport){
        Intent intent = new Intent(this, sampleReport.class);
        startActivity(intent);
    }
    public void myTasksex(View browsePage){
        Intent intent = new Intent(this, browsePage.class);
        startActivity(intent);
    }

}



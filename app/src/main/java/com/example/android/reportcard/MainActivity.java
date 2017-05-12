package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myReport = (TextView)findViewById(R.id.myReport);

        ReportCard reportCard = new ReportCard(4, "Adel Othman", 83, 77, 100, 97);

        myReport.setText(reportCard.toString());
    }
}

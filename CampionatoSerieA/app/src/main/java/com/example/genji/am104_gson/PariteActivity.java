package com.example.genji.am104_gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class PariteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partite);
        ScrollView t = findViewById(R.id.scrollPartite);

        ArrayList<String> listStr = getIntent().getExtras().getStringArrayList("partite");
        t.removeAllViews();
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT);
        params.setMargins(40, 10, 10, 10);

        for (int i = 0; i < listStr.size() - 1; i++) {
            TextView p = new TextView(this);
            p.setText(listStr.get(i));
            linearLayout.addView(p);
        }
        t.addView(linearLayout);
    }
}

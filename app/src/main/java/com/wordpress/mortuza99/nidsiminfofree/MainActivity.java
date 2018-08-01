package com.wordpress.mortuza99.nidsiminfofree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_item);

        String[] operators = getApplicationContext().getResources().getStringArray(R.array.operators);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, operators);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        // GP
                        sendME("info","4949");
                        break;
                    case 1:
                        // Banglalink
                        callME("*1600*2#");
                        break;
                    case 2:
                        // Robi
                        callME("*1600*3#");
                        break;
                    case 3:
                        // Airtel
                        callME("*121*4444#");
                        break;
                    case 4:
                        // Teletalk
                        sendME("info","1600");
                        break;
                }
            }
        });


    }

    private void sendME(String message, String number) {
        // TODO: SEND SMS
    }

    private void callME(String number) {
        // TODO: MAKE CALL USING INTENT
    }
}

package com.rxjavalearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] mobileArray = {"RX Sample",
            "Disposable Sample",
            "RxJava Operators - Filter",
            "RxJava CompositeDisposable",
            "RxJava Custom Data Type Operator"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, ObserverableObserverActivity.class);
                        startActivity(intent);
                    case 1:
                        intent = new Intent(MainActivity.this, DisposableActivity.class);
                        startActivity(intent);
                    case 2:
                        intent = new Intent(MainActivity.this, OperatorFilterActivity.class);
                        startActivity(intent);
                    case 3:
                        intent = new Intent(MainActivity.this, CompositeDisposableActivity.class);
                        startActivity(intent);
                    case 4:
                        intent = new Intent(MainActivity.this, CustomDataActivity.class);
                        startActivity(intent);
                }
            }
        });
    }
}

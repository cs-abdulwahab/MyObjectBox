package com.example.abdul_wahab.myobjectbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import io.objectbox.Box;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Box<Person> personBox = ((MyApp) getApplication()).getBoxStore().boxFor(Person.class);


        for (int i = 2; i <= 1000; i++) {
            personBox.put(new Person( "name " + i));
        }

        List<Person> personList = personBox.getAll();

       

        Log.d(TAG, "onCreate: ");


    }
}

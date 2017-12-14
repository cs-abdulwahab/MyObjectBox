package com.example.abdul_wahab.myobjectbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.objectbox.Box;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Box<Person> personBox = ((MyApp) getApplication()).getBoxStore().boxFor(Person.class);







/*

        for (int i = 2000; i <= 3000; i++) {
            personBox.put(new Person( "name " + i));
            Log.d(TAG, "person : "+ i);
        }*/

/*

        List<Person> personList = personBox.getAll();
*/

        Person p = personBox.get(500);

        p.name = "changed";

        personBox.put(p);

        Person p2 = personBox.get(500);



        Log.d(TAG, "onCreate: ");


    }
}

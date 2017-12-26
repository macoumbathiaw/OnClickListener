package com.example.mthiaw.onclicklistener;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Let's create the button to take the OnclickListen
        final Button button = (Button) findViewById(R.id.on_click_listener);
        //Now that we found the button to place our onClickListener, let's create a instance of the Onclick class
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Let's put a Toast in the click button

                //Context context = getApplicationContext();
                //CharSequence text = "Hello toast!";
                //int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(getApplicationContext(), "This is a Toast", Toast.LENGTH_LONG);
                toast.show();
            }
        });


        //final Buton = new View.OnClickListener()






    }
}

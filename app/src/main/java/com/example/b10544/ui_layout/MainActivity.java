package com.example.b10544.ui_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget. Button;
import android.view. View;
import android.R;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new MyOnClickListener());
    }
    private class MyOnClickListener implements

            View.OnClickListener {
        public void onClick (View view) {
            Toast.makeText(getApplicationContext(),R.string.button_clicked_msg , Toast.LENGTH_SHORT).show();
        }
    }
}

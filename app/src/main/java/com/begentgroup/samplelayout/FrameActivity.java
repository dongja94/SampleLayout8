package com.begentgroup.samplelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FrameActivity extends AppCompatActivity {
    TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        messageView = (TextView)findViewById(R.id.text_message);
        Button btn = (Button)findViewById(R.id.btn_show_message);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageView.setVisibility(View.VISIBLE);
            }
        });

        messageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageView.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_frame, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

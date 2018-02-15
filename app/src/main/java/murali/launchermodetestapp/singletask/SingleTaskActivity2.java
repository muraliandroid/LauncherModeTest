package murali.launchermodetestapp.singletask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import murali.launchermodetestapp.R;

public class SingleTaskActivity2 extends AppCompatActivity {

    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task2);
        btn1 = findViewById(R.id.singletask2_btn1);
        tv1 = findViewById(R.id.singletask2_tv1);

        Log.d("singleTask", "onCreate()");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingleTaskActivity2.this, SingleTaskActivity3.class));
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        tv1.setText("onNewIntent() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("singleTask", "onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("singleTask", "onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("singleTask", "onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("singleTask", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("singleTask", "onDestroy()");
    }
}

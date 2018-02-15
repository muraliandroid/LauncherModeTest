package murali.launchermodetestapp.singletop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import murali.launchermodetestapp.R;

public class Main3Activity extends AppCompatActivity {

    TextView tv3, tv3_1;
    Button b3, b3_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv3 = findViewById(R.id.activity3_text);
        b3 = findViewById(R.id.activity3_button);
        b3_1 = findViewById(R.id.activity3_1_button);
        tv3_1 = findViewById(R.id.activity3_2_text);

        //tv3_1.setText("onCreate");
        Log.d("SingleTop","onCreate()");

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main3Activity.this, Main3Activity.class));
            }
        });

        b3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(Main3Activity.this, Main3Activity.class));
                tv3.setText("Instance of Activity 3 is cleared using finish() and recalling now instance C is in top of the task " +
                        "so if we call Activity C again with \"SINGLE TOP\" Flag then onNewInstance will be called instead of creating new instance of  Activity C" +
                        "if instance of Activity C is not in top of the task (call finish()) then new instance will be created");
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        tv3.setText("onNewIntent called Activity-3, Instance of Activities A,B and C orderd one by one and now instance C is in top of the task " +
                "so if we call Activity C again with \"SINGLE TOP\" Flag then onNewInstance will be called instead of creating new instance of  Activity C" +
                "if instance of Activity C is not in top of the task (call finish()) then new instance will be created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //tv3_1.setText("onStart");
        Log.d("SingleTop","onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //tv3_1.setText("onStop");
        Log.d("SingleTop","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //tv3_1.setText("onDestroy");
        Log.d("SingleTop","onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //tv3_1.setText("onPause");
        Log.d("SingleTop","onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //tv3_1.setText("onResume");
        Log.d("SingleTop","onResume()");
    }
}
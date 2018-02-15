package murali.launchermodetestapp.singletask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import murali.launchermodetestapp.R;

public class SingleTaskActivity3 extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task3);
        btn1 = findViewById(R.id.singletask3_btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingleTaskActivity3.this, SingleTaskActivity2.class));
            }
        });
    }
}

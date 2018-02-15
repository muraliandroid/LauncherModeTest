package murali.launchermodetestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import murali.launchermodetestapp.singletask.SingleTaskActivity1;
import murali.launchermodetestapp.singletop.MainActivity;

public class LauncherModeHomeActivity extends AppCompatActivity {

    Button singleTopBtn, singleTaskBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_mode_home);
        singleTaskBtn = findViewById(R.id.goto_single_task);
        singleTopBtn = findViewById(R.id.goto_single_top);

        singleTopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(LauncherModeHomeActivity.this, MainActivity.class));
            }
        });

        singleTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(LauncherModeHomeActivity.this, SingleTaskActivity1.class));
            }
        });
    }
}
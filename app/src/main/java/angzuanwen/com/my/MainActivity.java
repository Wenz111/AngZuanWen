package angzuanwen.com.my;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnSpm;
    private Button mBtnOlevel;
    private Button mBtnUec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnSpm = findViewById(R.id.btnSpm);
        mBtnOlevel = findViewById(R.id.btnOlevel);
        mBtnUec = findViewById(R.id.btnUec);

        mBtnSpm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSpmActivity();
            }
        });

        mBtnOlevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchOlevelActivity();
            }
        });

        mBtnUec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchUecActivity();
            }
        });
    }

    private void launchSpmActivity(){
        Intent intent = new Intent(this, SpmActivity.class);
        startActivity(intent);
    }

    private void launchOlevelActivity(){
        Intent intent = new Intent(this, OlevelActivity.class);
        startActivity(intent);
    }

    private void launchUecActivity(){
        Intent intent = new Intent(this, UecActivity.class);
        startActivity(intent);
    }
}

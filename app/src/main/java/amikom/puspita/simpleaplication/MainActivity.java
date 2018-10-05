package amikom.puspita.simpleaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonActivity, buttonFragmen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonActivity = (Button) findViewById(R.id.fragmen2);
        buttonFragmen = (Button) findViewById(R.id.fragmen);

        buttonActivity.setOnClickListener(new View.OnClickListener());
        @Override

    }
}

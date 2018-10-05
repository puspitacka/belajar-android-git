package amikom.puspita.simpleaplication;

import android.preference.EditTextPreference;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import amikom.puspita.simpleaplication.util.PreferencesHelper;

public class LoginActivity extends AppCompatActivity {
    PreferencesHelper instance;
    private EditText name;
    private EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        instance = PreferencesHelper.getInstance(getApplication());

        name = (EditText) findViewById(R.id.etNama);
        email =(EditText) findViewById(R.id.etEmail);

    }

    public void Login (View view ) {
        String n = name.getText().toS
    }
}

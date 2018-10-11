package s.sanket.com.attender3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.*;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void goToWelcome(View v)
    {
        Intent i2= new Intent(RegisterActivity.this, RegisterActivity.class);
        startActivity(i2);
    }
}

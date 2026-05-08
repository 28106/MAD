package com.example.constaintlay;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This ensures the ConstraintLayout XML is displayed
        setContentView(R.layout.activity_main);
    }
}
package com.example.toggleevt;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3;
    RadioGroup radioGroup;
    RadioButton radioJava, radioHTML, radioPython, radioJS;
    ToggleButton toggleButton;
    TextView textView;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);

        radioGroup = findViewById(R.id.radioGroup);
        radioJava = findViewById(R.id.radioButton1);
        radioHTML = findViewById(R.id.radioButton2);
        radioPython = findViewById(R.id.radioButton3);
        radioJS = findViewById(R.id.radioButton4);

        toggleButton = findViewById(R.id.toggleButton);
        textView = findViewById(R.id.textView);
        submitButton = findViewById(R.id.submitButton);

        // Dynamic checkbox feedback
        checkBox1.setOnClickListener(v -> updateCheckBoxStatus(checkBox1));
        checkBox2.setOnClickListener(v -> updateCheckBoxStatus(checkBox2));
        checkBox3.setOnClickListener(v -> updateCheckBoxStatus(checkBox3));

        // Submit button click shows all selections
        submitButton.setOnClickListener(v -> showSubmittedSelections());
    }

    private void updateCheckBoxStatus(CheckBox cb) {
        if (cb.isChecked()) {
            textView.setText(cb.getText() + " Checked");
        } else {
            textView.setText(cb.getText() + " Unchecked");
        }
    }

    private void showSubmittedSelections() {
        StringBuilder sb = new StringBuilder("Submitted Selections:\n");

        // CheckBoxes
        if (checkBox1.isChecked()) sb.append("- ").append(checkBox1.getText()).append("\n");
        if (checkBox2.isChecked()) sb.append("- ").append(checkBox2.getText()).append("\n");
        if (checkBox3.isChecked()) sb.append("- ").append(checkBox3.getText()).append("\n");

        // RadioButton
        if (radioJava.isChecked()) sb.append("- JAVA\n");
        else if (radioHTML.isChecked()) sb.append("- HTML\n");
        else if (radioPython.isChecked()) sb.append("- Python\n");
        else if (radioJS.isChecked()) sb.append("- JavaScript\n");

        // ToggleButton
        sb.append("- Toggle is ").append(toggleButton.isChecked() ? "ON" : "OFF");

        textView.setText(sb.toString());
    }
}

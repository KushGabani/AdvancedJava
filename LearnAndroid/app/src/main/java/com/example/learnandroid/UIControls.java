package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class UIControls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uicontrols);

        String[] arr = {
                "Paris, France",
                "PA, United States",
                "Parana, Brazil",
                "Padua, Italy",
                "Pasadena, CA"
        };

        AutoCompleteTextView autoTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arr);

        autoTextView.setThreshold(3);
        autoTextView.setAdapter(adapter);

        Button submitText = (Button) findViewById(R.id.submitText);
        submitText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputText = (EditText) findViewById(R.id.editView);
                AutoCompleteTextView autoText = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
                String result = inputText.getText() + ". ";
                result += autoText.getText();

                Toast.makeText(UIControls.this, result, Toast.LENGTH_SHORT).show();
            }
        });

        Button submitChoice = (Button) findViewById(R.id.submitChoice);
        submitChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "";
                RadioGroup rdGroup = (RadioGroup) findViewById(R.id.radioGroup);
                int selectedRadioButtonId = rdGroup.getCheckedRadioButtonId();
                RadioButton rdButton = (RadioButton) findViewById(selectedRadioButtonId);
                String rdText = rdButton.getText().toString();
                result = "Radio button: " + rdText + ".\n";


                CheckBox ch1 = (CheckBox) findViewById(R.id.checkbox1);
                CheckBox ch2 = (CheckBox) findViewById(R.id.checkbox2);
                result += "Checkbox selected: ";
                if(ch1.isChecked()) {
                    result += ch1.getText().toString() + ", ";
                }
                if(ch2.isChecked()) {
                    result += ch2.getText().toString() + ". ";
                }

                ToggleButton toggleBtn = (ToggleButton) findViewById(R.id.toggleButton);
                result += "\nToggle Button: " + toggleBtn.getText();

                Toast.makeText(UIControls.this, result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
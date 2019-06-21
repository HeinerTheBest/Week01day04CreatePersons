package com.mobileapps.week01day04createpersons.Activities;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.mobileapps.week01day04createpersons.Models.Person;
import com.mobileapps.week01day04createpersons.R;

public class MainActivity extends AppCompatActivity {

    EditText etFirstName;
    EditText etLastName;
    EditText etAddress;
    EditText etCity;
    EditText etState;
    EditText etZipCode;
    Context context;
    TextView persons;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        etFirstName = findViewById(R.id.etFirstName);
        etLastName  = findViewById(R.id.etLastName);
        etAddress   = findViewById(R.id.etAddress);
        etCity      = findViewById(R.id.etCity);
        etState     = findViewById(R.id.etState);
        etZipCode   = findViewById(R.id.etZipCode);
        persons     = findViewById(R.id.tvPersons);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void submit(View vIew)
    {
        if(validate())
        {
            Person person = new Person(
                                        etFirstName.getText().toString(),
                                        etLastName.getText().toString(),
                                        etAddress.getText().toString(),
                                        etCity.getText().toString(),
                                        etState.getText().toString(),
                                        etZipCode.getText().toString());

            persons.append(person.toString(i));
            i++;
            restart();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public boolean validate()
    {
        boolean flag = true;

        if(etFirstName.getText().toString().isEmpty())
        {
            etFirstName.setHintTextColor(this.getColor(R.color.colorAccent));
            flag = false;
        }

        if(etLastName.getText().toString().isEmpty())
        {
            etLastName.setHintTextColor(this.getColor(R.color.colorAccent));
            flag = false;
        }

        if(etAddress.getText().toString().isEmpty())
        {
            etAddress.setHintTextColor(this.getColor(R.color.colorAccent));
            flag = false;
        }

        if(etCity.getText().toString().isEmpty())
        {
            etCity.setHintTextColor(this.getColor(R.color.colorAccent));
            flag = false;
        }

        if(etState.getText().toString().isEmpty())
        {
            etState.setHintTextColor(this.getColor(R.color.colorAccent));
            flag = false;
        }

        if(etZipCode.getText().toString().isEmpty())
        {
            etZipCode.setHintTextColor(this.getColor(R.color.colorAccent));
            flag = false;
        }
        return flag;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void restart(View view)
    {
        etFirstName.setText("");
        etLastName.setText("");
        etAddress.setText("");
        etZipCode.setText("");
        etState.setText("");
        etCity.setText("");

            etFirstName.setHintTextColor(this.getColor(R.color.colorHint));
            etLastName.setHintTextColor(this.getColor(R.color.colorHint));
            etAddress.setHintTextColor(this.getColor(R.color.colorHint));
            etCity.setHintTextColor(this.getColor(R.color.colorHint));
            etState.setHintTextColor(this.getColor(R.color.colorHint));
            etZipCode.setHintTextColor(this.getColor(R.color.colorHint));
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void restart()
    {
        etFirstName.setText("");
        etLastName.setText("");
        etAddress.setText("");
        etZipCode.setText("");
        etState.setText("");
        etCity.setText("");

        etFirstName.setHintTextColor(this.getColor(R.color.colorHint));
        etLastName.setHintTextColor(this.getColor(R.color.colorHint));
        etAddress.setHintTextColor(this.getColor(R.color.colorHint));
        etCity.setHintTextColor(this.getColor(R.color.colorHint));
        etState.setHintTextColor(this.getColor(R.color.colorHint));
        etZipCode.setHintTextColor(this.getColor(R.color.colorHint));
    }
}

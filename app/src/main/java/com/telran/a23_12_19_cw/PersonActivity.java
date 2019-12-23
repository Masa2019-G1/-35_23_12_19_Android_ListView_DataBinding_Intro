package com.telran.a23_12_19_cw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.telran.a23_12_19_cw.databinding.ActivityPersonBinding;

public class PersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPersonBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_person);
        binding.button2.setVisibility(View.GONE);
        Person person = new Person("Vasya",23);
        binding.setPerson(person);
//        setContentView(R.layout.activity_person);
//        Button btn2 = findViewById(R.id.button2);
//        btn2.setVisibility(View.GONE);
    }
}

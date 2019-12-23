package com.telran.a23_12_19_cw;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;


public class Person extends BaseObservable {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeName(View view){
        name = "Petya";
        notifyPropertyChanged(BR.name);
//        this.name.set("Petya");
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public int getAge() {
        return age;
    }
}

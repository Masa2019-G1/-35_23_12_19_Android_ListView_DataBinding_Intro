package com.telran.a23_12_19_cw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<Person> persons;
    private Context context;

    public MyAdapter(Context context) {
        persons = new ArrayList<>();
        this.context = context;
//        for (int i = 0; i < 1000; i++) {
//            persons.add(new Person("Name " + i, 20 + i % 10));
//        }
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int position) {
        return persons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.my_row,parent,false);
        }
        Person p = persons.get(position);
        TextView nameTxt = convertView.findViewById(R.id.nameTxt);
        TextView ageTxt = convertView.findViewById(R.id.ageTxt);
        nameTxt.setText(p.name);
        ageTxt.setText(String.valueOf(p.age));
        return convertView;
    }

    public void add(Person person) {
        persons.add(person);
        notifyDataSetChanged();
    }
}

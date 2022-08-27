package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<String> address = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      recyclerView = findViewById(R.id.recycle_view);
      address.add("Кулигова №17");
        address.add("Ленина №32");
        address.add("Ленина №205");
        address.add("Тагайбаева №143");
        address.add("Алтынай №212");
        address.add("Жибек Жолу №432");
        address.add("Т.Молдо №343");
        address.add("Масалиева №24");
        address.add("Гагарина №23");
        address.add("Масалиева №21");
        address.add("Курманжан Датка №09");
        address.add("Лунина №355");
        address.add("Лулигова №422");
        address.add("Масалиева №333");
        AddressAdapter adapter = new AddressAdapter(address);
recyclerView.setAdapter(adapter);









    }
}
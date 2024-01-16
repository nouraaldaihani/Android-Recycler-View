package com.noura.androidrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import Adaptor.CurrencyAccountAdaptor;

public class MainActivity extends AppCompatActivity {


    RecyclerView currencyreceyclerView;

    ArrayList <Currency> accountlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addcurrencyAccount();

        currencyreceyclerView = findViewById(R.id.currencyreceyclerView);
        currencyreceyclerView.setLayoutManager(new LinearLayoutManager(this));

        CurrencyAccountAdaptor currencyaccountadapter = new CurrencyAccountAdaptor(accountlist);
        currencyreceyclerView.setAdapter(currencyaccountadapter);
    }

    private void addcurrencyAccount(){

        Currency eurocurrency = new Currency ( "EUR", 0.33, "Europe Euro");
        Currency kuwaitcurrency = new Currency ( "KWD", 2.2, "kuwaiti dinar");
        Currency gbpcurrency = new Currency ("GBP",1, "British Pound");
        accountlist.add(eurocurrency);
        accountlist.add(kuwaitcurrency);
        accountlist.add(gbpcurrency);

    }
}
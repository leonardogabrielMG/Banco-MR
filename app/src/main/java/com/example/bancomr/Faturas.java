package com.example.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bancomr.databinding.ActivityFaturasBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class Faturas extends AppCompatActivity {

    private ActivityFaturasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarFaturas.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        CreditCardView cartaoDeCredito = binding.cartaoDeCredito;
        cartaoDeCredito.setCardNumber("5535 6477 8594 8687");
        cartaoDeCredito.setCardName("Leonardo A O");
        cartaoDeCredito.setExpiryDate("11/25");
        cartaoDeCredito.setType(CardType.AUTO);
    }
}
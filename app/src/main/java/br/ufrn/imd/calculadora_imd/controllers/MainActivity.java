package br.ufrn.imd.calculadora_imd.controllers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import br.ufrn.imd.calculadora_imd.R;

public class MainActivity extends AppCompatActivity {
    private GradesFragment gradesFragment;
    private CalculatorFragment calculatorFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculatorFragment = new CalculatorFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contentFrame, calculatorFragment);
        transaction.commit();
    }

    public void navigateToCalculator(View v) {
        calculatorFragment = new CalculatorFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contentFrame, calculatorFragment);
        transaction.commit();
    }

    public void navigateToGrades(View v) {
        System.out.println(v.toString());
        gradesFragment = new GradesFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contentFrame, gradesFragment);
        transaction.commit();
    }
}
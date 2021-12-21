package com.eticapovedeniya.eticaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long backPressedtimer;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void textBtnMainAct1OnClick (View view){
        Intent intent = new Intent(this, PeculiaritiesActivity.class);
        startActivity(intent);
        finish();
    }
    public void textBtnMainAct2OnClick (View view){
        Intent intent = new Intent(this, ImportantIngredientsActivity.class);
        startActivity(intent);
        finish();
    }
    public void textBtnMainAct3OnClick (View view){
        Intent intent = new Intent(this, RelationshipNormsActivity.class);
        startActivity(intent);
        finish();
    }
    public void textBtnMainAct4OnClick (View view){
        Intent intent = new Intent(this, RulesActivity.class);
        startActivity(intent);
        finish();
    }
    public void textBtnMainAct5OnClick (View view){
        Intent intent = new Intent(this, ExamplesActivity.class);
        startActivity(intent);
        finish();
    }
    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        if (backPressedtimer + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast = Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти!", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedtimer = System.currentTimeMillis();
    }
}
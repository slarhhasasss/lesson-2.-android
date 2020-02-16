package ru.kolesnikovDmitry.lesson2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    String GO_AWAY = "Пошел Нахуй";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void onClickButtonNoYou(View view) {
        Toast.makeText(getApplicationContext(), GO_AWAY, Toast.LENGTH_LONG).show();
        finish();
    }
}

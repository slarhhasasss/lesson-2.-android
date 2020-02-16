package ru.kolesnikovDmitry.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String DEFAULT_MESSAGE = "Он ничего не хотел лол";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButtonSecondActivity(View view) {
        EditText mEditTextCheHotel = findViewById(R.id.editTextCheHotel);
        String message;
        if(!mEditTextCheHotel.getText().toString().equals("")) {
            message = mEditTextCheHotel.getText().toString();
        }
        else {
            message = DEFAULT_MESSAGE;
        }

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
        finish();
    }
}

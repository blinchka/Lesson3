package ru.mirea.kiushkinaaa.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        editText = findViewById(R.id.editTextTextPersonName);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Любимая книга разработчика: %s", university));
        }


    }


    public void onClickSend(View view){
        Intent data = new Intent();
        String text =  editText.getText().toString();
        data.putExtra(MainActivity.USER_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }

}
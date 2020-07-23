package com.example.jumbleword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv;
    EditText et;
    Button c,n;
    String wordToFind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.txt);
        et=findViewById(R.id.enter);
        c=findViewById(R.id.click);
        n=findViewById(R.id.nxt);
        c.setOnClickListener(this);
        n.setOnClickListener(this);
        next();
    }

    @Override
    public void onClick(View v) {
        if(v == c){
            check();
        }
        else if(v == n){
            next();
        }
    }
    private void check(){
        String wrd = tv.getText().toString();
        if(wordToFind.equals(wrd)){
            Toast.makeText(this, "You are Right....!!", Toast.LENGTH_SHORT).show();
            next();
        }
        else {
            Toast.makeText(this, "Wrong guess....!!", Toast.LENGTH_SHORT).show();
        }
    }
    private void next(){
        wordToFind = Anagram.jumble();
        String wordJumbled = Anagram.jumbleword(wordToFind);
        tv.setText(wordJumbled);
        et.setText("");
    }

}
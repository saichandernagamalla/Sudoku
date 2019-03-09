package com.example.nitinkumar.sudoku44;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
    }
    public void easy(View v){
        Intent intent=new Intent(MainActivity2Activity.this,MainActivity.class);
        intent.putExtra("mode",12);
        startActivity(intent);
    }
    public void medium(View v){
        Intent intent=new Intent(MainActivity2Activity.this,MainActivity.class);
        intent.putExtra("mode",8);
        startActivity(intent);
    }
    public void hard(View v){
        Intent intent=new Intent(MainActivity2Activity.this,MainActivity.class);
        intent.putExtra("mode",6);
        startActivity(intent);
    }
}

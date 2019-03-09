package com.example.nitinkumar.sudoku44;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.EditText;
import java.util.Random;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import java.util.ArrayList;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    int b1[][]=new int[4][4];
    int a[][]=new int[4][4];
    final EditText t[][]=new EditText[4][4];
    int i=0,j=0,uncnt=0;
    Coordinates []c=new Coordinates[16];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button undo = (Button) findViewById(R.id.b);
        Button check = (Button) findViewById(R.id.button);

        t[0][0] = (EditText) findViewById(R.id.t1);
        t[0][1] = (EditText) findViewById(R.id.t2);
        t[0][2] = (EditText) findViewById(R.id.t3);
        t[0][3] = (EditText) findViewById(R.id.t4);
        t[1][0] = (EditText) findViewById(R.id.t5);
        t[1][1] = (EditText) findViewById(R.id.t6);
        t[1][2] = (EditText) findViewById(R.id.t7);
        t[1][3] = (EditText) findViewById(R.id.t8);
        t[2][0] = (EditText) findViewById(R.id.t9);
        t[2][1] = (EditText) findViewById(R.id.t10);
        t[2][2] = (EditText) findViewById(R.id.t11);
        t[2][3] = (EditText) findViewById(R.id.t12);
        t[3][0] = (EditText) findViewById(R.id.t13);
        t[3][1] = (EditText) findViewById(R.id.t14);
        t[3][2] = (EditText) findViewById(R.id.t15);
        t[3][3] = (EditText) findViewById(R.id.t16);

        Random r = new Random();
        int low = 1, high = 4;

        t[0][0].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(0, 0))
                    c[uncnt++] = new Coordinates(0, 0);
            }
        });

        t[0][1].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(0, 1))
                    c[uncnt++] = new Coordinates(0, 1);
            }
        });

        t[0][2].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(0, 2))
                    c[uncnt++] = new Coordinates(0, 2);
            }
        });

        t[0][3].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(0, 3))
                    c[uncnt++] = new Coordinates(0, 3);
            }
        });

        t[1][0].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(1, 0))
                    c[uncnt++] = new Coordinates(1, 0);
            }
        });

        t[1][1].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(1, 1))
                    c[uncnt++] = new Coordinates(1, 1);
            }
        });

        t[1][2].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(1, 2))
                    c[uncnt++] = new Coordinates(1, 2);
            }
        });

        t[1][3].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(1, 3))
                    c[uncnt++] = new Coordinates(1, 3);
            }
        });

        t[2][0].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(2, 0))
                    c[uncnt++] = new Coordinates(2, 0);
            }
        });

        t[2][1].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(2, 1))
                    c[uncnt++] = new Coordinates(2, 1);
            }
        });

        t[2][2].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(2, 2))
                    c[uncnt++] = new Coordinates(2, 2);
            }
        });

        t[2][3].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(2, 3))
                    c[uncnt++] = new Coordinates(2, 3);
            }
        });

        t[3][0].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(3, 0))
                    c[uncnt++] = new Coordinates(3, 0);
            }
        });

        t[3][1].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(3, 1))
                    c[uncnt++] = new Coordinates(3, 1);
            }
        });

        t[3][2].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(3, 2))
                    c[uncnt++] = new Coordinates(3, 2);
            }
        });

        t[3][3].setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (check1(3, 3))
                    c[uncnt++] = new Coordinates(3, 3);
            }
        });

        undo.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if (uncnt < 1)
                    return;
                --uncnt;
                int x = c[uncnt].x;
                int y = c[uncnt].y;
                c[uncnt] = null;
                t[x][y].setText("");
            }
        });

        check.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String num = t[0][0].getText().toString();
                String num1 = t[1][1].getText().toString();
                boolean b = false;

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (b1[i][j] == 0) {
                            if ((t[i][j].getText().toString()).equals("")) {
                                Toast.makeText(getBaseContext(), "please fill the empty boxes", Toast.LENGTH_LONG).show();
                                t[i][j].setBackgroundColor(Color.CYAN);
                                b = true;
                            } else {
                                if (Integer.parseInt(t[i][j].getText().toString()) != a[i][j]) {
                                    Toast.makeText(getBaseContext(), "wrong value inserted", Toast.LENGTH_LONG).show();
                                    t[i][j].setBackgroundColor(Color.RED);
                                    b = true;
                                }
                            }
                        }
                    }
                }
                if (b == false) {
                    Toast.makeText(getApplicationContext(), "you won", Toast.LENGTH_LONG).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle("you won the match");
                    //.setMessage("do you want to continue");

                    builder.setPositiveButton("Return to Home", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface diag, int which) {
                            Intent intent = new Intent(MainActivity.this, MainActivity2Activity.class);
                            startActivity(intent);
                        }
                    });

                    builder.setNegativeButton("Restart", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface diag, int which) {
                            Intent intent = getIntent();
                            finish();
                            startActivity(intent);
                        }
                    });
                    builder.show();
                }
            }
        });

        int n, t1 = 0, k, c = 0;
        a[0][0] = r.nextInt(4) + low;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                t1 = 0;
                while (t1 == 0) {
                    n = r.nextInt(4) + low;
                    if (i == 0 && j == 0) {
                        t1 = t1 + 1;
                    } else if (i == 0 && j != 0) {
                        for (k = 0; k < j; k++)
                            if (a[0][k] != n) {
                            } else break;
                        if (k == j) {
                            a[0][j] = n;
                            t1 = t1 + 1;
                            break;
                        }
                    } else if (i == 1) {
                        if (a[0][j] != n) {
                            if (j % 2 == 0) {
                                if (n == a[0][j + 1])
                                    continue;
                            } else if (j % 2 == 1) {
                                if (n == a[0][j - 1])
                                    continue;
                            }
                            if (j == 0) {
                                a[1][j] = n;
                                t1++;
                            } else {
                                for (k = 0; k < j; k++)
                                    if (a[1][k] == n)
                                        break;
                                if (k == j) {
                                    a[1][j] = n;

                                    t1 = t1 + 1;
                                    break;
                                }
                            }
                        }
                    } else if (i == 2) {
                        for (k = 0; k < i; k++)
                            if (n == a[k][j])
                                break;
                        if (k == i) {
                            for (k = 0; k < j; k++) {
                                if (n == a[i][k])
                                    break;
                            }
                            if (k == j) {
                                a[2][j] = n;
                                t1 = t1 + 1;
                            } else {
                                t1 = t1 + 1;
                                j = 0;
                            }
                        }

                    } else if (i == 3) {
                        for (k = 0; k < i; k++)
                            if (n == a[k][j])
                                break;

                        if (k == i) {
                            a[3][j] = n;
                            t1 = t1 + 1;
                            break;
                        }
                    }
                }
            }
        }


        Intent intent = getIntent();
        int n2 = intent.getIntExtra("mode", 0);
        int count = 0;

        for (int i1 = 0; i1 < 4; i1++) {
            for (int j1 = 0; j1 < 4; j1++) {
                int m = low + r.nextInt(4);
                int n1 = low + r.nextInt(4);

                if (count == n2)
                    break;
                if (i1 == m || j1 == n1) {
                    t[i1][j1].setEnabled(true);
                    b1[i1][j1] = 0;
                }
                else {
                    b1[i1][j1] = a[i1][j1];
                    count++;
                    t[i1][j1].setHint(Integer.toString(a[i1][j1]));
                    t[i1][j1].setEnabled(false);
                }
            }
        }

        /*
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
                b1[i][j]=0;
        }

        while (count != n2) {
            for (int i = 0; i < 4; i++) {
                if (count == n2)
                    break;

                int x = low + r.nextInt(4);
                if (b1[i][x] == 0) {
                    b1[i][x] = a[i][x];
                    t[i][x].setHint(Integer.toString(a[i][x]));
                    t[i][x].setEnabled(false);
                    count++;
                }
                else{
                    t[i][x].setEnabled(true);i--;
                }
            }
        }*/
    }

    public void restart(View v)
    {
        Intent intent=getIntent();
        finish();
        startActivity(intent);
    }

    public void onBackPressed(){
        //Toast.makeText(getApplicationContext(),"you won",Toast.LENGTH_LONG).show();
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("do you want to continue?");
        //.setMessage("do you want to continue");

        builder.setPositiveButton("Yes",new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface diag,int which)
            {

            }
        });

        builder.setNegativeButton("No",new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface diag,int which)
            {
                Intent intent = new Intent(MainActivity.this,MainActivity2Activity.class);
                finish();
                startActivity(intent);
            }
        });
        builder.show();
    }

    public boolean check1(int x,int y)
    {
        for(int i=0;i<uncnt;i++)
        {
            if(c[i].x==x && c[i].y==y)
                return false;
        }
        return true;
    }
}
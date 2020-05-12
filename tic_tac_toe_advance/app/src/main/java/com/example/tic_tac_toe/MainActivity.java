package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 1;
    boolean winner = false;
    boolean winners;
    int s = 3;
    int v = 0;
    TextView t1;
    ImageButton b0;
    String n1, n2, n3, n4, n5, n6, n7, n8, n9;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    boolean b11 = true, b12 = true, b13 = true, b14 = true, b15 = true, b16 = true, b17 = true, b18 = true, b19 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        t1 = findViewById(R.id.t1);


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.two);
        Handler handler=new Handler();







        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.start();





                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                t1.setText("");
                s = 3;
                n1 = "";
                n2 = "";
                n3 = "";
                n4 = "";
                n5 = "";
                n6 = "";
                n7 = "";
                n8 = "";
                n9 = "";
                b11 = true;
                b12 = true;
                b13 = true;
                b14 = true;
                b15 = true;
                b16 = true;
                b17 = true;
                b18 = true;
                b19 = true;
                winner = false;

            }
        });


    }

    public void ok(View v) {
        if(!winner) {
            switch (v.getId()) {
                case R.id.b1:
                    if (b11) {
                        if (s % 2 == 0) {
                            b1.setText("O");
                            n1 = "O";
                        } else {
                            b1.setText("X");
                            n1 = "X";
                        }
                        s = s + 1;
                        b11 = false;
                        conditions();


                    }
                    break;
                case R.id.b2:
                    if (b12) {
                        if (s % 2 == 0) {
                            b2.setText("O");
                            n2 = "O";
                        } else {
                            b2.setText("X");
                            n2 = "X";
                        }
                        s = s + 1;
                        b12 = false;
                        conditions();

                    }break;

                case R.id.b3:
                    if (b13) {
                        if (s % 2 == 0) {
                            b3.setText("O");
                            n3 = "O";
                        } else {
                            b3.setText("X");
                            n3 = "X";
                        }
                        b13 = false;
                        s = s + 1;
                        conditions();



                    } break;
                case R.id.b4:
                    if (b14) {
                        if (s % 2 == 0) {
                            b4.setText("O");
                            n4 = "O";
                        } else {
                            b4.setText("X");
                            n4 = "X";
                        }
                        b14 = false;
                        s = s + 1;
                        conditions();

                    } break;
                case R.id.b5:
                    if (b15) {
                        if (s % 2 == 0) {
                            b5.setText("O");
                            n5 = "O";
                        } else {
                            b5.setText("X");
                            n5 = "X";
                        }
                        b15 = false;
                        s = s + 1;
                        conditions();

                    } break;
                case R.id.b6:
                    if (b16) {
                        if (s % 2 == 0) {
                            b6.setText("O");
                            n6 = "O";
                        } else {
                            b6.setText("X");
                            n6 = "X";
                        }
                        b16 = false;
                        s = s + 1;
                        conditions();

                    } break;
                case R.id.b7:
                    if (b17) {
                        if (s % 2 == 0) {
                            b7.setText("O");;
                            n7 = "O";
                        } else {
                            b7.setText("X");
                            n7 = "X";
                        }
                        b17 = false;
                        s = s + 1;
                        conditions();

                    } break;
                case R.id.b8:
                    if (b18) {
                        if (s % 2 == 0) {
                            b8.setText("O");
                            n8 = "O";
                        } else {
                            b8.setText("X");
                            n8 = "X";
                        }
                        b18 = false;
                        s = s + 1;
                        conditions();

                    } break;
                case R.id.b9:
                    if (b19) {
                        if (s % 2 == 0) {
                            b9.setText("O");
                            n9 = "O";
                        } else {
                            b9.setText("X");
                            n9 = "X";
                        }
                        b19 = false;
                        s = s + 1;
                        conditions();

                    } break;
            }


        }
    }

    public void conditions() {
        if (n1 == "X" && n2 == "X" && n3 == "X" || n1 == "O" && n2 == "O" && n3 == "O") {
            if (n2 == "X") {
               t1.setText("Aha! X Win");
                winner = true;
                v = 1;
            } else {
                v = 1;
                winner = true;
                t1.setText("hurray! O Win ");
            }
        }
        if (n1 == "X" && n4 == "X" && n7 == "X" || n1 == "O" && n4 == "O" && n7 == "O") {
            if (n4 == "X") {
                t1.setText("Aha! X Win");
                winner = true;
                v = 1;
            } else {
                v = 1;
                winner = true;
                t1.setText("hurray! O Win ");
            }
        }
        if (n1 == "X" && n5 == "X" && n9 == "X" || n1 == "O" && n5 == "O" && n9 == "O") {
            if (n1 == "X") {
                t1.setText("Aha! X Win");
                winner = true;
                v = 1;
            } else {
                v = 1;
                winner = true;
                t1.setText("hurray! O Win");
            }
        }
        if (n3 == "X" && n5 == "X" && n7 == "X" || n3 == "O" && n5 == "O" && n7 == "O") {
            if (n3 == "X") {
                t1.setText("Aha! X Win");
                winner = true;
                v = 1;
            } else {
                v = 1;
                winner = true;
                t1.setText("hurray! O Win");
            }
        }
        if (n2 == "X" && n5 == "X" && n8 == "X" || n2 == "O" && n5 == "O" && n8 == "O") {
            if (n2 == "X") {
                t1.setText("Aha! X Win");
                winner = true;
                v = 1;
            } else {
                v = 1;
                winner = true;
                t1.setText("hurray! O Win");
            }
        }
        if (n3 == "X" && n6 == "X" && n9 == "X" || n3 == "O" && n6 == "O" && n9 == "O") {
            if (n3 == "X") {
                t1.setText("Aha! X Win");
                winner = true;
                v = 1;
            } else {
                v = 1;
                winner = true;
                t1.setText("hurray! O Win");
            }
        }
        if (n4 == "X" && n5 == "X" && n6 == "X" || n4 == "O" && n5 == "O" && n6 == "O") {
            if (n4 == "X") {
                t1.setText("Aha! X Win");
                winner = true;
                v = 1;
            } else {
                v = 1;
                winner = true;
                t1.setText("hurray! O Win");
            }
        }
        if (n7 == "X" && n8 == "X" && n9 == "X" || n7 == "O" && n8 == "O" && n9 == "O") {
            if (n7 == "X") {
                t1.setText("Aha! X Win");
                winner = true;
                v = 1;
            } else {
                v = 1;
                winner = true;
                t1.setText("hurray! O Win");
            }
        } else if (s == 12 && v == 0) {
            t1.setText("DRAW");


        }

    }
    }
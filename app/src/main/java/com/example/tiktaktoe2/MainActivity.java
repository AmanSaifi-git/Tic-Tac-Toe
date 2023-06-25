package com.example.tiktaktoe2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,resetData;
    int count =0;
    int flag = 0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
//    TextView txtWin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        resetData = findViewById(R.id.resetData);
        resetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//        androidx.appcompat.app.AlertDialog.Builder delBuilder = new androidx.appcompat.app.AlertDialog.Builder(MainActivity.this);
//        delBuilder.setTitle("RESET THE DATA");
//        delBuilder.setMessage("Are you sure want to delete");
//        delBuilder.setIcon(R.drawable.ic_baseline_info_24);
//        delBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });
//        delBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });
                restart();
            }
        });
//        txtWin = findViewById(R.id.txtWin);

    }
    public void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }
    public void check(View view){
        Button checkButton = (Button) view;
        if(checkButton.getText().toString().equals("")){
            count++;
            if(flag==0){
                checkButton.setText("X");
                flag=1;
            }else{
                checkButton.setText("O");
                flag = 0;
            }

            if(count>4){
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
                if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
//                    Toast.makeText(this, "WINNER IS "+b1, Toast.LENGTH_SHORT).show();
//                    txtWin.setText("WINNER IS "+b1);
//                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//                    txtWin.startAnimation(scale);

                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.custom_layout);
                    dialog.show();
                    dialog.setCancelable(false);
                    TextView msgTxtView = dialog.findViewById(R.id.msgTxtView);
                    msgTxtView.setText(b1);
                    Button btnLayout = dialog.findViewById(R.id.btnLayout);
                    btnLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });


                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);



                }else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
//                    Toast.makeText(this, "WINNER IS "+b4, Toast.LENGTH_SHORT).show();
//                    txtWin.setText("WINNER IS "+b4);
//                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//                    txtWin.startAnimation(scale);
                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.custom_layout);
                    dialog.show();
                    dialog.setCancelable(false);
                    TextView msgTxtView = dialog.findViewById(R.id.msgTxtView);
                    msgTxtView.setText(b4);
                    Button btnLayout = dialog.findViewById(R.id.btnLayout);
                    btnLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);



                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
//                    Toast.makeText(this, "WINNER IS "+b7, Toast.LENGTH_SHORT).show();
//                    txtWin.setText("WINNER IS "+b7);
//                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//                    txtWin.startAnimation(scale);

                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.custom_layout);
                    dialog.show();
                    dialog.setCancelable(false);
                    TextView msgTxtView = dialog.findViewById(R.id.msgTxtView);
                    msgTxtView.setText(b7);
                    Button btnLayout = dialog.findViewById(R.id.btnLayout);
                    btnLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
//                    txtWin.setText("WINNER IS "+b1);
//                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//                    txtWin.startAnimation(scale);
//                    Toast.makeText(this, "WINNER IS "+b1, Toast.LENGTH_SHORT).show();

                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.custom_layout);
                    dialog.show();
                    dialog.setCancelable(false);
                    TextView msgTxtView = dialog.findViewById(R.id.msgTxtView);
                    msgTxtView.setText(b1);
                    Button btnLayout = dialog.findViewById(R.id.btnLayout);
                    btnLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);


                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
//                    txtWin.setText("WINNER IS "+b2);
//                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//                    txtWin.startAnimation(scale);
//                    Toast.makeText(this, "WINNER IS "+b2, Toast.LENGTH_SHORT).show();
                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.custom_layout);
                    dialog.show();
                    dialog.setCancelable(false);
                    TextView msgTxtView = dialog.findViewById(R.id.msgTxtView);
                    msgTxtView.setText(b2);
                    Button btnLayout = dialog.findViewById(R.id.btnLayout);
                    btnLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);


                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
//                    txtWin.setText("WINNER IS "+b3);
//                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//                    txtWin.startAnimation(scale);
//                    Toast.makeText(this, "WINNER IS "+b3, Toast.LENGTH_SHORT).show();
                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.custom_layout);
                    dialog.show();
                    dialog.setCancelable(false);
                    TextView msgTxtView = dialog.findViewById(R.id.msgTxtView);
                    msgTxtView.setText(b3);
                    Button btnLayout = dialog.findViewById(R.id.btnLayout);
                    btnLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);


                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
//                    txtWin.setText("WINNER IS "+b1);
//                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//                    txtWin.startAnimation(scale);
//                    Toast.makeText(this, "WINNER IS "+b1, Toast.LENGTH_SHORT).show();

                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.custom_layout);
                    dialog.show();
                    dialog.setCancelable(false);
                    TextView msgTxtView = dialog.findViewById(R.id.msgTxtView);
                    msgTxtView.setText(b1);
                    Button btnLayout = dialog.findViewById(R.id.btnLayout);
                    btnLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);


                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
//                    txtWin.setText("WINNER IS "+b3);
//                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//                    txtWin.startAnimation(scale);
//                    Toast.makeText(this, "WINNER IS "+b3, Toast.LENGTH_SHORT).show();

                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.custom_layout);
                    dialog.show();
                    dialog.setCancelable(false);
                    TextView msgTxtView = dialog.findViewById(R.id.msgTxtView);
                    msgTxtView.setText(b3);
                    Button btnLayout = dialog.findViewById(R.id.btnLayout);
                    btnLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);


                }else if(count ==9){
//                    txtWin.setText("DRAW");
//                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
//                    txtWin.startAnimation(scale);
//                    Toast.makeText(this, "MATCH IS DRAW ", Toast.LENGTH_SHORT).show();
                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.custom_layout);
                    dialog.show();
                    dialog.setCancelable(false);
                    TextView msgTxtView = dialog.findViewById(R.id.msgTxtView);
                    msgTxtView.setText("DRAW");
                    Button btnLayout = dialog.findViewById(R.id.btnLayout);
                    btnLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                }
            }
        }
    }
    public void customDialog(){


    }
    public void restart(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag =0;
        count=0;

    }
}
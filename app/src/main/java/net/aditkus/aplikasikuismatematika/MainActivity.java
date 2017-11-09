package net.aditkus.aplikasikuismatematika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double ang1, ang2;
    int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void soalbaru(View view) {
        EditText ed1 = (EditText)findViewById(R.id.angka1);
        EditText ed2 = (EditText)findViewById(R.id.angka2);
        EditText ed3 = (EditText)findViewById(R.id.operator);

        double random1;
        double random2;
        int random3;
        random1 = (int) (Math.random()*100);
        random2 = (int) (Math.random()*100+1);
        random3 = (int) (Math.random()*4);
        String e1 = String.valueOf(random1);
        String e2 = String.valueOf(random2);

        ed1.setText(e1);
        ed2.setText(e2);

        if (random3 == 0){
            ed3.setText("+");
        }

        if (random3 == 1){
            ed3.setText("-");
        }

        if (random3 == 2){
            ed3.setText("/");
        }

        if (random3 == 3){
            ed3.setText("*");
        }

        ang1 = random1;
        ang2 = random2;
        op = random3;
    }

    public void cekjawab(View view) {
        EditText edt = (EditText) findViewById(R.id.input);
        TextView jawaban = (TextView) findViewById(R.id.hasil);
        TextView jwbB = (TextView)findViewById(R.id.benar);
        TextView jwbS = (TextView)findViewById(R.id.salah);

        String Jwb = edt.getText().toString();
        int ang3 = Integer.parseInt(Jwb);
        String in = String.valueOf(ang3);
        int random4;
        random4 = (int)(Math.random()*100);
        String e3 = String.valueOf(random4);
        double hasiljaw;

        if (op == 0) {
            hasiljaw = ang1 + ang2;
            String hsl = String.valueOf(hasiljaw);

            if (hasiljaw == Double.parseDouble(edt.getText().toString())) {
                jawaban.setText("Selamat! \njawaban anda benar");
                jwbB.setText(hsl);
                jwbS.setText(e3);
            } else {
                jawaban.setText("jawaban anda salah");
                jwbB.setText(hsl);
                jwbS.setText(in);
            }
        }

        if (op == 1) {
            hasiljaw = ang1 - ang2;
            String hsl = String.valueOf(hasiljaw);

            if (hasiljaw == Double.parseDouble(edt.getText().toString())) {
                jawaban.setText("Selamat! \njawaban anda benar");
                jwbB.setText(hsl);
                jwbS.setText(e3);
            } else {
                jawaban.setText("jawaban anda salah");
                jwbB.setText(hsl);
                jwbS.setText(in);
            }
        }

        if (op == 2) {
            hasiljaw = ang1 / ang2;
            String hsl = String.valueOf(hasiljaw);

            if (hasiljaw == Double.parseDouble(edt.getText().toString())) {
                jawaban.setText("Selamat! \njawaban anda benar");
                jwbB.setText(hsl);
                jwbS.setText(e3);
            } else {
                jawaban.setText("jawaban anda salah");
                jwbB.setText(hsl);
                jwbS.setText(in);
            }
        }

        if (op == 3) {
            hasiljaw = ang1 * ang2;
            String hsl = String.valueOf(hasiljaw);

            if (hasiljaw == Double.parseDouble(edt.getText().toString())) {
                jawaban.setText("Selamat! \njawaban anda benar");
                jwbB.setText(hsl);
                jwbS.setText(e3);
            } else {
                jawaban.setText("jawaban anda salah");
                jwbB.setText(hsl);
                jwbS.setText(in);
            }
        }
    }
}

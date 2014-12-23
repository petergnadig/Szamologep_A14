package com.example.gnadigpeter.szamologep_a14;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView kijelzo = (TextView) findViewById(R.id.kijelzo);
        final TextView elozo = (TextView) findViewById(R.id.elozo);
        final TextView muvelet = (TextView) findViewById(R.id.muvelet);

        Button button_0 = (Button) findViewById(R.id.button_0);
        button_0.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("0");
            }
        });
        Button button_1 = (Button) findViewById(R.id.button_1);
        button_1.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("1");
            }
        });
        Button button_2 = (Button) findViewById(R.id.button_2);
        button_2.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("2");
            }
        });
        Button button_3 = (Button) findViewById(R.id.button_3);
        button_3.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("3");
            }
        });
        Button button_4 = (Button) findViewById(R.id.button_4);
        button_4.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("4");
            }
        });
        Button button_5 = (Button) findViewById(R.id.button_5);
        button_5.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("5");
            }
        });
        Button button_6 = (Button) findViewById(R.id.button_6);
        button_6.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("6");
            }
        });
        Button button_7 = (Button) findViewById(R.id.button_7);
        button_7.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("7");
            }
        });
        Button button_8 = (Button) findViewById(R.id.button_8);
        button_8.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("8");
            }
        });
        Button button_9 = (Button) findViewById(R.id.button_9);
        button_9.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append("9");
            }
        });
        Button button_T = (Button) findViewById(R.id.button_T);
        button_T.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.append(".");
            }
        });
        Button button_C = (Button) findViewById(R.id.button_C);
        button_C.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                kijelzo.setText("");
                elozo.setText("");
                muvelet.setText("");
            }
        });
        Button button_P = (Button) findViewById(R.id.button_P);
        button_P.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                float e;
                float k;
                String muv;
                float m=0;

                try { e = Float.parseFloat(elozo.getText().toString());} catch (NumberFormatException err) {e=0;}
                try { k = Float.parseFloat(kijelzo.getText().toString());} catch (NumberFormatException err) {k=0;}
                muv = muvelet.getText().toString();

                if (muv.equals("+")) { m=e+k;}
                if (muv.equals("-")) { m=e-k;}
                if (muv.equals("")) { m=k;}

                String s = Float.toString(m);
                elozo.setText(s);
                muvelet.setText("+");
                kijelzo.setText("");
            }
        });
        Button button_M = (Button) findViewById(R.id.button_M);
        button_M.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                float e;
                float k;
                String muv;
                float m=0;

                try { e = Float.parseFloat(elozo.getText().toString());} catch (NumberFormatException err) {e=0;}
                try { k = Float.parseFloat(kijelzo.getText().toString());} catch (NumberFormatException err) {k=0;}
                muv = muvelet.getText().toString();

                if (muv.equals("+")) { m=e+k; }
                if (muv.equals("-")) { m=e-k; }
                if (muv.equals("")) { m=k; }

                String s = Float.toString(m);
                elozo.setText(s);
                muvelet.setText("-");
                kijelzo.setText("");
            }
        });
        Button button_E = (Button) findViewById(R.id.button_E);
        button_E.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                float e;
                float k;
                String muv;
                float m=0;

                try { e = Float.parseFloat(elozo.getText().toString());} catch (NumberFormatException err) {e=0;}
                try { k = Float.parseFloat(kijelzo.getText().toString());} catch (NumberFormatException err) {k=0;}
                muv = muvelet.getText().toString();

                if (muv.equals("+")) { m=e+k; }
                if (muv.equals("-")) { m=e-k; }
                if (muv.equals("")) { m=k; }

                String s = Float.toString(m);
                elozo.setText("");
                muvelet.setText("");
                kijelzo.setText(s);
            }
        });
    }



}


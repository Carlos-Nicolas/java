package com.example.caljava;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText pant;
    public double operan1, operan2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant=(EditText)findViewById(R.id.caja);
    }

    public void bt1 (View v){
        String cap= pant.getText().toString();
        cap=cap+"1";
        pant.setText(cap);
    }

    public void bt2 (View v){
        String cap= pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);

    }
    public void bt3 (View v){
        String cap= pant.getText().toString();
        cap=cap+"3";
        pant.setText(cap);

    }
    public void bt4 (View v){
        String cap= pant.getText().toString();
        cap=cap+"4";
        pant.setText(cap);

    }
    public void bt5 (View v){
        String cap= pant.getText().toString();
        cap=cap+"5";
        pant.setText(cap);

    }
    public void bt6 (View v){
        String cap= pant.getText().toString();
        cap=cap+"6";
        pant.setText(cap);

    }
    public void bt7 (View v){
        String cap= pant.getText().toString();
        cap=cap+"7";
        pant.setText(cap);

    }
    public void bt8 (View v){
        String cap= pant.getText().toString();
        cap=cap+"8";
        pant.setText(cap);
    }

    public void bt9 (View v){
        String cap= pant.getText().toString();
        cap=cap+"9";
        pant.setText(cap);
    }

    public void bt0 (View v){
        String cap= pant.getText().toString();
        cap=cap+"0";
        pant.setText(cap);

    }

    public void bt00 (View v){
        String cap= pant.getText().toString();
        cap=cap+"00";
        pant.setText(cap);

    }

    public void btpunt (View v){
        String cap=pant.getText().toString();
        cap=cap+".";
        pant.setText(cap);
    }

    public void suma(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=1;
    }

    public void resta (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=2;
    }
    public void multiplicacion (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
            pant.setText("");
            String aux2= pant.getText().toString();
            operan2= Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=3;
    }

    public void division (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=4;
    }

    public void igual (View v){
        try{
            String aux2= pant.getText().toString();
            operan2= Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){};
        pant.setText("total"+res);

        if (ope==1){
            res=operan1+operan2;

        }else if (ope==2){
            res=operan1-operan2;

        }else if (ope==3){
            res=operan1*operan2;

        }else if (ope==4){
            if(operan2==0){
                pant.setText("Numero no se puede dividir para 0");
            }else{
                res= operan1/operan2;
            }
        }

        pant.setText(""+res);
        operan1=res;
    }

    public void clear (View v){
        pant.setText("");
        operan1=0.0;
        operan2=0.0;
        res=0.0;
    }

}

package go.programacion.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /*Creacion de las variables de entrada y para las operaciones*/
    public EditText pant;

    public int operan1, operan2, res;
    int ope,posicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pant=(EditText)findViewById(R.id.txtcaja);


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

    public void btpunt (View v){
        String cap=pant.getText().toString();
        cap=cap+".";
        pant.setText(cap);
    }

    public void btpar(View v){
        String cap=pant.getText().toString();
        cap=cap+"( )";
        pant.setText(cap);
    }

    public void suma(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};

        pant.setText("");
        ope=1;
    }

    public void resta(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=2;
    }
    public void multiplicacion (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=3;
    }

    public void division (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=4;
    }

    public void potencia (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=5;
    }

    public void porcentaje (View v) {
        try{ String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=6;
    }

    public void raiz (View v) {
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText(" v(" +operan1+")");
        ope=7;
    }


    public void sin (View v){
        try{ String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Sin (" +operan1+")");
        ope=8;
    }

    public void cos (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Cos (" +operan1+")");
        ope=9;
    }

    public void tan (View v){
        try{ String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Tan (" +operan1+")");
        ope=10;

    }

    public void csc (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Csc (" +operan1+")");
        ope=11;
    }

    public void sec (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Sec (" +operan1+")");
        ope=12;
    }

    public void ctg (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Ctg (" +operan1+")");
        ope=13;
    }

    public void factorial (View v) {
        try{
            String aux1= pant.getText().toString();
            operan1= Integer.parseInt(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=14;
    }

    public void igual (View v){
        try{

            String aux2= pant.getText().toString();
            operan2= Integer.parseInt(aux2);
        }catch(NumberFormatException nfe){};
        pant.setText("" );

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

        }else if (ope==5){
            res= (int) Math.pow(operan1, operan2);

        }else if (ope==6){
            res= (int) (operan2*(operan1/100.0));

        }else if (ope==7){
            res=(int)Math.sqrt(operan1);

        }else if(ope==8){
            double rad=Math.toRadians(operan1);
            res= (int)(Math.sin(rad));

        }else if(ope==9){
            double rad=Math.toRadians(operan1);
            res= (int)(Math.cos(rad));

        }else if(ope==10){
            double rad=Math.toRadians(operan1);
            res=(int) (Math.tan(rad));

        }else if(ope==11){
            double angulo = (Math.asin(operan1));
            res= (int)Math.toDegrees(angulo);

        }else if(ope==12){
            double angulo = (Math.acos(operan1));
            res=(int)Math.toDegrees(angulo);

        }else if(ope==13){
            double angulo = (Math.atan(operan1));
            res=(int)Math.toDegrees(angulo);

        }else if (ope==14){
            res=1;
            for(double i=operan1; i>=1; i--){
                res= (int) (res*i);
            }
        }
        pant.setText(""+res);
        operan1=res;
    }

    public void clear (View v){
        pant.setText("");
        operan1=0;
        operan2=0;
        res=0;
    }

    public void borrar (View v){
        if (!pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0,pant.getText().length()-1)+"");
        }
    }

    public void off (View v){
        finish();
    }
}
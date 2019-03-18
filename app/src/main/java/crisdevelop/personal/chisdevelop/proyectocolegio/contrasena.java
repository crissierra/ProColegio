package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class contrasena extends AppCompatActivity

{

    private EditText CLAVE;
    static Button VALIDAR;
    static Toast m;
    static TextView RTA_PRIMERAVEZ;
    final int DEFAULT = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
            //CODIGO PARA ESCONDER EL STATUS BAR
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //CODIGO PARA ESCONDER EL STATUS BAR

            super.onCreate(savedInstanceState);
            setContentView(R.layout.contrasena);

            CLAVE=findViewById(R.id.clave);
            VALIDAR=findViewById(R.id.validar);

            RTA_PRIMERAVEZ= findViewById(R.id.rta_primeravez);


            SharedPreferences prefs = this.getSharedPreferences("primeravez",MODE_PRIVATE);
            RTA_PRIMERAVEZ.setText(String.valueOf(prefs.getInt("primeravez",DEFAULT)));


            VALIDAR.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    LoginUsuario();
                }
            });

        }

    @Override
    public void onBackPressed()
    {

    }

    private void LoginUsuario()
        {

            final String password = CLAVE.getText().toString();


                if   ( password.equals("music") )
                               {
                                  //  E D I T A R   S H A R E D   P R E F E R E N C E S
                                  SharedPreferences primeravez = getSharedPreferences("primeravez",MODE_PRIVATE);
                                  SharedPreferences.Editor editor = primeravez.edit();
                                  editor.putInt("primeravez", 100);
                                  editor.apply();
                                  //  E D I T A R   S H A R E D   P R E F E R E N C E S



                                  Intent i=new  Intent(getApplicationContext(), MainActivity.class);
                                  startActivity(i);
                               }

                 else {

                          Toast m = Toast.makeText(getApplicationContext(), "Contraseña incorrecta", Toast.LENGTH_SHORT);
                          m.show();
                      }

        }

}





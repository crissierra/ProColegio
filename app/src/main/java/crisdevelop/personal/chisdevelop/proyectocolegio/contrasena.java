package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class contrasena extends AppCompatActivity

{

    private EditText CLAVE;
    static Button VALIDAR;
    static Toast m;

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


                if   ( password.equals("funny2019") )
                               {
                                  //  E D I T A R   S H A R E D   P R E F E R E N C E S
                                  SharedPreferences recuperacionkey = getSharedPreferences("recuperacionkey",MODE_PRIVATE);
                                  SharedPreferences.Editor editor = recuperacionkey.edit();
                                  editor.putInt("recuperacionkey", 100);
                                  editor.apply();
                                  //  E D I T A R   S H A R E D   P R E F E R E N C E S

                                  Intent i=new  Intent(getApplicationContext(), SplashScreen_Bienvenida.class);
                                  startActivity(i);
                               }

                 else {

                          Toast m = Toast.makeText(getApplicationContext(), "                     Contraseña incorrecta.\n Comunícate con los encargados del Proyecto.", Toast.LENGTH_LONG);
                          m.show();
                      }

        }

}





package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;


public class splashscreen extends AppCompatActivity
    {


        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splashscreen);


            new Handler().postDelayed(new Runnable()
            {
                @Override
                public void run()
                {









                    // CREACION DE VARIABLE SHARED PARA PASAR A CONTRASEÑA O A MENÚ
                    SharedPreferences inicio =  getSharedPreferences("primeravez", Context.MODE_PRIVATE);
                    int primeravez = inicio.getInt("primeravez",0);
                    // RECORDAR QUE SPREF INICIA EN 0 PORQUE SE LE DA LA GANA... ASÍ LO AJUSTE EN OTRO NUMERO



                    //AQUI PONER LOS CONDICIONALES PARA CONTRASEÑA O PARA ENTRAR DE UNA AL MAIN


                            if (primeravez >= 1)
                            {
                                startActivity(new Intent(splashscreen.this,MainActivity.class));
                                finish();
                            }
                            else{
                                startActivity(new Intent(splashscreen.this,contrasena.class));
                                finish();
                            }


                }

             },1200);
        }
    }


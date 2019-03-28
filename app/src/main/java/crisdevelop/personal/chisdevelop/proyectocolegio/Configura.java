package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Configura extends AppCompatActivity {

    private boolean estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_configura);

    }

    public void organizar(){
        Button intento, tiempo;
        intento=findViewById(R.id.intentos);
        tiempo=findViewById(R.id.tiempo);

        if(estado){
            intento.setBackgroundResource(R.drawable.anima_bt_verde);
            tiempo.setBackgroundResource(R.drawable.anima_bt_rojo);

            intento.setTextSize(25);
            tiempo.setTextSize(20);

            intento.setTypeface(null, Typeface.BOLD);
            tiempo.setTypeface(null, Typeface.NORMAL);

        }else{
            tiempo.setBackgroundResource(R.drawable.anima_bt_verde);
            intento.setBackgroundResource(R.drawable.anima_bt_rojo);

            tiempo.setTextSize(25);
            intento.setTextSize(20);

            tiempo.setTypeface(null, Typeface.BOLD);
            intento.setTypeface(null, Typeface.NORMAL);
        }

    }
    public void botones(View v){
        Button intento, tiempo;
        intento=findViewById(R.id.intentos);
        tiempo=findViewById(R.id.tiempo);

        switch (v.getId()){

            case R.id.intentos:

                estado=true;

                intento.setBackgroundResource(R.drawable.anima_bt_verde);
                tiempo.setBackgroundResource(R.drawable.anima_bt_rojo);

                intento.setTextSize(25);
                tiempo.setTextSize(20);

                intento.setTypeface(null, Typeface.BOLD);
                tiempo.setTypeface(null, Typeface.NORMAL);

                break;
            case R.id.tiempo:

                estado=false;

                tiempo.setBackgroundResource(R.drawable.anima_bt_verde);
                intento.setBackgroundResource(R.drawable.anima_bt_rojo);

                tiempo.setTextSize(25);
                intento.setTextSize(20);

                tiempo.setTypeface(null, Typeface.BOLD);
                intento.setTypeface(null, Typeface.NORMAL);



                break;
            case R.id.atras:
                Intent i=new Intent(this, PressConcentrese.class);
                startActivity(i);


                break;
        }

    }
    public void onResume(){
        super.onResume();
        SharedPreferences datos= PreferenceManager.getDefaultSharedPreferences(this);

        estado=datos.getBoolean("estado",true);
        organizar();

    }

    @Override
    public void onPause(){
        super.onPause();

        SharedPreferences datos= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor guarda=datos.edit();

        guarda.putBoolean("estado",estado);

        guarda.apply();



    }


}

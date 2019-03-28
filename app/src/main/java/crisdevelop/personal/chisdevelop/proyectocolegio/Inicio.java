package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Inicio extends AppCompatActivity {

    private Dialog escojeDificultad;
    private int[] dificultad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        escojeDificultad=new Dialog(this);
        escojeDificultad.setContentView(R.layout.escoje_dificultad_mensaje);
        escojeDificultad.setCanceledOnTouchOutside(false);
        escojeDificultad.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dificultad=new int[2];
    }

    public void botones(View v){
        Intent i;


        switch (v.getId()){

            case R.id.jugar:

                escojeDificultad.show();


                break;
            case R.id.ajustes:
                i=new Intent(this, Configura.class);
                startActivity(i);

                break;
            case R.id.puntajes:
                break;

            // ACA ESTA ROTO EL CODIGO.. DEBERIA ENVIAR A PUNTAJES



            case R.id.facil:

                dificultad[0]=8;
                dificultad[1]=4;

                i=new Intent(this, Partida.class);
                i.putExtra("capacidad",dificultad[0]);
                i.putExtra("parejas",dificultad[1]);
                startActivity(i);
                break;

            case R.id.medio:
                dificultad[0]=12;
                dificultad[1]=6;

                i=new Intent(this, Partida.class);

                i.putExtra("capacidad",dificultad[0]);
                i.putExtra("parejas",dificultad[1]);
                startActivity(i);
                break;
            case R.id.dificil:
                dificultad[0]=16;
                dificultad[1]=8;

                i=new Intent(this, Partida.class);

                i.putExtra("capacidad",dificultad[0]);
                i.putExtra("parejas",dificultad[1]);
                startActivity(i);
                break;

        }

    }
    public void onResume(){
        super.onResume();


    }

}

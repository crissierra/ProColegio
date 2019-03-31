package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class PressConcentrese extends AppCompatActivity {

    private Dialog escojeDificultad;
    private int[] dificultad;
    MediaPlayer misonido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.press_concentrese);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        misonido = MediaPlayer.create(this,R.raw.songjuego);
        misonido.start();



        escojeDificultad=new Dialog(this);
        escojeDificultad.setContentView(R.layout.escoje_dificultad_mensaje);
        escojeDificultad.setCanceledOnTouchOutside(true);
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


            case R.id.volver:
                i=new Intent(this, menu_principal.class);
                startActivity(i);

                break;

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
    @Override
    protected void onPause()
    {
        super.onPause();
        misonido.release();
        finish();
    }

}

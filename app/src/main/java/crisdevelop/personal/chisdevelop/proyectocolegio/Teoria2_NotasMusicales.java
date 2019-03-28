package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;


public class Teoria2_NotasMusicales extends AppCompatActivity  implements View.OnClickListener

{
     ImageButton HOME,ANTERIOR, CONTINUAR;

     ImageButton button1;
     MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria2_notas_musicales);


      /*  DO = (ImageButton) findViewById(R.id.nota_do);
        RE = (ImageButton) findViewById(R.id.nota_re);
        MI = (ImageButton) findViewById(R.id.nota_mi);
        FA = (ImageButton) findViewById(R.id.nota_fa);
        SOL = (ImageButton) findViewById(R.id.nota_sol);
        LA = (ImageButton) findViewById(R.id.nota_la);
        SI = (ImageButton) findViewById(R.id.nota_si);*/


      // DESDE ACA
        ImageButton button1 = (ImageButton) findViewById(R.id.nota_do);

        MediaPlayer mp = MediaPlayer.create(Teoria2_NotasMusicales.this, R.raw.do_60);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                {

                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        // TODO Auto-generated method stub
                        mp.release();
                    }

                });
                   mp.start();
        // HASTA ACA








        HOME = (ImageButton) findViewById(R.id.home);
        HOME.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), menu_principal.class);
                startActivity(intent);
            }
        });

        ANTERIOR = (ImageButton) findViewById(R.id.anterior);
        ANTERIOR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), menu_principal.class);
                startActivity(intent);
            }
        });

        CONTINUAR = (ImageButton) findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Teoria3_FigurasDuracion.class);
                startActivity(intent);
            }
        });

    }

    public void onClickStringButton(View view)
         {

            switch (view.getId())
                {
                    case R.id.notado :
                        mediaPlayer = MediaPlayer.create(this, R.raw.do_60);
                        mediaPlayer.start();
                        break;
                    case R.id.notare :
                        mediaPlayer = MediaPlayer.create(this, R.raw.re_62);
                        mediaPlayer.start();
                        break;
                    case R.id.notami :
                        mediaPlayer = MediaPlayer.create(this, R.raw.mi_64);
                        mediaPlayer.start();
                        break;
                    case R.id.notafa :
                        mediaPlayer = MediaPlayer.create(this, R.raw.fa_65);
                        mediaPlayer.start();
                        break;
                    case R.id.notasol :
                        mediaPlayer = MediaPlayer.create(this, R.raw.sol_67);
                        mediaPlayer.start();
                        break;
                    case R.id.notala :
                        mediaPlayer = MediaPlayer.create(this, R.raw.la_69);
                        mediaPlayer.start();
                        break;
                    case R.id.notasi :
                        mediaPlayer = MediaPlayer.create(this, R.raw.si_71);
                        mediaPlayer.start();
                        break;
                }

         }

    @Override
    public void onClick(View v) {

    }
}

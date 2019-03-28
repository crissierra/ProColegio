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
     private MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria2_notas_musicales);


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
                Intent intent=new Intent (getApplicationContext(), Teoria1_QueEsMusica.class);
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


    public void playnota(View view)
            {
                switch (view.getId()) {
                    case R.id.btn_do :
                        mediaPlayer = MediaPlayer.create(this, R.raw.do_60);
                        break;
                    case R.id.btn_re :
                        mediaPlayer = MediaPlayer.create(this, R.raw.re_62);
                        break;
                    case R.id.btn_mi :
                        mediaPlayer = MediaPlayer.create(this, R.raw.mi_64);
                        break;
                    case R.id.btn_fa :
                        mediaPlayer = MediaPlayer.create(this, R.raw.fa_65);
                        break;
                    case R.id.btn_sol :
                        mediaPlayer = MediaPlayer.create(this, R.raw.sol_67);
                        break;
                    case R.id.btn_la :
                        mediaPlayer = MediaPlayer.create(this, R.raw.la_69);
                        break;
                    case R.id.btn_si :
                        mediaPlayer = MediaPlayer.create(this, R.raw.si_71);
                        break;
                }
                mediaPlayer.start();
            }

    @Override
    public void onClick(View v) {

    }
}

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


public class Teoria2NotasMusicales extends AppCompatActivity implements View.OnClickListener

{


    ImageButton HOME, ANTERIOR, CONTINUAR, DO, RE, MI, FA, SOL, LA, SI;
     MediaPlayer mediaPlayer, nota_do, nota_re, nota_mi, nota_fa, nota_sol, nota_la, nota_si;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria2_notas_musicales);


        DO = (ImageButton) findViewById(R.id.nota_do);
        RE = (ImageButton) findViewById(R.id.nota_re);
        MI = (ImageButton) findViewById(R.id.nota_mi);
        FA = (ImageButton) findViewById(R.id.nota_fa);
        SOL = (ImageButton) findViewById(R.id.nota_sol);
        LA = (ImageButton) findViewById(R.id.nota_la);
        SI = (ImageButton) findViewById(R.id.nota_si);


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


        CONTINUAR = findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(this);

        ANTERIOR = findViewById(R.id.anterior);
        ANTERIOR.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId())

        {
            case R.id.menu:
                Intent i= new  Intent(getApplicationContext(), menu_principal.class);
                startActivity(i);
                break;

            case R.id.continuar:
                Intent in= new  Intent(getApplicationContext(), Teoria3FigurasDuracion.class);
                startActivity(in);
                break;

            case R.id.nota_do :

                this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
                nota_do = MediaPlayer.create(this,R.raw.do_60);
                nota_do.start();
                break;

            case R.id.nota_re :
                this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
                nota_re = MediaPlayer.create(this,R.raw.re_62);
                nota_re.start();
                break;

            case R.id.nota_mi :
                this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
                nota_mi = MediaPlayer.create(this,R.raw.mi_64);
                nota_mi.start();
                break;

            case R.id.nota_fa :
                this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
                nota_fa = MediaPlayer.create(this,R.raw.fa_65);
                nota_fa.start();
                break;

            case R.id.nota_sol :
                this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
                nota_sol = MediaPlayer.create(this,R.raw.sol_67);
                nota_sol.start();
                break;

            case R.id.nota_la :
                this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
                nota_la = MediaPlayer.create(this,R.raw.la_69);
                nota_la.start();
                break;

            case R.id.nota_si :
                this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
                nota_si = MediaPlayer.create(this,R.raw.si_71);
                nota_si.start();
                break;

            default:
                break;
        }

    }
}

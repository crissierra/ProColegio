package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class juegoInicio extends AppCompatActivity {

    MediaPlayer misonido;
    SoundPool soundPool;
    int carga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego_inicio);

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        misonido = MediaPlayer.create(this,R.raw.songjuego);
        misonido.start();

    }

    @Override
    protected void onPause()
    {
        super.onPause();
        misonido.release();
        finish();
    }

    public void start_game(View view)
    {

        Intent i= new Intent(this, PreguntasUno.class);
        startActivity(i);
    }

    public void about_game(View view)
    {
        Intent i= new Intent(this, Anexos.class);
        startActivity(i);
    }
}

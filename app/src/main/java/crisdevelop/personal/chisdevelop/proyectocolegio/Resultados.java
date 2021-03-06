package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import pl.droidsonroids.gif.GifImageView;

public class Resultados extends AppCompatActivity {

    MediaPlayer misonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        Intent intent = getIntent();
        //getting
        int puntos = intent.getIntExtra("puntos", 0);
        String Estado_juego= intent.getStringExtra("Estado_juego");
        int gif=intent.getIntExtra("gif",0);
        //setting
        TextView puntosTXT=(TextView) findViewById(R.id.textView4);
        TextView EstadoTitle=(TextView) findViewById(R.id.title);

        puntosTXT.setText("$"+puntos);
        EstadoTitle.setText(Estado_juego);



        //gif
        GifImageView pGif = (GifImageView) findViewById(R.id.viewGif);
        //video
        VideoView simpleVideoView=(VideoView) findViewById(R.id.videoView);
        MediaController mediaControls = null;
         if(gif>0)
             {
                 pGif.setImageResource(gif);
                 simpleVideoView.setVisibility(View.INVISIBLE);

                 this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
                 misonido = MediaPlayer.create(this,R.raw.victoria);
                 misonido.start();
             }
        else
         {
             pGif.setVisibility(View.INVISIBLE);
             //displays a video file

             if (mediaControls == null) {
                 // create an object of media controller class
                 mediaControls = new MediaController(Resultados.this);
                 mediaControls.setAnchorView(simpleVideoView);
             }
             // set the media controller for video view
             //simpleVideoView.setMediaController(mediaControls);
             // set the uri for the video view
             simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.over));
             // start a video
             simpleVideoView.start();
             //mediaControls.setVisibility(View.GONE);
         }

    }

    public void Restart(View v)
    {
        Intent intent = new Intent(this, QuienQuiereSer.class);
        startActivity(intent);
    }

    public void end(View v)
    {
        Intent intent = new Intent(this, menu_principal.class);
        startActivity(intent);
        super.onDestroy();
        android.os.Process.killProcess(android.os.Process.myPid());
    }


}

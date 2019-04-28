package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Intent;
        import android.media.AudioManager;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.ImageButton;


public class Jeroglifico extends AppCompatActivity  implements View.OnClickListener

{
    ImageButton HOME;
    private MediaPlayer mediaPlayer;

    MediaPlayer misonido;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeroglifico);

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        misonido = MediaPlayer.create(this,R.raw.songjuego);
        misonido.start();


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
    }



    @Override
    public void onClick(View v) {

    }
    public void onPause()
    {
        super.onPause();
        misonido.release();
    }
}

package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Context;
        import android.content.SharedPreferences;
        import android.media.AudioManager;
        import android.media.MediaPlayer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.content.Intent;
        import android.os.Handler;
        import android.view.WindowManager;

        import com.crashlytics.android.Crashlytics;
        import io.fabric.sdk.android.Fabric;


public class Teoria23_Splash extends AppCompatActivity
{

    MediaPlayer voz4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.teoria23_splash);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        voz4 = MediaPlayer.create(this,R.raw.toma_15_1);
        voz4.start();

        new Handler().postDelayed(new Runnable()
        {


            @Override
            public void run()
            {

                Intent intent=new Intent (getApplicationContext(), Teoria24_EjerciciosRitmicos.class);
                startActivity(intent);

            }

        },3200);
    }
}




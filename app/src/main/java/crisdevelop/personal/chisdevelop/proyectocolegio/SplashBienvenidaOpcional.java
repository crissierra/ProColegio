package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.WindowManager;
        import android.widget.VideoView;




public class SplashBienvenidaOpcional extends AppCompatActivity {

    static VideoView videoView;

    final int DEFAULT = -1;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_bienvenida_opcional);

        getSupportActionBar().hide();
        videoView = findViewById(R.id.videoView);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.introformato);
        videoView.setVideoURI(video);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer)
            {
                if (isFinishing())
                    return;
                   {

                       Intent i=new Intent(getApplicationContext(), menu_principal.class);
                       startActivity(i);
                }
            }
        });
        videoView.start();
    }
}

package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.ImageButton;


public class Teoria44_NotasPentagrama extends AppCompatActivity  implements View.OnClickListener

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
        setContentView(R.layout.teoria44__notas_pentagrama);

        mediaPlayer=new MediaPlayer();

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
                Intent intent=new Intent (getApplicationContext(), Teoria43_NotasPemtagrama.class);
                startActivity(intent);
            }
        });

        CONTINUAR = (ImageButton) findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mediaPlayer.release();
                Intent intent=new Intent (getApplicationContext(), Teoria45_SignosMusicales.class);
                startActivity(intent);
            }
        });

    }

    public void playnotadevoz(View view)
    {
        switch (view.getId())
        {
            case R.id.notavoz1 :
                mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(this, R.raw.toma_361_1);
                break;
            case R.id.notavoz2 :
                mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(this, R.raw.toma_361_2);
                break;
        }
        mediaPlayer.start();
    }

    @Override
    public void onClick(View v) {

    }

}

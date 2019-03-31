package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.ImageButton;


public class Teoria24_EjerciciosRitmicos extends AppCompatActivity  implements View.OnClickListener

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
        setContentView(R.layout.teoria24_ejercicios_ritmicos);


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
                Intent intent=new Intent (getApplicationContext(), Teoria22_Ejercicios.class);
                startActivity(intent);
            }
        });

        CONTINUAR = (ImageButton) findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Teoria26_EscalaMusical.class);
                startActivity(intent);
            }
        });

    }

    public void playnotadevoz(View view)
    {
        switch (view.getId())
        {
            case R.id.notavoz1 :
                mediaPlayer = MediaPlayer.create(this, R.raw.toma_16_1);
                break;
            case R.id.notavoz2 :
                mediaPlayer = MediaPlayer.create(this, R.raw.toma_16_1);
                break;
            case R.id.notavoz3 :
                mediaPlayer = MediaPlayer.create(this, R.raw.toma_16_1);
                break;
        }
        mediaPlayer.start();
    }

    @Override
    public void onClick(View v) {

    }
}

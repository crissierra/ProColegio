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


public class Teoria7_Negra extends AppCompatActivity  implements View.OnClickListener

{
    ImageButton HOME,ANTERIOR, CONTINUAR;
    MediaPlayer voz7;
    private MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria7__negra);



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
                Intent intent=new Intent (getApplicationContext(), Teoria5_RitmoLenguaje.class);
                startActivity(intent);
            }
        });

        CONTINUAR = (ImageButton) findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Teoria8_Ejercicio.class);
                startActivity(intent);
            }
        });

    }


    public void playnotadevoz(View view)
    {
        switch (view.getId()) {
            case R.id.btn_pan :
                mediaPlayer = MediaPlayer.create(this, R.raw.toma_7);
                break;
        }
        mediaPlayer.start();
    }
    @Override
    public void onClick(View v) {

    }
}

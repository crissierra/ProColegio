package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.ImageButton;


public class Teoria28_EjericiosDireccion extends AppCompatActivity  implements View.OnClickListener

{
    ImageButton HOME,ANTERIOR, CONTINUAR;
    private MediaPlayer mediaPlayer;
    static Button VERVIDEO;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria28__ejericios_direccion);


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
                Intent intent=new Intent (getApplicationContext(), Teoria27_EjerciciosDireccion.class);
                startActivity(intent);
            }
        });

        CONTINUAR = (ImageButton) findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Teoria29_FraseMozart.class);
                startActivity(intent);
            }
        });

        VERVIDEO= findViewById(R.id.botonyoutube);
        VERVIDEO.setOnClickListener(this);


        VERVIDEO.setOnClickListener(new View.OnClickListener()
                                    {

                                        @Override
                                        public void onClick(View v)
                                        {

                                            // TODO Auto-generated method stub
                                            Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/DW3qz2DBTlI"));
                                            startActivity(in);

                                        }
                                    }
        );

    }

    public void playnotadevoz(View view)
    {
        switch (view.getId())
        {

        }
        mediaPlayer.start();
    }

    @Override
    public void onClick(View v) {

    }
}


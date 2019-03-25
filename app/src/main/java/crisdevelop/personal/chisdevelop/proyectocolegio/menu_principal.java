package crisdevelop.personal.chisdevelop.proyectocolegio;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageButton;

public class menu_principal extends AppCompatActivity {

    GridLayout mainGrid;
    ImageButton TEORIA, JUEGO, ENTRENAMIENTO, PIANO, ANEXO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        TEORIA = (ImageButton) findViewById(R.id.teoria);
        JUEGO = (ImageButton) findViewById(R.id.game);
        ENTRENAMIENTO = (ImageButton) findViewById(R.id.entrenamiento);
        PIANO = (ImageButton) findViewById(R.id.piano);
        ANEXO = (ImageButton) findViewById(R.id.anexo);






        TEORIA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Teoria1_QueEsMusica.class);
                startActivity(intent);
            }
        });

        JUEGO.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), juegoInicio.class);
                startActivity(intent);
            }
        });

        ENTRENAMIENTO.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Entrenamiento.class);
                startActivity(intent);
            }
        });

        PIANO.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), piano.class);
                startActivity(intent);
            }
        });

        ANEXO.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Anexos.class);
                startActivity(intent);
            }
        });


    }

}

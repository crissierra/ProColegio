package crisdevelop.personal.chisdevelop.proyectocolegio;


import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageButton;

public class menu_principal extends AppCompatActivity {

    private Dialog escojeJuego;

    GridLayout mainGrid;
    ImageButton TEORIA, ENTRENAMIENTO, METRONOMO, ANEXO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);


        // SOLO PARA EL DIALOG
            escojeJuego=new Dialog(this);
            escojeJuego.setContentView(R.layout.escoje_juego);
            escojeJuego.setCanceledOnTouchOutside(true);
            escojeJuego.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        // ACABA SOLO PARA EL DIALOG

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        TEORIA = (ImageButton) findViewById(R.id.teoria);
        ENTRENAMIENTO = (ImageButton) findViewById(R.id.entrenamiento);
        METRONOMO = (ImageButton) findViewById(R.id.metronomo);
        ANEXO = (ImageButton) findViewById(R.id.anexo);


        TEORIA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Teoria25_Info.class);
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

        METRONOMO.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Metronome.class);
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


    public void escogerJuego(View v){
        Intent i;


        switch (v.getId()){

            case R.id.game:

                escojeJuego.show();
                break;

            case R.id.quienquiere:

                i=new Intent(this, PressQuienQuiere.class);

                startActivity(i);
                break;

            case R.id.concentrese:

                i=new Intent(this, PressConcentrese.class);

                startActivity(i);
                break;

        }

    }


    public void onResume(){
        super.onResume();

    }
}

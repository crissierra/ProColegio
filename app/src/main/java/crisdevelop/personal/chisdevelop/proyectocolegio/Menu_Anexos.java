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

public class Menu_Anexos extends AppCompatActivity {



    GridLayout mainGrid;
    ImageButton DESARROLLADOR, INTEGRANTES,HOME;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_anexos);



        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        DESARROLLADOR = (ImageButton) findViewById(R.id.desarrollador);
        INTEGRANTES = (ImageButton) findViewById(R.id.integrantes);


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

        DESARROLLADOR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Desarrollador.class);
                startActivity(intent);
            }
        });

        INTEGRANTES.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), Integrantes.class);
                startActivity(intent);
            }
        });


    }


    public void onResume(){
        super.onResume();

    }
}


package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;


public class Teoria1_QueEsMusica extends AppCompatActivity implements View.OnClickListener

{

    ImageButton  HOME,CONTINUAR;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria1_que_es);

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

        CONTINUAR = findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId())

        {
            case R.id.menu:

                Intent i= new  Intent(getApplicationContext(), menu_principal.class);
                startActivity(i);
                break;

            case R.id.continuar:

                Intent in= new  Intent(getApplicationContext(), Teoria2NotasMusicales.class);
                startActivity(in);
                break;

            default:
                break;
        }

    }
}

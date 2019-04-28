package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.TextView;
        import android.widget.Toast;

        import static crisdevelop.personal.chisdevelop.proyectocolegio.contrasena.VALIDAR;


public class Teoria49_ActividadNotas extends AppCompatActivity  implements View.OnClickListener

{
    ImageButton HOME,ANTERIOR, CONTINUAR;
    private MediaPlayer mediaPlayer;

    private EditText NOTA1, NOTA2, NOTA3, NOTA4;
    final int DEFAULT = 0;

    static TextView INTER_NOTA1, INTER_NOTA2,INTER_NOTA3,INTER_NOTA4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria49__actividad_notas);


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
        Intent intent=new Intent (getApplicationContext(), Teoria47_InfoCompas.class);
        startActivity(intent);
        }
        });

        CONTINUAR = (ImageButton) findViewById(R.id.continuar);
        CONTINUAR.setOnClickListener(new View.OnClickListener()
        {
@Override
public void onClick(View v)
        {
        Intent intent=new Intent (getApplicationContext(), Teoria50_Frases.class);
        startActivity(intent);
        }
        });


        NOTA1=findViewById(R.id.nota1);
        NOTA2=findViewById(R.id.nota2);
        NOTA3=findViewById(R.id.nota3);
        NOTA4=findViewById(R.id.nota4);

        /*VALIDAR=findViewById(R.id.validar);
        VALIDAR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
                {
                    //ValidarNota();





        }
        });*/

        final String note1 = NOTA1.getText().toString();
        if   ( note1.equals("mi") || note1.equals("MI") || note1.equals("Mi")  )
        {
            Toast m = Toast.makeText(getApplicationContext(), "Correcta", Toast.LENGTH_SHORT);
            m.show();
            //   INTER_NOTA1.setText("5.000 und");
        }
        else { Toast m = Toast.makeText(getApplicationContext(), "Incorrecta", Toast.LENGTH_SHORT);
            m.show();
        }


        final String note2 = NOTA2.getText().toString();
        if   ( note2.equals("la") || note2.equals("LA") || note2.equals("La")  )
        {
            Toast m = Toast.makeText(getApplicationContext(), "Correcta", Toast.LENGTH_SHORT);
            m.show();
            //   INTER_NOTA1.setText("5.000 und");
        }
        else { Toast m = Toast.makeText(getApplicationContext(), "Incorrecta", Toast.LENGTH_SHORT);
            m.show();
        }


        final String note3 = NOTA3.getText().toString();
        if   ( note3.equals("re") || note3.equals("RE") || note3.equals("Re")  )
        {
            Toast m = Toast.makeText(getApplicationContext(), "Correcta", Toast.LENGTH_SHORT);
            m.show();
            //   INTER_NOTA1.setText("5.000 und");
        }
        else { Toast m = Toast.makeText(getApplicationContext(), "Incorrecta", Toast.LENGTH_SHORT);
            m.show();
        }


        final String note4 = NOTA4.getText().toString();
        if   ( note4.equals("fa") || note4.equals("FA") || note4.equals("Fa")  )
        {
            Toast m = Toast.makeText(getApplicationContext(), "Correcta", Toast.LENGTH_SHORT);
            m.show();
            //   INTER_NOTA1.setText("5.000 und");
        }
        else { Toast m = Toast.makeText(getApplicationContext(), "Incorrecta", Toast.LENGTH_SHORT);
            m.show();
        }




        }


private void ValidarNota()
        {


    }


    @Override
    public void onClick(View v) {

    }



}







package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;


public class Juego_Solfeo extends AppCompatActivity  implements View.OnClickListener

{
    private ImageButton HOME,ANTERIOR, CONTINUAR;
    private MediaPlayer mediaPlayer;
    private Button VALIDAR;
    private Toast m;

    private EditText NOTA1, NOTA2, NOTA3, NOTA4;
    private ImageView BIEN1, BIEN2, BIEN3, BIEN4, MAL1, MAL2, MAL3, MAL4;
    final int DEFAULT = 0;

    static TextView INTER_NOTA1, INTER_NOTA2,INTER_NOTA3,INTER_NOTA4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego_solfeo);


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

        // INSTANCIA DE IMAGEVIEWS
        BIEN1=findViewById(R.id.bien1);
        BIEN2=findViewById(R.id.bien2);
        BIEN3=findViewById(R.id.bien3);
        BIEN4=findViewById(R.id.bien4);

        MAL1=findViewById(R.id.mal1);
        MAL2=findViewById(R.id.mal2);
        MAL3=findViewById(R.id.mal3);
        MAL4=findViewById(R.id.mal4);

        // INSTANCIA DE CAPTURA DE TEXTO

        NOTA1=findViewById(R.id.nota1);
        NOTA2=findViewById(R.id.nota2);
        NOTA3=findViewById(R.id.nota3);
        NOTA4=findViewById(R.id.nota4);

        //INSTANCIA DE BOTON VALIDAR

        VALIDAR=findViewById(R.id.validar);

        /*VALIDAR=findViewById(R.id.validar);
        VALIDAR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
                {
                    //ValidarNota();





        }
        });*/





        }


    public void validar(View view)
    {

      /*  BIEN1.setVisibility(View.INVISIBLE);
        BIEN1.setVisibility(View.INVISIBLE);
        BIEN1.setVisibility(View.INVISIBLE);
        BIEN1.setVisibility(View.INVISIBLE);

        BIEN1.setVisibility(View.INVISIBLE);
        MAL2.setVisibility(View.INVISIBLE);
        MAL3.setVisibility(View.INVISIBLE);
        MAL4.setVisibility(View.INVISIBLE);*/




            final String note1 = NOTA1.getText().toString();
            if   ( note1.equals("mi") || note1.equals("MI") || note1.equals("Mi")  )
            {

                /*Toast m = Toast.makeText(getApplicationContext(), "Correcta", Toast.LENGTH_SHORT);
                m.show();*/
                //   INTER_NOTA1.setText("5.000 und");

                BIEN1.setVisibility(View.VISIBLE);
                MAL1.setVisibility(View.INVISIBLE);
            }
            else { /*Toast m = Toast.makeText(getApplicationContext(), "Incorrecta", Toast.LENGTH_SHORT);
                m.show();*/

                BIEN2.setVisibility(View.INVISIBLE);
                MAL2.setVisibility(View.VISIBLE);
            }


            final String note2 = NOTA2.getText().toString();
            if   ( note2.equals("la") || note2.equals("LA") || note2.equals("La")  )
            {
               /* Toast m = Toast.makeText(getApplicationContext(), "Correcta", Toast.LENGTH_SHORT);
                m.show();*/
                //   INTER_NOTA1.setText("5.000 und");

                BIEN2.setVisibility(View.VISIBLE);
                MAL2.setVisibility(View.INVISIBLE);
            }
            else {/* Toast m = Toast.makeText(getApplicationContext(), "Incorrecta", Toast.LENGTH_SHORT);
                m.show();*/

                BIEN2.setVisibility(View.INVISIBLE);
                MAL2.setVisibility(View.VISIBLE);
            }


            final String note3 = NOTA3.getText().toString();
            if   ( note3.equals("re") || note3.equals("RE") || note3.equals("Re")  )
            {
                /*Toast m = Toast.makeText(getApplicationContext(), "Correcta", Toast.LENGTH_SHORT);
                m.show();*/
                //   INTER_NOTA1.setText("5.000 und");
                BIEN3.setVisibility(View.VISIBLE);
                MAL3.setVisibility(View.INVISIBLE);
            }
            else { /*Toast m = Toast.makeText(getApplicationContext(), "Incorrecta", Toast.LENGTH_SHORT);
                m.show();*/
                BIEN3.setVisibility(View.INVISIBLE);
                MAL3.setVisibility(View.VISIBLE);
            }


            final String note4 = NOTA4.getText().toString();
            if   ( note4.equals("fa") || note4.equals("FA") || note4.equals("Fa")  )
            {
                /*Toast m = Toast.makeText(getApplicationContext(), "Correcta", Toast.LENGTH_SHORT);
                m.show();*/
                //   INTER_NOTA1.setText("5.000 und");
                BIEN4.setVisibility(View.VISIBLE);
                MAL4.setVisibility(View.INVISIBLE);
            }
            else { /*Toast m = Toast.makeText(getApplicationContext(), "Incorrecta", Toast.LENGTH_SHORT);
                m.show();*/
                BIEN4.setVisibility(View.INVISIBLE);
                MAL4.setVisibility(View.VISIBLE);
            }

    }


    @Override
    public void onClick(View v) {

    }



}







package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import io.netopen.hotbitmapgg.library.view.RingProgressBar;

public class QuienQuiereSer extends AppCompatActivity {

    MediaPlayer misonido;


    int contador=0;
    int puntos=0;
    int RespuestaH;
    int correcta=3;
    int correctaActual;
    RadioGroup opciones;
    TextView pregunta;
    TextView tiempo;
    TextView premio;


    //  CODIGO PARA EL PROGRESS BAR
    static RingProgressBar ringProgressBar1;
    int progress = 0;
    Handler myHandler = new Handler()
    {
     /*   @Override
        public void handleMessage(Message msg) {
            if (msg.what ==0) {
                if (progress < 100)
                {
                    progress++;
                    ringProgressBar1.setProgress(progress);
                }
            }
        }*/
    };
    //  ACABA CODIGO PARA EL PROGRESS BAR


    //tiempo
    CountDownTimer MyCountDownTimer=null;
    //manejador de eventos
    View.OnClickListener handler = new View.OnClickListener()
    {


        public void onClick(final View v)
        {
            Button btns =(Button) findViewById(R.id.button2);

            //tags para las preguntas
            ArrayList<String> preguntas = new ArrayList<String>();
            preguntas.add("pregunta1");
            preguntas.add("pregunta2");
            preguntas.add("pregunta3");
            preguntas.add("pregunta4");
            preguntas.add("pregunta5");
            preguntas.add("pregunta6");
            preguntas.add("pregunta7");
            preguntas.add("pregunta8");
            preguntas.add("pregunta9");
            preguntas.add("pregunta10");
            preguntas.add("pregunta11");
            preguntas.add("pregunta12");
            /*preguntas.add("pregunta13");
            preguntas.add("pregunta14");*/
            preguntas.add("Final");
            //respuestas codes
            final ArrayList<Integer> Respuestas = new ArrayList<Integer>();
     /*       Respuestas.add(3);//0
            Respuestas.add(2); //pregunta 1
            Respuestas.add(4); //pregunta 2
            Respuestas.add(1); //pregunta 3
            Respuestas.add(4); //pregunta 4
            Respuestas.add(3); //pregunta 5
            Respuestas.add(4); //pregunta 6
            Respuestas.add(4); //pregunta 7
            Respuestas.add(4); //pregunta 8
            Respuestas.add(2); //pregunta 9
            Respuestas.add(3); //pregunta 10
            Respuestas.add(3); //pregunta 11
            Respuestas.add(4); //pregunta 12
            Respuestas.add(4); //pregunta 13
            Respuestas.add(3); //pregunta 14*/


            Respuestas.add(4);//0
            Respuestas.add(3); //pregunta 1
            Respuestas.add(4); //pregunta 2
            Respuestas.add(3); //pregunta 3
            Respuestas.add(1); //pregunta 4
            Respuestas.add(2); //pregunta 5
            Respuestas.add(3); //pregunta 6
            Respuestas.add(3); //pregunta 7
            Respuestas.add(4); //pregunta 8
            Respuestas.add(2); //pregunta 9
            Respuestas.add(2); //pregunta 10
            Respuestas.add(4); //pregunta 11
            Respuestas.add(2); //pregunta 12
          /*  Respuestas.add(1); //pregunta 13
            Respuestas.add(1); //pregunta 14*/



           // Toast.makeText(v.getContext(),"R-"+Respuestas.get(0),Toast.LENGTH_SHORT).show();
            if (contador<preguntas.size())
            {
                //Toast.makeText(v.getContext(),preguntas.get(contador),Toast.LENGTH_SHORT).show();
                //Toast.makeText(v.getContext(),""+preguntas.size(),Toast.LENGTH_SHORT).show();
                btns.setTag(preguntas.get(contador));
                tiempo();
                dishide_cincuenta_cincuent_event(v);
                if (contador<Respuestas.size()-1)
                {
                    correcta=Respuestas.get(contador);
                    correctaActual=Respuestas.get(contador+1);
                    System.out.println("correcta Anterior: "+correcta);
                    System.out.println("correcta Actual: "+Respuestas.get(contador+1));

                }
                else
                {
                    correcta=Respuestas.get(contador);
                    correctaActual=correcta;
                    System.out.println("correcta Actual: "+correcta);
                    System.out.println("correcta proxima: no hay");
                }


            }
            else
            {
                    System.out.println(contador);
            }

            contador++;

            System.out.println("contador Aumentado: "+contador);

            // REMUMEN DE TODAS LAS PREGUNTAS

            if (v.getTag()=="pregunta1")
            {
                if(validar_respuesta(v,Respuestas.get(0)))
                {

                    Button btn =(Button) v;
                   // btn.setText("primero");
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("A. Blanca. ");
                    opcionesa.add("B. Negra. ");
                    opcionesa.add("C. Corchea. ");
                    opcionesa.add("D. Redonda. ");
                    String preguntaa="El valor de duración de 1/2 de negra pertenece a la figura:";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                }



            }
            if (v.getTag()=="pregunta2")
            {
                if(validar_respuesta(v,Respuestas.get(1)))
                {
                    Button btn =(Button) v;
                    //btn.setText("segundo");
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Dispositivo de audio ");
                    opcionesa.add("Dispositivo para escuchar música ");
                    opcionesa.add("Una clase de afinador ");
                    opcionesa.add("Herramienta para marcar el pulso ");
                    String preguntaa="Qué es el metrónomo?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                }


            }
            if (v.getTag()=="pregunta3")
            {
                if(validar_respuesta(v,Respuestas.get(2)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Símbolos para notas ");
                    opcionesa.add("Símbolos de silencio ");
                    opcionesa.add("Signos que determinan duración ");
                    opcionesa.add("Figuras aleatorias ");
                    String preguntaa="¿Qué son las figuras de duración?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("tercxero");
                }

            }
            if (v.getTag()=="pregunta4")
            {
                if(validar_respuesta(v,Respuestas.get(3)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Representación de sonidos ");
                    opcionesa.add("Figuras al azar ") ;
                    opcionesa.add("Estructoras gramaticales " );
                    opcionesa.add("Silencios ");
                    String preguntaa="Qué son las notas musicales?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("cuarto");
                }

            }
            if (v.getTag()=="pregunta5")
            {
                if(validar_respuesta(v,Respuestas.get(4)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Una clase de nota musical ");
                    opcionesa.add("Ausencia de sonido ");
                    opcionesa.add("Momento de inspiración ");
                    opcionesa.add("Ninguna de las anteriores ");
                    String preguntaa="Qúe es un silencio?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("quinto");
                }

            }
            else if (v.getTag()=="pregunta6")
            {
                if(validar_respuesta(v,Respuestas.get(5)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("4 lineas y 5 espacios ");
                    opcionesa.add("5 líneas y 5 espacios ");
                    opcionesa.add("5 líneas y 4 espacios ");
                    opcionesa.add("Ninguna de las anteriores ");
                    String preguntaa="Cuántas líneas y espacios tiene el pentagrama?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("sexto");
                }

            }
            if (v.getTag()=="pregunta7")
            {
                if(validar_respuesta(v,Respuestas.get(6)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Re, Mi, Fa, SOl, La, Si. ");
                    opcionesa.add("Do, Re, Mi, Sol, Fa, La, Si. ");
                    opcionesa.add("Do, Re, Mi, Fa, Sol, La, Si. ");
                    opcionesa.add("Do, Si, La, Sol, Fa, MI, Re. ");
                    String preguntaa="Las notas en orden ascendente son:";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("septimo");
                }

            }
            if (v.getTag()=="pregunta8")
            {
                if(validar_respuesta(v,Respuestas.get(7)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("5 Notas ");
                    opcionesa.add("6 Notas ");
                    opcionesa.add("4 Notas ");
                    opcionesa.add("7 Notas ");
                    String preguntaa="La escala natural tiene:";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("octavo");
                }

            }
            else if (v.getTag()=="pregunta9")
            {
                if(validar_respuesta(v,Respuestas.get(8)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Do. ");
                    opcionesa.add("Re. ");
                    opcionesa.add("Fa. ");
                    opcionesa.add("Si. ");
                    String preguntaa="En orden descendente. Sol, Fa, Mi y luego...";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("noveno");
                }
            }
            if (v.getTag()=="pregunta10")
            {
                if(validar_respuesta(v,Respuestas.get(9)))//2
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Do. ");
                    opcionesa.add("Si. ");
                    opcionesa.add("Re. ");
                    opcionesa.add("Ninguna de las anteriores ");
                    String preguntaa="En orden ascendente, Fa, Sol, La...?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("decimo");

                }

            }
            if (v.getTag()=="pregunta11")
            {
                if(validar_respuesta(v,Respuestas.get(10)))//3
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Re. ");
                    opcionesa.add("Fa. ");
                    opcionesa.add("Sol. ");
                    opcionesa.add( "Do. ");
                    String preguntaa="En orden ascendente, Si...";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("once");

                }

            }
            if (v.getTag()=="pregunta12")
            {
                if(validar_respuesta(v,Respuestas.get(11)))//2
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Re. ");
                    opcionesa.add("Si. ");
                    opcionesa.add("Fa. ");
                    opcionesa.add("Sol. ");
                    String preguntaa="En orden descendente, Do...";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("doce");

                }

            }
      /*      if (v.getTag()=="pregunta13")
            {
                if(validar_respuesta(v,Respuestas.get(12)))//2
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add(" a {underline:no-underline}");
                    opcionesa.add("a {underline:none} ");
                    opcionesa.add("a {text-decoration:no-underline} ");
                    opcionesa.add("a {text-decoration:none} ");
                    String preguntaa="¿Cómo se hace en CSS para que un enlace se muestre sin el subrayado?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("trece");

                }

            }
            if (v.getTag()=="pregunta14")
            {
                if(validar_respuesta(v,Respuestas.get(13)))//2
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("1989");
                    opcionesa.add("1991");
                    opcionesa.add("1994");
                    opcionesa.add("1996");
                    String preguntaa="¿Cuando se fundó el W3C?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("catorce");
                }

            }*/
            if(v.getTag()=="Final")
            {

                Button btn =(Button) v;
                btn.setText("Final");
                //delay
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        new AlertDialog.Builder(v.getContext())
                                .setTitle("Final")
                                .setMessage("¿Estas seguro? Ésta es tu última respuesta")
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        // continue with delete
                                        validar_respuesta(v,Respuestas.get(12));
                                        terminarJuego();
                                    }
                                })
                                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        // do nothing
                                    }
                                })
                                .setIcon(android.R.drawable.ic_dialog_alert)
                                .show();

                    }

                }, 1);

            }
        }


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego_quien_quiere_ser);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        // EXCLUSIVO PARA PONERLE EL SONIDO A LA ACTIVITY
            this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
            misonido = MediaPlayer.create(this,R.raw.songjuego);
            misonido.start();
        // ACABA EXCLUSIVO PARA PONERLE EL SONIDO A LA ACTIVITY



        // COGIDO EXCLUSIVO PARA EL PROGRESS BAR
            ringProgressBar1 =  findViewById(R.id.progress_bar_1);
            new Thread (new Runnable() {
                @Override
                public void run () {
                    for (int i = 0; i < 450; i++)
                    {
                        try {  Thread.sleep(450);
                            myHandler.sendEmptyMessage(0);
                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                }
        // COGIDO EXCLUSIVO PARA EL PROGRESS BAR

// estoy trabajando aqui para parar el contador
                public void onFinish() {
                    tiempo.setText("¡Game Over!");
                    terminarJuego();
                }
                // estoy trabajando aqui para parar el contador
            }).start();



        // se obtienen las opciones
        opciones = (RadioGroup) findViewById(R.id.opciones);
        final TextView answer=(TextView ) findViewById(R.id.Answer);
        opciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()        {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int checkedId)
            {
                // TODO Auto-generated method stub
                // Se comprueban los radioButton
                if (checkedId == R.id.radioButton){
                    answer.setText("Seleccionaste la opción A \n  Última palabra?");
                    RespuestaH=1;
                }else if (checkedId == R.id.radioButton2){
                    answer.setText("Seleccionaste la opción B \n  Última palabra?");
                    RespuestaH=2;
                }else if (checkedId == R.id.radioButton3){
                    answer.setText("Seleccionaste la opción C \n  Última palabra?");
                    RespuestaH=3;
                }else if (checkedId == R.id.radioButton4){
                    answer.setText("Seleccionaste la opción D \n  Última palabra?");
                    RespuestaH=4;
                }else{
                    answer.setText("estas en algo que trasciende lo previsto");
                    RespuestaH=-1;
                }
            }
        });

        //SETEAR listener
        Button btn =(Button) findViewById(R.id.button2);
        pregunta= (TextView) findViewById(R.id.textView5);
        btn.setOnClickListener(handler);

        //setear tiempo
        tiempo=(TextView) findViewById(R.id.tiempo);
        tiempo();

        //setear premio
        premio=(TextView) findViewById(R.id.premio_valor);
        premio.setText(""+0);

    }



    //proceso que verifica la pregunta
    public boolean validar_respuesta(View v,int r)
    {
        if(RespuestaH== r)
        {
            Toast.makeText(v.getContext(),"¡Correcto!",Toast.LENGTH_SHORT).show();
            ArrayList<Integer> premios= new ArrayList<Integer>();
            premios.add(0);
            premios.add(100);
            premios.add(200);
            premios.add(300);
            premios.add(500);
            premios.add(600);
            premios.add(800);
            premios.add(1000);
            premios.add(2000);
            premios.add(5000);
            premios.add(8000);
            premios.add(9000);
            premios.add(10000);
            premios.add(50000);
        /*    premios.add(100000);
            premios.add(300000);*/
            if (contador<premios.size())
            {
                puntos=premios.get(contador);
                premio.setText("$"+premios.get(contador));
                System.out.println("puntos Acumulados"+puntos);

            }
            play_success();
            return true;
        }
        else
        {

            play_error();
            Button b=(Button) findViewById(R.id.button2);
            b.setEnabled(false);
            //delay
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 5s = 5000ms
                    terminarJuego();
                }

            }, 3000);

            return false;
        }
    }

    //proceso que termina el juego
    public void terminarJuego()
    {
        kill_tiempo();
        Intent i=new Intent(this,Resultados.class);
        int gif;
        String estado;
        if (puntos==50000)
        {
            estado="Ganaste";
            gif=R.drawable.worldclass;
        }
        else
        {
            estado="Perdiste";
            if(puntos>=10000)
            {
                puntos=10000;
            }
            else if(puntos>=1000)
            {
                puntos=1000;
            }
            else
            {
                puntos=0;
            }

            gif=-1;
        }

        i.putExtra("puntos",puntos);
        i.putExtra("Estado_juego",estado);
        i.putExtra("gif",gif);

        startActivity(i);
    }
   //conteo del tiempo
   public void tiempo()
   {
       kill_tiempo();
       MyCountDownTimer=new CountDownTimer(46000, 1000)
       {

           public void onTick(long millisUntilFinished) {
               tiempo.setText( millisUntilFinished / 1000+ " s.");
           }

           public void onFinish() {
               tiempo.setText("¡Game Over!");
               terminarJuego();
           }
       }.start();

   }
    //parar conteo del tiempo
    public void kill_tiempo()
    {
       if(MyCountDownTimer!= null)
       {
           MyCountDownTimer.cancel();
           MyCountDownTimer=null;
       }
        System.out.println(MyCountDownTimer);

    }
    //proces to pley success sound
    public void play_success() {
        //sounds
        MediaPlayer mp = MediaPlayer.create(this, R.raw.success);
        mp.start();
    }
    //proces to pley error sound
    public void play_error() {
        //sounds
        MediaPlayer mp = MediaPlayer.create(this, R.raw.error);
        mp.start();
    }

    //proceso que cambia la pregunta
    public void cambiar_radioGroup(int grupo,int label,ArrayList<String> opciones,String pregunta)
    {
        //cambiar_radioGroup();
        RadioGroup radioGroup = (RadioGroup)findViewById(grupo);

        for (int i = 0; i < radioGroup .getChildCount(); i++) {
            ((RadioButton) radioGroup.getChildAt(i)).setText(opciones.get(i));
        }
        //setear la pregunta
        TextView lbl=(TextView) findViewById(label);
        lbl.setText(pregunta);
    }

    //generar aleatorio
    public  ArrayList<Integer>  get_ramdom(int limite, int diferente)
    {
        int cuantos=0;
        ArrayList<Integer> ramdom= new ArrayList<Integer>();
        while(cuantos<2)
        {
            int value= (int) (Math.random()*limite+1);
            if(value!=diferente && !ramdom.contains(value))
            {
                ramdom.add(value);
                cuantos++;
            }
        }
        return ramdom;

    }
    ///ayudas 50/50
    public void cincuenta_cincuenta(int grupo, int correcta)
    {
        int numeros;

        //cambiar_radioGroup();
        RadioGroup radioGroup = (RadioGroup)findViewById(grupo);
        ArrayList<Integer> preguntas=get_ramdom(4, correcta);
        System.out.println((preguntas.get(0)));
        System.out.println((preguntas.get(1)));

        RadioButton op=(RadioButton)radioGroup.getChildAt(preguntas.get(0)-1);
        op.setVisibility(View.INVISIBLE);
        op=(RadioButton)radioGroup.getChildAt(preguntas.get(1)-1);
        op.setVisibility(View.INVISIBLE);

    }

    //50/50
    public void cincuenta_cincuent_event(View v)
    {
        cincuenta_cincuenta(R.id.opciones,correctaActual);
        System.out.println("correcta actual"+correctaActual);
        findViewById(R.id.b50_50).setVisibility(View.INVISIBLE);
    }

    //quitar 50/50
    public void dishide_cincuenta_cincuent_event(View v)
    {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.opciones);
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            ((RadioButton) radioGroup.getChildAt(i)).setVisibility(View.VISIBLE);
        }
    }

    public void onPause()
        {
            super.onPause();

            misonido.release();

            finish();
        }
    public void onResume()
    {
        super.onResume();

    }

}

package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class JuegoConcentrese extends AppCompatActivity {

    private AdapterCarta adapter;
    private int [] numeros;
    private ArrayList<ItemCarta> cartas;
    private GridView gridView;
    private long estadoJuego;
    private Chronometer chronometer;
    private boolean tipoP;
    private Dialog mensajeFinal;
    private Animation animationC, animacionA;

    MediaPlayer misonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.juego_concentrese);


        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        misonido = MediaPlayer.create(this,R.raw.songjuego);
        misonido.start();



         gridView=findViewById(R.id.gridView);

         animacionA= AnimationUtils.loadAnimation(this,R.anim.abrir);
         animationC= AnimationUtils.loadAnimation(this,R.anim.cerrar);
         animacionA.setFillAfter(true);
         animationC.setFillAfter(true);

         mensajeFinal=new Dialog(this);
         mensajeFinal.setContentView(R.layout.mensaje_final);
         mensajeFinal.setCanceledOnTouchOutside(false);
         mensajeFinal.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

         Bundle datos=getIntent().getExtras();
        int capacidad,parejas;
         try {
             capacidad = datos.getInt("capacidad");
             parejas = datos.getInt("parejas");
         }catch (Exception e){
             capacidad=8;
             parejas=4;
         }



         numeros= new int[capacidad];
         for(int i=0; i<numeros.length;i++){
             numeros[i]=-1;
         }

         estadoJuego=0;

        chronometer=findViewById(R.id.cronos);
        chronometer.setVisibility(View.INVISIBLE);
        TextView movimientos = findViewById(R.id.mostrarEstado);
        movimientos.setVisibility(View.INVISIBLE);

         azarPosicion(parejas);
        organizaCartas();
        iniciaAjustes();

    }


    public void onPause()
        {
            super.onPause();
            misonido.release();
        }
    public void onResume(){
        super.onResume();

        SharedPreferences datos= PreferenceManager.getDefaultSharedPreferences(this);
        tipoP=datos.getBoolean("estado",true);
        if(!tipoP){
            chronometer.start();
            chronometer.setVisibility(View.VISIBLE);
        }else {
            TextView textView = findViewById(R.id.mostrarEstado);
            textView.setVisibility(View.VISIBLE);
        }
    }



    public void iniciaAjustes(){
        Button button=findViewById(R.id.ajustes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), PressConcentrese.class);
                startActivity(i);
            }
        });
    }
    int rellena=1;
    public int azarPosicion(int parejas){
       int vea=0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]==-1){
                vea++;
            }
        }
        if(vea==0){
            return 0;
        }

        Random a=new Random();
        int b=a.nextInt(numeros.length);


        if(numeros[b]==-1){

            numeros[b]=rellena;
            rellena++;
            if(rellena==(parejas+1))rellena=1;

        }

        azarPosicion(parejas);
        return 1;
    }

    public void organizaCartas(){

        try{
            cartas=new ArrayList<>();
            adapter=new AdapterCarta(this, cartas,R.layout.item_carta);
            gridView.setAdapter(adapter);

            for(int i=0; i<numeros.length; i++){
                cartas.add(new ItemCarta(numeros[i], R.drawable.logo_waa_carta));
            }

            adapter.notifyDataSetChanged();

            comprueba();

        }catch (Exception e){

        }
    }
    boolean c, t;
    int valorElegido;
    int posicionAnterior, posicionActual;
    View view1, view2;


    public void comprueba(){


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {


                posicionActual=posicion;
                
                if(!c && R.drawable.fondoimagen2!=cartas.get(posicion).getFondoImagenL() && countDownTimer==null) {




                        Toast.makeText(getApplicationContext(), "Con qué otra imagen?", Toast.LENGTH_SHORT).show();

                        cartas.get(posicion).setFondoImagenL(R.drawable.fondoimagen2);

                        if(view1 !=null && view2!=null) {
                            view1.clearAnimation();
                            view2.clearAnimation();
                        }

                        view1=view;
                        view1.startAnimation(animacionA);




                        valorElegido = cartas.get(posicion).getNumero();


                        posicionAnterior = posicion;
                        adapter.notifyDataSetChanged();


                        c = true;


                }else if(posicionAnterior!=posicion && R.drawable.fondoimagen2!=cartas.get(posicion).getFondoImagenL()){



                    if(countDownTimer==null){
                    cartas.get(posicion).setFondoImagenL(R.drawable.fondoimagen2);
                        view2=view;

                        view1.clearAnimation();
                        view2.startAnimation(animacionA);

                    }

                        adapter.notifyDataSetChanged();

                        retrasar();



                }


                fin();

            }

        });


    }
    CountDownTimer countDownTimer;
    public void retrasar(){

        gridView.setOnItemClickListener(null);
        countDownTimer=new CountDownTimer(1000,1000) {



            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

                if (valorElegido == cartas.get(posicionActual).getNumero()) {



                    Toast.makeText(getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();

                } else {

                    cartas.get(posicionAnterior).setFondoImagenL(R.drawable.logo_waa_carta);
                    cartas.get(posicionActual).setFondoImagenL(R.drawable.logo_waa_carta);

                    view1.startAnimation(animacionA);
                    view2.startAnimation(animacionA);

                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();

                }

                adapter.notifyDataSetChanged();

                comprueba();



                c=false;
                countDownTimer=null;
                if(tipoP) {
                    estadoJuego++;
                    TextView textView = findViewById(R.id.mostrarEstado);
                    textView.setText(estadoJuego + "");
                }

            }
        }.start();


    }


    public void fin(){
        int igual=R.drawable.fondoimagen2;
        int revisa=0;

        for(int i=0; i<cartas.size();i++){
            if(igual!=cartas.get(i).getFondoImagenL()){
                revisa++;
            }
        }

        if(revisa==0){
            Button button=mensajeFinal.findViewById(R.id.inicio);
            TextView textView=mensajeFinal.findViewById(R.id.puntajePartida);

            if(tipoP)textView.setText((estadoJuego+1)+"");
            else {
                textView.setText(chronometer.getText().toString());
                chronometer.stop();

            }
            mensajeFinal.show();
            verificarBaseDatos();

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(getApplicationContext(), PressConcentrese.class);
                    startActivity(i);
                }
            });
        }
    }
    public void verificarBaseDatos()
        {

        }

}

package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Button;

import model.Jogador;


import java.util.ArrayList;

public class EntrenamientoAuditivo extends AppCompatActivity {

    public static int REQUEST_ADD = 1;
    private static boolean STATUS_REPEAT = false;
    private MediaPlayer mediaPlayer;
    private Switch btnRepetir;
    ArrayAdapter adapter;
    ArrayList<String> rankingList;

    static TextView RTA_PRIMERAVEZ;
    final int DEFAULT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrenamiento_auditivo);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR



        rankingList = new ArrayList<>();


        // LO USO PARA IMPRIMIR EL ESTADO DE LA VARIABLE PRIMERA VEZ
               /* RTA_PRIMERAVEZ= findViewById(R.id.rta_primeravez);

                SharedPreferences prefs = this.getSharedPreferences("primeravez",MODE_PRIVATE);
                RTA_PRIMERAVEZ.setText(String.valueOf(prefs.getInt("primeravez",DEFAULT)));*/
        // LO USO PARA IMPRIMIR EL ESTADO DE LA VARIABLE PRIMERA VEZ
    }

    public void repetirSom(View view)
    {
        btnRepetir = findViewById(R.id.swtRepeatSound);
        STATUS_REPEAT = btnRepetir.isChecked();
        if (mediaPlayer != null && !STATUS_REPEAT) {
            if (mediaPlayer.isLooping())
            {
                mediaPlayer.release();
            }
        }
    }

    public void testarOuvidoAbsButton(View view) {
        Intent intent = new Intent(this, menu_principal.class);
        startActivityForResult(intent, REQUEST_ADD);
    }

    public void onClickStringButton(View view) {

        switch (view.getId()) {
            case R.id.notado :
                mediaPlayer = MediaPlayer.create(this, R.raw.do_60);
                break;
            case R.id.notare :
                mediaPlayer = MediaPlayer.create(this, R.raw.re_62);
                break;
            case R.id.notami :
                mediaPlayer = MediaPlayer.create(this, R.raw.mi_64);
                break;
            case R.id.notafa :
                mediaPlayer = MediaPlayer.create(this, R.raw.fa_65);
                break;
            case R.id.notasol :
                mediaPlayer = MediaPlayer.create(this, R.raw.sol_67);
                break;
            case R.id.notala :
                mediaPlayer = MediaPlayer.create(this, R.raw.la_69);
                break;
            case R.id.notasi :
                mediaPlayer = MediaPlayer.create(this, R.raw.si_71);
                break;
        }
        if (STATUS_REPEAT) {
            mediaPlayer.setLooping(true);
        }

        mediaPlayer.start();
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Jogador jogador = new Jogador();

        if (resultCode == REQUEST_ADD) {
            if (data.getExtras() != null) {
                String nome = data.getExtras().get("nome").toString();
                int pontos = (int) data.getExtras().get("pontos");

                jogador.setNome(nome);
                jogador.setṔontos(pontos);
            }
            rankingList.add(jogador.getNome() + " - " + jogador.getṔontos());
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, rankingList);

            ListView listView = findViewById(R.id._dynamicList);
            listView.setAdapter(adapter);
            listView.setSelection(android.R.color.holo_blue_dark);

        }

    }
}

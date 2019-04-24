package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;
        import model.NotasMusicais;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Locale;
        import java.util.Random;

public class EntrenamientoTest extends AppCompatActivity  implements View.OnClickListener{

    public static int RESULT_SAVE = 1;
    public static int RESULT_CANCEL = 2;
    private List<NotasMusicais> listMedia;
    private NotasMusicais atualSom;
    private int pontos;

    static TextView CORRECTOS;

    static Button BOTONDO,BOTONRE,BOTONMI,BOTONFA, BOTONSOL, BOTONLA, BOTONSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrenamiento_test);
        setPontos(0);

        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        setPontos(0);

        int index = 0;

        listMedia = new ArrayList<>();

        listMedia.add(new NotasMusicais("DO", MediaPlayer.create(this, R.raw.do_60)));
        listMedia.add(new NotasMusicais("RE", MediaPlayer.create(this, R.raw.re_62)));
        listMedia.add(new NotasMusicais("MI", MediaPlayer.create(this, R.raw.mi_64)));
        listMedia.add(new NotasMusicais("FA", MediaPlayer.create(this, R.raw.fa_65)));
        listMedia.add(new NotasMusicais("SOL", MediaPlayer.create(this, R.raw.sol_67)));
        listMedia.add(new NotasMusicais("LA", MediaPlayer.create(this, R.raw.la_69)));
        listMedia.add(new NotasMusicais("SI", MediaPlayer.create(this, R.raw.si_71)));

        Collections.shuffle(listMedia,new Random(System.nanoTime()));

        atualSom = listMedia.get(index);
        atualSom.getAudio().start();

        BOTONDO= findViewById(R.id.botondo);
        BOTONDO.setOnClickListener(this);

        BOTONRE= findViewById(R.id.botonre);
        BOTONRE.setOnClickListener(this);

        BOTONMI= findViewById(R.id.botonmi);
        BOTONMI.setOnClickListener(this);

        BOTONFA= findViewById(R.id.botonfa);
        BOTONFA.setOnClickListener(this);

        BOTONSOL= findViewById(R.id.botonsol);
        BOTONSOL.setOnClickListener(this);

        BOTONLA= findViewById(R.id.botonla);
        BOTONLA.setOnClickListener(this);

        BOTONSI= findViewById(R.id.botonsi);
        BOTONSI.setOnClickListener(this);
    }

    public void tocarSom(View view) {

        int index = 0;
        listMedia = new ArrayList<>();

        listMedia.add(new NotasMusicais("DO", MediaPlayer.create(this, R.raw.do_60)));
        listMedia.add(new NotasMusicais("RE", MediaPlayer.create(this, R.raw.re_62)));
        listMedia.add(new NotasMusicais("MI", MediaPlayer.create(this, R.raw.mi_64)));
        listMedia.add(new NotasMusicais("FA", MediaPlayer.create(this, R.raw.fa_65)));
        listMedia.add(new NotasMusicais("SOL", MediaPlayer.create(this, R.raw.sol_67)));
        listMedia.add(new NotasMusicais("LA", MediaPlayer.create(this, R.raw.la_69)));
        listMedia.add(new NotasMusicais("SI", MediaPlayer.create(this, R.raw.si_71)));
        Collections.shuffle(listMedia,new Random(System.nanoTime()));
        atualSom = listMedia.get(index);
        atualSom.getAudio().start();
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {


            case R.id.botondo:
                CORRECTOS= findViewById(R.id.vercorrectos);


                if (atualSom.getTitle().contains("DO")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();

                    setPontos(getPontos() + 1);

                    CORRECTOS.setText(getPontos() + "");

                    int index = 0;
                    listMedia = new ArrayList<>();

                    listMedia.add(new NotasMusicais("DO", MediaPlayer.create(this, R.raw.do_60)));
                    listMedia.add(new NotasMusicais("RE", MediaPlayer.create(this, R.raw.re_62)));
                    listMedia.add(new NotasMusicais("MI", MediaPlayer.create(this, R.raw.mi_64)));
                    listMedia.add(new NotasMusicais("FA", MediaPlayer.create(this, R.raw.fa_65)));
                    listMedia.add(new NotasMusicais("SOL", MediaPlayer.create(this, R.raw.sol_67)));
                    listMedia.add(new NotasMusicais("LA", MediaPlayer.create(this, R.raw.la_69)));
                    listMedia.add(new NotasMusicais("SI", MediaPlayer.create(this, R.raw.si_71)));
                    Collections.shuffle(listMedia,new Random(System.nanoTime()));
                    atualSom = listMedia.get(index);
                    atualSom.getAudio().start();

                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.botonre:

                if (atualSom.getTitle().contains("RE")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    CORRECTOS.setText(getPontos() + "");

                    int index = 0;
                    listMedia = new ArrayList<>();

                    listMedia.add(new NotasMusicais("DO", MediaPlayer.create(this, R.raw.do_60)));
                    listMedia.add(new NotasMusicais("RE", MediaPlayer.create(this, R.raw.re_62)));
                    listMedia.add(new NotasMusicais("MI", MediaPlayer.create(this, R.raw.mi_64)));
                    listMedia.add(new NotasMusicais("FA", MediaPlayer.create(this, R.raw.fa_65)));
                    listMedia.add(new NotasMusicais("SOL", MediaPlayer.create(this, R.raw.sol_67)));
                    listMedia.add(new NotasMusicais("LA", MediaPlayer.create(this, R.raw.la_69)));
                    listMedia.add(new NotasMusicais("SI", MediaPlayer.create(this, R.raw.si_71)));
                    Collections.shuffle(listMedia,new Random(System.nanoTime()));
                    atualSom = listMedia.get(index);
                    atualSom.getAudio().start();

                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.botonmi:

                if (atualSom.getTitle().contains("MI")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    CORRECTOS.setText(getPontos() + "");

                    int index = 0;
                    listMedia = new ArrayList<>();

                    listMedia.add(new NotasMusicais("DO", MediaPlayer.create(this, R.raw.do_60)));
                    listMedia.add(new NotasMusicais("RE", MediaPlayer.create(this, R.raw.re_62)));
                    listMedia.add(new NotasMusicais("MI", MediaPlayer.create(this, R.raw.mi_64)));
                    listMedia.add(new NotasMusicais("FA", MediaPlayer.create(this, R.raw.fa_65)));
                    listMedia.add(new NotasMusicais("SOL", MediaPlayer.create(this, R.raw.sol_67)));
                    listMedia.add(new NotasMusicais("LA", MediaPlayer.create(this, R.raw.la_69)));
                    listMedia.add(new NotasMusicais("SI", MediaPlayer.create(this, R.raw.si_71)));
                    Collections.shuffle(listMedia,new Random(System.nanoTime()));
                    atualSom = listMedia.get(index);
                    atualSom.getAudio().start();
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.botonfa:

                if (atualSom.getTitle().contains("FA")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    CORRECTOS.setText(getPontos() + "");

                    int index = 0;
                    listMedia = new ArrayList<>();

                    listMedia.add(new NotasMusicais("DO", MediaPlayer.create(this, R.raw.do_60)));
                    listMedia.add(new NotasMusicais("RE", MediaPlayer.create(this, R.raw.re_62)));
                    listMedia.add(new NotasMusicais("MI", MediaPlayer.create(this, R.raw.mi_64)));
                    listMedia.add(new NotasMusicais("FA", MediaPlayer.create(this, R.raw.fa_65)));
                    listMedia.add(new NotasMusicais("SOL", MediaPlayer.create(this, R.raw.sol_67)));
                    listMedia.add(new NotasMusicais("LA", MediaPlayer.create(this, R.raw.la_69)));
                    listMedia.add(new NotasMusicais("SI", MediaPlayer.create(this, R.raw.si_71)));
                    Collections.shuffle(listMedia,new Random(System.nanoTime()));
                    atualSom = listMedia.get(index);
                    atualSom.getAudio().start();
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.botonsol:

                if (atualSom.getTitle().contains("SOL")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    CORRECTOS.setText(getPontos() + "");

                    int index = 0;
                    listMedia = new ArrayList<>();

                    listMedia.add(new NotasMusicais("DO", MediaPlayer.create(this, R.raw.do_60)));
                    listMedia.add(new NotasMusicais("RE", MediaPlayer.create(this, R.raw.re_62)));
                    listMedia.add(new NotasMusicais("MI", MediaPlayer.create(this, R.raw.mi_64)));
                    listMedia.add(new NotasMusicais("FA", MediaPlayer.create(this, R.raw.fa_65)));
                    listMedia.add(new NotasMusicais("SOL", MediaPlayer.create(this, R.raw.sol_67)));
                    listMedia.add(new NotasMusicais("LA", MediaPlayer.create(this, R.raw.la_69)));
                    listMedia.add(new NotasMusicais("SI", MediaPlayer.create(this, R.raw.si_71)));
                    Collections.shuffle(listMedia,new Random(System.nanoTime()));
                    atualSom = listMedia.get(index);
                    atualSom.getAudio().start();
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.botonla:

                if (atualSom.getTitle().contains("LA")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    CORRECTOS.setText(getPontos() + "");

                    int index = 0;
                    listMedia = new ArrayList<>();

                    listMedia.add(new NotasMusicais("DO", MediaPlayer.create(this, R.raw.do_60)));
                    listMedia.add(new NotasMusicais("RE", MediaPlayer.create(this, R.raw.re_62)));
                    listMedia.add(new NotasMusicais("MI", MediaPlayer.create(this, R.raw.mi_64)));
                    listMedia.add(new NotasMusicais("FA", MediaPlayer.create(this, R.raw.fa_65)));
                    listMedia.add(new NotasMusicais("SOL", MediaPlayer.create(this, R.raw.sol_67)));
                    listMedia.add(new NotasMusicais("LA", MediaPlayer.create(this, R.raw.la_69)));
                    listMedia.add(new NotasMusicais("SI", MediaPlayer.create(this, R.raw.si_71)));
                    Collections.shuffle(listMedia,new Random(System.nanoTime()));
                    atualSom = listMedia.get(index);
                    atualSom.getAudio().start();
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.botonsi:

                if (atualSom.getTitle().contains("SI")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    CORRECTOS.setText(getPontos() + "");

                    int index = 0;
                    listMedia = new ArrayList<>();

                    listMedia.add(new NotasMusicais("DO", MediaPlayer.create(this, R.raw.do_60)));
                    listMedia.add(new NotasMusicais("RE", MediaPlayer.create(this, R.raw.re_62)));
                    listMedia.add(new NotasMusicais("MI", MediaPlayer.create(this, R.raw.mi_64)));
                    listMedia.add(new NotasMusicais("FA", MediaPlayer.create(this, R.raw.fa_65)));
                    listMedia.add(new NotasMusicais("SOL", MediaPlayer.create(this, R.raw.sol_67)));
                    listMedia.add(new NotasMusicais("LA", MediaPlayer.create(this, R.raw.la_69)));
                    listMedia.add(new NotasMusicais("SI", MediaPlayer.create(this, R.raw.si_71)));
                    Collections.shuffle(listMedia,new Random(System.nanoTime()));
                    atualSom = listMedia.get(index);
                    atualSom.getAudio().start();
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }


    public void onClickStringButton(View view) {

            boolean checked = ((CheckBox) view).isPressed();
            TextView textView = (TextView) findViewById((R.id.vercorrectos));

            if (view.getId() == R.id.botondo) {
                if (checked && atualSom.getTitle().contains("DO")) {

                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {

                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonre) {
                if (checked && atualSom.getTitle().contains("RE")) {

                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {

                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonmi) {
                if (checked && atualSom.getTitle().contains("MI")) {

                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {

                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonfa) {
                if (checked && atualSom.getTitle().contains("FA")) {

                    setPontos(getPontos() + 1);

                } else {

                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonsol) {
                if (checked && atualSom.getTitle().contains("SOL")) {

                    setPontos(getPontos() + 1);

                } else {

                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonla) {
                if (checked && atualSom.getTitle().contains("LA")) {

                    setPontos(getPontos() + 1);

                } else {

                }
                ((CheckBox) view).setChecked(false);
            }

            if (view.getId() == R.id.botonsi) {
                if (checked && atualSom.getTitle().contains("SI")) {

                    setPontos(getPontos() + 1);

                } else {

                }
                ((CheckBox) view).setChecked(false);
            }
    }

    public void salvarJogo(View view) {
        Intent intent = new Intent();

        int pontuacao = getPontos();

        intent.putExtra("pontos", pontuacao);

        setResult(RESULT_SAVE, intent);
        finish();
    }

    public void cancelar(View view) {
        setResult(RESULT_CANCEL);
        finish();
    }


    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}

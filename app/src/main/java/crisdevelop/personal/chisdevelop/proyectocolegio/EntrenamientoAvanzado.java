package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;
        import model.NotasMusicais;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Random;

public class EntrenamientoAvanzado extends AppCompatActivity  implements View.OnClickListener{

    public static int RESULT_SAVE = 1;
    public static int RESULT_CANCEL = 2;
    private List<NotasMusicais> listMedia;
    private NotasMusicais atualSom;
    private int pontos;
    private EditText edtNome;
    static Button ENLACEQUIENQUIERESER;


    static Button BOTONDO,BOTONDOSOS, BOTONRE,BOTONRESOS,BOTONMI,BOTONFA,BOTONFASOS, BOTONSOL, BOTONSOLSOS, BOTONLA,BOTONLASOS, BOTONSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrenamiento_avanzado);
        setPontos(0);
        edtNome = findViewById(R.id.edtNome);

        ENLACEQUIENQUIERESER= findViewById(R.id.enlacequienquiereser);
        ENLACEQUIENQUIERESER.setOnClickListener(this);

        BOTONDO= findViewById(R.id.botondo);
        BOTONDO.setOnClickListener(this);

        BOTONDOSOS= findViewById(R.id.botondosos);
        BOTONDOSOS.setOnClickListener(this);

        BOTONRE= findViewById(R.id.botonre);
        BOTONRE.setOnClickListener(this);

        BOTONRESOS= findViewById(R.id.botonresos);
        BOTONRESOS.setOnClickListener(this);

        BOTONMI= findViewById(R.id.botonmi);
        BOTONMI.setOnClickListener(this);

        BOTONFA= findViewById(R.id.botonfa);
        BOTONFA.setOnClickListener(this);

        BOTONFASOS= findViewById(R.id.botonfasos);
        BOTONFASOS.setOnClickListener(this);

        BOTONSOL= findViewById(R.id.botonsol);
        BOTONSOL.setOnClickListener(this);

        BOTONSOLSOS= findViewById(R.id.botonsolsos);
        BOTONSOLSOS.setOnClickListener(this);

        BOTONLA= findViewById(R.id.botonla);
        BOTONLA.setOnClickListener(this);

        BOTONLASOS= findViewById(R.id.botonlasos);
        BOTONLASOS.setOnClickListener(this);

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

        listMedia.add(new NotasMusicais("DO SOS", MediaPlayer.create(this, R.raw.do_sostenido_61)));
        listMedia.add(new NotasMusicais("RE SOS", MediaPlayer.create(this, R.raw.re_sostenido_63)));
        listMedia.add(new NotasMusicais("FA SOS", MediaPlayer.create(this, R.raw.fa_sostenido_66)));
        listMedia.add(new NotasMusicais("SOL SOS", MediaPlayer.create(this, R.raw.sol_sostenido_68)));
        listMedia.add(new NotasMusicais("LA SOS", MediaPlayer.create(this, R.raw.la_sostenido_70)));

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

                if (atualSom.getTitle().contains("DO")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.botondosos:

                if (atualSom.getTitle().contains("DO SOS")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.botonre:

                if (atualSom.getTitle().contains("RE")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.botonresos:

                if (atualSom.getTitle().contains("RE SOS")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.botonmi:

                if (atualSom.getTitle().contains("MI")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.botonfa:

                if (atualSom.getTitle().contains("FA")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.botonfasos:

                if (atualSom.getTitle().contains("FA SOS")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.botonsol:

                if (atualSom.getTitle().contains("SOL")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.botonsolsos:

                if (atualSom.getTitle().contains("SOL SOS")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.botonla:

                if (atualSom.getTitle().contains("LA")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.botonlasos:

                if (atualSom.getTitle().contains("LA SOS")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.botonsi:

                if (atualSom.getTitle().contains("SI")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                break;







            case R.id.enlacequienquiereser:

                Intent intent=new Intent (this, MainActivity.class);
                startActivity(intent);

                break;

        }
    }


    public void onCheckBoxClicked(View view) {

            /*boolean checked = ((CheckBox) view).isPressed();
            TextView textView = (TextView) findViewById((R.id._txtViewPontos));

            if (view.getId() == R.id._btnRadioMiAgudo) {
                if (checked && atualSom.getTitle().contains("DO")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id._btnRadioSi) {
                if (checked && atualSom.getTitle().contains("RE")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id._btnRadioSol) {
                if (checked && atualSom.getTitle().contains("MI")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id._btnRadioRe) {
                if (checked && atualSom.getTitle().contains("FA")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id._btnRadioLa) {
                if (checked && atualSom.getTitle().contains("SOL")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id._btnRadioMiGrave) {
                if (checked && atualSom.getTitle().contains("LA")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }

            if (view.getId() == R.id._btnRadioMiGrave) {
                if (checked && atualSom.getTitle().contains("SI")) {
                    Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }*/
    }

    public void salvarJogo(View view) {
        Intent intent = new Intent();

        String nome = edtNome.getText().toString();
        int pontuacao = getPontos();

        intent.putExtra("nome", nome);
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

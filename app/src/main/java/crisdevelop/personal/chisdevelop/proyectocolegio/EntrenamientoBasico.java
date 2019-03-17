package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import model.NotasMusicais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EntrenamientoBasico extends AppCompatActivity {


    public class TesteOuvido extends AppCompatActivity {

        public static int RESULT_SAVE = 1;
        public static int RESULT_CANCEL = 2;
        private List<NotasMusicais> listMedia;
        private NotasMusicais atualSom;
        private int pontos;
        private EditText edtNome;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_entrenamiento_basico);
            setPontos(0);
            edtNome = findViewById(R.id.edtNome);
        }

        public void tocarSom(View view) {

            int index = 0;

            listMedia = new ArrayList<>();

            listMedia.add(new NotasMusicais("Nota Do", MediaPlayer.create(this, R.raw.firststring)));
            listMedia.add(new NotasMusicais("Nota Re", MediaPlayer.create(this, R.raw.secondstring)));
            listMedia.add(new NotasMusicais("Nota Mi", MediaPlayer.create(this, R.raw.thirdstring)));
            listMedia.add(new NotasMusicais("Nota Fa", MediaPlayer.create(this, R.raw.fourthstring)));
            listMedia.add(new NotasMusicais("Nota Sol", MediaPlayer.create(this, R.raw.fithstring)));
            listMedia.add(new NotasMusicais("Nota La", MediaPlayer.create(this, R.raw.sixthstrin)));
            listMedia.add(new NotasMusicais("Nota Si", MediaPlayer.create(this, R.raw.sixthstrin)));

            Collections.shuffle(listMedia, new Random(System.nanoTime()));

            atualSom = listMedia.get(index);
            atualSom.getAudio().start();
        }

        public void onCheckBoxClicked(View view) {

            boolean checked = ((CheckBox) view).isChecked();
            TextView textView = (TextView) findViewById((R.id._txtViewPontos));

            if (view.getId() == R.id.botondo) {
                if (checked && atualSom.getTitle().contains("Nota Do")) {
                    Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Errou", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonre) {
                if (checked && atualSom.getTitle().contains("SI")) {
                    Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Errou", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonmi) {
                if (checked && atualSom.getTitle().contains("SOL")) {
                    Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Errou", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonfa) {
                if (checked && atualSom.getTitle().contains("RE")) {
                    Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Errou", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonsol) {
                if (checked && atualSom.getTitle().contains("LA")) {
                    Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Errou", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }
            if (view.getId() == R.id.botonla)
            {
                if (checked && atualSom.getTitle().contains("Grave")) {
                    Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Errou", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }

            if (view.getId() == R.id.botonsi)
            {
                if (checked && atualSom.getTitle().contains("Grave")) {
                    Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                    setPontos(getPontos() + 1);
                    textView.setText(getPontos() + "");
                } else {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
                ((CheckBox) view).setChecked(false);
            }



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
}
package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class juegoInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego_inicio);
    }

    public void start_game(View view)
    {
        Intent i= new Intent(this, PreguntasUno.class);
        startActivity(i);
    }

    public void about_game(View view)
    {
        Intent i= new Intent(this, anexos.class);
        startActivity(i);
    }
}

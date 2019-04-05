package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.app.Activity;
import android.os.Bundle;

public class Settings extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getFragmentManager()
            .beginTransaction()
            .replace(android.R.id.content, new crisdevelop.josantos.metronome.ui.fragment.Settings())
            .commit();
    }
}

package crisdevelop.josantos.metronome.ui.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import crisdevelop.personal.chisdevelop.proyectocolegio.R;


public class Settings extends PreferenceFragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}

package crisdevelop.personal.chisdevelop.proyectocolegio;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.content.Intent;
        import android.os.Handler;
        import com.crashlytics.android.Crashlytics;
        import io.fabric.sdk.android.Fabric;


public class Teoria6_Splash extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.teoria6__splash);


        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(Teoria6_Splash.this, menu_principal.class));
                finish();
            }

        },6200);
    }
}


package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.WindowManager;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
import io.netopen.hotbitmapgg.library.view.RingProgressBar;


public class Teoria4_Splash extends AppCompatActivity
        {

            MediaPlayer voz4;

            //  CODIGO PARA EL PROGRESS BAR
            static RingProgressBar ringProgressBar1;
            int progress = 0;
            Handler myHandler = new Handler()
            {
       @Override
        public void handleMessage(Message msg) {
            if (msg.what ==0) {
                if (progress < 100)
                {
                    progress++;
                    ringProgressBar1.setProgress(progress);
                }
            }
        }
            };
            //  ACABA CODIGO PARA EL PROGRESS BAR


            @Override
            protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                Fabric.with(this, new Crashlytics());
                setContentView(R.layout.teoria4_splash);

                //CODIGO PARA ESCONDER EL STATUS BAR
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
                //CODIGO PARA ESCONDER EL STATUS BAR


                // COGIDO EXCLUSIVO PARA EL PROGRESS BAR
                ringProgressBar1 =  findViewById(R.id.progress_bar_1);
                new Thread (new Runnable()
                {
                    @Override
                    public void run () {
                        for (int i = 0; i < 100; i++)
                        {
                            try {  Thread.sleep(70);
                                myHandler.sendEmptyMessage(0);
                            }
                            catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    }


                    // estoy trabajando aqui para parar el contador
                    public void onFinish()
                    {

                    }
                    // estoy trabajando aqui para parar el contador
                }).start();
// COGIDO EXCLUSIVO PARA EL PROGRESS BAR



                new Handler().postDelayed(new Runnable()
                {


                    @Override
                    public void run()
                    {

                        Intent intent=new Intent (getApplicationContext(), Teoria5_RitmoLenguaje.class);
                        startActivity(intent);

                    }

                },7000);
            }
        }





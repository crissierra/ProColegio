package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Integrantes extends AppCompatActivity {

    static TextView LINK;
    ImageButton HOME;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.integrantes);
        //CODIGO PARA ESCONDER EL STATUS BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //CODIGO PARA ESCONDER EL STATUS BAR

        HOME = (ImageButton) findViewById(R.id.home);
        HOME.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent (getApplicationContext(), menu_principal.class);
                startActivity(intent);
            }
        });


        LINK= findViewById(R.id.paginaweb);

        LINK.setOnClickListener(new View.OnClickListener()
                                {

                                    @Override
                                    public void onClick(View v)
                                    {

                                        // TODO Auto-generated method stub
                                        Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://funnymusicforkids.wixsite.com/official"));
                                        startActivity(in);

                                    }

                                }
        );
    }
}

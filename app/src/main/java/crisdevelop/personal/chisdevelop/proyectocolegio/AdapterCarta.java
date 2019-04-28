package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Usuario on 17/06/2018.
 */
// FALTAN ARCHIVOS DE VOZ 18_2, 20_1, 20_2,
public class AdapterCarta extends BaseAdapter {
    private Context context;
    private ArrayList<ItemCarta> num;
    private int plantillaLayour;
    private final static int FIGURAS[]={
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8

    };

    public AdapterCarta(Context context, ArrayList<ItemCarta> num, int plantillaLayour) {
        this.context = context;
        this.num = num;
        this.plantillaLayour = plantillaLayour;


    }

    @Override
    public int getCount() {
        return num.size();
    }

    @Override
    public Object getItem(int posicion) {
        return num.get(posicion);
    }

    @Override
    public long getItemId(int posicion) {
        return posicion;
    }
    Holder holder;
    View row;
    @Override

    public View getView(int posicion, View view, ViewGroup viewGroup) {


        row=view;
         holder=new Holder();

        if(row==null){

            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(plantillaLayour, null);

            holder.figura=row.findViewById(R.id.textoId);
            holder.Iview=row.findViewById(R.id.view);


            row.setTag(holder);
        }else{
            holder=(Holder)row.getTag();
        }

        final ItemCarta carta=num.get(posicion);


        holder.figura.setBackgroundResource(FIGURAS[carta.getNumero()-1]);
        holder.Iview.setBackgroundResource(carta.getFondoImagenL());



        return row;
    }
    public class Holder{
        ImageView figura;
        ImageView Iview;
    }

}


//1. OVA e implementación de las TIC.
// 2.Ejercicios ritmicos. NUevo Power point + IMPLEMENTAR MENSAJE DE FELICITACIÓN SUPER BIEN.. ERES BUEN MÚSICA+ DESPUES MENSAJE DE BEETHOVEN
//3. EJERCICIOS RITMICOS ESCALA CORRIGIENDO IMAGEN DE AGUDO Y GRAVE. ESCALA MUSICA
//4. PENTAGRAMA.
// 5.NOTAS EN EL MENTAGRAMA.
//6.IMAGEN DE ESCALA MUSICAL CON COLORES
//7. CLAVE DE SOL
// 8.COMPAS
// 10. FRASE MAGDALENA MARTINEZ
//11.JUEGOS LECTURA.
//12. JUEGOS COMPLETAR LA ESCALA
//13. LÁPIZ. NOMBRER NOTAS DE LA ESCALA.


// PENDIENTES PARA TERMINAR:
/*

3. SCROLLABLE.
4. ARREGLAR PROGRESIVE BAR
5. SPINNER*/


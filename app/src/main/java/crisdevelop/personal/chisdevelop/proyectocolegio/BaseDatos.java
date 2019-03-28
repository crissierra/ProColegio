package crisdevelop.personal.chisdevelop.proyectocolegio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Usuario on 23/06/2018.
 */

public class BaseDatos extends SQLiteOpenHelper {

    private static final String NOMBRE_BBDD="jugador.db";
    private static final int VERSION=1;
    private static final String NOMBRE_TABLA="CREATE TABLE TABLA(NICK TEXT PRIMARY KEY, PUN1 TEXT, PUN2 TEXT, PUN3 TEXT)";

    public BaseDatos(Context contex){
        super(contex,NOMBRE_BBDD,null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(NOMBRE_TABLA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS CREATE"+NOMBRE_BBDD);
        sqLiteDatabase.execSQL(NOMBRE_TABLA);

    }
    public void insetarDatos(String id, String p1, String p2, String p3){
        SQLiteDatabase db=getWritableDatabase();

        ContentValues valores=new ContentValues();

        valores.put("NICK",id);
        valores.put("PUN1",p1);
        valores.put("PUN2",p2);
        valores.put("PUN3",p3);

        db.insert("TABLA",null,valores);
    }
    public Cursor cargarDatos(String id){
        Cursor cursor=null;

        SQLiteDatabase db=getReadableDatabase();

        String[] columnasBuscar={"PUN1","PUN2","PUN3"};
        String columnaBase="NICK" + " = ?";
        String[] fuente={id};

        try{
            cursor=db.query("TABLA",columnasBuscar,columnaBase,fuente,null,null,null);
            cursor.moveToFirst();
        }catch (Exception e){

        }



        return cursor;


    }
    public void borrarDatos(String id){
        SQLiteDatabase db=getWritableDatabase();

        String idBase="NICK" + "LIKE ?";
        String[] guia={id};

        db.delete("TABLA",idBase,guia);
    }
    public void actualizarDatos(String id, String p1, String p2, String p3){

        SQLiteDatabase db=getWritableDatabase();

        ContentValues valores=new ContentValues();

        valores.put("PUN1",p1);
        valores.put("PUN2",p2);
        valores.put("PUN3",p3);

        String datoReferencia="NICK" + " LIKE ?";
        String[] datoGuia={id};

        db.update("TABLA",valores,datoReferencia,datoGuia);
    }
}

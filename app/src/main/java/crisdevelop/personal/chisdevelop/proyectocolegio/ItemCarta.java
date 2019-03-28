package crisdevelop.personal.chisdevelop.proyectocolegio;


public class ItemCarta {

    private int numero;
    private int fondoImagenL;



    public ItemCarta(int n, int fondoL){
        numero=n;
        fondoImagenL=fondoL;

    }

    public void setFondoImagenL(int fondoImagenL) {
        this.fondoImagenL = fondoImagenL;
    }

    public int getFondoImagenL() {
        return fondoImagenL;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

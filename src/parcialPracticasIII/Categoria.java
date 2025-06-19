package parcialPracticasIII;

public class Categoria {
    private int[] cat;

    public Categoria(int[] cat) {
        this.cat = cat;
    }

    public int[] getCat() {
        return cat;
    }

    public void setCat(int[] cat) {
        this.cat = cat;
    }

    public int calcularPorcentaje(int posicion){
        return cat[posicion];
    }
}

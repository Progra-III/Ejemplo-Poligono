
public class Cuadrado extends Poligono {

    //METODOS HEREDADOS-----------------------------------------------
    @Override
    public int area(){
        return getLado1()+getLado2();
    }

    @Override
    public int perimetro(){
        return 2*(getLado1()+getLado2());
    }
    //METODOS IMPLEMENTADOS-------------------------------------------

    public Cuadrado(int lado1){
        super(lado1,lado1);
    }
}

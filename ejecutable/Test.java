package ejecutable;

import modelo.Carro;

public class Test
{
    public static void main(String[] args) 
    {
        //Crear un objeto de tipo Carro usando constructor sin parámetros
        Carro carro1 = new Carro();
        System.out.println("Color: " + carro1.getColor());
        System.out.println("Num. Ruedas: " + carro1.getNumRuedas());
        System.out.println("Pos. X: " + carro1.getPosX());
        System.out.println("Pos. Y: " + carro1.getPosY());
        System.out.println("Velocidad: " + carro1.getVelocidad());

        System.out.println("------------------------------");

        System.out.println(carro1);

        //Crear un objeto de tipo Carro usando constructor con parámetros
        Carro carro2 = new Carro("Blanco", 10, 100);
        carro2.acelerar();
        System.out.println(carro2);

    }
}

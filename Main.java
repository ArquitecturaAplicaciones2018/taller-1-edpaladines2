package Principal;
import java.util.List;

public class main {
    public static void main(String[] args) {
        var rationals = List.of(
                new Rational(1, 4),
                new Rational(1, 8),
                new Rational(3, 4),
                new Rational(7, 8));

        var unMedio = new Rational(1,2);
        var sumaR = Rational.ZERO;
        int nro_elementos = 0;
        int promedio = 0;

        //imperativa
        for (Rational r : rationals){
            if (r.isLessThan(unMedio)){
                //System.out.println(r);
            }
        }
        //Funcional
        //Obtener todos los números racionales que sean menores a 1/2
        System.out.println("Racionales menores a un medio (1/2):");
        rationals.stream().filter(r -> r.isLessThan(unMedio)).forEach(System.out::println);

        //Sumar todos los racionales
        sumaR = rationals.stream().reduce(Rational::plus).get();
        System.out.println("Suma de numeros racionales:/n"+sumaR);

        //Obtener el número racional mayor
        System.out.println("Racional mayor: "+rationals.stream().reduce(Rational::getGreater).get());

        /**Sumar todos numeradores y obtener los siguientes datos:
        número de elementos, la suma de los numeradores, el numerador menor, el mayor y el promedio
         **/
        System.out.println("Suma de numeradores:\n"+rationals.stream().mapToInt(r -> r.getNumerator()).reduce(0, Integer::sum));

        //Numero de elementos
        nro_elementos = (int) rationals.stream().count();
        System.out.println("Numero de elementos:\n"+ nro_elementos);

        //Numerador menor
        System.out.println("Numerador mayor:\n"+rationals.stream().mapToInt(r -> r.getNumerator()).max().getAsInt());

        //Numerador mayor
        System.out.println("Numerador menor:\n"+rationals.stream().mapToInt(r -> r.getNumerator()).min().getAsInt());

        //Promedio de numeros
        promedio = (int)rationals.stream().mapToInt(r -> r.getNumerator()).average().getAsDouble();
        System.out.println("Promedio:\n"+promedio);
    }
}

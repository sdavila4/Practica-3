
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;


public class main{
    public static void main(String[] args) {
        Vector<Estudiante> re = new Vector<>();
        Estudiante captura = new Estudiante();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        char eleccion = ' ';
       // int i;
        do {
            System.out.println("        Menú       ");
            System.out.println(" a. Capturar Alumnos");
            System.out.println(" b. Mostrar Alumnos");
            System.out.println(" c. Salir");
            System.out.println(" Elige una opción: ");

            eleccion = sc.next().charAt(0);
        try{
            switch(eleccion) {
                case 'a':
                    // for(int i=1; i<=5; i++);
              //  {
                    // System.out.println("i");
                    System.out.println("");
                    captura.AsignarNombre(sc);
                    re.add(captura);
              //  }
                    break;
                case 'b':
                    re.forEach((a) -> {System.out.println(a.toString());});

                    System.out.println("Estudiante = nombre:Adrian, numero de control:001, materia:español, calificación:50, estado: reprobado");
                    System.out.println("Estudiante = nombre:Esthela, numero de control:002, materia:calculo, calificación:70, estado: aprobado");
                    System.out.println("Estudiante = nombre:Victor, numero de control:003, materia:sistemas, calificación:100, estado:aprobado");
                    System.out.println("Estudiante = nombre:America, numero de control:004, materia:programacion, calificación:40, estado: reprobado");
                    System.out.println("Estudiante = nombre:Jacqueline, numero de control:005, materia:fisica, calificación:70, estado:aprobado");
                    break;
                case 'c':
                    salir = true;
                    break;
            }
        } catch (InputMismatchException e){
           return;
            }
        } while (eleccion != 'c');
    }
}

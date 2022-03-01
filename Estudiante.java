//import java.util.InputMismatchException;
import java.util.Scanner;
public class Estudiante {
    //Atributos
    private String nombre;
    private String no_de_control;
    private String materia;
    private String estado;
    private float calificación;
    //Parametros del metodo
    public Estudiante(String nombre, String no_de_control, String materia, float calificación) {
        this.nombre = nombre;
        this.no_de_control = no_de_control;
        this.materia = materia;
        this.calificación = calificación;
        this.estado = this.Estado(calificación);
    }
    public Estudiante() {
        this.nombre = nombre;
        this.no_de_control = no_de_control;
        this.materia = materia;
        this.calificación = calificación;
        this.estado = estado;
    }
    //Método para asignar nombre a los estudiantes
    public void AsignarNombre(Scanner sc) {
        System.out.println("Estudiante ");
        System.out.print("Nombre: ");
        this.nombre = sc.next();
        System.out.print("Numero de control: ");
        this.no_de_control = sc.next();
        System.out.print("Materia: ");
        this.materia = sc.next();
        System.out.print("Calificación: ");
        this.calificación = sc.nextFloat();
        this.AsignarEstado();

    } //Asignar estado del alumno, >=60=aprobado, <60=reprobado
    private String Estado(float calificación) {
     /*   if (calificación>=60){System.out.println("Aprobado");}
        else{
            System.out.println("Reprobado")};
            return calificación;
        */
        return (calificación >= 60 ? "aprobado" : "reprobado");
    }
    private String Estado() {
        return Estado(this.calificación);
    }
    public void AsignarEstado() {
        this.estado = this.Estado();
    }
    public String toString() {
        return "Estudiante ="+ " nombre:" + nombre + ", numero de control:" + no_de_control + ", materia:" + materia + ", calificación:" + calificación + ", estado:" + estado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNo_de_control() {
        return no_de_control;
    }
    public void setNo_de_control(String no_de_control) {
        this.no_de_control = no_de_control;
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public float getCalificación() {
        return calificación;
    }
    public void setCalificación(float calificación) {
        this.calificación = calificación;
    }
}
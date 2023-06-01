public class MiClase {
    public static void main(String[] args) {
        int[] calificacion = {99,88,77,60,71}; //Atributo tipo Array almacenando las 5 calificaciones
        String alumno = "Joaquin Gonzalez"; //atributo tipo string almacenando el nombre del participante
        String calificacion_final;
//Metodo para calcular el promedio de las 5 calificaciones
        double calprom = (calificacion[0] + calificacion[1] + calificacion[2] + calificacion[3] + calificacion[4]) / 5;
//Metodo para obtener la calificacion final con letra
        if (calprom >= 91 && calprom <= 100) {
            calificacion_final = "A";
        } else if (calprom >= 81 && calprom <= 90) {
            calificacion_final = "B";
        } else if(calprom >= 71 && calprom <= 80) {
            calificacion_final = "C";
        } else if(calprom >= 61 && calprom <= 70) {
            calificacion_final = "D";
        } else if(calprom >= 51 && calprom <= 60) {
            calificacion_final = "D";
        } else calificacion_final = "F";
//Metodo para imprimir en pantalla
        System.out.println("Nombre del Estudiante: " + alumno);
        System.out.println("Calificacion1: " + calificacion[0]);
        System.out.println("Calificacion2: " + calificacion[1]);
        System.out.println("Calificacion3: " + calificacion[2]);
        System.out.println("Calificacion4: " + calificacion[3]);
        System.out.println("Calificacion5: " + calificacion[4]);
        System.out.println("Promedio: " + calprom);
        System.out.println("Calificacion: " + calificacion_final);
    }
}
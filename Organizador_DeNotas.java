import java.util.Scanner;

public class Organizador_DeNotas
{
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nombre = new String[10];
        int[] nota1 = new int[100];
        int[] nota2 = new int[100];
        int[] nota3 = new int[100];
        
}
    public static void Organizador_DeNotas(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cantReprob = 0, cantApro = 0;
        double nota, suma = 0, mayor, menor;;
       
        System.out.println("Nota media, mayor y menor de una clase");
        System.out.println("--------------------------------------");
    
       do {
            System.out.print("Introduce numero de alumnos: ");
            n = sc.nextInt();  //n contiene el número de alumnos
        } while (n <= 0); //repetir mientras que el valor de n sea <= 0

        System.out.print("Nota del alumno 1: ");
        nota = sc.nextDouble(); // leemos la nota del primer alumno
       if (nota >51) {
                cantApro ++;            }
            else{
                cantReprob ++;
            }
        suma = suma + nota; //la sumamos al acumulador
       
        mayor = nota; //la tomamos como nota mayor y menor
        menor = nota;
       
        for (int i = 2; i <= n; i++) {  // leemos el resto de notas desde el alumno 2 hasta el alumno n         
            System.out.print("Nota del alumno " + i + ": ");
            nota = sc.nextDouble();
            if (nota >51) {
                cantApro ++;            }
            else{
                cantReprob ++;
            }
            suma = suma + nota; // la sumamos al acumulador
            if (nota > mayor){  // se compara la nota con la mayor y con la menor actual
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }

        // mostrar resultados
        System.out.printf("Nota media: %.2f %n" , suma/n);
        System.out.println("La mayor nota ha sido un " + mayor);
        System.out.println("La menor nota ha sido un " + menor);
        System.out.println("La catidad de reprobados es:" + cantReprob);
        System.out.println("La catidad de Aprobados es:" + cantApro);
    }
   
}
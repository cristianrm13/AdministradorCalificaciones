package com.upchiapas.asignaturas.models;

import java.util.ArrayList;
import java.util.Scanner;
public class Operacionmenu {


private static Alumno[] listaAlumno = new Alumno[3];

    private static Scanner teclado = new Scanner(System.in);
    byte op;
    public void menu() {
        do {

            System.out.printf("------Administrador de calificaciones------\n");
            System.out.println("1. Alta asignaturas");
            System.out.println("2. Alta de alumnos en cada asignatura");
            System.out.println("3. Registro de calificacion");
            System.out.println("4. Imprimir lista de alumnos por asignatura");
            System.out.println("5. Imprimir promedios de cada asignatura");
            System.out.println("6. salir");
            System.out.print("Seleccione una opcion: ");
            op = teclado.nextByte();
            teclado.nextLine();
            switch (op) {
                case 1:
                    addAsig();
                    break;
                case 2:
                    altaAlumnos();
                    break;
                case 3:
                    regCalif();
                    break;
                case 4:
                    listaAlumnos();

                break;
                case 5:promedio(); break;
            }
        } while (op < 6);
    }
    private static ArrayList listaM = new ArrayList();
    private static ArrayList listaAl = new ArrayList();
    private static ArrayList listaAl2 = new ArrayList();
    private static ArrayList listaAl3 = new ArrayList();
    private static String al1,al2,al3,al4,al5,al6,al7,al8,al9;
    private static String m1,m2,m3;
    public static void addAsig(){
      //   ArrayList listaM = new ArrayList();
        System.out.println("Ingrese el nombre de la primera materia");
        m1 = teclado.nextLine();
        listaM.add(m1);
        System.out.println("Ingrese el nombre de la segunda materia");
        m2 = teclado.nextLine();
        listaM.add(m2);
        System.out.println("Ingrese el nombre de la tercer materia");
        m3 = teclado.nextLine();
        listaM.add(m3);

      //  String ASIGNATURAS = String.valueOf(new String[] {m1+", "+m2+", "+m3});
      //  System.out.println(listaM);
    }

    public static void altaAlumnos(){

        System.out.println("Asignacion de materias\n");
        System.out.println("1. "+m1);
        System.out.println("2. "+m2);
        System.out.println("3. "+m3);
        System.out.println("4. salir");
        System.out.print("seleccione la materia a agregarle alumnos: ");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1: asigAl();break;
            case 2: asigAl2();break;
            case 3:asigAl3(); break;
            case 4: break;
        }
    }
    public static void asigAl(){
        System.out.println("Asignacion de alumnos");
        String alr = teclado.nextLine();
        System.out.println("Ingrese el nombre del primer alumno");
        al1 = teclado.nextLine();
        //Alumno a = new Alumno(al1,id1)
        listaAl.add(al1);
        System.out.println("Ingrese el nombre del segundo alumno");
        al2 = teclado.nextLine();
        listaAl.add(al2);
        System.out.println("Ingrese el nombre del tercer alumno");
        al3 = teclado.nextLine();
        listaAl.add(al3);
      //  System.out.println(listaAl);
    }
    public static void asigAl2(){
        System.out.println("Asignacion de alumnos");
        String alr = teclado.nextLine();
        System.out.println("Ingrese el nombre del primer alumno");
        al4 = teclado.nextLine();
        listaAl2.add(al4);
        System.out.println("Ingrese el nombre del segundo alumno");
        al5 = teclado.nextLine();
        listaAl2.add(al5);
        System.out.println("Ingrese el nombre del tercer alumno");
        al6 = teclado.nextLine();
        listaAl2.add(al6);
      //  System.out.println(listaAl2);
    }
    public static void asigAl3(){
        System.out.println("Asignacion de alumnos");
        String alr = teclado.nextLine();
        System.out.println("Ingrese el nombre del primer alumno");
        al7 = teclado.nextLine();
        listaAl3.add(al7);
        System.out.println("Ingrese el nombre del segundo alumno");
        al8 = teclado.nextLine();
        listaAl3.add(al8);
        System.out.println("Ingrese el nombre del tercer alumno");
        al9 = teclado.nextLine();
        listaAl3.add(al9);
       // System.out.println(listaAl3);
    }

    private static int cal1,cal2,cal3,cal4,cal5,cal6,cal7,cal8,cal9;
    public static void regCalif(){
        System.out.println("1. agregarle calificacion a los alumnos de "+m1);
        System.out.println("2. agregarle calificacion a los alumnos de "+m2);
        System.out.println("3. agregarle calificacion a los alumnos de "+m3);
        System.out.print("Seleccione una opcion: ");
        int opcion = teclado.nextInt();
        switch(opcion){
            case 1:
                System.out.println("ingresa la calificacion para "+al1);
                 cal1 = teclado.nextInt();
                System.out.println("ingresa la calificacion para "+al2);
                cal2 = teclado.nextInt();
                System.out.println("ingresa la calificacion para "+al3);
                cal3 = teclado.nextInt();
                break;
            case 2:
                System.out.println("ingresa la calificacion para "+al4);
                cal4 = teclado.nextInt();
                System.out.println("ingresa la calificacion para "+al5);
                cal5 = teclado.nextInt();
                System.out.println("ingresa la calificacion para "+al6);
                cal6 = teclado.nextInt();
                break;
            case 3:
                System.out.println("ingresa la calificacion para "+al7);
                cal7 = teclado.nextInt();
                System.out.println("ingresa la calificacion para "+al8);
                cal8 = teclado.nextInt();
                System.out.println("ingresa la calificacion para "+al9);
                cal9 = teclado.nextInt();
                break;
        }
    }

    public static void promedio(){
        System.out.println("promedio de la asignatura "+m1+" : \n");
        int pr=0;
        pr = cal1+cal2+cal3;
        int prom=pr/3;
        System.out.println(prom);
        System.out.println("\npromedio de la asignatura "+m2+" : \n");
        int pr2 = cal4+cal5+cal6;
        int prom2=pr2/3;
        System.out.println(prom2);
        System.out.println("\npromedio de la asignatura "+m3+" : \n");
        int pr3 = cal7+cal8+cal9;
        int prom3=pr3/3;
        System.out.println(prom3);
    }
    public static void listaAlumnos(){
        System.out.println("\nAlumnnos que cursan "+m1+"\n"+listaAl);
        System.out.println("\nAlumnnos que cursan "+m2+"\n"+listaAl2);
        System.out.println("\nAlumnnos que cursan "+m3+"\n"+listaAl3);
    }
}

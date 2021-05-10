package TiendaVet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Random;

public class tienda{

    public static void main(String[] args){

        int c, k, op, op2, op3;
        int edad, numCasa;
        String tel;
        String rut;
        
        String sexo, direccion;
        String name, name1, name2, name3;

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner telefono = new Scanner(System.in);
        Scanner nombre = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        
        
        do{
            System.out.println("\nBienvenido a la tienda favorita de tus mascotas, Eliga una opcion. ");
            System.out.println("1) Registrar clientes.");
            System.out.println("2) Lista de productos. ");
            System.out.println("3) Comprar. ");
            System.out.println("4) Reponer STOCK. ");
            System.out.println("0) Salir. ");
            op = opcion.nextInt();

            switch(op){
                case 1:
                    System.out.println("\nIngrese la cantidad de clientes: ");
                    c = sc.nextInt();
            
                    cliente clientela[] = new cliente[c];
                    for(int i=0 ; i<c; i++){
            
                        System.out.println("\nIngrese el nombre completo del cliente: ");
                        name = nombre.next(); name1 = nombre.next(); name2 = nombre.next(); name3 = nombre.next();
                
                        System.out.println("\nIngrese la edad del cliente: ");
                        edad = sc.nextInt();
                
                        System.out.println("\nIngrese el sexo del cliente: ");
                        sexo = sc1.next();
                
                        System.out.println("\nIngrese el rut del cliente: (con punto y guion) ");
                        rut = sc.next();
                
                        System.out.println("\nIngrese la direccion del cliente: ");
                        System.out.println("Ingrese la calle: ");
                        direccion = sc1.next(); 
                        System.out.println("Ingrese el numero de casa: ");
                        numCasa = sc.nextInt();
                
                        System.out.println("\nIngrese el numero telefonico del cliente: ");
                        tel = telefono.next();

                        try{
                            FileWriter registrar = new FileWriter("TiendaVet/registroCLI.txt", true);
                            registrar.write(""+ name +" "+ name1 +" "+ name2 +" "+ name3);
                            registrar.write("; "+ edad);
                            registrar.write("; "+ sexo);
                            registrar.write("; "+ rut); 
                            registrar.write("; "+ direccion +" "+ numCasa); 
                            registrar.write("; "+ tel +"\n"); 
                
                            registrar.close();
                            System.out.println("el registro fue realizado con exito");
                            
                        } catch (IOException e){
                            System.out.println("Ocurrio un error al registrar");
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    do{
                        System.out.println("\n1) Productos de Aseo. ");
                        System.out.println("2) Productos Esteticos y prendas. ");
                        System.out.println("3) Accesorios y jueguetes. ");
                        System.out.println("4) Alimentos. ");
                        System.out.println("0) volver al menu incial. ");
                        op2 = opcion.nextInt();
                        switch(op2){
                            case 1:
                                try{
                                    File art = new File("TiendaVet/ArtAseo.txt");
                                    Scanner muestra = new Scanner(art);
                        
                                    while(muestra.hasNextLine()){
                                        String linea = muestra.nextLine();
                                        System.out.println(linea);
                                    }
                                    muestra.close();
                                }catch( FileNotFoundException e){
                                    System.out.println("Ocurrio un error en el listado de productos");
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                try{
                                    File art = new File("TiendaVet/ArtEstetico.txt");
                                    Scanner muestra = new Scanner(art);
                        
                                    while(muestra.hasNextLine()){
                                        String linea = muestra.nextLine();
                                        System.out.println(linea);
                                    }
                                    muestra.close();
                                }catch( FileNotFoundException e){
                                    System.out.println("Ocurrio un error en el listado de productos");
                                    e.printStackTrace();
                                }
                                break;
                            case 3:
                                try{
                                    File art = new File("TiendaVet/Accesorios.txt");
                                    Scanner muestra = new Scanner(art);
                        
                                    while(muestra.hasNextLine()){
                                        String linea = muestra.nextLine();
                                        System.out.println(linea);
                                    }
                                    muestra.close();
                                }catch( FileNotFoundException e){
                                    System.out.println("Ocurrio un error en el listado de productos");
                                    e.printStackTrace();
                                }    
                                break;
                            case 4:
                                try{
                                    File art = new File("TiendaVet/Alimentos.txt");
                                    Scanner muestra = new Scanner(art);
                        
                                    while(muestra.hasNextLine()){
                                        String linea = muestra.nextLine();
                                        System.out.println(linea);
                                    }
                                    muestra.close();
                                }catch( FileNotFoundException e){
                                    System.out.println("Ocurrio un error en el listado de productos");
                                    e.printStackTrace();
                                }
                                break;
                        }

                        if(op2 < 0 || op2 > 4)
                            System.out.println("\nERROR - Ingrese una opcion valida");

                    }while(op2 > 0 || op2 < 0);
                    break;
                case 3:
                    
                    break;
                case 4:
                    do{
                        System.out.println("\nSeleccione stock a reponer: \n1) Productos de aseo. ");
                        System.out.println("2) Productos Esteticos y prendas. ");
                        System.out.println("3) Accesorios y jueguetes. ");
                        System.out.println("4) Alimentos. ");
                        System.out.println("0) volver menu principal. ");
                        op3 = opcion.nextInt();

                        switch(op3){
                            case 1:

                                break;
                            case 2:
                            
                                break;
                            case 3:


                                break;
                            case 4:

                                break;
                            case 0:

                                break;
                        }

                        if(op3 > 4 || op3 < 0)
                            System.out.println("\nERROR - Ingrese una opcion valida");

                    }while(op3 > 0 || op3 < 0);
                    break;
                case 0:
                    System.out.println("Gracias por preferirnos vuelva pronto. ");
                    break;
                default:
                    break;
            }

            if(op > 5 || op < 0)
                System.out.println("\nERROR - Ingrese una opcion valida");

        }while(op > 0 || op < 0);
    }
}
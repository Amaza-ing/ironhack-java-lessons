package com.ironhack.w1d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
//        System.err.println("Prueba de error por consola");
//        System.out.println("Prueba de escritura normal por consola");

//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        do {
//            System.out.println("Please write your name");
//            name = scanner.nextLine();
//        } while (name.length() < 3);
//        System.out.println("Your name is: " + name);
//
//        System.out.println("Please write your age");
//        int age = scanner.nextInt();
//        System.out.println("Your age is: " + age);
//
//        scanner.close();

        File file = new File("src/com/ironhack/w1d3/fichero.txt");
        if (file.createNewFile()) {
            System.out.println("El archivo se ha creado");
        } else {
            System.out.println("El archivo ya existía");
        }

        String route = "src/com/ironhack/w1d3/fichero.txt";
        FileWriter fileWriter = new FileWriter(route, true);
        fileWriter.write("Esto es una linea\n");
        fileWriter.write("Esto es otra linea\n");
        fileWriter.close();

        Scanner scannerFile = new Scanner(file);
        String str = "";
        while (scannerFile.hasNextLine()) {
            str += scannerFile.nextLine();
            System.out.println(str);
        }
        scannerFile.close();
    }
}

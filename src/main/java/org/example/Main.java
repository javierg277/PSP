package org.example;

import org.example.Controller.EscritorDeClientes;
import org.example.Controller.LectorDeClientes;
import org.example.Controller.ProcesadorDeClientes;
import org.example.model.Cliente;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String archivoEntrada = "C:\\Users\\javie\\OneDrive\\Escritorio\\untitled3\\src\\main\\java\\org\\example\\Clientes.txt";
        String archivoSalida = "C:\\Users\\javie\\OneDrive\\Escritorio\\untitled3\\src\\main\\java\\org\\example\\cprocesados.txt";

        try {

            List<Cliente> clientes = LectorDeClientes.leerClientes(archivoEntrada);


            ProcesadorDeClientes.calcularDescuento(clientes);


            EscritorDeClientes.escribirClientes(archivoSalida, clientes);

            System.out.println("Operación completada correctamente.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

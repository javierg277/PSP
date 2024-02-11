package org.example.Controller;

import org.example.model.Cliente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LectorDeClientes {
    public static List<Cliente> leerClientes(String rutaArchivo) throws IOException {
        List<Cliente> clientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                if (partes.length == 2) {
                    clientes.add(new Cliente(partes[0], partes[1]));
                }
            }
        }

        return clientes;
    }
}

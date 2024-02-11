package org.example.Controller;

import org.example.model.Cliente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EscritorDeClientes {
    public static void escribirClientes(String rutaArchivo, List<Cliente> clientes) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Cliente cliente : clientes) {

                bw.write(cliente.getNombre() + " " + cliente.getCorreoElectronico() + " - Elegible para descuento\n");
            }
        }
    }
}
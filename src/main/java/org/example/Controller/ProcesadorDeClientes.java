package org.example.Controller;

import org.example.model.Cliente;

import java.util.List;

public class ProcesadorDeClientes {
    public static void calcularDescuento(List<Cliente> clientes) {
        if (clientes != null) {
            for (Cliente cliente : clientes) {
                if (cliente.getNombre().startsWith("s")) {

                }else{
                    clientes.remove(cliente);
                }
            }
        }
    }
}
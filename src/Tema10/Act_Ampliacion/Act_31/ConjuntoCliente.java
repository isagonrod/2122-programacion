package Tema10.Act_Ampliacion.Act_31;

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;

import java.util.Arrays;

public class ConjuntoCliente extends Lista {
    public ConjuntoCliente() {
        super();
    }

    void altaCliente() {
        //Arrays.sort(this.tabla);
        Cliente nuevo = Cliente.pedirDatosCliente();
        int indiceInsercion = Arrays.binarySearch(tabla, nuevo);
        if (indiceInsercion < 0) {
            indiceInsercion = -indiceInsercion - 1;
        }
        Cliente[] copia = new Cliente[tabla.length + 1];
        System.arraycopy(tabla,0,copia,0,indiceInsercion);
        System.arraycopy(tabla, indiceInsercion, copia,indiceInsercion + 1, tabla.length - indiceInsercion);
        copia[indiceInsercion] = nuevo;
        tabla = copia;
    }

    void listarClientes() {
        System.out.println(super.toString());
        System.out.println("Saldo Mínimo del conjunto de clientes: " + this.saldoMin());
        System.out.println("Saldo Máximo del conjunto de clientes: " + this.saldoMax());
        System.out.println("Saldo Promedio del conjunto de clientes: " + this.saldoPromedio());
    }

    void bajaCliente(String dni) {
        this.eliminar(this.buscar(dni));
    }

    Double saldoMax() {
        Double saldoMax = 0.0;
        for (Object elemento: this.tabla) {
            Cliente cliente = (Cliente)elemento;
            if (cliente.getSaldo() > saldoMax) {
                saldoMax = cliente.getSaldo();
            }
        }
        return saldoMax;
    }

    Double saldoMin() {
        Double saldoMin = 99999999.0;
        for (Object elemento : this.tabla) {
            Cliente cliente = (Cliente)elemento;
            if (cliente.getSaldo() < saldoMin) {
                saldoMin = cliente.getSaldo();
            }
        }
        return saldoMin;
    }

    Double saldoPromedio() {
        Double saldoPromedio = 0.0;
        for (Object elemento : this.tabla) {
            Cliente cliente = (Cliente)elemento;
            saldoPromedio += cliente.getSaldo();
        }
        saldoPromedio /= this.getLength();
        return saldoPromedio;
    }

    public int buscar(String claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (((Cliente)tabla[i]).getDni().equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }
}

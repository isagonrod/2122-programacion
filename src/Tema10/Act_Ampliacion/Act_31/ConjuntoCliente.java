package Tema10.Act_Ampliacion.Act_31;

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;

public class ConjuntoCliente extends Lista {
    public ConjuntoCliente() {
        super();
    }

    void altaCliente() {
        this.encolar(Cliente.pedirDatosCliente());
    }

    void listarClientes() {
        this.ordenar();
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

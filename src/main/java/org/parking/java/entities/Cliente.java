package org.parking.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    public String nombres;
    public String apellidos;
    public Long numeroIdentificacion;
    public List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();

    public Cliente() {
    }
    public Cliente(String nombres, String apellidos, Long numeroIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    // definir metodo de clase
    // addCar: vincular un carrito al cliente 
    public void addVehicle(Vehiculo vehiculo){
    //añadir el carrito a la lista
    //THIS: para accerder a atributos y metodos al interior del objeto
    //NOTA: usenla al interior de metodos 
        this.misVehiculos.add(vehiculo);
    }
    //otra sobrecarga del metodo 
    //addVehicle:
    public void addVehicle(String placa,TipoVehiculo tv) {
        Vehiculo v = new Vehiculo();
        v.placa = placa;
        v.tipoVehiculo = tv;
        this.misVehiculos.add(v);
    }
    
    
}

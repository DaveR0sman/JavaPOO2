package com.generation;

import com.generation.banco.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Santiago", 33, "102045455");
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");

    }

    /*public static void main(String[] args) {
	// write your code here


        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("david");
        cuenta.setClave("dsadsa88898");
        cuenta.setSaldo(-22002);
b n
        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();
        /*Perro lomito = new Perro();
        lomito.nombre = "chems";
        lomito.edad = 5;
        lomito.raza = "mestizo";
        lomito.tamanio = "wrande";
        lomito.caracteristicas();
        lomito.comer();

        Perro lomito2 = new Perro();
        lomito2.nombre = "firulais";
        lomito2.edad = 10;
        lomito2.raza = "black";
        lomito2.tamanio = "Mewiano";
        lomito2.caracteristicas();
        lomito2.dormir();

        Perro lomito3 = new Perro();
    }*/
}

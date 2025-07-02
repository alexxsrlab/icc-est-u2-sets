package Controllers;

import java.util.Set;
import java.util.TreeSet;

import Models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorHash;
import utils.ContactoComparatorNumeros;

public class ContactoController {
    
    public ContactoController(){
        runTreeContacto();
    }

    public void runTreeContacto(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        
        for(Contacto contacto : agenda){
            System.out.println(contacto);
        }
    }

    public void runTreeContactoNumeros(){
        Set<Contacto> numeros = new TreeSet<>(new ContactoComparatorNumeros());
        numeros.add(new Contacto("Pedro", "Lopez", "222222222"));
        numeros.add(new Contacto("Luis", "Perez", "111111111"));
        numeros.add(new Contacto("Ana", "Perez", "987654321"));
        numeros.add(new Contacto("Pedro", "Lopez", "123456789"));
        numeros.add(new Contacto("Pedro", "Lopez", "222222222"));
        numeros.add(new Contacto("Pedro", "Gonzales", "222222222"));
        numeros.add(new Contacto("Pablo", "Lopez", "222222222"));
        
        for(Contacto contacto : numeros){
            System.out.println(contacto);
        }
    }

    public void runTreeContactoHash(){
        Set<Contacto> hash = new TreeSet<>(new ContactoComparatorHash());
        hash.add(new Contacto("Pedro", "Lopez", "222222222"));
        hash.add(new Contacto("Luis", "Perez", "111111111"));
        hash.add(new Contacto("Ana", "Perez", "987654321"));
        hash.add(new Contacto("Pedro", "Lopez", "123456789"));
        hash.add(new Contacto("Pedro", "Lopez", "222222222"));
        hash.add(new Contacto("Pedro", "Gonzales", "222222222"));
        hash.add(new Contacto("Pablo", "Lopez", "222222222"));
        
        for(Contacto contacto : hash){
            System.out.println(contacto);
        }
    }
}



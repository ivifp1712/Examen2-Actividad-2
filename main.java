import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        //cliente1
        Cliente cliente1 = new Cliente("Indra","Madrid", 1000)
        cliente1.setCiudad("Sevilla");
        System.out.println("Ciudad modificada a " + cliente1.getCiudad());
        cliente1.getFicha();
        //cliente2
        Cliente cliente2 = new Cliente("Vass", "Valencia", 12000);
        cliente2.getFicha();
        
    }

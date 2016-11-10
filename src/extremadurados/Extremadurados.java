/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extremadurados;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Extremadurados {

    static ArrayList<Provincia> provincias = new ArrayList<>();

    public static void rellenarDatos() {
        Provincia p = new Provincia();
        p.setNombre("BADAJOZ ");
        p.setExtension(2340000);
        provincias.add(p);

        p = new Provincia();
        p.setNombre("CACERES ");
        p.setExtension(2340000);
        provincias.add(p);

        Localidad loc;
        //ArrayList<Localidad> aux = new ArrayList<Localidad>();
        for (int i = 0; i < 300; i++) {
            loc = new Localidad();
            loc.setNombre("Cachorrilla " + i);
            loc.setExtension(4000 + i);
            loc.setHabitantes(7000 + i);
            provincias.get(0).addLocalidad(loc);
            //aux.add(loc);
        }
        //provincias.get(0).setLocalidades(aux);
        for (int i = 1; i < 300; i++) {
            loc = new Localidad();
            loc.setNombre("Coria " + i);
            loc.setExtension(3000 + i);
            loc.setHabitantes(5000 + i);
            provincias.get(1).addLocalidad(loc);

        }

        /* public static void rellenarDatos(){
        Localidad loc[];
        for (int f=0;f < provincias.length;f++){
            provincias[f] = new Provincia ();
            provincias[f].setNombre("PROVINCIA "+f);
            provincias[f].setExtension(40000);
            loc = provincias[f].getLocalidades();
             for (int l=0;l < loc.length;l++){
                 loc[l] = new Localidad ();
                 loc[l].setNombre("LAS LOCALIDADES SON "+l);
                 loc[l].setExtension(3000+l);
                 loc[l].setHabitantes(5000+l);
                    
             }
        }  
     }*/
    }

    public static void ejercicio01() {
        //mostrar nombre provincia.
        for (int i = 0; i < provincias.size(); i++) {
            System.out.println(provincias.get(i).getNombre());
        }

    }

    public static void ejercicio02() {
        //mostrar localidad (provincia)
        for (Provincia p : provincias) {
            for (Localidad loc : p.getLocalidades()) {
                System.out.println(loc.getNombre());
            }
        }

    }

    public static void ejercicio03() {
        //Número de habitantes por provincia
        int suma_provincia;
        for (Provincia p : provincias) {
            suma_provincia = 0;
            for (Localidad loc : p.getLocalidades()) {
                suma_provincia = suma_provincia + loc.getHabitantes();
            }
            System.out.println(suma_provincia);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        rellenarDatos();
        //ejercicio01();
        //ejercicio02();
         ejercicio03();

    }

}

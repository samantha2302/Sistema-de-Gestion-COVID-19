import Area.AreaSalud;
import Persona.Contacto;
import Persona.Paciente;
import PruebaCovid.OrdenSanitaria;
import PruebaCovid.Prueba;
import PruebaCovid.Sintoma;

public class PruebaDatosQuemados {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //REGISTRO DE AREAS DE SALUD
        System.out.println("________________________AREAS DE SALUD AGREGADAS_________________________________\n");
        AreaSalud area1 = new AreaSalud(1,"DRRS Huetar Norte","JUan Carlos Jimenez",
                24600571,"huetarnortems@ice.co.cr",
                "100 metros Norte y 50 metros Este del Hospital de San Carlos", "San Carlos, Los Chiles, Guatuso");
        area1.registrarAreaSalud(area1);

        AreaSalud area2 = new AreaSalud(2,"DARS Aguas Zarcas","Dionisio Sibaja",
                24742333,"dionisio.sibaja@misalud.go.cr",
                "150 metros  Sur del Banco Costa Rica.","Aguas Zarcas, Venecia, Pital");
        area2.registrarAreaSalud(area2);

        AreaSalud area3 = new AreaSalud(3,"DARS Ciudad Quesada","Dra. María del Milagro Picado Cartín",
                24602316,"milagro.picado@misalud.go.cr",
                "De la Gasolinera Meco, 100 metros Oeste, 150 metros  Sur y 25 metros Oeste Urbanizacion la Leyla","Ciudad Quesada, Buena Vista y La Palmera ");
        area3.registrarAreaSalud(area3);

        AreaSalud area4 = new AreaSalud(4,"DARS de Florencia","Dr. José Pablo Molina Velázquez",
                24757002,"jose.molina@misalud.go.cr",
                "Florencia, 50 metros Norte de la Bomba contiguo a Respuestos Joisa","Florencia, La Tigra, Monterrey, Venado, La Fortuna y Platanar");
        area4.registrarAreaSalud(area4);

        AreaSalud area5 = new AreaSalud(5,"DARS Guatuso","Dr.  Douglas Lanzoni Solano",
                24641065,"douglas.lanzoni@misalud.go.cr",
                "Guatuso, San Rafael centro, contiguo al Cen Cinai", "Guatuso, San Rafael, Catira, Buena Vista y Cote");
        area5.registrarAreaSalud(area5);

        AreaSalud area6 = new AreaSalud(6,"DARS Los Chiles","Dra. Claudia Rosales Galeano",
                24711314 ,"claudia.rosales@misalud.go.cr",
                "De la Delegación Policial de los Chiles, 700 metros Norte y 200 metros Oeste ", "Los Chiles, Caño Negro, El Amparo y San Jorge");
        area6.registrarAreaSalud(area6);

        AreaSalud area7 = new AreaSalud(7,"DARS Santa Rosa Pocosol","Dr. Geovanny Ureña Vargas",
                24777080,"geovanny.urena@misalud.go.cr",
                "150 metros  Norte de la Escuela de Santa Rosa Pocosol, calle al Salon Comunal", "Sta.Rosa Pocosol y Cutris");
        area7.registrarAreaSalud(area7);



        //System.out.println(area.toString());

        //AGREGAR PACIENTE
        System.out.println("______________________AGREGACION DE PACIENTE___________________________________\n");
        Paciente paciente= new Paciente(2811186, "Katherine", 20, 63689914, "kat@gamil","San Carlos","13/10/2021");
        PruebaCovid.Prueba prueba = new PruebaCovid.Prueba("RRR","15","8","Pancracio");
        Sintoma sintoma = new Sintoma("S","N","N","N","S","S","S",
                "S","N","N","N");
        area1.registrarPaciente1(sintoma, prueba , paciente);

        Paciente paciente1= new Paciente(7456789, "Ashley", 19, 68957431, "sammi@gamil","Fortuna","14/10/2021");
        PruebaCovid.Prueba prueba1 = new PruebaCovid.Prueba("Astra","16","9","Ronal");
        Sintoma  sintoma1 = new Sintoma("N","S","S","N","N","S","N",
                "S","N","S","S");
        area2.registrarPaciente2(sintoma1, prueba1 , paciente1);

        Paciente paciente2= new Paciente(6754356, "Mela", 19, 89745178, "mela@gamil","San Antonio","15/10/2021");
        PruebaCovid.Prueba prueba2 = new PruebaCovid.Prueba("FI","18","10","Guillermo");
        Sintoma  sintoma2 = new Sintoma("S","S","N","N","S","S","S",
                "N","S","S","N");
        area3.registrarPaciente3(sintoma2, prueba2 , paciente2);


        System.out.println(paciente);
        System.out.println(paciente1);
        System.out.println(paciente2);

        //MODIFICAR PACIENTE
        System.out.println("________________________PACIENTE MODIFICADO_________________________________\n");
        area1.modificarPaciente1(2811186,5490186,"Keity",16,74547816,"eity@gamil.com",
                "San Ramon");
        System.out.println(paciente);



        //AGREGAR DATO CONTACTO
        System.out.println("__________________________DATOS DEL CONTACTO AGREGADAS_______________________________\n");
        Contacto contacto = new Contacto(256874,"Sammy",19,87457896,"sam@gamil","Fortuna");
        Sintoma sintomaC1 = new Sintoma("N","N","S","N","N","S","S","N","S","N","N");
        paciente.guardarDatoContacto(sintomaC1,contacto);

        Contacto contacto1 = new Contacto(897645,"Nicole",18,64578987,"nico@gamil","San Carlos");
        Sintoma sintomaC2 = new Sintoma("S","N","S","N","S","N","S","N","S","N","S");
        paciente1.guardarDatoContacto(sintomaC2,contacto1);

        Contacto contacto2 = new Contacto(78564589,"Sandra",15,75894570,"sandra@gamil","San Jorge");
        Sintoma sintomaC3 = new Sintoma("N","S","N","S","N","S","N","S","N","S","N");
        paciente2.guardarDatoContacto(sintomaC3,contacto2);

        System.out.println(contacto);
        System.out.println(contacto1);
        System.out.println(contacto2);

        //MODIFICAR DATO CONTACTO
        System.out.println("________________________CONTACTO MODIFICADO_________________________________\n");
        paciente.modificarDatoContacto(256874,809540728,"Ashley",15,78945647,"ash@gmail.com","San Marcos");

        System.out.println(contacto);


        //AGREGAR ORDEN SANITARIA PACIENTE
        System.out.println("__________________________AGREGACION DE ORDENES SANITARIAS PACIENTES_______________________________\n");
        OrdenSanitaria orden = new OrdenSanitaria(2811186,"Katherine",1,"14/03/2020","18/05/2021","Covid","Regelio");
        area1.agregarOrdenSanitariaPaciente1(orden);

        OrdenSanitaria orden1 = new OrdenSanitaria(7456789,"Ashley",2,"15/03/2020","10/05/2021","Covid","Gustavo");
        area2.agregarOrdenSanitariaPaciente2(orden1);

        OrdenSanitaria orden2 = new OrdenSanitaria(78564589,"Mela",3,"20/03/2020","03/05/2021","Covid","Alejandria");
        area3.agregarOrdenSanitariaPaciente3(orden2);

        System.out.println(orden);
        System.out.println(orden1);
        System.out.println(orden2);

        //MODIFICAR ORDEN SANITARIA PACIENTE
        area1.modificarOrdenSanitariaPaciente1(1,2811186,"Katherine",2,"17/03/2020","20/04/2020","COVID-19", "Orozco");
        System.out.println(orden);

        System.out.println("__________________________________");
        System.out.println(area3.getListaPacientes1());

        //AGREGAR ORDEN  SANITARIA PACIENTE
        System.out.println("_________________AGREGACION DE ORDEN SANITARIA CONTACTOS_________________");
        OrdenSanitaria ordenC = new OrdenSanitaria(256874,"Sammy",4,"17/05/2021","20/05/2021","COVID-19","Sarguedo");
        area1.agregarOrdenSanitariaContacto1(ordenC);


        //MOSTRAR LOS DATOS DE UN PACIENTE ESPECIFICO
        System.out.println("___________________________MOSTRAR DATOS DE UN CONTACTO_________________________");
        area1.imprimirPaciente1(5490186);
        area2.imprimirPaciente1(7456789);


        System.out.println("____________________________MOSTRAR CANTIDAD DE PACIENTES Y CONTACTOS POSITIVOS___________________");
        area1.personaCasosPositivos1(area1);

    }
}


import Persona.*;
import PruebaCovid.*;
import Area.*;

import java.util.Scanner;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //REGISTRO DE AREAS DE SALUD
        //Se registraron las areas de primero.
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

        AreaSalud area8 = new AreaSalud(8,"Unidad de Atención al Cliente","Lic. Jenory Fernández Peraza",
                24600571,"jenory.fernandez@misalud.go.cr",
                "100metros Norte y 50 metros  Este del Hospital de San Carlos", "San Carlos, Los Chiles y Guatuso");
        area8.registrarAreaSalud(area8);


        boolean salir = false;
        int opcion;
        Scanner sc = new Scanner(System.in);
        /*Bucle que permite repetir el menu*/
        while (!salir) {
            System.out.println("\n Sistema de Gestion de Ordenes Sanitarias para COVID-19 \n");
            System.out.println("-------------------------------------------------------------");
            System.out.print(" Opciones de Menu\n");
            System.out.println("1. San Carlos, Los Chiles y Guatuso.");
            System.out.println("2. Aguas Zarcas, Venecia y Pital.");
            System.out.println("3. Ciudad Quesada, Buena Vista y La Palmera.");
            System.out.println("4. Florencia, La Tigra, Monterrey, Venado, La Fortuna y Platanar.");
            System.out.println("5. Guatuso, San Rafael, Katira, Buena Vista y Cote.");
            System.out.println("6. Los Chiles, Caño Negro, El Amparo y San Jorge.");
            System.out.println("7. Santa Rosa Pocosol, Cutris.");
            System.out.println("8. Generar reportes.");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            /*Switch con cada uno de los casos para las diferentes opciones del menu*/
            switch (opcion) {
                case 1:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("San Carlos, Los Chiles y Guatuso.");
                    int opcion1;
                    System.out.println("1. Paciente.");
                    System.out.println("3. Orden Sanitaria.");
                    System.out.println("3. Generar reportes.");
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion1 = sc.nextInt();
                    if (opcion1 == 1) {
                        int opcion2;
                        System.out.println("1. Registrar paciente.");
                        System.out.println("2. Modificar paciente.");
                        System.out.println("3. Agregar datos de contacto.");
                        System.out.println("4. Modificar datos de contacto.");
                        System.out.println("5. Generar reporte.");
                        System.out.println("Ingrese la opcion que desea: ");
                        opcion2 = sc.nextInt();
                        if (opcion2 == 1) {
                            int cedula;
                            String nombrePaciente;
                            int edad;
                            String fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular,
                                    dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta;
                            String lugarResidencia;
                            int telefonoPaciente;
                            String correoEPaciente;
                            String tipo, fecha, hora, nombrePersona;
                            String fechaSintomaPaciente;
                            System.out.println("Ingrese la cedula: ");
                            cedula = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombrePaciente = sc.next();
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico: ");
                            telefonoPaciente = sc.nextInt();
                            System.out.println("Ingrese el correo electronico: ");
                            correoEPaciente = sc.next();
                            System.out.println("Ingrese el lugar de residencia: ");
                            lugarResidencia = sc.next();
                            System.out.println("Ingrese la fecha de los sintomas: ");
                            fechaSintomaPaciente = sc.next();
                            System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                            System.out.println("Fiebre: ");
                            fiebre = sc.next();
                            System.out.println("Escalofrios: ");
                            escalofrios = sc.next();
                            System.out.println("Tos: ");
                            tos = sc.next();
                            System.out.println("Dificultad respiratoria: ");
                            difiRespiratoria = sc.next();
                            System.out.println("Fatiga: ");
                            fatiga = sc.next();
                            System.out.println("Dolor muscular: ");
                            dolorMuscular = sc.next();
                            System.out.println("Dolor corporal: ");
                            dolorCorporal = sc.next();
                            System.out.println("Dolor de cabeza: ");
                            dolorCabeza = sc.next();
                            System.out.println("Perdida de olfato: ");
                            perdOlfato = sc.next();
                            System.out.println("Perdida del gusto: ");
                            perdGusto = sc.next();
                            System.out.println("Dolor de garganta: ");
                            dolorGarganta = sc.next();
                            System.out.println("Prueba Aplicada");
                            System.out.println("Tipo: ");
                            tipo = sc.next();
                            System.out.println("Fecha: ");
                            fecha = sc.next();
                            System.out.println("Hora: ");
                            hora = sc.next();
                            System.out.println("Nombre de la persona que se la aplico: ");
                            nombrePersona = sc.next();

                            Paciente paciente = new Paciente(cedula, nombrePaciente, edad, telefonoPaciente, correoEPaciente, lugarResidencia, fechaSintomaPaciente);
                            Sintoma sintoma = new Sintoma(fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular, dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta);
                            PruebaCovid.Prueba prueba = new PruebaCovid.Prueba(tipo, fecha, hora, nombrePersona);
                            AreaSalud areaSalud = new AreaSalud();
                            areaSalud.registrarPaciente1(sintoma, prueba, paciente);
                        }
                        if (opcion2 == 2) {
                            int idPaciente;
                            int cedulaNueva;
                            String nombrePacienteNuevo;
                            int edadNueva;
                            int telefonoPacienteNuevo;
                            String correoEPacienteNuevo;
                            String lugarResidenciaNueva;
                            System.out.println("Ingrese la cedula: ");
                            idPaciente = sc.nextInt();
                            System.out.println("Ingrese la cedula modificada: ");
                            cedulaNueva = sc.nextInt();
                            System.out.println("Ingrese el nombre modificado: ");
                            nombrePacienteNuevo = sc.next();
                            System.out.println("Ingrese la edad modificada: ");
                            edadNueva = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico modificado: ");
                            telefonoPacienteNuevo = sc.nextInt();
                            System.out.println("Ingrese el correo electronico modificado: ");
                            correoEPacienteNuevo = sc.next();
                            System.out.println("Ingrese el lugar de residencia modificado: ");
                            lugarResidenciaNueva = sc.next();
                            AreaSalud areaSalud1 = new AreaSalud();
                            areaSalud1.modificarPaciente1(idPaciente, cedulaNueva, nombrePacienteNuevo, edadNueva, telefonoPacienteNuevo, correoEPacienteNuevo, lugarResidenciaNueva);
                        }
                        if (opcion2 == 3) {
                            AreaSalud areaSalud2 = new AreaSalud();
                            int idPaciente1;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente1 = sc.nextInt();
                            String fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC,
                                    dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC;
                            int cedulaContacto, edadContacto, telefonoContacto;
                            String nombreContacto, correoEContacto, direccionContacto;
                            for (Paciente item : areaSalud2.getListaPacientes1()) {
                                if (item.getCedula() == idPaciente1) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedulaContacto = sc.nextInt();
                                    System.out.println("Ingrese el nombre del contacto: ");
                                    nombreContacto = sc.next();
                                    System.out.println("Ingrese la edad del contacto: ");
                                    edadContacto = sc.nextInt();
                                    System.out.println("Ingrese el telefono del contacto: ");
                                    telefonoContacto = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico del contacto: ");
                                    correoEContacto = sc.next();
                                    System.out.println("Ingrese la direccion del contacto: ");
                                    direccionContacto = sc.next();
                                    System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                                    System.out.println("Fiebre: ");
                                    fiebreC = sc.next();
                                    System.out.println("Escalofrios: ");
                                    escalofriosC = sc.next();
                                    System.out.println("Tos: ");
                                    tosC = sc.next();
                                    System.out.println("Dificultad respiratoria: ");
                                    difiRespiratoriaC = sc.next();
                                    System.out.println("Fatiga: ");
                                    fatigaC = sc.next();
                                    System.out.println("Dolor muscular: ");
                                    dolorMuscularC = sc.next();
                                    System.out.println("Dolor corporal: ");
                                    dolorCorporalC = sc.next();
                                    System.out.println("Dolor de cabeza: ");
                                    dolorCabezaC = sc.next();
                                    System.out.println("Perdida de olfato: ");
                                    perdOlfatoC = sc.next();
                                    System.out.println("Perdida del gusto: ");
                                    perdGustoC = sc.next();
                                    System.out.println("Dolor de garganta: ");
                                    dolorGargantaC = sc.next();
                                    Contacto contacto = new Contacto(cedulaContacto, nombreContacto, edadContacto, telefonoContacto, correoEContacto, direccionContacto);
                                    Sintoma sintoma = new Sintoma(fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC, dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC);
                                    item.guardarDatoContacto(sintoma, contacto);
                                }
                            }
                        }
                        if (opcion2 == 4) {
                            AreaSalud areaSalud3 = new AreaSalud();
                            int idPaciente2;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente2 = sc.nextInt();
                            int cedContacto;
                            int cedulaContactoN, edadContactoN, telefonoContactoN;
                            String nombreContactoN, correoEContactoN, direccionContactoN;
                            for (Paciente item1 : areaSalud3.getListaPacientes1()) {
                                if (item1.getCedula() == idPaciente2) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedContacto = sc.nextInt();
                                    System.out.println("Ingrese la cedula modificada del contacto: ");
                                    cedulaContactoN = sc.nextInt();
                                    System.out.println("Ingrese el nombre modificado del contacto: ");
                                    nombreContactoN = sc.next();
                                    System.out.println("Ingrese la edad modificada del contacto: ");
                                    edadContactoN = sc.nextInt();
                                    System.out.println("Ingrese el telefono modificado del contacto: ");
                                    telefonoContactoN = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico modificado del contacto: ");
                                    correoEContactoN = sc.next();
                                    System.out.println("Ingrese la direccion modificada del contacto: ");
                                    direccionContactoN = sc.next();
                                    item1.modificarDatoContacto(cedContacto, cedulaContactoN, nombreContactoN, edadContactoN, telefonoContactoN, correoEContactoN, direccionContactoN);
                                }
                            }
                        }
                        if (opcion2 == 5) {
                            int idpaciente;
                            System.out.println("Reporte.");
                            System.out.println("Ingrese el id del paciente: ");
                            idpaciente = sc.nextInt();
                            area1.imprimirPaciente1(idpaciente);
                        }
                    }
                    if(opcion1 == 2){
                        int opcion11;
                        System.out.println("1. Agregar orden sanitaria para paciente.");
                        System.out.println("2. Agregar orden sanitaria para contacto.");
                        System.out.println("Ingrese una opcion: ");
                        opcion11 = sc.nextInt();
                        if (opcion11 == 1){
                            AreaSalud areaP =new AreaSalud();
                            int idPersonaOrden, idOrden;
                            String nombrePersonaOrde, fechaInicialOP, fechaFinalOP,motivoOP, nombreFuncionarioOP;

                            System.out.println("Ingrese el Id del paciente a quien se le asignara la orden: ");
                            idPersonaOrden = sc.nextInt();
                            System.out.println("Ingrese el nombre del paciente a quien se le asignara la orden: ");
                            nombrePersonaOrde = sc.next();
                            System.out.println("Ingrese el Id de la Orden: ");
                            idOrden = sc.nextInt();
                            System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                            fechaInicialOP = sc.next();
                            System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                            fechaFinalOP = sc.next();
                            System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                            motivoOP = sc.next();
                            System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                            nombreFuncionarioOP = sc.next();

                            OrdenSanitaria ordenPaciente = new OrdenSanitaria(idPersonaOrden,nombrePersonaOrde,idOrden,
                                    fechaInicialOP,fechaFinalOP,motivoOP,nombreFuncionarioOP);
                            areaP.agregarOrdenSanitariaPaciente1(ordenPaciente);
                        }
                        if (opcion11 == 2){
                            int numero;
                            String respuesta;
                            System.out.println("Ingrese la cantidad de sintomas que tiene el contacto: ");
                            numero = sc.nextInt();
                            System.out.println("Tiene el esquema de vacunación completo? Digite 'S' para si o 'N' caso contrario:");
                            respuesta = sc.next();
                            if(numero == 0 && respuesta.equalsIgnoreCase("S")){
                                System.out.println("El Contacto no tiene sintomas y tiene el esquema de vacunación completa, por lo tanto, no se le emite Orden Sanitaria");
                            }
                            if(numero < 5 && respuesta.equalsIgnoreCase("N")){
                                System.out.println("El Contacto no tiene sintomas y no tiene el esquema de vacunación completa, por lo tanto, dentro de 3 dias se le volvera a llamar");
                            }
                            if(numero >=5){
                                AreaSalud areaC =new AreaSalud();
                                int idPersonaOrdenC, idOrdenC;
                                String nombrePersonaOrdeC, fechaInicialOC, fechaFinalOC,motivoOC, nombreFuncionarioOC;


                                System.out.println("Ingrese el Id del contacto a quien se le asignara la orden: ");
                                idPersonaOrdenC = sc.nextInt();
                                System.out.println("Ingrese el nombre del contacto a quien se le asignara la orden: ");
                                nombrePersonaOrdeC = sc.next();
                                System.out.println("Ingrese el Id de la Orden: ");
                                idOrdenC = sc.nextInt();
                                System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                                fechaInicialOC = sc.next();
                                System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                                fechaFinalOC = sc.next();
                                System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                                motivoOC = sc.next();
                                System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                                nombreFuncionarioOC = sc.next();

                                OrdenSanitaria ordenContacto = new OrdenSanitaria(idPersonaOrdenC,nombrePersonaOrdeC,idOrdenC,
                                        fechaInicialOC,fechaFinalOC,motivoOC,nombreFuncionarioOC);

                                areaC.agregarOrdenSanitariaContacto1(ordenContacto);
                            }
                        }
                    }

                case 2:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Aguas Zarcas, Venecia y Pital.");
                    int opcion2;
                    System.out.println("1. Paciente.");
                    System.out.println("3. Orden Sanitaria.");
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion2 = sc.nextInt();
                    if (opcion2 == 1) {
                        int opcion3;
                        System.out.println("1. Registrar paciente.");
                        System.out.println("2. Modificar paciente.");
                        System.out.println("3. Agregar datos de contacto.");
                        System.out.println("4. Modificar datos de contacto.");
                        System.out.println("5. Generar reporte.");
                        System.out.println("Ingrese la opcion que desea: ");
                        opcion3 = sc.nextInt();
                        if (opcion3 == 1) {
                            int cedula;
                            String nombrePaciente;
                            int edad;
                            String fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular,
                                    dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta;
                            String lugarResidencia;
                            int telefonoPaciente;
                            String correoEPaciente;
                            String tipo, fecha, hora, nombrePersona;
                            String fechaSintomaPaciente;
                            System.out.println("Ingrese la cedula: ");
                            cedula = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombrePaciente = sc.next();
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico: ");
                            telefonoPaciente = sc.nextInt();
                            System.out.println("Ingrese el correo electronico: ");
                            correoEPaciente = sc.next();
                            System.out.println("Ingrese el lugar de residencia: ");
                            lugarResidencia = sc.next();
                            System.out.println("Ingrese la fecha de los sintomas: ");
                            fechaSintomaPaciente = sc.next();
                            System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                            System.out.println("Fiebre: ");
                            fiebre = sc.next();
                            System.out.println("Escalofrios: ");
                            escalofrios = sc.next();
                            System.out.println("Tos: ");
                            tos = sc.next();
                            System.out.println("Dificultad respiratoria: ");
                            difiRespiratoria = sc.next();
                            System.out.println("Fatiga: ");
                            fatiga = sc.next();
                            System.out.println("Dolor muscular: ");
                            dolorMuscular = sc.next();
                            System.out.println("Dolor corporal: ");
                            dolorCorporal = sc.next();
                            System.out.println("Dolor de cabeza: ");
                            dolorCabeza = sc.next();
                            System.out.println("Perdida de olfato: ");
                            perdOlfato = sc.next();
                            System.out.println("Perdida del gusto: ");
                            perdGusto = sc.next();
                            System.out.println("Dolor de garganta: ");
                            dolorGarganta = sc.next();
                            System.out.println("Prueba Aplicada");
                            System.out.println("Tipo: ");
                            tipo = sc.next();
                            System.out.println("Fecha: ");
                            fecha = sc.next();
                            System.out.println("Hora: ");
                            hora = sc.next();
                            System.out.println("Nombre de la persona que se la aplico: ");
                            nombrePersona = sc.next();

                            Paciente paciente = new Paciente(cedula, nombrePaciente, edad, telefonoPaciente, correoEPaciente, lugarResidencia, fechaSintomaPaciente);
                            Sintoma sintoma = new Sintoma(fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular, dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta);
                            PruebaCovid.Prueba prueba = new PruebaCovid.Prueba(tipo, fecha, hora, nombrePersona);
                            AreaSalud areaSalud = new AreaSalud();
                            areaSalud.registrarPaciente2(sintoma, prueba, paciente);
                        }
                        if (opcion3 == 2) {
                            int idPaciente;
                            int cedulaNueva;
                            String nombrePacienteNuevo;
                            int edadNueva;
                            int telefonoPacienteNuevo;
                            String correoEPacienteNuevo;
                            String lugarResidenciaNueva;
                            System.out.println("Ingrese la cedula: ");
                            idPaciente = sc.nextInt();
                            System.out.println("Ingrese la cedula modificada: ");
                            cedulaNueva = sc.nextInt();
                            System.out.println("Ingrese el nombre modificado: ");
                            nombrePacienteNuevo = sc.next();
                            System.out.println("Ingrese la edad modificada: ");
                            edadNueva = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico modificado: ");
                            telefonoPacienteNuevo = sc.nextInt();
                            System.out.println("Ingrese el correo electronico modificado: ");
                            correoEPacienteNuevo = sc.next();
                            System.out.println("Ingrese el lugar de residencia modificado: ");
                            lugarResidenciaNueva = sc.next();
                            AreaSalud areaSalud1 = new AreaSalud();
                            areaSalud1.modificarPaciente2(idPaciente, cedulaNueva, nombrePacienteNuevo, edadNueva, telefonoPacienteNuevo, correoEPacienteNuevo, lugarResidenciaNueva);
                        }
                        if (opcion3 == 3) {
                            AreaSalud areaSalud2 = new AreaSalud();
                            int idPaciente1;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente1 = sc.nextInt();
                            String fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC,
                                    dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC;
                            int cedulaContacto, edadContacto, telefonoContacto;
                            String nombreContacto, correoEContacto, direccionContacto;
                            for (Paciente item : areaSalud2.getListaPacientes2()) {
                                if (item.getCedula() == idPaciente1) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedulaContacto = sc.nextInt();
                                    System.out.println("Ingrese el nombre del contacto: ");
                                    nombreContacto = sc.next();
                                    System.out.println("Ingrese la edad del contacto: ");
                                    edadContacto = sc.nextInt();
                                    System.out.println("Ingrese el telefono del contacto: ");
                                    telefonoContacto = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico del contacto: ");
                                    correoEContacto = sc.next();
                                    System.out.println("Ingrese la direccion del contacto: ");
                                    direccionContacto = sc.next();
                                    System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                                    System.out.println("Fiebre: ");
                                    fiebreC = sc.next();
                                    System.out.println("Escalofrios: ");
                                    escalofriosC = sc.next();
                                    System.out.println("Tos: ");
                                    tosC = sc.next();
                                    System.out.println("Dificultad respiratoria: ");
                                    difiRespiratoriaC = sc.next();
                                    System.out.println("Fatiga: ");
                                    fatigaC = sc.next();
                                    System.out.println("Dolor muscular: ");
                                    dolorMuscularC = sc.next();
                                    System.out.println("Dolor corporal: ");
                                    dolorCorporalC = sc.next();
                                    System.out.println("Dolor de cabeza: ");
                                    dolorCabezaC = sc.next();
                                    System.out.println("Perdida de olfato: ");
                                    perdOlfatoC = sc.next();
                                    System.out.println("Perdida del gusto: ");
                                    perdGustoC = sc.next();
                                    System.out.println("Dolor de garganta: ");
                                    dolorGargantaC = sc.next();
                                    Contacto contacto = new Contacto(cedulaContacto, nombreContacto, edadContacto, telefonoContacto, correoEContacto, direccionContacto);
                                    Sintoma sintoma = new Sintoma(fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC, dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC);
                                    item.guardarDatoContacto(sintoma, contacto);
                                }
                            }
                        }
                        if (opcion3 == 4) {
                            AreaSalud areaSalud3 = new AreaSalud();
                            int idPaciente2;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente2 = sc.nextInt();
                            int cedContacto;
                            int cedulaContactoN, edadContactoN, telefonoContactoN;
                            String nombreContactoN, correoEContactoN, direccionContactoN;
                            for (Paciente item1 : areaSalud3.getListaPacientes2()) {
                                if (item1.getCedula() == idPaciente2) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedContacto = sc.nextInt();
                                    System.out.println("Ingrese la cedula modificada del contacto: ");
                                    cedulaContactoN = sc.nextInt();
                                    System.out.println("Ingrese el nombre modificado del contacto: ");
                                    nombreContactoN = sc.next();
                                    System.out.println("Ingrese la edad modificada del contacto: ");
                                    edadContactoN = sc.nextInt();
                                    System.out.println("Ingrese el telefono modificado del contacto: ");
                                    telefonoContactoN = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico modificado del contacto: ");
                                    correoEContactoN = sc.next();
                                    System.out.println("Ingrese la direccion modificada del contacto: ");
                                    direccionContactoN = sc.next();
                                    item1.modificarDatoContacto(cedContacto, cedulaContactoN, nombreContactoN, edadContactoN, telefonoContactoN, correoEContactoN, direccionContactoN);
                                }
                            }
                        }
                        if (opcion3 == 5) {
                            int idpaciente2;
                            System.out.println("Reporte.");
                            System.out.println("Ingrese el id del paciente: ");
                            idpaciente2 = sc.nextInt();
                            area2.imprimirPaciente2(idpaciente2);
                        }
                    }
                    if (opcion2 == 1){
                        int opcion11;
                        System.out.println("1. Agregar orden sanitaria para paciente.");
                        System.out.println("2. Agregar orden sanitaria para contacto.");
                        System.out.println("Ingrese una opcion: ");
                        opcion11 = sc.nextInt();
                        if (opcion11 == 1){
                            AreaSalud areaP =new AreaSalud();
                            int idPersonaOrden, idOrden;
                            String nombrePersonaOrde, fechaInicialOP, fechaFinalOP,motivoOP, nombreFuncionarioOP;

                            System.out.println("Ingrese el Id del paciente a quien se le asignara la orden: ");
                            idPersonaOrden = sc.nextInt();
                            System.out.println("Ingrese el nombre del paciente a quien se le asignara la orden: ");
                            nombrePersonaOrde = sc.next();
                            System.out.println("Ingrese el Id de la Orden: ");
                            idOrden = sc.nextInt();
                            System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                            fechaInicialOP = sc.next();
                            System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                            fechaFinalOP = sc.next();
                            System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                            motivoOP = sc.next();
                            System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                            nombreFuncionarioOP = sc.next();

                            OrdenSanitaria ordenPaciente = new OrdenSanitaria(idPersonaOrden,nombrePersonaOrde,idOrden,
                                    fechaInicialOP,fechaFinalOP,motivoOP,nombreFuncionarioOP);
                            areaP.agregarOrdenSanitariaPaciente2(ordenPaciente);
                        }
                        if (opcion11 == 2){
                            int numero;
                            String respuesta;
                            System.out.println("Ingrese la cantidad de sintomas que tiene el contacto: ");
                            numero = sc.nextInt();
                            System.out.println("Tiene el esquema de vacunación completo? Digite 'S' para si o 'N' caso contrario:");
                            respuesta = sc.next();
                            if(numero == 0 && respuesta.equalsIgnoreCase("S")){
                                System.out.println("El Contacto no tiene sintomas y tiene el esquema de vacunación completa, por lo tanto, no se le emite Orden Sanitaria");
                            }
                            if(numero < 5 && respuesta.equalsIgnoreCase("N")){
                                System.out.println("El Contacto no tiene sintomas y no tiene el esquema de vacunación completa, por lo tanto, dentro de 3 dias se le volvera a llamar");
                            }
                            if(numero >=5){
                                AreaSalud areaC =new AreaSalud();
                                int idPersonaOrdenC, idOrdenC;
                                String nombrePersonaOrdeC, fechaInicialOC, fechaFinalOC,motivoOC, nombreFuncionarioOC;


                                System.out.println("Ingrese el Id del contacto a quien se le asignara la orden: ");
                                idPersonaOrdenC = sc.nextInt();
                                System.out.println("Ingrese el nombre del contacto a quien se le asignara la orden: ");
                                nombrePersonaOrdeC = sc.next();
                                System.out.println("Ingrese el Id de la Orden: ");
                                idOrdenC = sc.nextInt();
                                System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                                fechaInicialOC = sc.next();
                                System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                                fechaFinalOC = sc.next();
                                System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                                motivoOC = sc.next();
                                System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                                nombreFuncionarioOC = sc.next();

                                OrdenSanitaria ordenContacto = new OrdenSanitaria(idPersonaOrdenC,nombrePersonaOrdeC,idOrdenC,
                                        fechaInicialOC,fechaFinalOC,motivoOC,nombreFuncionarioOC);

                                areaC.agregarOrdenSanitariaContacto2(ordenContacto);
                            }
                        }
                    }
                case 3:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Ciudad Quesada, Buena Vista y La Palmera.");
                    int opcion3;
                    System.out.println("1. Paciente.");
                    System.out.println("3. Orden Sanitaria.");
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion3 = sc.nextInt();
                    if (opcion3 == 1) {
                        int opcion4;
                        System.out.println("1. Registrar paciente.");
                        System.out.println("2. Modificar paciente.");
                        System.out.println("3. Agregar datos de contacto.");
                        System.out.println("4. Modificar datos de contacto.");
                        System.out.println("5. Generar reporte.");
                        System.out.println("Ingrese la opcion que desea: ");
                        opcion4 = sc.nextInt();
                        if (opcion4 == 1) {
                            int cedula;
                            String nombrePaciente;
                            int edad;
                            String fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular,
                                    dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta;
                            String lugarResidencia;
                            int telefonoPaciente;
                            String correoEPaciente;
                            String tipo, fecha, hora, nombrePersona;
                            String fechaSintomaPaciente;
                            System.out.println("Ingrese la cedula: ");
                            cedula = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombrePaciente = sc.next();
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico: ");
                            telefonoPaciente = sc.nextInt();
                            System.out.println("Ingrese el correo electronico: ");
                            correoEPaciente = sc.next();
                            System.out.println("Ingrese el lugar de residencia: ");
                            lugarResidencia = sc.next();
                            System.out.println("Ingrese la fecha de los sintomas: ");
                            fechaSintomaPaciente = sc.next();
                            System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                            System.out.println("Fiebre: ");
                            fiebre = sc.next();
                            System.out.println("Escalofrios: ");
                            escalofrios = sc.next();
                            System.out.println("Tos: ");
                            tos = sc.next();
                            System.out.println("Dificultad respiratoria: ");
                            difiRespiratoria = sc.next();
                            System.out.println("Fatiga: ");
                            fatiga = sc.next();
                            System.out.println("Dolor muscular: ");
                            dolorMuscular = sc.next();
                            System.out.println("Dolor corporal: ");
                            dolorCorporal = sc.next();
                            System.out.println("Dolor de cabeza: ");
                            dolorCabeza = sc.next();
                            System.out.println("Perdida de olfato: ");
                            perdOlfato = sc.next();
                            System.out.println("Perdida del gusto: ");
                            perdGusto = sc.next();
                            System.out.println("Dolor de garganta: ");
                            dolorGarganta = sc.next();
                            System.out.println("Prueba Aplicada");
                            System.out.println("Tipo: ");
                            tipo = sc.next();
                            System.out.println("Fecha: ");
                            fecha = sc.next();
                            System.out.println("Hora: ");
                            hora = sc.next();
                            System.out.println("Nombre de la persona que se la aplico: ");
                            nombrePersona = sc.next();

                            Paciente paciente = new Paciente(cedula, nombrePaciente, edad, telefonoPaciente, correoEPaciente, lugarResidencia, fechaSintomaPaciente);
                            Sintoma sintoma = new Sintoma(fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular, dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta);
                            PruebaCovid.Prueba prueba = new PruebaCovid.Prueba(tipo, fecha, hora, nombrePersona);
                            AreaSalud areaSalud = new AreaSalud();
                            areaSalud.registrarPaciente3(sintoma, prueba, paciente);
                        }
                        if (opcion4 == 2) {
                            int idPaciente;
                            int cedulaNueva;
                            String nombrePacienteNuevo;
                            int edadNueva;
                            int telefonoPacienteNuevo;
                            String correoEPacienteNuevo;
                            String lugarResidenciaNueva;
                            System.out.println("Ingrese la cedula: ");
                            idPaciente = sc.nextInt();
                            System.out.println("Ingrese la cedula modificada: ");
                            cedulaNueva = sc.nextInt();
                            System.out.println("Ingrese el nombre modificado: ");
                            nombrePacienteNuevo = sc.next();
                            System.out.println("Ingrese la edad modificada: ");
                            edadNueva = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico modificado: ");
                            telefonoPacienteNuevo = sc.nextInt();
                            System.out.println("Ingrese el correo electronico modificado: ");
                            correoEPacienteNuevo = sc.next();
                            System.out.println("Ingrese el lugar de residencia modificado: ");
                            lugarResidenciaNueva = sc.next();
                            AreaSalud areaSalud1 = new AreaSalud();
                            areaSalud1.modificarPaciente3(idPaciente, cedulaNueva, nombrePacienteNuevo, edadNueva, telefonoPacienteNuevo, correoEPacienteNuevo, lugarResidenciaNueva);
                        }
                        if (opcion4 == 3) {
                            AreaSalud areaSalud2 = new AreaSalud();
                            int idPaciente1;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente1 = sc.nextInt();
                            String fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC,
                                    dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC;
                            int cedulaContacto, edadContacto, telefonoContacto;
                            String nombreContacto, correoEContacto, direccionContacto;
                            for (Paciente item : areaSalud2.getListaPacientes3()) {
                                if (item.getCedula() == idPaciente1) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedulaContacto = sc.nextInt();
                                    System.out.println("Ingrese el nombre del contacto: ");
                                    nombreContacto = sc.next();
                                    System.out.println("Ingrese la edad del contacto: ");
                                    edadContacto = sc.nextInt();
                                    System.out.println("Ingrese el telefono del contacto: ");
                                    telefonoContacto = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico del contacto: ");
                                    correoEContacto = sc.next();
                                    System.out.println("Ingrese la direccion del contacto: ");
                                    direccionContacto = sc.next();
                                    System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                                    System.out.println("Fiebre: ");
                                    fiebreC = sc.next();
                                    System.out.println("Escalofrios: ");
                                    escalofriosC = sc.next();
                                    System.out.println("Tos: ");
                                    tosC = sc.next();
                                    System.out.println("Dificultad respiratoria: ");
                                    difiRespiratoriaC = sc.next();
                                    System.out.println("Fatiga: ");
                                    fatigaC = sc.next();
                                    System.out.println("Dolor muscular: ");
                                    dolorMuscularC = sc.next();
                                    System.out.println("Dolor corporal: ");
                                    dolorCorporalC = sc.next();
                                    System.out.println("Dolor de cabeza: ");
                                    dolorCabezaC = sc.next();
                                    System.out.println("Perdida de olfato: ");
                                    perdOlfatoC = sc.next();
                                    System.out.println("Perdida del gusto: ");
                                    perdGustoC = sc.next();
                                    System.out.println("Dolor de garganta: ");
                                    dolorGargantaC = sc.next();
                                    Contacto contacto = new Contacto(cedulaContacto, nombreContacto, edadContacto, telefonoContacto, correoEContacto, direccionContacto);
                                    Sintoma sintoma = new Sintoma(fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC, dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC);
                                    item.guardarDatoContacto(sintoma, contacto);
                                }
                            }
                        }
                        if (opcion4 == 4) {
                            AreaSalud areaSalud3 = new AreaSalud();
                            int idPaciente2;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente2 = sc.nextInt();
                            int cedContacto;
                            int cedulaContactoN, edadContactoN, telefonoContactoN;
                            String nombreContactoN, correoEContactoN, direccionContactoN;
                            for (Paciente item1 : areaSalud3.getListaPacientes3()) {
                                if (item1.getCedula() == idPaciente2) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedContacto = sc.nextInt();
                                    System.out.println("Ingrese la cedula modificada del contacto: ");
                                    cedulaContactoN = sc.nextInt();
                                    System.out.println("Ingrese el nombre modificado del contacto: ");
                                    nombreContactoN = sc.next();
                                    System.out.println("Ingrese la edad modificada del contacto: ");
                                    edadContactoN = sc.nextInt();
                                    System.out.println("Ingrese el telefono modificado del contacto: ");
                                    telefonoContactoN = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico modificado del contacto: ");
                                    correoEContactoN = sc.next();
                                    System.out.println("Ingrese la direccion modificada del contacto: ");
                                    direccionContactoN = sc.next();
                                    item1.modificarDatoContacto(cedContacto, cedulaContactoN, nombreContactoN, edadContactoN, telefonoContactoN, correoEContactoN, direccionContactoN);
                                }
                            }
                        }
                        if (opcion4 == 5) {
                            int idpaciente3;
                            System.out.println("Reporte.");
                            System.out.println("Ingrese el id del paciente: ");
                            idpaciente3 = sc.nextInt();
                            area3.imprimirPaciente3(idpaciente3);

                        }
                    }
                    if (opcion3 == 2){
                        int opcion11;
                        System.out.println("1. Agregar orden sanitaria para paciente.");
                        System.out.println("2. Agregar orden sanitaria para contacto.");
                        System.out.println("Ingrese una opcion: ");
                        opcion11 = sc.nextInt();
                        if (opcion11 == 1){
                            AreaSalud areaP =new AreaSalud();
                            int idPersonaOrden, idOrden;
                            String nombrePersonaOrde, fechaInicialOP, fechaFinalOP,motivoOP, nombreFuncionarioOP;

                            System.out.println("Ingrese el Id del paciente a quien se le asignara la orden: ");
                            idPersonaOrden = sc.nextInt();
                            System.out.println("Ingrese el nombre del paciente a quien se le asignara la orden: ");
                            nombrePersonaOrde = sc.next();
                            System.out.println("Ingrese el Id de la Orden: ");
                            idOrden = sc.nextInt();
                            System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                            fechaInicialOP = sc.next();
                            System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                            fechaFinalOP = sc.next();
                            System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                            motivoOP = sc.next();
                            System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                            nombreFuncionarioOP = sc.next();

                            OrdenSanitaria ordenPaciente = new OrdenSanitaria(idPersonaOrden,nombrePersonaOrde,idOrden,
                                    fechaInicialOP,fechaFinalOP,motivoOP,nombreFuncionarioOP);
                            areaP.agregarOrdenSanitariaPaciente3(ordenPaciente);
                        }
                        if (opcion11 == 2){
                            int numero;
                            String respuesta;
                            System.out.println("Ingrese la cantidad de sintomas que tiene el contacto: ");
                            numero = sc.nextInt();
                            System.out.println("Tiene el esquema de vacunación completo? Digite 'S' para si o 'N' caso contrario:");
                            respuesta = sc.next();
                            if(numero == 0 && respuesta.equalsIgnoreCase("S")){
                                System.out.println("El Contacto no tiene sintomas y tiene el esquema de vacunación completa, por lo tanto, no se le emite Orden Sanitaria");
                            }
                            if(numero < 5 && respuesta.equalsIgnoreCase("N")){
                                System.out.println("El Contacto no tiene sintomas y no tiene el esquema de vacunación completa, por lo tanto, dentro de 3 dias se le volvera a llamar");
                            }
                            if(numero >=5){
                                AreaSalud areaC =new AreaSalud();
                                int idPersonaOrdenC, idOrdenC;
                                String nombrePersonaOrdeC, fechaInicialOC, fechaFinalOC,motivoOC, nombreFuncionarioOC;


                                System.out.println("Ingrese el Id del contacto a quien se le asignara la orden: ");
                                idPersonaOrdenC = sc.nextInt();
                                System.out.println("Ingrese el nombre del contacto a quien se le asignara la orden: ");
                                nombrePersonaOrdeC = sc.next();
                                System.out.println("Ingrese el Id de la Orden: ");
                                idOrdenC = sc.nextInt();
                                System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                                fechaInicialOC = sc.next();
                                System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                                fechaFinalOC = sc.next();
                                System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                                motivoOC = sc.next();
                                System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                                nombreFuncionarioOC = sc.next();

                                OrdenSanitaria ordenContacto = new OrdenSanitaria(idPersonaOrdenC,nombrePersonaOrdeC,idOrdenC,
                                        fechaInicialOC,fechaFinalOC,motivoOC,nombreFuncionarioOC);

                                areaC.agregarOrdenSanitariaContacto3(ordenContacto);
                            }
                        }
                    }
                case 4:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Florencia, La Tigra, Monterrey, Venado, La Fortuna y Platanar.");
                    int opcion4;
                    System.out.println("1. Paciente.");
                    System.out.println("3. Orden Sanitaria.");
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion4 = sc.nextInt();
                    if (opcion4 == 1) {
                        int opcion5;
                        System.out.println("1. Registrar paciente.");
                        System.out.println("2. Modificar paciente.");
                        System.out.println("3. Agregar datos de contacto.");
                        System.out.println("4. Modificar datos de contacto.");
                        System.out.println("5. Generar reporte.");
                        System.out.println("Ingrese la opcion que desea: ");
                        opcion5 = sc.nextInt();
                        if (opcion5 == 1) {
                            int cedula;
                            String nombrePaciente;
                            int edad;
                            String fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular,
                                    dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta;
                            String lugarResidencia;
                            int telefonoPaciente;
                            String correoEPaciente;
                            String tipo, fecha, hora, nombrePersona;
                            String fechaSintomaPaciente;
                            System.out.println("Ingrese la cedula: ");
                            cedula = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombrePaciente = sc.next();
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico: ");
                            telefonoPaciente = sc.nextInt();
                            System.out.println("Ingrese el correo electronico: ");
                            correoEPaciente = sc.next();
                            System.out.println("Ingrese el lugar de residencia: ");
                            lugarResidencia = sc.next();
                            System.out.println("Ingrese la fecha de los sintomas: ");
                            fechaSintomaPaciente = sc.next();
                            System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                            System.out.println("Fiebre: ");
                            fiebre = sc.next();
                            System.out.println("Escalofrios: ");
                            escalofrios = sc.next();
                            System.out.println("Tos: ");
                            tos = sc.next();
                            System.out.println("Dificultad respiratoria: ");
                            difiRespiratoria = sc.next();
                            System.out.println("Fatiga: ");
                            fatiga = sc.next();
                            System.out.println("Dolor muscular: ");
                            dolorMuscular = sc.next();
                            System.out.println("Dolor corporal: ");
                            dolorCorporal = sc.next();
                            System.out.println("Dolor de cabeza: ");
                            dolorCabeza = sc.next();
                            System.out.println("Perdida de olfato: ");
                            perdOlfato = sc.next();
                            System.out.println("Perdida del gusto: ");
                            perdGusto = sc.next();
                            System.out.println("Dolor de garganta: ");
                            dolorGarganta = sc.next();
                            System.out.println("Prueba Aplicada");
                            System.out.println("Tipo: ");
                            tipo = sc.next();
                            System.out.println("Fecha: ");
                            fecha = sc.next();
                            System.out.println("Hora: ");
                            hora = sc.next();
                            System.out.println("Nombre de la persona que se la aplico: ");
                            nombrePersona = sc.next();

                            Paciente paciente = new Paciente(cedula, nombrePaciente, edad, telefonoPaciente, correoEPaciente, lugarResidencia, fechaSintomaPaciente);
                            Sintoma sintoma = new Sintoma(fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular, dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta);
                            PruebaCovid.Prueba prueba = new PruebaCovid.Prueba(tipo, fecha, hora, nombrePersona);
                            AreaSalud areaSalud = new AreaSalud();
                            areaSalud.registrarPaciente4(sintoma, prueba, paciente);
                        }
                        if (opcion5 == 2) {
                            int idPaciente;
                            int cedulaNueva;
                            String nombrePacienteNuevo;
                            int edadNueva;
                            int telefonoPacienteNuevo;
                            String correoEPacienteNuevo;
                            String lugarResidenciaNueva;
                            System.out.println("Ingrese la cedula: ");
                            idPaciente = sc.nextInt();
                            System.out.println("Ingrese la cedula modificada: ");
                            cedulaNueva = sc.nextInt();
                            System.out.println("Ingrese el nombre modificado: ");
                            nombrePacienteNuevo = sc.next();
                            System.out.println("Ingrese la edad modificada: ");
                            edadNueva = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico modificado: ");
                            telefonoPacienteNuevo = sc.nextInt();
                            System.out.println("Ingrese el correo electronico modificado: ");
                            correoEPacienteNuevo = sc.next();
                            System.out.println("Ingrese el lugar de residencia modificado: ");
                            lugarResidenciaNueva = sc.next();
                            AreaSalud areaSalud1 = new AreaSalud();
                            areaSalud1.modificarPaciente4(idPaciente, cedulaNueva, nombrePacienteNuevo, edadNueva, telefonoPacienteNuevo, correoEPacienteNuevo, lugarResidenciaNueva);
                        }
                        if (opcion5== 3) {
                            AreaSalud areaSalud2 = new AreaSalud();
                            int idPaciente1;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente1 = sc.nextInt();
                            String fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC,
                                    dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC;
                            int cedulaContacto, edadContacto, telefonoContacto;
                            String nombreContacto, correoEContacto, direccionContacto;
                            for (Paciente item : areaSalud2.getListaPacientes4()) {
                                if (item.getCedula() == idPaciente1) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedulaContacto = sc.nextInt();
                                    System.out.println("Ingrese el nombre del contacto: ");
                                    nombreContacto = sc.next();
                                    System.out.println("Ingrese la edad del contacto: ");
                                    edadContacto = sc.nextInt();
                                    System.out.println("Ingrese el telefono del contacto: ");
                                    telefonoContacto = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico del contacto: ");
                                    correoEContacto = sc.next();
                                    System.out.println("Ingrese la direccion del contacto: ");
                                    direccionContacto = sc.next();
                                    System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                                    System.out.println("Fiebre: ");
                                    fiebreC = sc.next();
                                    System.out.println("Escalofrios: ");
                                    escalofriosC = sc.next();
                                    System.out.println("Tos: ");
                                    tosC = sc.next();
                                    System.out.println("Dificultad respiratoria: ");
                                    difiRespiratoriaC = sc.next();
                                    System.out.println("Fatiga: ");
                                    fatigaC = sc.next();
                                    System.out.println("Dolor muscular: ");
                                    dolorMuscularC = sc.next();
                                    System.out.println("Dolor corporal: ");
                                    dolorCorporalC = sc.next();
                                    System.out.println("Dolor de cabeza: ");
                                    dolorCabezaC = sc.next();
                                    System.out.println("Perdida de olfato: ");
                                    perdOlfatoC = sc.next();
                                    System.out.println("Perdida del gusto: ");
                                    perdGustoC = sc.next();
                                    System.out.println("Dolor de garganta: ");
                                    dolorGargantaC = sc.next();
                                    Contacto contacto = new Contacto(cedulaContacto, nombreContacto, edadContacto, telefonoContacto, correoEContacto, direccionContacto);
                                    Sintoma sintoma = new Sintoma(fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC, dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC);
                                    item.guardarDatoContacto(sintoma, contacto);
                                }
                            }
                        }
                        if (opcion5== 4) {
                            AreaSalud areaSalud3 = new AreaSalud();
                            int idPaciente2;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente2 = sc.nextInt();
                            int cedContacto;
                            int cedulaContactoN, edadContactoN, telefonoContactoN;
                            String nombreContactoN, correoEContactoN, direccionContactoN;
                            for (Paciente item1 : areaSalud3.getListaPacientes4()) {
                                if (item1.getCedula() == idPaciente2) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedContacto = sc.nextInt();
                                    System.out.println("Ingrese la cedula modificada del contacto: ");
                                    cedulaContactoN = sc.nextInt();
                                    System.out.println("Ingrese el nombre modificado del contacto: ");
                                    nombreContactoN = sc.next();
                                    System.out.println("Ingrese la edad modificada del contacto: ");
                                    edadContactoN = sc.nextInt();
                                    System.out.println("Ingrese el telefono modificado del contacto: ");
                                    telefonoContactoN = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico modificado del contacto: ");
                                    correoEContactoN = sc.next();
                                    System.out.println("Ingrese la direccion modificada del contacto: ");
                                    direccionContactoN = sc.next();
                                    item1.modificarDatoContacto(cedContacto, cedulaContactoN, nombreContactoN, edadContactoN, telefonoContactoN, correoEContactoN, direccionContactoN);
                                }
                            }
                        }
                        if (opcion5 == 5) {
                            int idpaciente4;
                            System.out.println("Reporte.");
                            System.out.println("Ingrese el id del paciente: ");
                            idpaciente4 = sc.nextInt();
                            area4.imprimirPaciente4(idpaciente4);
                        }
                    }
                    if (opcion4 == 2){
                        int opcion11;
                        System.out.println("1. Agregar orden sanitaria para paciente.");
                        System.out.println("2. Agregar orden sanitaria para contacto.");
                        System.out.println("Ingrese una opcion: ");
                        opcion11 = sc.nextInt();
                        if (opcion11 == 1){
                            AreaSalud areaP =new AreaSalud();
                            int idPersonaOrden, idOrden;
                            String nombrePersonaOrde, fechaInicialOP, fechaFinalOP,motivoOP, nombreFuncionarioOP;

                            System.out.println("Ingrese el Id del paciente a quien se le asignara la orden: ");
                            idPersonaOrden = sc.nextInt();
                            System.out.println("Ingrese el nombre del paciente a quien se le asignara la orden: ");
                            nombrePersonaOrde = sc.next();
                            System.out.println("Ingrese el Id de la Orden: ");
                            idOrden = sc.nextInt();
                            System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                            fechaInicialOP = sc.next();
                            System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                            fechaFinalOP = sc.next();
                            System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                            motivoOP = sc.next();
                            System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                            nombreFuncionarioOP = sc.next();

                            OrdenSanitaria ordenPaciente = new OrdenSanitaria(idPersonaOrden,nombrePersonaOrde,idOrden,
                                    fechaInicialOP,fechaFinalOP,motivoOP,nombreFuncionarioOP);
                            areaP.agregarOrdenSanitariaPaciente4(ordenPaciente);
                        }
                        if (opcion11 == 2){
                            int numero;
                            String respuesta;
                            System.out.println("Ingrese la cantidad de sintomas que tiene el contacto: ");
                            numero = sc.nextInt();
                            System.out.println("Tiene el esquema de vacunación completo? Digite 'S' para si o 'N' caso contrario:");
                            respuesta = sc.next();
                            if(numero == 0 && respuesta.equalsIgnoreCase("S")){
                                System.out.println("El Contacto no tiene sintomas y tiene el esquema de vacunación completa, por lo tanto, no se le emite Orden Sanitaria");
                            }
                            if(numero < 5 && respuesta.equalsIgnoreCase("N")){
                                System.out.println("El Contacto no tiene sintomas y no tiene el esquema de vacunación completa, por lo tanto, dentro de 3 dias se le volvera a llamar");
                            }
                            if(numero >=5){
                                AreaSalud areaC =new AreaSalud();
                                int idPersonaOrdenC, idOrdenC;
                                String nombrePersonaOrdeC, fechaInicialOC, fechaFinalOC,motivoOC, nombreFuncionarioOC;


                                System.out.println("Ingrese el Id del contacto a quien se le asignara la orden: ");
                                idPersonaOrdenC = sc.nextInt();
                                System.out.println("Ingrese el nombre del contacto a quien se le asignara la orden: ");
                                nombrePersonaOrdeC = sc.next();
                                System.out.println("Ingrese el Id de la Orden: ");
                                idOrdenC = sc.nextInt();
                                System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                                fechaInicialOC = sc.next();
                                System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                                fechaFinalOC = sc.next();
                                System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                                motivoOC = sc.next();
                                System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                                nombreFuncionarioOC = sc.next();

                                OrdenSanitaria ordenContacto = new OrdenSanitaria(idPersonaOrdenC,nombrePersonaOrdeC,idOrdenC,
                                        fechaInicialOC,fechaFinalOC,motivoOC,nombreFuncionarioOC);

                                areaC.agregarOrdenSanitariaContacto4(ordenContacto);
                            }
                        }
                    }
                case 5:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Guatuso, San Rafael, Katira, Buena Vista y Cote.");
                    int opcion5;
                    System.out.println("1. Paciente.");
                    System.out.println("3. Orden Sanitaria.");
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion5 = sc.nextInt();
                    if (opcion5 == 1) {
                        int opcion6;
                        System.out.println("1. Registrar paciente.");
                        System.out.println("2. Modificar paciente.");
                        System.out.println("3. Agregar datos de contacto.");
                        System.out.println("4. Modificar datos de contacto.");
                        System.out.println("5. Generar reporte.");
                        System.out.println("Ingrese la opcion que desea: ");
                        opcion6 = sc.nextInt();
                        if (opcion6 == 1) {
                            int cedula;
                            String nombrePaciente;
                            int edad;
                            String fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular,
                                    dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta;
                            String lugarResidencia;
                            int telefonoPaciente;
                            String correoEPaciente;
                            String tipo, fecha, hora, nombrePersona;
                            String fechaSintomaPaciente;
                            System.out.println("Ingrese la cedula: ");
                            cedula = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombrePaciente = sc.next();
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico: ");
                            telefonoPaciente = sc.nextInt();
                            System.out.println("Ingrese el correo electronico: ");
                            correoEPaciente = sc.next();
                            System.out.println("Ingrese el lugar de residencia: ");
                            lugarResidencia = sc.next();
                            System.out.println("Ingrese la fecha de los sintomas: ");
                            fechaSintomaPaciente = sc.next();
                            System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                            System.out.println("Fiebre: ");
                            fiebre = sc.next();
                            System.out.println("Escalofrios: ");
                            escalofrios = sc.next();
                            System.out.println("Tos: ");
                            tos = sc.next();
                            System.out.println("Dificultad respiratoria: ");
                            difiRespiratoria = sc.next();
                            System.out.println("Fatiga: ");
                            fatiga = sc.next();
                            System.out.println("Dolor muscular: ");
                            dolorMuscular = sc.next();
                            System.out.println("Dolor corporal: ");
                            dolorCorporal = sc.next();
                            System.out.println("Dolor de cabeza: ");
                            dolorCabeza = sc.next();
                            System.out.println("Perdida de olfato: ");
                            perdOlfato = sc.next();
                            System.out.println("Perdida del gusto: ");
                            perdGusto = sc.next();
                            System.out.println("Dolor de garganta: ");
                            dolorGarganta = sc.next();
                            System.out.println("Prueba Aplicada");
                            System.out.println("Tipo: ");
                            tipo = sc.next();
                            System.out.println("Fecha: ");
                            fecha = sc.next();
                            System.out.println("Hora: ");
                            hora = sc.next();
                            System.out.println("Nombre de la persona que se la aplico: ");
                            nombrePersona = sc.next();

                            Paciente paciente = new Paciente(cedula, nombrePaciente, edad, telefonoPaciente, correoEPaciente, lugarResidencia, fechaSintomaPaciente);
                            Sintoma sintoma = new Sintoma(fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular, dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta);
                            PruebaCovid.Prueba prueba = new PruebaCovid.Prueba(tipo, fecha, hora, nombrePersona);
                            AreaSalud areaSalud = new AreaSalud();
                            areaSalud.registrarPaciente5(sintoma, prueba, paciente);
                        }
                        if (opcion6 == 2) {
                            int idPaciente;
                            int cedulaNueva;
                            String nombrePacienteNuevo;
                            int edadNueva;
                            int telefonoPacienteNuevo;
                            String correoEPacienteNuevo;
                            String lugarResidenciaNueva;
                            System.out.println("Ingrese la cedula: ");
                            idPaciente = sc.nextInt();
                            System.out.println("Ingrese la cedula modificada: ");
                            cedulaNueva = sc.nextInt();
                            System.out.println("Ingrese el nombre modificado: ");
                            nombrePacienteNuevo = sc.next();
                            System.out.println("Ingrese la edad modificada: ");
                            edadNueva = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico modificado: ");
                            telefonoPacienteNuevo = sc.nextInt();
                            System.out.println("Ingrese el correo electronico modificado: ");
                            correoEPacienteNuevo = sc.next();
                            System.out.println("Ingrese el lugar de residencia modificado: ");
                            lugarResidenciaNueva = sc.next();
                            AreaSalud areaSalud1 = new AreaSalud();
                            areaSalud1.modificarPaciente5(idPaciente, cedulaNueva, nombrePacienteNuevo, edadNueva, telefonoPacienteNuevo, correoEPacienteNuevo, lugarResidenciaNueva);
                        }
                        if (opcion6== 3) {
                            AreaSalud areaSalud2 = new AreaSalud();
                            int idPaciente1;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente1 = sc.nextInt();
                            String fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC,
                                    dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC;
                            int cedulaContacto, edadContacto, telefonoContacto;
                            String nombreContacto, correoEContacto, direccionContacto;
                            for (Paciente item : areaSalud2.getListaPacientes5()) {
                                if (item.getCedula() == idPaciente1) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedulaContacto = sc.nextInt();
                                    System.out.println("Ingrese el nombre del contacto: ");
                                    nombreContacto = sc.next();
                                    System.out.println("Ingrese la edad del contacto: ");
                                    edadContacto = sc.nextInt();
                                    System.out.println("Ingrese el telefono del contacto: ");
                                    telefonoContacto = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico del contacto: ");
                                    correoEContacto = sc.next();
                                    System.out.println("Ingrese la direccion del contacto: ");
                                    direccionContacto = sc.next();
                                    System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                                    System.out.println("Fiebre: ");
                                    fiebreC = sc.next();
                                    System.out.println("Escalofrios: ");
                                    escalofriosC = sc.next();
                                    System.out.println("Tos: ");
                                    tosC = sc.next();
                                    System.out.println("Dificultad respiratoria: ");
                                    difiRespiratoriaC = sc.next();
                                    System.out.println("Fatiga: ");
                                    fatigaC = sc.next();
                                    System.out.println("Dolor muscular: ");
                                    dolorMuscularC = sc.next();
                                    System.out.println("Dolor corporal: ");
                                    dolorCorporalC = sc.next();
                                    System.out.println("Dolor de cabeza: ");
                                    dolorCabezaC = sc.next();
                                    System.out.println("Perdida de olfato: ");
                                    perdOlfatoC = sc.next();
                                    System.out.println("Perdida del gusto: ");
                                    perdGustoC = sc.next();
                                    System.out.println("Dolor de garganta: ");
                                    dolorGargantaC = sc.next();
                                    Contacto contacto = new Contacto(cedulaContacto, nombreContacto, edadContacto, telefonoContacto, correoEContacto, direccionContacto);
                                    Sintoma sintoma = new Sintoma(fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC, dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC);
                                    item.guardarDatoContacto(sintoma, contacto);
                                }
                            }
                        }
                        if (opcion6== 4) {
                            AreaSalud areaSalud3 = new AreaSalud();
                            int idPaciente2;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente2 = sc.nextInt();
                            int cedContacto;
                            int cedulaContactoN, edadContactoN, telefonoContactoN;
                            String nombreContactoN, correoEContactoN, direccionContactoN;
                            for (Paciente item1 : areaSalud3.getListaPacientes5()) {
                                if (item1.getCedula() == idPaciente2) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedContacto = sc.nextInt();
                                    System.out.println("Ingrese la cedula modificada del contacto: ");
                                    cedulaContactoN = sc.nextInt();
                                    System.out.println("Ingrese el nombre modificado del contacto: ");
                                    nombreContactoN = sc.next();
                                    System.out.println("Ingrese la edad modificada del contacto: ");
                                    edadContactoN = sc.nextInt();
                                    System.out.println("Ingrese el telefono modificado del contacto: ");
                                    telefonoContactoN = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico modificado del contacto: ");
                                    correoEContactoN = sc.next();
                                    System.out.println("Ingrese la direccion modificada del contacto: ");
                                    direccionContactoN = sc.next();
                                    item1.modificarDatoContacto(cedContacto, cedulaContactoN, nombreContactoN, edadContactoN, telefonoContactoN, correoEContactoN, direccionContactoN);
                                }
                            }
                        }
                        if (opcion6 == 5) {
                            int idpaciente5;
                            System.out.println("Reporte.");
                            System.out.println("Ingrese el id del paciente: ");
                            idpaciente5 = sc.nextInt();
                            area5.imprimirPaciente5(idpaciente5);
                        }
                    }
                    if (opcion5 == 2){
                        int opcion11;
                        System.out.println("1. Agregar orden sanitaria para paciente.");
                        System.out.println("2. Agregar orden sanitaria para contacto.");
                        System.out.println("Ingrese una opcion: ");
                        opcion11 = sc.nextInt();
                        if (opcion11 == 1){
                            AreaSalud areaP =new AreaSalud();
                            int idPersonaOrden, idOrden;
                            String nombrePersonaOrde, fechaInicialOP, fechaFinalOP,motivoOP, nombreFuncionarioOP;

                            System.out.println("Ingrese el Id del paciente a quien se le asignara la orden: ");
                            idPersonaOrden = sc.nextInt();
                            System.out.println("Ingrese el nombre del paciente a quien se le asignara la orden: ");
                            nombrePersonaOrde = sc.next();
                            System.out.println("Ingrese el Id de la Orden: ");
                            idOrden = sc.nextInt();
                            System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                            fechaInicialOP = sc.next();
                            System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                            fechaFinalOP = sc.next();
                            System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                            motivoOP = sc.next();
                            System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                            nombreFuncionarioOP = sc.next();

                            OrdenSanitaria ordenPaciente = new OrdenSanitaria(idPersonaOrden,nombrePersonaOrde,idOrden,
                                    fechaInicialOP,fechaFinalOP,motivoOP,nombreFuncionarioOP);
                            areaP.agregarOrdenSanitariaPaciente5(ordenPaciente);
                        }
                        if (opcion11 == 2){
                            int numero;
                            String respuesta;
                            System.out.println("Ingrese la cantidad de sintomas que tiene el contacto: ");
                            numero = sc.nextInt();
                            System.out.println("Tiene el esquema de vacunación completo? Digite 'S' para si o 'N' caso contrario:");
                            respuesta = sc.next();
                            if(numero == 0 && respuesta.equalsIgnoreCase("S")){
                                System.out.println("El Contacto no tiene sintomas y tiene el esquema de vacunación completa, por lo tanto, no se le emite Orden Sanitaria");
                            }
                            if(numero < 5 && respuesta.equalsIgnoreCase("N")){
                                System.out.println("El Contacto no tiene sintomas y no tiene el esquema de vacunación completa, por lo tanto, dentro de 3 dias se le volvera a llamar");
                            }
                            if(numero >=5){
                                AreaSalud areaC =new AreaSalud();
                                int idPersonaOrdenC, idOrdenC;
                                String nombrePersonaOrdeC, fechaInicialOC, fechaFinalOC,motivoOC, nombreFuncionarioOC;


                                System.out.println("Ingrese el Id del contacto a quien se le asignara la orden: ");
                                idPersonaOrdenC = sc.nextInt();
                                System.out.println("Ingrese el nombre del contacto a quien se le asignara la orden: ");
                                nombrePersonaOrdeC = sc.next();
                                System.out.println("Ingrese el Id de la Orden: ");
                                idOrdenC = sc.nextInt();
                                System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                                fechaInicialOC = sc.next();
                                System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                                fechaFinalOC = sc.next();
                                System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                                motivoOC = sc.next();
                                System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                                nombreFuncionarioOC = sc.next();

                                OrdenSanitaria ordenContacto = new OrdenSanitaria(idPersonaOrdenC,nombrePersonaOrdeC,idOrdenC,
                                        fechaInicialOC,fechaFinalOC,motivoOC,nombreFuncionarioOC);

                                areaC.agregarOrdenSanitariaContacto5(ordenContacto);
                            }
                        }
                    }
                case 6:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Los Chiles, Caño Negro, El Amparo y San Jorge.");
                    int opcion6;
                    System.out.println("1. Paciente.");
                    System.out.println("3. Orden Sanitaria.");
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion6 = sc.nextInt();
                    if (opcion6 == 1) {
                        int opcion7;
                        System.out.println("1. Registrar paciente.");
                        System.out.println("2. Modificar paciente.");
                        System.out.println("3. Agregar datos de contacto.");
                        System.out.println("4. Modificar datos de contacto.");
                        System.out.println("5. Generar reporte.");
                        System.out.println("Ingrese la opcion que desea: ");
                        opcion7 = sc.nextInt();
                        if (opcion7 == 1) {
                            int cedula;
                            String nombrePaciente;
                            int edad;
                            String fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular,
                                    dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta;
                            String lugarResidencia;
                            int telefonoPaciente;
                            String correoEPaciente;
                            String tipo, fecha, hora, nombrePersona;
                            String fechaSintomaPaciente;
                            System.out.println("Ingrese la cedula: ");
                            cedula = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombrePaciente = sc.next();
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico: ");
                            telefonoPaciente = sc.nextInt();
                            System.out.println("Ingrese el correo electronico: ");
                            correoEPaciente = sc.next();
                            System.out.println("Ingrese el lugar de residencia: ");
                            lugarResidencia = sc.next();
                            System.out.println("Ingrese la fecha de los sintomas: ");
                            fechaSintomaPaciente = sc.next();
                            System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                            System.out.println("Fiebre: ");
                            fiebre = sc.next();
                            System.out.println("Escalofrios: ");
                            escalofrios = sc.next();
                            System.out.println("Tos: ");
                            tos = sc.next();
                            System.out.println("Dificultad respiratoria: ");
                            difiRespiratoria = sc.next();
                            System.out.println("Fatiga: ");
                            fatiga = sc.next();
                            System.out.println("Dolor muscular: ");
                            dolorMuscular = sc.next();
                            System.out.println("Dolor corporal: ");
                            dolorCorporal = sc.next();
                            System.out.println("Dolor de cabeza: ");
                            dolorCabeza = sc.next();
                            System.out.println("Perdida de olfato: ");
                            perdOlfato = sc.next();
                            System.out.println("Perdida del gusto: ");
                            perdGusto = sc.next();
                            System.out.println("Dolor de garganta: ");
                            dolorGarganta = sc.next();
                            System.out.println("Prueba Aplicada");
                            System.out.println("Tipo: ");
                            tipo = sc.next();
                            System.out.println("Fecha: ");
                            fecha = sc.next();
                            System.out.println("Hora: ");
                            hora = sc.next();
                            System.out.println("Nombre de la persona que se la aplico: ");
                            nombrePersona = sc.next();

                            Paciente paciente = new Paciente(cedula, nombrePaciente, edad, telefonoPaciente, correoEPaciente, lugarResidencia, fechaSintomaPaciente);
                            Sintoma sintoma = new Sintoma(fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular, dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta);
                            PruebaCovid.Prueba prueba = new PruebaCovid.Prueba(tipo, fecha, hora, nombrePersona);
                            AreaSalud areaSalud = new AreaSalud();
                            areaSalud.registrarPaciente6(sintoma, prueba, paciente);
                        }
                        if (opcion7 == 2) {
                            int idPaciente;
                            int cedulaNueva;
                            String nombrePacienteNuevo;
                            int edadNueva;
                            int telefonoPacienteNuevo;
                            String correoEPacienteNuevo;
                            String lugarResidenciaNueva;
                            System.out.println("Ingrese la cedula: ");
                            idPaciente = sc.nextInt();
                            System.out.println("Ingrese la cedula modificada: ");
                            cedulaNueva = sc.nextInt();
                            System.out.println("Ingrese el nombre modificado: ");
                            nombrePacienteNuevo = sc.next();
                            System.out.println("Ingrese la edad modificada: ");
                            edadNueva = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico modificado: ");
                            telefonoPacienteNuevo = sc.nextInt();
                            System.out.println("Ingrese el correo electronico modificado: ");
                            correoEPacienteNuevo = sc.next();
                            System.out.println("Ingrese el lugar de residencia modificado: ");
                            lugarResidenciaNueva = sc.next();
                            AreaSalud areaSalud1 = new AreaSalud();
                            areaSalud1.modificarPaciente6(idPaciente, cedulaNueva, nombrePacienteNuevo, edadNueva, telefonoPacienteNuevo, correoEPacienteNuevo, lugarResidenciaNueva);
                        }
                        if (opcion7== 3) {
                            AreaSalud areaSalud2 = new AreaSalud();
                            int idPaciente1;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente1 = sc.nextInt();
                            String fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC,
                                    dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC;
                            int cedulaContacto, edadContacto, telefonoContacto;
                            String nombreContacto, correoEContacto, direccionContacto;
                            for (Paciente item : areaSalud2.getListaPacientes6()) {
                                if (item.getCedula() == idPaciente1) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedulaContacto = sc.nextInt();
                                    System.out.println("Ingrese el nombre del contacto: ");
                                    nombreContacto = sc.next();
                                    System.out.println("Ingrese la edad del contacto: ");
                                    edadContacto = sc.nextInt();
                                    System.out.println("Ingrese el telefono del contacto: ");
                                    telefonoContacto = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico del contacto: ");
                                    correoEContacto = sc.next();
                                    System.out.println("Ingrese la direccion del contacto: ");
                                    direccionContacto = sc.next();
                                    System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                                    System.out.println("Fiebre: ");
                                    fiebreC = sc.next();
                                    System.out.println("Escalofrios: ");
                                    escalofriosC = sc.next();
                                    System.out.println("Tos: ");
                                    tosC = sc.next();
                                    System.out.println("Dificultad respiratoria: ");
                                    difiRespiratoriaC = sc.next();
                                    System.out.println("Fatiga: ");
                                    fatigaC = sc.next();
                                    System.out.println("Dolor muscular: ");
                                    dolorMuscularC = sc.next();
                                    System.out.println("Dolor corporal: ");
                                    dolorCorporalC = sc.next();
                                    System.out.println("Dolor de cabeza: ");
                                    dolorCabezaC = sc.next();
                                    System.out.println("Perdida de olfato: ");
                                    perdOlfatoC = sc.next();
                                    System.out.println("Perdida del gusto: ");
                                    perdGustoC = sc.next();
                                    System.out.println("Dolor de garganta: ");
                                    dolorGargantaC = sc.next();
                                    Contacto contacto = new Contacto(cedulaContacto, nombreContacto, edadContacto, telefonoContacto, correoEContacto, direccionContacto);
                                    Sintoma sintoma = new Sintoma(fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC, dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC);
                                    item.guardarDatoContacto(sintoma, contacto);
                                }
                            }
                        }
                        if (opcion7== 4) {
                            AreaSalud areaSalud3 = new AreaSalud();
                            int idPaciente2;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente2 = sc.nextInt();
                            int cedContacto;
                            int cedulaContactoN, edadContactoN, telefonoContactoN;
                            String nombreContactoN, correoEContactoN, direccionContactoN;
                            for (Paciente item1 : areaSalud3.getListaPacientes6()) {
                                if (item1.getCedula() == idPaciente2) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedContacto = sc.nextInt();
                                    System.out.println("Ingrese la cedula modificada del contacto: ");
                                    cedulaContactoN = sc.nextInt();
                                    System.out.println("Ingrese el nombre modificado del contacto: ");
                                    nombreContactoN = sc.next();
                                    System.out.println("Ingrese la edad modificada del contacto: ");
                                    edadContactoN = sc.nextInt();
                                    System.out.println("Ingrese el telefono modificado del contacto: ");
                                    telefonoContactoN = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico modificado del contacto: ");
                                    correoEContactoN = sc.next();
                                    System.out.println("Ingrese la direccion modificada del contacto: ");
                                    direccionContactoN = sc.next();
                                    item1.modificarDatoContacto(cedContacto, cedulaContactoN, nombreContactoN, edadContactoN, telefonoContactoN, correoEContactoN, direccionContactoN);
                                }
                            }
                        }
                        if (opcion7 == 5) {
                            int idpaciente6;
                            System.out.println("Reporte.");
                            System.out.println("Ingrese el id del paciente: ");
                            idpaciente6 = sc.nextInt();
                            area6.imprimirPaciente6(idpaciente6);
                        }
                    }
                    if (opcion6 == 2){
                        int opcion11;
                        System.out.println("1. Agregar orden sanitaria para paciente.");
                        System.out.println("2. Agregar orden sanitaria para contacto.");
                        System.out.println("Ingrese una opcion: ");
                        opcion11 = sc.nextInt();
                        if (opcion11 == 1){
                            AreaSalud areaP =new AreaSalud();
                            int idPersonaOrden, idOrden;
                            String nombrePersonaOrde, fechaInicialOP, fechaFinalOP,motivoOP, nombreFuncionarioOP;

                            System.out.println("Ingrese el Id del paciente a quien se le asignara la orden: ");
                            idPersonaOrden = sc.nextInt();
                            System.out.println("Ingrese el nombre del paciente a quien se le asignara la orden: ");
                            nombrePersonaOrde = sc.next();
                            System.out.println("Ingrese el Id de la Orden: ");
                            idOrden = sc.nextInt();
                            System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                            fechaInicialOP = sc.next();
                            System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                            fechaFinalOP = sc.next();
                            System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                            motivoOP = sc.next();
                            System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                            nombreFuncionarioOP = sc.next();

                            OrdenSanitaria ordenPaciente = new OrdenSanitaria(idPersonaOrden,nombrePersonaOrde,idOrden,
                                    fechaInicialOP,fechaFinalOP,motivoOP,nombreFuncionarioOP);
                            areaP.agregarOrdenSanitariaPaciente6(ordenPaciente);
                        }
                        if (opcion11 == 2){
                            int numero;
                            String respuesta;
                            System.out.println("Ingrese la cantidad de sintomas que tiene el contacto: ");
                            numero = sc.nextInt();
                            System.out.println("Tiene el esquema de vacunación completo? Digite 'S' para si o 'N' caso contrario:");
                            respuesta = sc.next();
                            if(numero == 0 && respuesta.equalsIgnoreCase("S")){
                                System.out.println("El Contacto no tiene sintomas y tiene el esquema de vacunación completa, por lo tanto, no se le emite Orden Sanitaria");
                            }
                            if(numero < 5 && respuesta.equalsIgnoreCase("N")){
                                System.out.println("El Contacto no tiene sintomas y no tiene el esquema de vacunación completa, por lo tanto, dentro de 3 dias se le volvera a llamar");
                            }
                            if(numero >=5){
                                AreaSalud areaC =new AreaSalud();
                                int idPersonaOrdenC, idOrdenC;
                                String nombrePersonaOrdeC, fechaInicialOC, fechaFinalOC,motivoOC, nombreFuncionarioOC;


                                System.out.println("Ingrese el Id del contacto a quien se le asignara la orden: ");
                                idPersonaOrdenC = sc.nextInt();
                                System.out.println("Ingrese el nombre del contacto a quien se le asignara la orden: ");
                                nombrePersonaOrdeC = sc.next();
                                System.out.println("Ingrese el Id de la Orden: ");
                                idOrdenC = sc.nextInt();
                                System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                                fechaInicialOC = sc.next();
                                System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                                fechaFinalOC = sc.next();
                                System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                                motivoOC = sc.next();
                                System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                                nombreFuncionarioOC = sc.next();

                                OrdenSanitaria ordenContacto = new OrdenSanitaria(idPersonaOrdenC,nombrePersonaOrdeC,idOrdenC,
                                        fechaInicialOC,fechaFinalOC,motivoOC,nombreFuncionarioOC);

                                areaC.agregarOrdenSanitariaContacto6(ordenContacto);
                            }
                        }
                    }
                case 7:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Santa Rosa Pocosol, Cutris.");
                    int opcion7;
                    System.out.println("1. Paciente.");
                    System.out.println("3. Orden Sanitaria.");
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion7 = sc.nextInt();
                    if (opcion7 == 1) {
                        int opcion8;
                        System.out.println("1. Registrar paciente.");
                        System.out.println("2. Modificar paciente.");
                        System.out.println("3. Agregar datos de contacto.");
                        System.out.println("4. Modificar datos de contacto.");
                        System.out.println("5. Generar reporte.");
                        System.out.println("Ingrese la opcion que desea: ");
                        opcion8 = sc.nextInt();
                        if (opcion8 == 1) {
                            int cedula;
                            String nombrePaciente;
                            int edad;
                            String fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular,
                                    dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta;
                            String lugarResidencia;
                            int telefonoPaciente;
                            String correoEPaciente;
                            String tipo, fecha, hora, nombrePersona;
                            String fechaSintomaPaciente;
                            System.out.println("Ingrese la cedula: ");
                            cedula = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombrePaciente = sc.next();
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico: ");
                            telefonoPaciente = sc.nextInt();
                            System.out.println("Ingrese el correo electronico: ");
                            correoEPaciente = sc.next();
                            System.out.println("Ingrese el lugar de residencia: ");
                            lugarResidencia = sc.next();
                            System.out.println("Ingrese la fecha de los sintomas: ");
                            fechaSintomaPaciente = sc.next();
                            System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                            System.out.println("Fiebre: ");
                            fiebre = sc.next();
                            System.out.println("Escalofrios: ");
                            escalofrios = sc.next();
                            System.out.println("Tos: ");
                            tos = sc.next();
                            System.out.println("Dificultad respiratoria: ");
                            difiRespiratoria = sc.next();
                            System.out.println("Fatiga: ");
                            fatiga = sc.next();
                            System.out.println("Dolor muscular: ");
                            dolorMuscular = sc.next();
                            System.out.println("Dolor corporal: ");
                            dolorCorporal = sc.next();
                            System.out.println("Dolor de cabeza: ");
                            dolorCabeza = sc.next();
                            System.out.println("Perdida de olfato: ");
                            perdOlfato = sc.next();
                            System.out.println("Perdida del gusto: ");
                            perdGusto = sc.next();
                            System.out.println("Dolor de garganta: ");
                            dolorGarganta = sc.next();
                            System.out.println("Prueba Aplicada");
                            System.out.println("Tipo: ");
                            tipo = sc.next();
                            System.out.println("Fecha: ");
                            fecha = sc.next();
                            System.out.println("Hora: ");
                            hora = sc.next();
                            System.out.println("Nombre de la persona que se la aplico: ");
                            nombrePersona = sc.next();

                            Paciente paciente = new Paciente(cedula, nombrePaciente, edad, telefonoPaciente, correoEPaciente, lugarResidencia, fechaSintomaPaciente);
                            Sintoma sintoma = new Sintoma(fiebre, escalofrios, tos, difiRespiratoria, fatiga, dolorMuscular, dolorCorporal, dolorCabeza, perdOlfato, perdGusto, dolorGarganta);
                            PruebaCovid.Prueba prueba = new PruebaCovid.Prueba(tipo, fecha, hora, nombrePersona);
                            AreaSalud areaSalud = new AreaSalud();
                            areaSalud.registrarPaciente7(sintoma, prueba, paciente);
                        }
                        if (opcion8 == 2) {
                            int idPaciente;
                            int cedulaNueva;
                            String nombrePacienteNuevo;
                            int edadNueva;
                            int telefonoPacienteNuevo;
                            String correoEPacienteNuevo;
                            String lugarResidenciaNueva;
                            System.out.println("Ingrese la cedula: ");
                            idPaciente = sc.nextInt();
                            System.out.println("Ingrese la cedula modificada: ");
                            cedulaNueva = sc.nextInt();
                            System.out.println("Ingrese el nombre modificado: ");
                            nombrePacienteNuevo = sc.next();
                            System.out.println("Ingrese la edad modificada: ");
                            edadNueva = sc.nextInt();
                            System.out.println("Ingrese el numero telefonico modificado: ");
                            telefonoPacienteNuevo = sc.nextInt();
                            System.out.println("Ingrese el correo electronico modificado: ");
                            correoEPacienteNuevo = sc.next();
                            System.out.println("Ingrese el lugar de residencia modificado: ");
                            lugarResidenciaNueva = sc.next();
                            AreaSalud areaSalud1 = new AreaSalud();
                            areaSalud1.modificarPaciente7(idPaciente, cedulaNueva, nombrePacienteNuevo, edadNueva, telefonoPacienteNuevo, correoEPacienteNuevo, lugarResidenciaNueva);
                        }
                        if (opcion8== 3) {
                            AreaSalud areaSalud2 = new AreaSalud();
                            int idPaciente1;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente1 = sc.nextInt();
                            String fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC,
                                    dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC;
                            int cedulaContacto, edadContacto, telefonoContacto;
                            String nombreContacto, correoEContacto, direccionContacto;
                            for (Paciente item : areaSalud2.getListaPacientes7()) {
                                if (item.getCedula() == idPaciente1) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedulaContacto = sc.nextInt();
                                    System.out.println("Ingrese el nombre del contacto: ");
                                    nombreContacto = sc.next();
                                    System.out.println("Ingrese la edad del contacto: ");
                                    edadContacto = sc.nextInt();
                                    System.out.println("Ingrese el telefono del contacto: ");
                                    telefonoContacto = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico del contacto: ");
                                    correoEContacto = sc.next();
                                    System.out.println("Ingrese la direccion del contacto: ");
                                    direccionContacto = sc.next();
                                    System.out.println("Escriba 'S' si tiene algun sintoma o 'N' si fuera el caso contrario.");
                                    System.out.println("Fiebre: ");
                                    fiebreC = sc.next();
                                    System.out.println("Escalofrios: ");
                                    escalofriosC = sc.next();
                                    System.out.println("Tos: ");
                                    tosC = sc.next();
                                    System.out.println("Dificultad respiratoria: ");
                                    difiRespiratoriaC = sc.next();
                                    System.out.println("Fatiga: ");
                                    fatigaC = sc.next();
                                    System.out.println("Dolor muscular: ");
                                    dolorMuscularC = sc.next();
                                    System.out.println("Dolor corporal: ");
                                    dolorCorporalC = sc.next();
                                    System.out.println("Dolor de cabeza: ");
                                    dolorCabezaC = sc.next();
                                    System.out.println("Perdida de olfato: ");
                                    perdOlfatoC = sc.next();
                                    System.out.println("Perdida del gusto: ");
                                    perdGustoC = sc.next();
                                    System.out.println("Dolor de garganta: ");
                                    dolorGargantaC = sc.next();
                                    Contacto contacto = new Contacto(cedulaContacto, nombreContacto, edadContacto, telefonoContacto, correoEContacto, direccionContacto);
                                    Sintoma sintoma = new Sintoma(fiebreC, escalofriosC, tosC, difiRespiratoriaC, fatigaC, dolorMuscularC, dolorCorporalC, dolorCabezaC, perdOlfatoC, perdGustoC, dolorGargantaC);
                                    item.guardarDatoContacto(sintoma, contacto);
                                }
                            }
                        }
                        if (opcion8== 4) {
                            AreaSalud areaSalud3 = new AreaSalud();
                            int idPaciente2;
                            System.out.println("Ingrese el ID del paciente: ");
                            idPaciente2 = sc.nextInt();
                            int cedContacto;
                            int cedulaContactoN, edadContactoN, telefonoContactoN;
                            String nombreContactoN, correoEContactoN, direccionContactoN;
                            for (Paciente item1 : areaSalud3.getListaPacientes7()) {
                                if (item1.getCedula() == idPaciente2) {
                                    System.out.println("Ingrese la cedula del contacto: ");
                                    cedContacto = sc.nextInt();
                                    System.out.println("Ingrese la cedula modificada del contacto: ");
                                    cedulaContactoN = sc.nextInt();
                                    System.out.println("Ingrese el nombre modificado del contacto: ");
                                    nombreContactoN = sc.next();
                                    System.out.println("Ingrese la edad modificada del contacto: ");
                                    edadContactoN = sc.nextInt();
                                    System.out.println("Ingrese el telefono modificado del contacto: ");
                                    telefonoContactoN = sc.nextInt();
                                    System.out.println("Ingrese el correo electronico modificado del contacto: ");
                                    correoEContactoN = sc.next();
                                    System.out.println("Ingrese la direccion modificada del contacto: ");
                                    direccionContactoN = sc.next();
                                    item1.modificarDatoContacto(cedContacto, cedulaContactoN, nombreContactoN, edadContactoN, telefonoContactoN, correoEContactoN, direccionContactoN);
                                }
                            }
                        }
                        if (opcion8 == 5) {
                            int idpaciente7;
                            System.out.println("Reporte.");
                            System.out.println("Ingrese el id del paciente: ");
                            idpaciente7 = sc.nextInt();
                            area7.imprimirPaciente7(idpaciente7);
                        }
                    }
                    if (opcion7 == 2){
                        int opcion11;
                        System.out.println("1. Agregar orden sanitaria para paciente.");
                        System.out.println("2. Agregar orden sanitaria para contacto.");
                        System.out.println("Ingrese una opcion: ");
                        opcion11 = sc.nextInt();
                        if (opcion11 == 1){
                            AreaSalud areaP =new AreaSalud();
                            int idPersonaOrden, idOrden;
                            String nombrePersonaOrde, fechaInicialOP, fechaFinalOP,motivoOP, nombreFuncionarioOP;

                            System.out.println("Ingrese el Id del paciente a quien se le asignara la orden: ");
                            idPersonaOrden = sc.nextInt();
                            System.out.println("Ingrese el nombre del paciente a quien se le asignara la orden: ");
                            nombrePersonaOrde = sc.next();
                            System.out.println("Ingrese el Id de la Orden: ");
                            idOrden = sc.nextInt();
                            System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                            fechaInicialOP = sc.next();
                            System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                            fechaFinalOP = sc.next();
                            System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                            motivoOP = sc.next();
                            System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                            nombreFuncionarioOP = sc.next();

                            OrdenSanitaria ordenPaciente = new OrdenSanitaria(idPersonaOrden,nombrePersonaOrde,idOrden,
                                    fechaInicialOP,fechaFinalOP,motivoOP,nombreFuncionarioOP);
                            areaP.agregarOrdenSanitariaPaciente7(ordenPaciente);
                        }
                        if (opcion11 == 2){
                            int numero;
                            String respuesta;
                            System.out.println("Ingrese la cantidad de sintomas que tiene el contacto: ");
                            numero = sc.nextInt();
                            System.out.println("Tiene el esquema de vacunación completo? Digite 'S' para si o 'N' caso contrario:");
                            respuesta = sc.next();
                            if(numero == 0 && respuesta.equalsIgnoreCase("S")){
                                System.out.println("El Contacto no tiene sintomas y tiene el esquema de vacunación completa, por lo tanto, no se le emite Orden Sanitaria");
                            }
                            if(numero < 5 && respuesta.equalsIgnoreCase("N")){
                                System.out.println("El Contacto no tiene sintomas y no tiene el esquema de vacunación completa, por lo tanto, dentro de 3 dias se le volvera a llamar");
                            }
                            if(numero >=5){
                                AreaSalud areaC =new AreaSalud();
                                int idPersonaOrdenC, idOrdenC;
                                String nombrePersonaOrdeC, fechaInicialOC, fechaFinalOC,motivoOC, nombreFuncionarioOC;


                                System.out.println("Ingrese el Id del contacto a quien se le asignara la orden: ");
                                idPersonaOrdenC = sc.nextInt();
                                System.out.println("Ingrese el nombre del contacto a quien se le asignara la orden: ");
                                nombrePersonaOrdeC = sc.next();
                                System.out.println("Ingrese el Id de la Orden: ");
                                idOrdenC = sc.nextInt();
                                System.out.println("Ingrese la fecha inicial de la Orden Sanitaria: ");
                                fechaInicialOC = sc.next();
                                System.out.println("Ingrese la fecha final de la Orden Sanitaria: ");
                                fechaFinalOC = sc.next();
                                System.out.println("Ingrese el motivo de la Orden Sanitaria: ");
                                motivoOC = sc.next();
                                System.out.println("Ingrese el nombre del funcionario que acepta la Orden Sanitaria: ");
                                nombreFuncionarioOC = sc.next();

                                OrdenSanitaria ordenContacto = new OrdenSanitaria(idPersonaOrdenC,nombrePersonaOrdeC,idOrdenC,
                                        fechaInicialOC,fechaFinalOC,motivoOC,nombreFuncionarioOC);

                                areaC.agregarOrdenSanitariaContacto7(ordenContacto);
                            }
                        }

                    }
                case 8:
                    System.out.println("San Carlos, Los Chiles y Guatuso.");
                    area1.personaCasosPositivos1(area1);
                    System.out.println("Aguas Zarcas, Venecia y Pital.");
                    area2.personaCasosPositivos2(area2);
                    System.out.println("Ciudad Quesada, Buena Vista y La Palmera.");
                    area3.personaCasosPositivos3(area3);
                    System.out.println("Florencia, La Tigra, Monterrey, Venado, La Fortuna y Platanar.");
                    area4.personaCasosPositivos4(area4);
                    System.out.println("Guatuso, San Rafael, Katira, Buena Vista y Cote.");
                    area5.personaCasosPositivos5(area5);
                    System.out.println("Los Chiles, Caño Negro, El Amparo y San Jorge.");
                    area6.personaCasosPositivos6(area6);
                    System.out.println("Santa Rosa Pocosol, Cutris.");
                    area7.personaCasosPositivos7(area7);

                default:
                    System.out.print("Opcion no valida!");
            }
        }
    }
}

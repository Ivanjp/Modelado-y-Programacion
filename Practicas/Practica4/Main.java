
import java.util.Scanner;

public class Main {

    FactoryProducer productora = new FactoryProducer();//Se construye un objeto de tipo Factory Producer
    AbstractFactory fabricaLLantas = productora.getFactory("LLANTA");//Se construye un objeto de tipo AbstractFactory para llantas
    AbstractFactory fabricaCarrocerias = productora.getFactory("CARROCERIA");//Se construye un objeto de tipo AbstractFactory para carroceria
    AbstractFactory fabricaMotores = productora.getFactory("MOTOR");//Se construye un objeto de tipo AbstractFactory para motores
    AbstractFactory fabricaBlindaje = productora.getFactory("BLINDAJE");//Se construye un objeto de tipo AbstractFactory para blindaje
    AbstractFactory fabricaArma = productora.getFactory("ARMA");//Se construye un objeto de tipo AbstractFactory para arma
    Carroceria carroceriaNueva1 = null;//Se construye un objeto de tipo Carroceria
    Motor motorNuevo1 = null;//Se construye un objeto de tipo motor
    Llanta llantasNuevas1 = null;//Se construye un objeto de tipo llanta
    Blindaje blindajeNuevo1 = null;//Se construye un objeto de tipo blindaje
    Arma armaNueva1 = null;//Se construye un objeto de tipo Arma

    /**
     * Método que se utiliza para crear un auto con valores por defecto
     */
    public void default1() {
        carroceriaNueva1 = (Carroceria) fabricaCarrocerias.getComponente("casual");
        carroceriaNueva1.crearCarroceria();
        motorNuevo1 = (Motor) fabricaMotores.getComponente("deportivo");
        motorNuevo1.crearMotor();
        llantasNuevas1 = (Llanta) fabricaLLantas.getComponente("simple");
        llantasNuevas1.crearLlanta();
        blindajeNuevo1 = (Blindaje) fabricaBlindaje.getComponente("tanque");
        blindajeNuevo1.crearBlindaje();
        armaNueva1 = (Arma) fabricaArma.getComponente("sierra");
        armaNueva1.crearArma();
        Auto autoNuevo = new Auto(llantasNuevas1, carroceriaNueva1, motorNuevo1, blindajeNuevo1, armaNueva1);

        autoNuevo.muestraAuto();
        System.out.println("\n");
        System.out.println("El costo total es: " + autoNuevo.costo());
    }

    /**
     * Método que se utiliza para crear un auto con valores por defecto
     */
    public void default2() {
        carroceriaNueva1 = (Carroceria) fabricaCarrocerias.getComponente("camion");
        carroceriaNueva1.crearCarroceria();
        motorNuevo1 = (Motor) fabricaMotores.getComponente("diesel");
        motorNuevo1.crearMotor();
        llantasNuevas1 = (Llanta) fabricaLLantas.getComponente("off-road");
        llantasNuevas1.crearLlanta();
        blindajeNuevo1 = (Blindaje) fabricaBlindaje.getComponente("reforzado");
        blindajeNuevo1.crearBlindaje();
        armaNueva1 = (Arma) fabricaArma.getComponente("lanzallamas");
        armaNueva1.crearArma();
        Auto autoNuevo = new Auto(llantasNuevas1, carroceriaNueva1, motorNuevo1, blindajeNuevo1, armaNueva1);

        autoNuevo.muestraAuto();
        System.out.println("\n");
        System.out.println("El costo total es: " + autoNuevo.costo());
    }

    /**
     * Método que se utiliza para crear un auto con valores por defecto
     */
    public void default3() {
        carroceriaNueva1 = (Carroceria) fabricaCarrocerias.getComponente("deportivo");
        carroceriaNueva1.crearCarroceria();
        motorNuevo1 = (Motor) fabricaMotores.getComponente("simple");
        motorNuevo1.crearMotor();
        llantasNuevas1 = (Llanta) fabricaLLantas.getComponente("oruga de tanque");
        llantasNuevas1.crearLlanta();
        blindajeNuevo1 = (Blindaje) fabricaBlindaje.getComponente("reforzado");
        blindajeNuevo1.crearBlindaje();
        armaNueva1 = (Arma) fabricaArma.getComponente("metralleta");
        armaNueva1.crearArma();
        Auto autoNuevo = new Auto(llantasNuevas1, carroceriaNueva1, motorNuevo1, blindajeNuevo1, armaNueva1);

        autoNuevo.muestraAuto();
        System.out.println("\n");
        System.out.println("El costo total es: " + autoNuevo.costo());
    }

    /**
     * Método Main
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int opcion;
        Main m = new Main();

        int saldo;//Saldo Inicial del usuario
        boolean b = false;//Bandera para salir del sistema

        System.out.println("Bienvenido a nuestra fabrica de autos. Por favor ingresa la cantidad de dinero con la que cuentas: ");
        saldo = sc3.nextInt();

        while (b == false) {

            System.out.println("\nElige la opcion que necesites:\n "
                    + "\n1.- Auto personalizado.\n"
                    + "\n2.- Auto default\n");

            String opcionUsuario = sc.nextLine();

            opcion = Integer.parseInt(opcionUsuario);

            switch (opcion) {
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    FactoryProducer productora = new FactoryProducer();

                    //Fabricas para cada parte del auto.
                    AbstractFactory fabricaLLantas = productora.getFactory("LLANTA");
                    AbstractFactory fabricaCarrocerias = productora.getFactory("CARROCERIA");
                    AbstractFactory fabricaMotores = productora.getFactory("MOTOR");
                    AbstractFactory fabricaBlindaje = productora.getFactory("BLINDAJE");
                    AbstractFactory fabricaArma = productora.getFactory("ARMA");

                    Carroceria carroceriaNueva = null;
                    Motor motorNuevo = null;
                    Llanta llantasNuevas = null;
                    Blindaje blindajeNuevo = null;
                    Arma armaNueva = null;

                    System.out.println("Escoge que Carroceria quieres utilizar tenemos las siguientes:\n"
                            + "\n1. Carroceria Casual  Precio: 2000 \n"
                            + "2. Carroceria Camion  Precio: 2500 \n"
                            + "3. Carroceria Deportivo  Precio: 1500 \n"
                            + "\n Saldo actual: " + saldo + "\n");

                    int op = sc1.nextInt();

                    //Creacion de la carroceria que eligio el usuario
                    if (op == 1) {
                        if (saldo >= 2000) {
                            carroceriaNueva = (Carroceria) fabricaCarrocerias.getComponente("casual");
                            carroceriaNueva.crearCarroceria();
                            saldo = saldo - 2000;
                            System.out.println("\n Carroceria agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para una carroceria\n");
                        }
                    } else if (op == 2) {
                        if (saldo >= 2500) {
                            carroceriaNueva = (Carroceria) fabricaCarrocerias.getComponente("camion");
                            carroceriaNueva.crearCarroceria();
                            saldo = saldo - 2500;
                            System.out.println("\n Carroceria agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para una carroceria\n");
                        }
                    } else if (op == 3) {
                        if (saldo >= 1500) {
                            carroceriaNueva = (Carroceria) fabricaCarrocerias.getComponente("deportivo");
                            carroceriaNueva.crearCarroceria();
                            saldo = saldo - 1500;
                            System.out.println("\n Carroceria agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para una carroceria\n");
                        }
                    } else {
                        System.out.println("\n Opcion invalida\n");
                    }

                    System.out.println("\nEscoge que Motor quieres utilizar tenemos los siguientes:\n"
                            + "\n1. Motor Deportivo  Precio: 800 \n"
                            + "2. Motor Diesel  Precio: 1000 \n"
                            + "3. Motor Simple  Precio: 500 \n"
                            + "\n Saldo actual: " + saldo + "\n");

                    op = sc1.nextInt();

                    //Creacion del motor que eligio el usuario
                    if (op == 1) {
                        if (saldo >= 800) {
                            motorNuevo = (Motor) fabricaMotores.getComponente("deportivo");
                            motorNuevo.crearMotor();
                            saldo = saldo - 800;
                            System.out.println("\n Motor agregado\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para un motor\n");
                        }
                    } else if (op == 2) {
                        if (saldo >= 1500) {
                            motorNuevo = (Motor) fabricaMotores.getComponente("diesel");
                            motorNuevo.crearMotor();
                            saldo = saldo - 1500;
                            System.out.println("\n Motor agregado\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para un motor\n");
                        }
                    } else if (op == 3) {
                        if (saldo >= 500) {
                            motorNuevo = (Motor) fabricaMotores.getComponente("simple");
                            motorNuevo.crearMotor();
                            saldo = saldo - 500;
                            System.out.println("\n Motor agregado\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para un motor\n");
                        }
                    } else {
                        System.out.println("\n Opcion invalida\n");
                    }

                    System.out.println("\nEscoge que Llantas quieres utilizar tenemos las siguientes:\n"
                            + "\n1. Llantas simples  Precio: 600 \n"
                            + "2. Llantas deportivas  Precio: 1000 \n"
                            + "3. Llantas off-road  Precio: 1500 \n"
                            + "4. Llantas oruga de tanque  Precio: 1500 \n"
                            + "\n Saldo actual: " + saldo + "\n");

                    op = sc1.nextInt();

                    //Creacion de las llantas que eligio el usuario
                    if (op == 1) {
                        if (saldo >= 600) {
                            llantasNuevas = (Llanta) fabricaLLantas.getComponente("simple");
                            llantasNuevas.crearLlanta();
                            saldo = saldo - 600;
                            System.out.println("\nLlanta agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para llantas\n");
                        }
                    } else if (op == 2) {
                        if (saldo >= 1000) {
                            llantasNuevas = (Llanta) fabricaLLantas.getComponente("deportiva");
                            llantasNuevas.crearLlanta();
                            saldo = saldo - 1000;
                            System.out.println("\nLlanta agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para llantas\n");
                        }
                    } else if (op == 3) {
                        if (saldo >= 1500) {
                            llantasNuevas = (Llanta) fabricaLLantas.getComponente("off-road");
                            llantasNuevas.crearLlanta();
                            saldo = saldo - 1500;
                            System.out.println("\nLlanta agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para llantas\n");
                        }
                    } else if (op == 4) {
                        if (saldo >= 1500) {
                            llantasNuevas = (Llanta) fabricaLLantas.getComponente("oruga de tanque");
                            llantasNuevas.crearLlanta();
                            saldo = saldo - 1500;
                            System.out.println("\nLlanta agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para llantas\n");
                        }
                    } else {
                        System.out.println("\n Opcion invalida\n");
                    }

                    System.out.println("\nEscoge que Blindaje quieres utilizar tenemos las siguientes:\n"
                            + "\n1. Blindaje Simple  Precio: 2000 \n"
                            + "2. Blindaje Reforzado  Precio: 3000 \n"
                            + "3. Blindaje Tanque  Precio: 5000 \n"
                            + "\n Saldo actual: " + saldo + "\n");

                    op = sc1.nextInt();

                    //Creacion del blindaje que eligio el usuario
                    if (op == 1) {
                        if (saldo >= 2000) {
                            blindajeNuevo = (Blindaje) fabricaBlindaje.getComponente("simple");
                            blindajeNuevo.crearBlindaje();
                            saldo = saldo - 2000;
                            System.out.println("\nBlindaje agregado\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para blindaje\n");
                        }
                    } else if (op == 2) {
                        if (saldo >= 3000) {
                            blindajeNuevo = (Blindaje) fabricaBlindaje.getComponente("reforzado");
                            blindajeNuevo.crearBlindaje();
                            saldo = saldo - 3000;
                            System.out.println("\nBlindaje agregado\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para blindaje\n");
                        }
                    } else if (op == 3) {
                        if (saldo >= 5000) {
                            blindajeNuevo = (Blindaje) fabricaBlindaje.getComponente("tanque");
                            blindajeNuevo.crearBlindaje();
                            saldo = saldo - 5000;
                            System.out.println("\nBlindaje agregado\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para blindaje\n");
                        }
                    } else {
                        System.out.println("\n Opcion invalida\n");
                    }

                    System.out.println("\nEscoge que Arma quieres utilizar tenemos las siguientes:\n"
                            + "\n1. Arpones  Precio: 1500 \n"
                            + "2. Lanzallamas  Precio: 900 \n"
                            + "3. Lanzas  Precio: 600 \n"
                            + "4. Metralleta  Precio: 400 \n"
                            + "5. Sierra  Precio: 500 \n"
                            + "\n Saldo actual: " + saldo + "\n");

                    op = sc1.nextInt();

                    //Creacion de las armas que eligio el usuario
                    if (op == 1) {
                        if (saldo >= 1500) {
                            armaNueva = (Arma) fabricaArma.getComponente("arpones");
                            armaNueva.crearArma();
                            saldo = saldo - 1500;
                            System.out.println("\nArma agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para armas\n");
                        }
                    } else if (op == 2) {
                        if (saldo >= 900) {
                            armaNueva = (Arma) fabricaArma.getComponente("lanzallamas");
                            armaNueva.crearArma();
                            saldo = saldo - 900;
                            System.out.println("\nArma agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para armas\n");
                        }
                    } else if (op == 3) {
                        if (saldo >= 600) {
                            armaNueva = (Arma) fabricaArma.getComponente("lanzas");
                            armaNueva.crearArma();
                            saldo = saldo - 600;
                            System.out.println("\nArma agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para armas\n");
                        }
                    } else if (op == 4) {
                        if (saldo >= 400) {
                            armaNueva = (Arma) fabricaArma.getComponente("metralleta");
                            armaNueva.crearArma();
                            saldo = saldo - 400;
                            System.out.println("\nArma agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para armas\n");
                        }
                    } else if (op == 5) {
                        if (saldo >= 500) {
                            armaNueva = (Arma) fabricaArma.getComponente("sierra");
                            armaNueva.crearArma();
                            saldo = saldo - 500;
                            System.out.println("\nArma agregada\n");
                        } else {
                            System.out.println("No cuentas con el saldo suficiente para armas\n");
                        }
                    } else {
                        System.out.println("\n Opcion invalida\n");
                    }

                    Auto autoNuevo = new Auto(llantasNuevas, carroceriaNueva, motorNuevo, blindajeNuevo, armaNueva);//Se crea el auto con todos los componentes

                    autoNuevo.muestraAuto();//se muestra el auto creado
                    System.out.println("\n");
                    System.out.println("El costo total es: " + autoNuevo.costo());//Costo del auto
                    b = true;

                    break;

                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("\nActualmente tenemos 3 modelos:\n"
                            + "\n1. Auto 1 (Llanta simple,Carroceria casual, Motor deportivo,Blindaje tanque, Arma sierra) Precio: 8900 \n"
                            + "2. Auto 2 (Llanta off-road,Carroceria camion,Motor Diesel,Blindaje reforzado,Arma lanza llamas)  Precio: 8900 \n"
                            + "3. Auto 3 (Llanta oruga de tanque,Carroceria deportiva,Motor Simple,Blindaje reforzado,Arma metralleta) Precio: 6900 \n"
                            + "\n Saldo actual: " + saldo + "\n");

                    op = sc2.nextInt();

                    if (op == 1) {
                        m.default1();
                        b = true;

                    } else if (op == 2) {
                        m.default2();
                        b = true;

                    } else if (op == 3) {
                        m.default3();
                        b = true;

                    } else {
                        System.out.println("Opcion Invalida.\n");
                    }
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Elige una opcion valida.\n");
                    break;

            }
        }
    }

}

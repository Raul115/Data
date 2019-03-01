/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rulo
 */
public class DATA {

    public static float pedirNumeroFloat(String mensaje) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        float numero = 0;
        boolean correcto;
        do {
            try {
                System.out.print(mensaje);
                numero = Float.parseFloat(teclado.readLine());
                correcto = true;
            } catch (NumberFormatException ex) {
                System.out.println("No es un dato correcto."
                        + " Debe de se un número");
                correcto = false;
            } catch (IOException es) {
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static float pedirNumeroFloat(String mensaje, float linferior) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        float numero = 0;
        boolean correcto;
        do {
            try {
                System.out.print(mensaje);
                numero = Float.parseFloat(teclado.readLine());
                if (numero < linferior) {
                    System.out.println("El numero no puede ser inferior a " + linferior);
                    correcto = false;
                } else {
                    correcto = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("No es un dato correcto."
                        + " Debe de se un número");
                correcto = false;
            } catch (IOException es) {
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static float pedirNumeroFloat(String mensaje, float linferior, float lsuperior) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        float numero = 0;
        boolean correcto;
        do {
            try {
                System.out.print(mensaje);
                numero = Float.parseFloat(teclado.readLine());
                if (numero < linferior || numero > lsuperior) {
                    System.out.println("El numero no puede ser inferior a " + linferior
                            + " y mayor que " + lsuperior);
                    correcto = false;
                } else {
                    correcto = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("No es un dato correcto."
                        + " Debe de se un número");
                correcto = false;
            } catch (IOException es) {
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static int pedirNumeroInt(String mensaje) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        boolean correcto;
        do {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(teclado.readLine());
                correcto = true;
            } catch (NumberFormatException ex) {
                System.out.println("No es un dato correcto."
                        + " Debe de se un número");
                correcto = false;
            } catch (IOException es) {
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static int pedirNumeroInt(String mensaje, int linferior) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        boolean correcto;
        do {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(teclado.readLine());
                if (numero < linferior) {
                    System.out.println("El numero no puede ser inferior a " + linferior);
                    correcto = false;
                } else {
                    correcto = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("No es un dato correcto."
                        + " Debe de se un número");
                correcto = false;
            } catch (IOException es) {
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static int pedirNumeroInt(String mensaje, int linferior, int lsuperior) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        boolean correcto;
        do {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(teclado.readLine());
                if (numero < linferior || numero > lsuperior) {
                    System.out.println("El numero no puede ser inferior a " + linferior
                            + " y mayor que " + lsuperior);
                    correcto = false;
                } else {
                    correcto = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("No es un dato correcto."
                        + " Debe de se un número");
                correcto = false;
            } catch (IOException es) {
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static double pedirNumeroDouble(String mensaje) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean correcto;
        do {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(teclado.readLine());
                correcto = true;
            } catch (NumberFormatException ex) {
                System.out.println("No es un dato correcto."
                        + " Debe de se un número");
                correcto = false;
            } catch (IOException es) {
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static double pedirNumeroDouble(String mensaje, double linferior) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean correcto;
        do {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(teclado.readLine());
                if (numero < linferior) {
                    System.out.println("El numero no puede ser inferior a " + linferior);
                    correcto = false;
                } else {
                    correcto = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("No es un dato correcto."
                        + " Debe de se un número");
                correcto = false;
            } catch (IOException es) {
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static double pedirNumeroDouble(String mensaje, double linferior, double lsuperior) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean correcto;
        do {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(teclado.readLine());
                if (numero < linferior || numero > lsuperior) {
                    System.out.println("El numero no puede ser inferior a " + linferior
                            + " y mayor que " + lsuperior);
                    correcto = false;
                } else {
                    correcto = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("No es un dato correcto."
                        + " Debe de se un número");
                correcto = false;
            } catch (IOException es) {
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static String pedirString(String mensaje) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        try {
            System.out.print(mensaje);
            cadena = teclado.readLine();
            while (cadena.equals("")) {
                System.out.print("Campo obligatorio.");
                cadena = teclado.readLine();
            }
        } catch (IOException ex) {
        }
        return cadena;
    }

    public static int pedirPIN() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String pin;
        int resultado = 0;
        int intentos = 0;
        try {
            System.out.print("Introduzca su PIN: ");
            pin = teclado.readLine();
            while (pin.length() != 4 && intentos < 3) {
                System.out.print("El PIN debe contener al menos 4 digitos: ");
                intentos++;
                pin = teclado.readLine();
            }
            if (pin.length() == 4) {
                try {
                    resultado = Integer.parseInt(pin);
                } catch (NumberFormatException ex) {
                    resultado = -1;
                    System.out.println("El PIN debe estar compuesto de 4 numeros.");
                }
            }
            if (intentos == 3) {
                System.out.println("Has alcanzado el numero maximo de intentos.");
                resultado = -1;
            }
        } catch (IOException es) {
            System.out.println(es);
        }
        return resultado;
    }

    public static String pedirDNI() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String dni = "";
        boolean correcto = false;
        do {
            try {
                System.out.print("Introduzca su DNI: ");
                dni = teclado.readLine();
                while (dni.equals("") && dni.length() != 9) {
                    System.out.println("Campo obligatorio.");
                    dni = teclado.readLine();
                }
                correcto = validarDNI(dni);
            } catch (IOException es) {
            }
            if (!correcto) {
                System.out.println("DNI incorrecto.");
            }
        } while (!correcto);
        return dni;
    }

    private static boolean validarDNI(String dni) {
        boolean correcto = false;
        Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher matcher = pattern.matcher(dni);
        if (matcher.matches()) {
            String letra = matcher.group(2);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int index = Integer.parseInt(matcher.group(1));
            index = index % 23;
            String reference = letras.substring(index, index + 1);
            if (reference.equalsIgnoreCase(letra)) {
                correcto = true;
            } else {
                correcto = false;
            }
        } else {
            correcto = false;
        }
        return correcto;
    }
}

package ejercicio21;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosAntiguo {
    public String ficheroDatos = "usuarios.txt";

    /**
     * Crea un array list de usuarios
     * Escanea el archivo línea a línea leyendo los usuarios y separa sus datos por comas.
     * Asigna esos datos a los atributos de la clase usuario.
     * Guarda el usuario en la lista de usuarios (array list) y cierra el escáner.
     * @return lista de usuarios.
     */
    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String []partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);
            }

            scanner.close();
        } catch (Exception e) {
        }

        return usuarios;
    }

    /**
     * Crea un array list de usuarios
     * Escanea el fichero
     * Mientras hay usuarios, lee los datos.
     * Por cada usuario de la lista, separa sus atributos por comas y asigna el primer elemento a la variable nombreUsuarioActual
     * Si coincide con username pasado por parámetro, se crea un objeto de clase Usuario con los atributos correspondientes a ese nombreUsuarioActual.
     * Devuelve el objeto con dichos atributos.
     * @param username
     * @return null
     */
    public Usuario obtenerUsuario(String username) {
        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));
            ArrayList<String> usuarios = new ArrayList();

            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }

            scanner.close();

            for (String usuario : usuarios) {
                String []partes = usuario.split(",");
                String nombreUsuarioActual = partes[0];
                System.out.println(username + " " + nombreUsuarioActual);

                if (!nombreUsuarioActual.equalsIgnoreCase(username)) {
                    continue;
                }

                Usuario usuarioRetorno = new Usuario();
                usuarioRetorno.nombreUsuario = partes[0];
                usuarioRetorno.nombre = partes[1];
                usuarioRetorno.apellidos = partes[2];
                usuarioRetorno.email = partes[3];
                usuarioRetorno.nivelAcceso = Integer.parseInt(partes[4]);
                return usuarioRetorno;
            }

        } catch (Exception e) {
        }

        return null;
    }

    /**
     * Crea un array list de usuarios
     * Escanea el fichero
     * Mientras hay usuarios, los lee.
     * Para cada usuario, divide sus atributos en partes por coma y asigna el primer elemento a nombreUsuarioActual
     * Si nombreUsuarioActual coincide con un nombre de usuario ya creado, no hace nada.
     * Si no, escribe los datos de usuario en el fichero con un string separando los atributos por coma.
     * @param usuario
     */
    public void crearUsuario(Usuario usuario) {
        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));
            ArrayList<String> usuarios = new ArrayList();

            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }

            scanner.close();

            for (String usuarioActual : usuarios) {
                String []partes = usuarioActual.split(",");
                String nombreUsuarioActual = partes[0];

                if (nombreUsuarioActual.toLowerCase().equals(usuario.nombreUsuario.toLowerCase())) {
                    return;
                }
            }
        } catch (Exception e) {
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);
            String buffer = "";

            for (Usuario usuarioExistente : listarUsuarios()) {
                buffer += usuarioExistente.nombreUsuario + ","
                        + usuarioExistente.nombre + ","
                        + usuarioExistente.apellidos + ","
                        + usuarioExistente.email + ","
                        + usuarioExistente.nivelAcceso;
            }

            buffer += usuario.nombreUsuario + ","
                    + usuario.nombre + ","
                    + usuario.apellidos + ","
                    + usuario.email + ","
                    + usuario.nivelAcceso;

            printStream.println(buffer);
        } catch (Exception e) {

        }
    }

    /**
     * Método no utilizado --> ELIMINAR
     * @param usuario
     */
    public void crearUsuarioOld(Usuario usuario) {
        try {
            PrintStream printStream = new PrintStream(ficheroDatos);
            printStream.println(usuario.nombreUsuario + ","
                    + usuario.nombre + ","
                    + usuario.apellidos + ","
                    + usuario.email + ","
                    + usuario.nivelAcceso);

        } catch (Exception e) {
        }
    }

    /**
     * Crea un array list de usuarios
     * Lee los usuarios del fichero
     * Por cada usuario, divide sus atributos en partes por coma y asigna el primer elemento a la variable nombreUsuarioActual
     * Si dicha variable coincide con ell username pasado por parámetro, continúa
     * Escribe los datos en el fichero.
     * @param username
     */
    public void borrarUsuario(String username) {
        ArrayList<String> usuarios = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }

            scanner.close();
        } catch (Exception e) {
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (String usuarioActual : usuarios) {
                String[] partes = usuarioActual.split(",");
                String nombreUsuarioActual = partes[0];

                if (nombreUsuarioActual.toLowerCase().equals(username)) {
                    continue;
                }

                printStream.println(partes[0] + ","
                        + partes[1] + ","
                        + partes[2] + ","
                        + partes[3] + ","
                        + partes[4]);
            }
        } catch (Exception e) {
        }
    }
}

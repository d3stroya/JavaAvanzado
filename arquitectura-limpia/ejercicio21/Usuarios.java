package ejercicio21;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {
    public String ficheroDatos = "usuarios.txt";

    /**
     * Función para convertir el fichero en array list
     */
    public ArrayList<Usuario> convertirFicheroEnLista() {
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
            System.out.println("Error al obtener usuarios: " + e.getMessage());
        }

        return usuarios;
    }


    /**
     * Función que devuelve los usuarios del array list
     * @return convertirFicheroEnLista()
     */
    public ArrayList<Usuario> listarUsuarios() {
        return convertirFicheroEnLista();
    }

    /**
     * Función para obtener el nombre de usuario de la lista de usuarios
     * @param username
     * @return null
     */
    public Usuario obtenerUsuario(String username) {
        ArrayList<Usuario> usuarios = convertirFicheroEnLista();

        for(Usuario usuarioActual : usuarios) {
            if(usuarioActual.nombreUsuario.equalsIgnoreCase(username)) {
                return usuarioActual;
            }
        }
        return null;
    }

    /**
     * Función para crear un string con los datos de usuario separados por comas
     * @param usuario
     * @return string con datos del usuario separados por comas
     */
    private String separarPorComas(Usuario usuario) {
        return usuario.nombreUsuario + ","
                + usuario.nombre + ","
                + usuario.apellidos + ","
                + usuario.email + ","
                + usuario.nivelAcceso;
    }

    /**
     * Función para crear un usuario siempre que el nombre de usuario no exista ya.
     * @param usuario
     */
    public void crearUsuario(Usuario usuario) {
        if(obtenerUsuario(usuario.nombreUsuario) != null) {
            return;
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (Usuario usuarioExistente : convertirFicheroEnLista()) {
                printStream.println(usuarioExistente);
            }

            printStream.println(separarPorComas(usuario));
        } catch (Exception e) {
            System.out.println("Error al crear usuario: " + e.getMessage());
        }
    }


    /**
     * Función para borrar el objeto de clase Usuario que corresponda al nombre de usuario pasado por parámetro.
     * @param username
     */
    public void borrarUsuario(String username) {
        ArrayList<Usuario> usuarios = convertirFicheroEnLista();

        usuarios.removeIf(usuario -> usuario.nombreUsuario.equalsIgnoreCase(username));

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (Usuario usuarioActual : usuarios) {
                String usuarioSeparado = separarPorComas(usuarioActual);
                printStream.println(usuarioSeparado);
            }
        } catch(Exception e) {
            System.out.println("Error al borrar usuario: " + e.getMessage());
        }
    }
}

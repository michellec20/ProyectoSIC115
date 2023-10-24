/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formularios;

import java.util.ArrayList;

public class Registro {

    NodoUsuario usuarios, fin;

    public ArrayList<String> pos = new ArrayList<>();

    public Registro() {
        usuarios = fin = null;
    }

    public boolean ColaVacia() {
        return usuarios == null;
    }

    public void Insertar(String user, String pass) {
        NodoUsuario aux = new NodoUsuario(user, pass);
        if (ColaVacia()) {
            usuarios = aux;
        } else {
            fin.siguiente = aux;
        }
        fin = aux;
    }

    public void quitarUser() {
        usuarios = usuarios.siguiente;
    }

    public String mostrarUser() {
        String user = usuarios.user;

        return user;
    }

    public String mostrarPass() {
        String pass = usuarios.pass;
        return pass;
    }

//    public boolean validarCredenciales(String user, String pass) {
//        NodoUsuario current = usuarios;
//
//        while (current != null) {
//            if (current.user.equals(user) && current.pass.equals(pass)) {
//                return true; // Credenciales válidas
//            }
//            current = current.siguiente;
//        }
//
//        return false; // Credenciales no válidas
//    }
}

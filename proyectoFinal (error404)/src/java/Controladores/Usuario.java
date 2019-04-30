/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author Julian.castanoj
 */
public class Usuario {
    public String nombres;
    public String apellidos;
    public String cedula ;
    public int edad;
    public String estadoCivil;
    public String auxilio;
    public String tipoEmpleado;
    public String productosBancarios;
    public int puntos;

    Usuario(String nombres, String apellidos, String cedula, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getAuxilio() {
        return auxilio;
    }

    public void setAuxilio(String auxilio) {
        this.auxilio = auxilio;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getProductosBancarios() {
        return productosBancarios;
    }

    public void setProductosBancarios(String productosBancarios) {
        this.productosBancarios = productosBancarios;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Usuario(String nombres, String apellidos, String cedula, int edad, String estadoCivil, String auxilio, String tipoEmpleado, String productosBancarios, int puntos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.auxilio = auxilio;
        this.tipoEmpleado = tipoEmpleado;
        this.productosBancarios = productosBancarios;
        this.puntos = puntos;
    }
    
    
}

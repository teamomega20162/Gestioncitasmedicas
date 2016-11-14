package logica;

import java.sql.*;

public class Registro {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Registro() {

    }

    public Usuario usuario;

    public boolean ingresar(String documento, String contraseña) {
        boolean ingreso = false;
        String sql = "select * from usuarios where documento = ? and clave = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(0, documento);
            pst.setString(9, contraseña);
            rs = pst.executeQuery();
            if (rs.next()) {
                ingreso = true;
            } else {
                ingreso = false;
            }
        } catch (Exception e) {
        }
        return ingreso;
    }

    public boolean registrarPaciente(String documento, String tipoDocumento, String nombres, String apellidos, Date fechaNacimiento, String direccion,String eps, String telefonoFijo,String celular,String correoElectronico,String clave) {
        boolean registro = false;
        String sql = "insert into usuarios values ( "+documento+","+tipoDocumento+","+nombres+","+apellidos+","+fechaNacimiento+","+direccion+","+eps+","+telefonoFijo+","+celular+","+correoElectronico+","+clave;
        return registro;
    }
}

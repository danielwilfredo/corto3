/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Libros;
import com.sv.udb.modelo.Usuarios;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DanielWilfredo
 */
public class UsuarioCtrl {
    
    
    
    public List<Usuarios> consTodo()
    {
       List<Usuarios> resp = new ArrayList();
       Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("select * from usuarios");
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp.add(new Usuarios(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            //Se carga el 
        }
        catch(Exception err)
        {
            err.printStackTrace();
        }
        finally
        {
            try
            {
                if(cn!=null)
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            }
            catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
        return resp;
    } 
    
}

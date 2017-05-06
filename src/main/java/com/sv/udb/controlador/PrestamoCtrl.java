/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Prestamo;
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
public class PrestamoCtrl {
    
    public List<Prestamo> consTodo()
    {
       List<Prestamo> resp = new ArrayList();
       Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("select * from prestamos");
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp.add(new Prestamo(rs.getInt(1), rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
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
    
    
    //Codigo para consultar segun el id del registro
    
         public Prestamo consTodo2(int id)
    {
      Prestamo resp = null;
       Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("select * from prestamos where codi_pres =?");
            cmd.setString(1, String.valueOf(id));
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp = (new Prestamo(rs.getInt(1), rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
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
         
         
         //Codigo para guardar
         
         public boolean guar(Prestamo obje)
    {
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("insert into prestamos values(null, ?, ?, ? , null);");
            cmd.setInt(1, obje.getCodiLibr());
            cmd.setInt(2, obje.getCodiUsua());
            cmd.setString(3, obje.getFechaPres());
            cmd.executeUpdate();
            resp=true;
        }
        catch(Exception ex)
        {
            System.err.println("Error al guardar Miembros: " + ex.getMessage());
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
         
        
         //Codigo para modificar registros
         
          public boolean modi(Prestamo obje)
    {
         boolean resp = false;
        Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("update prestamos set codi_libr=?, codi_usua=?, fecha_devo=? where codi_pres=?");
            cmd.setString(1, String.valueOf(obje.getCodiLibr())); 
            cmd.setString(2, String.valueOf(obje.getCodiUsua()));
            cmd.setString(3, String.valueOf(obje.getFechaDevo()));
            cmd.setString(4, String.valueOf(obje.getCodiPresta()));
            cmd.executeUpdate();
            resp=true;
        }
        catch(Exception ex)
        {
            System.err.println("Error al modificar el Jugador " + ex.getMessage());
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

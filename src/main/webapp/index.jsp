<%@page import="com.sv.udb.controlador.UsuarioCtrl"%>
<%@page import="com.sv.udb.modelo.Usuarios"%>
<%@page import="com.sv.udb.controlador.LibroCtrl"%>
<%@page import="com.sv.udb.modelo.Libros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href='webjars/materialize/0.97.3/dist/css/materialize.min.css'>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script type="text/javascript" src="webjars/jquery/2.1.4/jquery.min.js"></script>
        <script type="text/javascript" src="webjars/materialize/0.97.3/dist/js/materialize.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <center><h2>Prestamo libros</h2></center>
        <div class="container">
        <select id="cmbEquipo" name="cmbLibro" value="${cmbLibro}">
            
            <option  disabled selected> Seleccione un libro</option>
            <%                
                for(Libros temp : new LibroCtrl().consTodo())
                {
            %>
            <option value="<%=temp.getCodiLibr()%>"><%=temp.getNombLibr()%></option>;
            <%
                }
            %>
             </select> 
            
        <select id="cmbEquipo" name="cmbUsuario" value="${cmbUsuario}">
            
            <option  disabled selected> Seleccione un usuario</option>
            <%                
                for(Usuarios temp : new UsuarioCtrl().consTodo())
                {
            %>
            <option value="<%=temp.getCodiUsua()%>"><%=temp.getNombUsua()%></option>;
            <%
                }
            %>
             </select> 
             <br>
             <br>
             
             <label>Fecha Prestamo:</label>
                <input type="text" name="altu" id="altu" value="${altu}" required> <br>
                </div>
        <center>
                        <button class="btn waves-effect waves-light" type="submit" name="btoJuga" value="Modificar">Prestar Libro
                <i class="material-icons right">send</i>
                </button>
                        <button class="btn waves-effect waves-light" type="submit" name="btoJuga" value="Modificar">Cancelar
                <i class="material-icons right">send</i>
                </button>
            </center>
    </body>
    
    <script>
        $(document).ready(function() {
            $('select').material_select();
          });
    </script>
</html>

<%-- 
    Document   : LibrosP
    Created on : 05-06-2017, 10:53:54 AM
    Author     : DanielWilfredo
--%>

<%@page import="com.sv.udb.controlador.LibroCtrl"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href='webjars/materialize/0.97.3/dist/css/materialize.min.css'>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script type="text/javascript" src="webjars/jquery/2.1.4/jquery.min.js"></script>
        <script type="text/javascript" src="webjars/materialize/0.97.3/dist/js/materialize.min.js"></script>
        <title>JSP Page</title>
        <title>JSP Page</title>
    </head>
    <% request.setAttribute( "test", new LibroCtrl().consTodo()); %>
      <div class="row">
        <div class="col s12 m6">
          <div class="card blue-grey darken-1">
            <div class="card-content white-text">
                <span class="card-title">Todos los libros</span><br>
                 <display:table name="test" id="test" pagesize="5">
                        <display:column property="codiLibr" title="ID" sortable="true" sortName="codiLibr"/>
                        <display:column property="nombLibr" title="Nombre Libro" sortable="true" sortName="nombLibr"/>
                        <display:column property="autoLibr" title="Autor" sortable="true" sortName="autoLibr"/>
                        <display:column property="geneLibr" title="Genero" sortable="true" sortName="geneLibr"/>
                        <display:column property="anioLibr" title="Año" sortable="true" sortName="anioLibr"/>
                        <display:column property="estaLibr" title="Estado" sortable="true" sortName="estaLibr"/>
                    </display:table>
            </div>
         </div>
        </div>
      </div>
</html>
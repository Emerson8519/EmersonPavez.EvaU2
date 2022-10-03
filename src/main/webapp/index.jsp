<%-- 
    Document   : index
    Created on : 02-10-2022, 23:12:54
    Author     : emers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar</title>
    </head>
    <body>
    
        <form name="Form1" action="proceso" method="GET">
            
            <h1>Ingresar curso:</h1>
            
            <label>ID Curso</label><br>
            <input type="text" name="ID"/>
            <br><br>

            <label>Nombre Curso</label><br>
            <input type="text" name="curso" />
            <br><br>
                
            <label>Nombre Profesor</label><br>
            <input type="text" name="profesor" />
            <br><br>  
            
            <label>Materiales necesarios</label><br>
            <input type="text" name="materiales" />
            <br><br>
            
            <label>Descripción de la asignatura</label><br>
            <input type="text" name="descripcion" />
            <br><br>
            <br><br>
            
            <input type="submit" value="Crear">
        
        </form>        
        
    </body>
</html>

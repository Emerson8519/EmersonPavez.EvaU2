<%-- 
    Document   : edicion
    Created on : 03-10-2022, 18:43:26
    Author     : emers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
    </head>
    <body>
   
        <form name="Form2" action="editar" method="GET">
            
            <h1>Editar curso:</h1>
            
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
            
            <input type="submit" value="Editar">
        
        </form>
        
    </body>
</html>

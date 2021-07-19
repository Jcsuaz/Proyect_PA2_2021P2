<!--// Chiphysi programación suscribete -->
<!--// V 0.1 original -->
<!--// Autor: Chiphysi  --><!--// Autor: Jhonatan Cardona  -->
<!--// Derechos de autor(Suscribete)  -->


<?php

    $usuario = "root"; //en ste caso root por ser localhost
    $password = "";  //contraseña por si tiene algun servicio de hosting 
    $servidor = "localhost"; //localhost por lo del xampp
    $basededatos ="reservas"; //nombre de la base de datos



$conexion = mysqli_connect  ($servidor,$usuario,"") or die ("Error con el servidor de la Base de datos"); 



$db = mysqli_select_db($conexion, $basededatos) or die ("Error conexion al conectarse a la Base de datos");



    $nombre=$_POST['nombre']; 
    $ocupacion=$_POST['ocupacion'];
    $destino=$_POST['destino'];
    $precio=$_POST['precio'];
    $fecha=$_POST['fecha']; 

    //sentencia sql
     $sql="INSERT INTO reservas VALUES ('$nombre','$ocupacion','$destino','$precio','$fecha')"; 

    $ejecutar=mysqli_query($conexion, $sql);



    if(!$ejecutar){
    	 echo '<script>alert("huvo algun error")</script> ';
         echo "<script>location.href='reserva.php'</script>";	
    }else{
        echo '<script>alert("Su reserva se a realizado correctamente ")</script> ';
        
        echo "<script>location.href='inicio.php'</script>";	
    }
     
?>﻿
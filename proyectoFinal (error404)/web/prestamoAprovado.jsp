
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./styles/miRegistro.css"/>
    </head>
    <body class="r">
        <form class="form">
            <h2 class="h2">APROVADO</h2> 
            
            <label for="name">Cantidad a prestar: <span class="required"></span></label>  
            <input class="input" type="text" name="pesos">
            
            <label for="name">Tipo de bienes: <span class="required"></span></label>  
                 <select class="input">
                    <option value="vehiculos">Vehiculo</option>
                    <option value="propiedadRaiz">Propiedad raiz</option>
                    <option value="territorio">Territorial</option>
            </select>
            
            <label for="name">Numero de pagos: <span class="required"></span></label>  
            <input class="input" type="text" name="pagos">
            
            <input class="input" type="submit" value="Aceptar">

        </form>
    </body>
</html>

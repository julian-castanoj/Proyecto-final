
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./styles/miRegistro.css"/>
    </head>
    <body class="r">
        <form class="form">
            
            <h2 class="h2">PAGOS</h2>
                
                <label for="name">Nombres: <span class="required"></span></label>  
                <input class="input" type="text" name="nombres">
                
                <label for="name">Apellidos: <span class="required"></span></label>
                <input class="input" type="text" name="apellidos">
                
                <label for="name">Cedula: <span class="required"></span></label>
                <input class="input" type="text" name="cedula">
                
                <label for="name">Forma de pago: <span class="required"></span></label>  
                 <select class="input">
                    <option value="TC">Tarjeta credito</option>
                    <option value="TD">Tarjeta devito</option>
                    <option value="TB">Transferencia bancaria</option>
            </select>
            
            <input class="input" type="submit" value="Pagar">

        </form>
    </body>
</html>

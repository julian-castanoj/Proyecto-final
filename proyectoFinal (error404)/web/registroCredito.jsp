<%@page import="Controladores.Usuario"%>
<html>
    <head>
        <title>Credito</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./styles/miRegistro.css"/>
    </head>

    <body class="r">
        <form class="form"  method="POST" action="comboData" >

            <h2 class="h2">OPCIONES DEL ADMINISTRADOR</h2>

            <label for="name">Nombres: <span class="required"></span></label>  
            <input class="input" type="text" name="nombres">

            <label for="name">Apellidos: <span class="required"></span></label>
            <input class="input" type="text" name="apellidos">

            <label for="name">Cedula: <span class="required"></span></label>
            <input class="input" type="text" name="cedula">

            <label for="name">Edad: <span class="required"></span></label>
            <input class="input" type="text" name="edad">

            <label name = "estadoCivil" for="name">Estado civil: <span class="required"></span></label>
            <select class="input" name="combolista" id="combolista">
                <option value="soltero">Soltero</option>
                <option value="casado">Casado</option>
            </select>
            <script type="text/javascript">
                var select = document.getElementById('combolista'
                        );
                select.addEventListener('change'
                        ,
                        function ()
                        {
                            var selectedOption = this.options[select.selectedIndex];
                            console.log(selectedOption.value + ': ' + selectedOption.text
                                    );
                        });
            </script>

            <label name = "auxilio" for="name">Auxilio: <span class="required"></span></label>
            <select class="input" name="combolista2" id="combolista2">
                <option value="posee">Si</option>
                <option value="noPosee">No</option>
            </select>
             <script type="text/javascript">
                var select = document.getElementById('combolista2'
                        );
                select.addEventListener('change'
                        ,
                        function ()
                        {
                            var selectedOption = this.options[select.selectedIndex];
                            console.log(selectedOption.value + ': ' + selectedOption.text
                                    );
                        });
            </script>

            <label name = "tipoEmpleado" for="name">Tipo de empleado: <span class="required"></span></label>
            <select class="input" name="combolista3" id="combolista3">
                <option value="publico">Publico</option>
                <option value="privado">Privado</option>
                <option value="independiente">Independiente</option>
            </select>
            
             <script type="text/javascript">
                var select = document.getElementById('combolista3'
                        );
                select.addEventListener('change'
                        ,
                        function ()
                        {
                            var selectedOption = this.options[select.selectedIndex];
                            console.log(selectedOption.value + ': ' + selectedOption.text
                                    );
                        });
            </script>

            <label name= "productoBanco" for="name">Productos en el banco: <span class="required"></span></label>
            <select class="input" name="combolista4" id="combolista4">
                <option value="posee">Si</option>
                <option value="noPosee">No</option>
            </select><br>
             <script type="text/javascript">
                var select = document.getElementById('combolista4'
                        );
                select.addEventListener('change'
                        ,
                        function ()
                        {
                            var selectedOption = this.options[select.selectedIndex];
                            console.log(selectedOption.value + ': ' + selectedOption.text
                                    );
                        });
            </script>

            <input class="input" type="text" name="aD">
            
            <input class="input" type="submit" value="Credito" >
            




            </div
        </form>
    </body>
</html> 



<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.Statement"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./styles/tabla.css"/>
    </head>
    <body class="r">
        <form class="form"> 
            <h2 class="h2">TABLA DE CONSULTAS</h2>
            <%
                String USERNAME = "root";
                String PASSWORD = "root";
                String HOST = "localhost";
                String PORT = "3306";
                String DATABASE = "mysql";
                String CLASSNAME = "com.mysql.jdbc.Driver";
                String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
                Connection con;

                Class.forName(CLASSNAME);
                con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

                PreparedStatement ps;
                ResultSet rs;
                ps = con.prepareStatement("select * from demo2");
                rs = ps.executeQuery();


            %>
            <div >
                 <table class="darkTable">
                     <tr >
                         <th>Nombres</th>
                         <th>Apellidos</th>
                         <th>Cedula</th>
                         <th>Edad</th>
                         <th>Cedula</th>
                         <th>Estado civil</th>
                         <th>auxilio</th>
                         <th>Tipo de empleado</th>
                         <th>Productos bancarios</th>
                         <th>Aprovado/Desaprovado</th>
                     </tr>

                    <%            
                        while (rs.next()) {
                    %>

                    <tr >
                        <th><%=rs.getString("nombres")%></th>
                        <th><%=rs.getString("apellidos")%></th>
                        <th><%=rs.getString("cedula")%></th>
                        <th><%=rs.getString("edad")%></th>
                        <th><%=rs.getString("cedula")%></th>
                        <th><%=rs.getString("eC")%></th>
                        <th><%=rs.getString("aU")%></th>
                        <th><%=rs.getString("tE")%></th>
                        <th><%=rs.getString("pB")%></th>
                        <th><%=rs.getString("aD")%></th>
                    </tr>
                    <%}%>
                </table>
            </div>
        </form>
    </body>
</html>
            
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"
	integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
<form action="registro" method="post"  role="form" data-toggle="validator" >	

<h2>Cliente</h2>

<div class="form-group">
	<label for="nombre" class="control-label col-xs-4">Nombre:</label>
    <input type="text" name="nombre" id="nombre" class="form-control" />
    
    <label for="apellido" class="control-label col-xs-4">Apellido:</label>                   
    <input type="text" name="ApPaterno" class="form-control" />                                   
				

			<button type="submit" class="btn btn-primary">Guardar</button>
</div>			
</form>
	</div>
	
	
      <table class="table table-striped">
         <thead>
          <tr>
            <td>Id</td>
            <td>Nombre</td>
            <td>Apellido Paterno</td>
          </tr>
         </thead>
         
         
         <c:forEach var="cliente" items="${clientes}">
         <tr>
            <td>${cliente.id_cliente}</td>
            <td>${cliente.nombre}</td>
            <td>${cliente.apellidoPaterno}</td>
         </tr>
         </c:forEach>
         
      </table>	
	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link href="css/estilo.css" type="text/css" rel="stylesheet" />
<title>HSBC</title>

</head>
<body>

	<div class="container well" id="containerLogin">

		<center>
			<img alt="" src="logo/hsbc.jpg" class="img-circle" />
		</center>
		<form class="form-horizontal" id="form1" action="login" method="post">
			<div class="form-group">

				<div class="col-sm-10">
					<input type="email" class="form-control" id="inputEmail3"
						placeholder="Email" name="usuario">
				</div>
			</div>
			<div class="form-group">

				<div class="col-sm-10">
					<input type="password" class="form-control" id="inputPassword3"
						placeholder="Password" name="pass">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label> <input type="checkbox"> Remember me
						</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-danger" id="btnLogin">Sign
						in</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
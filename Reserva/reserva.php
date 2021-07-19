<!--// Chiphysi programación suscribete -->
<!--// V 0.1 original -->
<!--// Autor: Chiphysi  --><!--// Autor: Jhonatan Cardona  -->
<!--// Derechos de autor(Suscribete)  -->

<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>chiphysi</title>
	<meta name="author" content="chiphysi" />
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
	
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/icomoon.css">
	<link rel="stylesheet" href="css/themify-icons.css">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
	<link rel="stylesheet" href="css/style.css">
	<script src="js/modernizr-2.6.2.min.js"></script>


	</head>
	<body>
		
	<div class="gtco-loader"></div>
	
	<div id="page">

	
	<nav class="gtco-nav" role="navigation">
		<div class="gtco-container">
			
			<div class="row">
				<div class="col-sm-4 col-xs-12">
					<div id="gtco-logo"><a href="index.html">Chiphysi <em>Programacion</em></a></div>
				</div>
				<div class="col-xs-8 text-right menu-1">
					<ul>
						<li><a href="inicio.php">Inicio</a></li>
						<li><a href="reserva.php">Reserva</a></li>
						<li><a href="precios.php">Precios</a></li>
						<li><a href="contacto.php">Contactos</a></li>
						<li><a href="desconectar.php"><font color="black">Salir</font></a></li>
					</ul>	
				</div>
			</div>
			
		</div>
	</nav>
	
	<header id="gtco-header" class="gtco-cover gtco-cover-md" role="banner" style="background-image: url(images/img_bg_2.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">
						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<h1>Planeando viaje a cualquier parte del mundo?</h1>	
						</div>
						<div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
							<div class="form-wrap">
								<div class="tab">
									
									<div class="tab-content">
										<div class="tab-content-inner active" data-content="signup">
											<h3>Reserva tu viaje</h3>

											<form action="datos.php" method="POST" >
												<div class="row form-group">
													<div class="col-md-12">
														<label for="fullname">Tu nombre</label>
														<input type="text" name="nombre" id="fullname" class="form-control" required="">
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="activities">Ocupaciones</label>
														<select name="ocupacion" id="activities" class="form-control" required="">
															<option value="Ocupaciones">Ocupaciones</option>
															<option value="Estudiante">Estudiante</option>
															<option value="Escursionista">Escursionista</option>
														</select>
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="destination">Destino</label>
														<select name="destino" id="destination" class="form-control" required="">
															<option value="Colombia">Colombia</option>
															<option value="Philippines">Philippines</option>
															<option value="USA">USA</option>
															<option value="Australia">Australia</option>
															<option value="Singapore">Singapore</option>
														</select>
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="destination">Precio</label>
														<select name="precio" id="destination" class="form-control" required="">
															<option value="250.000/COP">250.000/COP</option>
															<option value="500.000/COP">500.000/COP</option>
															<option value="1.000.000/COP">1.000.000/COP</option>
															<option value="600/US">600/US</option>
															<option value="1000/US">1000/US</option>
															<option value="2500/US">2500/US</option>
															
														</select>
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="date-start">Fecha de viaje</label>
														<input type="text" name="fecha" id="date-start" class="form-control" ">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<input type="submit" class="btn btn-primary btn-block" value="Submit">
													</div>
												</div>
											</form>	
										</div>

										
									</div>
								</div>
							</div>
						</div>
					</div>
							
					
				</div>
			</div>
		</div>
	</header>


	<footer id="gtco-footer" role="contentinfo">
		<div class="gtco-container">

			<div class="row copyright">
				<div class="col-md-12">
					<p class="pull-left">
						<small class="block">&copy; 2018</small> 
						<small class="block">SISTEMA RESERVAS AVIÓN <a href="https://www.facebook.com/jhonatan.cardona.9237" target="_blank">Chiphysi Programacion</a></small>
					</p>
					<p class="pull-right">
						<ul class="gtco-social-icons pull-right">
							<li><a href="https://www.youtube.com/channel/UC87BrnQy7Y6iipGvQ6sAJfQ"><i class="icon-twitter"></i></a></li>
							<li><a href="https://www.facebook.com/jhonatan.cardona.9237"><i class="icon-facebook"></i></a></li>
							<li><a href="https://www.youtube.com/channel/UC87BrnQy7Y6iipGvQ6sAJfQ"><i class="icon-linkedin"></i></a></li>
							<li><a href="https://www.youtube.com/channel/UC87BrnQy7Y6iipGvQ6sAJfQ"><i class="icon-dribbble"></i></a></li>
						</ul>
					</p>
				</div>
			</div>

		</div>
	</footer>


	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	

	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.countTo.js"></script>
	<script src="js/jquery.stellar.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<script src="js/bootstrap-datepicker.min.js"></script>
	<script src="js/main.js"></script>

	</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
	<tiles:insertAttribute name="header"/>
</head>
<body id="page-top">
	<div id="wrapper">
		<tiles:insertAttribute name="left"/>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<tiles:insertAttribute name="nav"/>
				<tiles:insertAttribute name="content"/>
			</div>
			<tiles:insertAttribute name="footer"/>
		</div>
	</div>
	<a class="scroll-to-top rounded" href="#page-top">
		<i class="fas fa-angle-up"></i>
	</a>
	
	<!-- Bootstrap core JavaScript-->
	<script src="/resources/vendor/jquery/jquery.min.js"></script>
	<script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	
	<!-- Core plugin JavaScript-->
	<script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
	
	<!-- Custom scripts for all pages-->
	<script src="/resources/js/sb-admin-2.min.js"></script>
	
	<!-- Page level plugins
	<script src="/resources/vendor/chart.js/Chart.min.js"></script>
	-->
	<!-- Page level custom scripts
	<script src="/resources/js/demo/chart-area-demo.js"></script>
	<script src="/resources/js/demo/chart-pie-demo.js"></script>
	<script src="/resources/js/demo/chart-bar-demo.js"></script>
	-->
</body>
</html>

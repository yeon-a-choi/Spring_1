<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Param Test Page</h1>

	<form action="./param1" method="post">
		
		<!-- input text -->
		<p>
			p1<input type="text" name="p1">
		</p>
		
		
		<!-- input date -->
		<p>
			p2<input type="date" name="p2">
		</p>
		
		
		<!-- input color -->
		<p>
			p3<input type="color" name="p3">
		</p>
		
		
		<!-- input select box -->
		<p>
			p4<select name="p4">
				<option value="s">SKT</option>
				<option value="k">KT</option>
				<option value="l">LG</option>
			  </select>
		</p>
		
		<!-- input radio -->
		<p>
			
			SKT<input type="radio" name="p5" value="skt">
			KT<input type="radio" name="p5" value="kt">
			LG<input type="radio" name="p5" value="lg">
			
		</p>
		
		
		<!-- input checkbox -->
		<p>
		
			SKT<input type="checkbox" name="p6" value="skt">
			KT<input type="checkbox" name="p6" value="kt">
			LG<input type="checkbox" name="p6" value="lg">
		
		</p>
		
		<button>SUBMIT</button>
		
	</form>

</body>
</html>
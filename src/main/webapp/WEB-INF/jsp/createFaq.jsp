<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Create FAQ</title>
</head>
<body>
	<H1>Add a FAQ</H1>
	<form>
		<div class="form-group">
			<label>Topic ID</label>
			<select></select>
		</div>
		<div class="form-group">
			<label>Question ID</label>
			<input type="text" name="questionId" id="questionId" />
		</div>
		<div class="form-group">
			<label>Question</label>
			<input type="text" name="question" id="question" />
		</div>
		<div class="form-group">
			<label>Answer</label>
			<input type="text" name="answer" id="answer" />
		</div>
		<div class="form-group">
			<input class="btn btn-primary" type="submit" value="Create FAQ" />
		</div>
	</form>
</body>
</html>
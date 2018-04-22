<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="partial/header.jsp" />
<div class="container">
<form method="POST" action="/Topic/Create">
	<h2>Create Topic</h2>
	<div class="form-group">
		<label for="topicName">Topic Name</label>
		<input type="text" name="topicName" id="topicName" />
	</div>
	<input class="btn btn-primary" type="submit" />
</form>
</div>
<jsp:include page="partial/footer.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="partial/header.jsp" />
<div class="container">
	<h3>Topics</h3>
	<table class="table-striped table-hover table-responsive">
		<thead>
			<tr>
				<td>Topic ID</td>
				<td>Question ID</td>
				<td>Question</td>
				<td>Answer</td>
			</tr>
		</thead>
		<c:forEach var="t" items="${topics}">
			<tr>
				<td><p>${ t.getTopicId() }</p></td>
				<td><p>${ t.getTopicName() }</p></td>
			</tr>
		</c:forEach>
	</table>

</div>
<jsp:include page="partial/footer.jsp" />
<!--  
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<table class="table table-striped">
		<caption>Your Orders are</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Date</th>
				<th>Completed</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${orders}" var="order">
				<tr>
					<td>${order.desc}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy"
							value="${order.targetDate}" /></td>
					<td>${order.done}</td>
					<td><a type="button" class="btn btn-primary"
						href="/update-order?id=${order.id}">Edit</a> <a type="button"
						class="btn btn-warning" href="/delete-order?id=${order.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a type="button" class="btn btn-success" href="/add-order">Add</a>
	</div>
</div>
<%@ include file="common/footer.jspf"%>
 -->
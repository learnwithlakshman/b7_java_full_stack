<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:import url="/header.jsp"></c:import>


	<div class="container">
		<div class="row">
			<div class="col-md-10"></div>
			<div class="col-md-2">

				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-target="#exampleModal">Add new TODO</button>

				<!-- Modal -->
				<div class="modal fade" id="exampleModal" tabindex="-1"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalLabel">Add new TODO</h5>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-body">...</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
								<button type="button" class="btn btn-primary">Save
									</button>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
		<div class="row mt-2">
			<div class="col-md-8 offset-md-2">

				<c:if test="${todos.size() > 0 }">
					<table class="table">
						<thead>
							<tr>

								<th scope="col">Title</th>
								<th scope="col">Description</th>
								<th scope="col">Edit/Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${todos}" var="todo">
								<tr>

									<td>${todo.title}</td>
									<td>${todo.message}</td>
									<td><a href="deletetodo.do?id=${todo.id}"><i class="fa fa-trash ml-2"></i></a><i
										class="fa fa-edit ml-2"></i></td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</c:if>
				<c:if test="${todos.size() == 0 }">
					<p class="lead">No dotos are created yet.... Please add new todo</p>
				</c:if>
			</div>
		</div>
		<a href="payment.do" class="btn btn-primary">Paynow</a>


	</div>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html ng-app="app">
<head>
<title>首页</title>
<c:import url="/static/res" charEncoding="UTF-8"/>
</head>
<body>
<div ng-controller='FirstController'>
{{ counter }}
<button class="btn btn-primary" ng-click="add(1)">Add</button>
</div>

<div ng-controller="ParentController">
<p>{{ person.name }}</p>
	<div ng-controller="ChildController">
	<p>{{ person.age }}</p>
	</div>
</div>

<script type="text/javascript" src="/static/js/app/app.js"></script>
</body>
</html>

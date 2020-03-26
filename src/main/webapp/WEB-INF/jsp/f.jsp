<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %><!DOCTYPE html>
<html lang="en">
<body>
	<form:form modelAttribute="person">
		<form:input path="name" placeholder="Leave this field empty to show error" cssStyle="width: 20em"/>
		<form:errors path="name"/>
		<br>
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>
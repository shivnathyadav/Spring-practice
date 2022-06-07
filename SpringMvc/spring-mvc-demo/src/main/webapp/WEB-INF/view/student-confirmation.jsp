<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
<title>
Student Confirmation
</title>
</head>
<body>

The Student is confirmed : ${student.firstName}  ${student.lastName}
<br><br>
Country : ${student.country}

<br><br>

Favorite Language: ${student.favoriteLanguage}
<br><br>

Operating Systems:

<ul>
	<c:forEach var="operating" items="${student.operatingSystems}" >

		<li> ${operating} </li>

	</c:forEach>
</ul>
</body>
</html>
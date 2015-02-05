<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<div>
    <h2>Entities List</h2>
    <table cellspacing="5">
        <tr>
            <th>T�tulo</th>
            <th>N�mero</th>
        </tr>
        <c:forEach items="${beanEntityList}" var="item">
            <tr>
                <td><c:out value="${item.titulo}"/></td>
                <td><c:out value="${item.numero}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
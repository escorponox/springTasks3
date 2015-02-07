<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <h2>Create Pizza: </h2>
    <sf:form method="post" modelAttribute="pizza">
        <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">

        <h3>Base: </h3>
        <sf:radiobuttons path="base" items="${bases}"/>

        <h3>Ingredients: </h3>
        <sf:checkboxes path="ingredients" items="${ingredients}"/>

        <table>
            <tr>
                <td>
                    <input type="submit" name="_eventId_addPizza" value="Add Pizza"/>
                </td>
                <td>
                    <input type="submit" name="_eventId_cancel" value="Cancel"/>
                </td>
            </tr>
        </table>

    </sf:form>
</div>
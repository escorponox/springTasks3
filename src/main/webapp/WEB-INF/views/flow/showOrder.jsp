<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <h2>Order: </h2>
    <sf:form method="post" modelAttribute="order">
        <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>

        <h3>Customer: </h3>
        <table cellspacing="3">
            <tr>
                <td>Phone Number:</td>
                <td><c:out value="${order.customer.phoneNumber}"/></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><c:out value="${order.customer.name}"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><c:out value="${order.customer.address}"/></td>
            </tr>
            <tr>
                <td>ZIP Code:</td>
                <td><c:out value="${order.customer.zipCode}"/></td>
            </tr>
        </table>
        <h3>Pizzas: </h3>
        <table cellspacing="3">
            <tr>
                <th>Base</th>
                <th>Ingredients</th>
            </tr>
            <c:forEach items="${order.pizzas}" var="pizza">
                <tr>
                    <td><c:out value="${pizza.base.toString()}"/></td>
                    <td>
                        <c:forEach items="${pizza.ingredients}" var="ingredient">
                            <c:out value="${ingredient.toString()} "/>
                        </c:forEach>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <h3>Cost: </h3>
        <table>
            <tr>
                <td>Total:</td>
                <td><c:out value="${order.payment.amount}"/></td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <input type="submit" name="_eventId_createPizza" value="Create Pizza"/>
                </td>
                <td>
                    <input type="submit" name="_eventId_checkOut" value="Check Out"/>
                </td>
                <td>
                    <input type="submit" name="_eventId_cancel" value="Cancel"/>
                </td>
            </tr>
        </table>

    </sf:form>
</div>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div>
    <h2>Create a new Entity</h2>

    <sf:form method="post" modelAttribute="beanEntity">
        <fieldset>
            <table cellspacing="0">
                <tr>
                    <td><sf:label path="titulo">Titulo: </sf:label></td>
                    <td><sf:input path="titulo"/></td>
                    <td><sf:errors path="titulo"/></td>
                </tr>
                <tr>
                    <td><sf:label path="numero">Numero: </sf:label></td>
                    <td><sf:input path="numero"/></td>
                    <td><sf:errors path="numero"/></td>
                </tr>
                <tr>
                    <td><input type="submit"/></td>
                </tr>
            </table>
        </fieldset>
    </sf:form>
</div>
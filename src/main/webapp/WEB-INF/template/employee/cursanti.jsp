<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <table class="responsive table">
        <tr>
            <th>Id</th>
            <th>Numar cursanti</th>
            <th>Nivel cunostinte</th>


        </tr>
        <tr>
            <th>${cursanti.getId()}</th>
            <th>${cursanti.getNumarCursanti()}</th>
            <th>${cursanti.getNivelCunostinte()}</th>
        </tr>
    </table>



</t:layout>

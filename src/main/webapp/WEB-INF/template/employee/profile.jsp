<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <table class="responsive table">
        <tr>
            <th>Id</th>
            <th>Nume</th>
            <th>Prenume</th>
            <th>ID Functie</th>
        </tr>
        <tr>
            <th>${profile.getId()}</th>
            <th>${profile.getNume()}</th>
            <th>${profile.getPrenume()}</th>
            <th>${profile.getIdFunctie()}</th>
        </tr>
    </table>
</t:layout>
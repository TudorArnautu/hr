<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <table class="responsive table">
        <tr>
            <th>Id</th>
            <th>Data</th>
            <th>Id Angajat</th>
        </tr>
        <tr>
            <th>${consultatii.getId()}</th>
            <th>${consultatii.getData()}</th>
            <th>${consultatii.getIdAngajat()}</th>
        </tr>
    </table>
</t:layout>
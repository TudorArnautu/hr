<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <table class="responsive table">
        <tr>
            <th>Id</th>
            <th>Tip Concediu</th>
            <th>Data</th>
            <th>Id Angajat</th>
        </tr>
        <tr>
            <th>${concedii.getId()}</th>
            <th>${concedii.getTipConcediu()}</th>
            <th>${concedii.getData()}</th>
            <th>${concedii.getIdAngajat()}</th>
        </tr>
    </table>
</t:layout>

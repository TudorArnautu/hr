<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>

    <h1 class="page-header">Concedii</h1>

    <ol class="breadcrumb">
        <li>
            <i class="fa fa-dashboard"></i>  <a href="/">Dashboard</a>
        </li>
        <li class="active">
            <i class="fa fa-file"></i> Concedii
        </li>
    </ol>

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

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <h1 class="page-header">Consultatii medicale</h1>

    <ol class="breadcrumb">
        <li>
            <i class="fa fa-dashboard"></i>  <a href="/">Dashboard</a>
        </li>
        <li class="active">
            <i class="fa fa-file"></i> Consultatii medicale
        </li>
    </ol>

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
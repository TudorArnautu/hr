<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <h1 class="page-header">Cursuri</h1>

    <ol class="breadcrumb">
        <li>
            <i class="fa fa-dashboard"></i>  <a href="/">Dashboard</a>
        </li>
        <li class="active">
            <i class="fa fa-file"></i> Cursuri
        </li>
    </ol>


    <table class="responsive table">
        <tr>
            <th>Id</th>
            <th>Nume curs</th>
        </tr>
        <tr>
            <th>${cursuri.getId()}</th>
            <th>${cursuri.getNumeCurs()}</th>
        </tr>
    </table>
</t:layout>
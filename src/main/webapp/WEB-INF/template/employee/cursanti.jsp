<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:layout>
    <h1 class="page-header">Cursanti</h1>

    <ol class="breadcrumb">
        <li>
            <i class="fa fa-dashboard"></i>  <a href="/">Dashboard</a>
        </li>
        <li class="active">
            <i class="fa fa-file"></i> Cursanti
        </li>
    </ol>

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

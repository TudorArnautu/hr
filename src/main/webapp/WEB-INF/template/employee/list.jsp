<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:layout>
    <h1 class="page-header">Angajati</h1>

    <ol class="breadcrumb">
        <li>
            <i class="fa fa-dashboard"></i>  <a href="/">Dashboard</a>
        </li>
        <li class="active">
            <i class="fa fa-file"></i> Angajati
        </li>
    </ol>

    <table class="responsive table">
        <tr>
            <th>Nume</th>
            <th>Prenume</th>
            <th></th>
        </tr>
        <c:forEach items="${angajati}" var="angajat">
            <tr>
                <td>${angajat.getNume()}</td>
                <td>${angajat.getPrenume()}</td>
                <td>
                    <a href="/employee/${angajat.getId()}/profile">Profil</a>
                    | <a href="/employee/${angajat.getId()}/cv">CV</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</t:layout>
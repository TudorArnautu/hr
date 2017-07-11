<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <h1 class="page-header">CV</h1>

    <ol class="breadcrumb">
        <li>
            <i class="fa fa-dashboard"></i>  <a href="/">Dashboard</a>
        </li>
        <li class="active">
            <i class="fa fa-file"></i> CV
        </li>
    </ol>


    <table class="responsive table">
    <tr>
        <th>Id</th>
        <th>Nume</th>
        <th>Prenume</th>
        <th>Adresa</th>
        <th>Telefon</th>
        <th>Email</th>
        <th>Nationalitate</th>
        <th>Data nastere</th>
        <th>Sex</th>
        <th>Oras</th>
        <th>Tara</th>
        <th>Educatie</th>
        <th>Experienta</th>
    </tr>
        <tr>
            <th>${cv.getId()}</th>
            <th>${cv.getNume()}</th>
            <th>${cv.getPrenume()}</th>
            <th>${cv.getAdresa()}</th>
            <th>${cv.getTelefon()}</th>
            <th>${cv.getEmail()}</th>
            <th>${cv.getNationalitate()}</th>
            <th>${cv.getDataNastere()}</th>
            <th>${cv.getSex()}</th>
            <th>${cv.getOras()}</th>
            <th>${cv.getTara()}</th>
            <th>${educatie.getDescriere()}</th>
            <th>${experienta.getDescriere()}</th>

        </tr>
    </table>



</t:layout>







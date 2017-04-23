<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
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

        </tr>
    </table>



</t:layout>







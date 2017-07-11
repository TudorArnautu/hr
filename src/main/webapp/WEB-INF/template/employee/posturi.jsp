<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
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
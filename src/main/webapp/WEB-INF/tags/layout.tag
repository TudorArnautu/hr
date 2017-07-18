<%@tag description="Overall Page template" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>HR Application</title>

    <link href="/theme/css/bootstrap.min.css" rel="stylesheet">

    <link href="/theme/css/sb-admin.css" rel="stylesheet">

    <link href="/theme/css/plugins/morris.css" rel="stylesheet">

    <link href="/theme/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div id="wrapper">
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">HR Application</a>
        </div>

        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li><a href="/manager/raport">Manager raport</a></li>
                <li><a href="/employee/list">Angajati</a></li>
                <li>
                    <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Angajat <i class="fa fa-fw fa-caret-down"></i></a>
                    <ul id="demo" class="collapse">
                        <li><a href="/employee/concedii">Concedii</a></li>
                        <li><a href="/employee/profile">Profil</a></li>
                        <li><a href="/employee/consultatiiMedicale">Consultatii medicale</a></li>
                        <li><a href="/employee/posturi">Posturi</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>

    <div id="page-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <jsp:doBody/>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="/theme/js/jquery.js"></script>
<script src="/theme/js/bootstrap.min.js"></script>

<script src="/theme/js/plugins/morris/raphael.min.js"></script>
<script src="/theme/js/plugins/morris/morris.min.js"></script>
<script src="/theme/js/plugins/morris/morris-data.js"></script>

</body>

</html>

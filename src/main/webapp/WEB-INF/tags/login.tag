<%@tag description="Overall Page template" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Bootstrap Admin Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="/theme/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/theme/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="/theme/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/theme/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>


<body>

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <jsp:doBody/>
        </div>
    </div>
</div>

<!-- jQuery -->
<script src="/theme/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="/theme/js/bootstrap.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="/theme/js/plugins/morris/raphael.min.js"></script>
<script src="/theme/js/plugins/morris/morris.min.js"></script>
<script src="/theme/js/plugins/morris/morris-data.js"></script>

</body>
</html>
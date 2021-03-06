<%@tag description="Overall Page template" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>HR</title>

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

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <jsp:doBody/>
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
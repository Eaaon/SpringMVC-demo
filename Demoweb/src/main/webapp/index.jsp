<html>
<head>
    <meta charset="UTF-8">
    <title>Just a demo</title>
</head>
<body>
<h2>Hello World!</h2>
<a href="http://localhost:8080/home/demo">click jump</a>
<form action="">
    <input type="text" id="demoname" />
    <button onclick="simpleClick()">click</button>
</form>
</body>
</html>
<script type="text/javascript" src="/js/jquery-3.2.1.js"></script>

<script type="text/javascript">
    function simpleClick() {
        var demoName = document.getElementById("demoname").value;
        console.info("--" + demoName);
        $.ajax({
            type: 'get',
            url: 'http://localhost:8080/home/value',
            data: {'name':demoName} ,
            dataType:'json',
            async:false,
            success:function(data) {
                console.info(data);
            },
            error:function (data) {
                console.info(data);
            }
        });
    }
</script>

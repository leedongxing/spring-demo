<%--
  Created by IntelliJ IDEA.
  User: lidongxing
  Date: 2017/12/29
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){
            $("#getList").click(function(){
                $.ajax({
                    url:'http://b2c.jcloud.com/item/getList',
                    //url:'http://i360mall.com/item/getList',
                    type:'get',
                    success:function(result){
                        alert(JSON.stringify(result));
                    }
                });
            });
        });
    </script>
</head>
<body>
 <input type="button" id="getList" value="获取"/>
</body>
</html>

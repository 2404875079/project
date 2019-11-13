$(function () {


    $.ajax({
        url: "/user/findById",
        type: "post",
        dataType: "json",
        data: {},
        success: function (data) {
            var user = $("#userList");
            user.append("<div><span > 用户名 : </span>" + data.u_username + "</div>" +
                "<div><span > 昵称 : </span>" + data.u_name + "</div>" +
                "<div><span > 性别 : </span>" + data.u_sex + "</div>" +
                "<div><span > 邮箱 : </span>" + data.u_email + "</div>" +
                "<div><span > 用户积分 : </span>" + data.u_score + "</div>")
        }
    });
    $.ajax({
        url: "/user/findById",
        type: "post",
        dataType: "json",
        success: function (data) {
            var user = $("#update");
            user.prepend("<div class=\"form-group\">\n" +
                "<label for=\"exampleInputEmail1\">昵称</label>\n" +
                "<input type=\"name\" name=\"u_name\" class=\"form-control\" id=\"exampleInputName\" placeholder=\"用户名\" value=" + data.u_name + ">" +
                "</div>" + "<div class=\"form-group\">\n" +
                "<label for=\"exampleInputEmail1\">邮箱</label>\n" +
                "<input type=\"email\" name=\"u_email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"邮箱\" value=" + data.u_email + ">" +
                "</div>"+"<div class=\"form-group\">\n"+
            "<div class=\"form-group\">\n" +
                "<label>性别：</label>\n" +
                "<input type=\"radio\" name=\"u_sex\" value=\"男\" chaecked=\"true\"><label>男</label>\n" +
                "<input type=\"radio\" name=\"u_sex\" value=\"女\"><label>女</label>\n" +
                "</div>");
            $("input[name='u_sex'][value='" + data.u_sex + "']").attr("checked", true);
        }
    });


    $("#out").click(function () {
        var update = $("#update").serialize();
        $.ajax({
            url: "/user/updateUser",
            data: update,
            type: "post",
            dataType: "json",
            success: function (data) {
                if(data.code==1){
                    alert("修改成功")
                }else if (data.code==0) {
                    alert("选项不能为空，请继续填写")
                }
            }
        });
    });
    function checkPasswordLength(pwd){
        return pwd.length>=6&&pwd.length<=9;
    }
    function checkPasswordEquals(){
        var exampleInputPassword=$("#exampleInputPassword").val(); //新密码
        var exampleInputPassword2=$("#exampleInputPassword2").val();  //确认新密码
        return exampleInputPassword==exampleInputPassword2;
    }
    $("#exampleInputPassword1").blur(function(){
        if(!checkPasswordLength($(this).val())){
            $("#oldPasswordSpan").text("密码长度在6-9位之间");
            $("#oldPasswordSpan").css("color","red");
        }else{
            $("#oldPasswordSpan").text("密码格式正确");
            $("#oldPasswordSpan").css("color","green");
        }
    });
    $("#exampleInputPassword").blur(function(){
        if(!checkPasswordLength($(this).val())){
            $("#newPasswordSpan").text("密码长度在6-9位之间");
            $("#newPasswordSpan").css("color","red");
        }else{
            $("#newPasswordSpan").text("密码格式正确");
            $("#newPasswordSpan").css("color","green");
        }
    });
    $("#exampleInputPassword2").blur(function(){
        //如果密码不一致
        if(!checkPasswordEquals()){
            $("#confirmPasswordSpan").text("密码与新密码不一致");
            $("#confirmPasswordSpan").css("color","red");
        }else{
            $("#confirmPasswordSpan").text("密码一致");
            $("#confirmPasswordSpan").css("color","green");
        }
    });
    $("#change").click(function () {
        var updatePd = $("#changePassword").serialize();
        $.ajax({
            url: "/user/updatePd",
            data: updatePd,
            type: "post",
            dataType: "json",
            success: function (data) {
                if(data.code==1){
                    alert("修改成功,请重新登录")
                }else if (data.code==0) {
                    alert("验证密码错误，请重新输入")
                }
            }
        });
    });
        $.ajax({
            url:"/article/findById",
            type: "post",
            dataType: "json",
            data: {},
            success:function (data) {
                var article = $("#cc");
                for (var i in data) {
                    var list = data[i];
                    article.append("<li class='subtitle'>"+list.a_headline+"</li>\n" +
                    "<div><span>点击量：</span>"+list.a_lookCount+";"+"<span>&nbsp&nbsp发表时间：</span>"+list.a_date+"</div>\n")
                }
            }
        });
        $.ajax({
            url:"/article/findAll",
            type:"post",
            dataType:"json",
            data:{},
            success:function (data) {
                var articleComment = $("#dd");
                for (var i in data) {
                    articleComment.append(
                        "<li class='subtitle'>你的评论:"+data[i].comment.c_content+"</li>" +
                        "<div><span>评论发表时间：</span>"+data[i].comment.c_date +"</div>"+
                        "<div class=\"subtitle\"><span>评论发表于：</span><"+data[i].a_headline+"></div>")
                }
            }
        })
});



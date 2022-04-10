function sign_in(){
    var name = $("#name").val();
    var password = $("#password").val();
    var login_identity = $("#login_identity").val();
    var param={
        "url":"login/selectUser.do",
        "method":"post",
        "dataType":"text",
        "data": { "name":name,"password":password,"login_identity":login_identity },
        "success":function (data) {
            if (data === "success"){
                window.location.href = "index.html";
            }else {
                alert("登录失败,请重新输入!")
            }
        }
    };
    $.ajax(param);
}
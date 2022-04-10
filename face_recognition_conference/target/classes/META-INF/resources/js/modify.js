function modify(){
    var name = $("#name").val();
    var password = $("#password").val();
    var login_identity = $("#login_identity").val();
    var phone_number = $("#phone_number").val();
    var param={
        "url":"login/updateUser.do",
        "method":"post",
        "dataType":"text",
        "data": { "name":name,"password":password,"login_identity":login_identity,"phone_number":phone_number},
        "success":function (data) {
            alert(data)
        }
    };
    $.ajax(param);
}
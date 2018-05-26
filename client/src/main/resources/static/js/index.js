$(function () {
    /*判断是否已经登录*/
    var _token = getCookie('_token');
    if(_token != null && _token != ''){
        $.getJSON('tokenUser/'+_token,function (data) {
            if(data.state == 200){
                data = JSON.parse(data.data);
                $('#login').hide();
                $('#logout').show();
            }
        });
    }
});
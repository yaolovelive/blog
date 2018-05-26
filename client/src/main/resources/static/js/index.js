$(function () {
    /*判断是否已经登录*/
    var _token = getCookie('_token');
    if (_token != null && _token != '') {
        $.getJSON('tokenUser/' + _token, function (data) {
            if (data.state == 200) {
                data = data.data;
                if (data != null && data != 'null' && data != '') {
                    $('#login').hide();
                    $('#logout').show();
                }
            }
        });
    } else {
        $('#login').show();
        $('#logout').hide();
    }

    /*登出*/
    $('#logout').click(function () {
        delCookie('_token');
        alert('已登出');
        window.location.reload();
    });
});
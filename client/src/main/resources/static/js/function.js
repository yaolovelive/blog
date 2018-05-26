/**
 * Created by jiangyao on 2018/5/25.
 */
/*设置cookie*/
function setCookie(c_name, c_value, expiredays) {
    var exdate = new Date();
    if(getCookie(c_name) != null || getCookie(c_name) != ''){
        exdate.setDate(exdate.getDate() - 99999);
        document.cookie = c_name + '=' + c_value + ((expiredays == null) ? "" : ";expires=" + exdate.toGMTString());
        exdate = new Date();
    }
    exdate.setDate(exdate.getDate() + exdate);
    document.cookie = c_name + '=' + c_value + ((expiredays == null) ? "" : ";expires=" + exdate.toGMTString());
}
/*获取cookie*/
function getCookie(c_name) {
    if (document.cookie.length > 0) {
        c_start = document.cookie.indexOf(c_name + "=")
        if (c_start != -1) {
            c_start = c_start + c_name.length + 1
            c_end = document.cookie.indexOf(";", c_start)
            if (c_end == -1) c_end = document.cookie.length
            return unescape(document.cookie.substring(c_start, c_end));
        }
    }
    return "";
}
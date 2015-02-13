/**
 * Created by dk on 15-1-27.
 */
$(function () {
    $.getJSON("test", function (blogList) {
        var html = "";
        $.each(blogList, function () {
            html += "<li><div class=\"arrow_box\"><div class=\"ti\"></div>";
            html += "<div class=\"ci\"></div><h2 class=\"title\"><a href=\"/\" target=\"_blank\">" + this.title + "</a></h2>";
            html += "<ul class=\"textinfo\"><a href=\"/\"><img src=" + this.image + "></a>";
            html += "<p>" + this.content + "</p></ul><ul class=\"details\">";
            html += "<li class=\"icon-time\"><a href=\"#\">" + this.time + "</a></li>";
            html += "</ul></div></li>";
        });
        $("#blogList").html(html);
    });
})
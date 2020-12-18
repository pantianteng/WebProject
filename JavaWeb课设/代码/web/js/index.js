$(document).ready(function() {
    var app1 = new Vue({
        el: "#goodsLocation",
        data: {
            locations: []
        }
    });

    var app2 = new Vue({
        el: "#payUnit",
        data: {
            units: []
        }
    });

    var app3 = new Vue({
        el: "#firstDirectory",
        data: {
            sbs: []
        }
    });

    var app4 = new Vue({
        el: "#secondDirectory",
        data: {
            names: []
        }
    });

    $.ajax({
        type: "post",
        url: "getLocation.do",
        data: "",
        dataType: "json",
        success: function(response) {
            app1.locations = response;
        }
    });
    $.ajax({
        type: "post",
        url: "getAllPayUnit.do",
        data: "",
        dataType: "json",
        success: function(response) {
            app2.units = response;
        }
    });

    $.ajax({
        type: "post",
        url: "getFirstDirectory.do",
        data: "",
        dataType: "json",
        success: function(response) {
            app3.sbs = response;
        }
    });


    $("#first").change(function(e) {
        if ($("#first").val() == "0") {
            alert("一级目录不可为空");
        } else {
            var f_id = $("#first").val();
            $.ajax({
                type: "post",
                url: "getSecondDirectory.do",
                data: "f_id=" + f_id,
                dataType: "json",
                success: function(response) {
                    app4.names = response;
                }
            });
        }
    });


    $("#goodsSave").click(function(e) {
        var goodsId = $("#goodsId").val();
        var goodsCode = $("#goodsCode").val();
        var goodsChrName = $("#goodsChrName").val();
        var payUnit = $("#pay_unit").val();
        var location = $("#location").val();
        var first = $("#first").val();
        var second = $("#second").val();
        if (
            $("#goodsId").val() != "" &&
            $("#goodsCode").val() != "" &&
            $("#goodsChrName").val() != "" &&
            $("#location").val() != "0" &&
            $("#pay_unit").val() != "0" &&
            $("#first").val() != "0" &&
            $("#second").val() != "0") {
            alert("数据正确");
            $.ajax({
                type: "post",
                url: "insertGoods.do",
                data: "goodsid=" + goodsId +
                    "&goodscode=" + goodsCode +
                    "&goodschrname=" + goodsChrName +
                    "&goodslocation=" + location +
                    "&payunit=" + payUnit +
                    "&firstdirectory=" + first +
                    "&seconddirectory=" + second,
                dataType: "json",
                success: function(response) {
                    alert(response.msg);
                }
            });
        } else {
            alert("数据存在为空情况");
        }
    });


});
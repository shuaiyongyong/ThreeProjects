$.post("fav.do/favList", function(data) {//data是个对象
	$(".content_links").empty();

	for (var i = 0; i < data.length; i++) {
		$(".content_links").append("<div style='padding: 6px 10px;'> <div>"
								+"<a href='"+data[i]. f_url+"'"
								+"style='color: blue; font-size: 18px;' target='_blank'>"+data[i].f_label+" </a> </div>"
							+"<div style='color: black; font-size: 16px;'>"+data[i].f_desc+"</div>"
							+"<div style='color: green; font-size: 14px;'> "+data[i].f_url+"</div> </div>");
	}
}, "json");

$.post("fav.do/tagList", function(data) {//data是个对象

	for (var i = 0; i < data.length; i++) {
		$(".labels_table").append("<tr>"
								+"<td><a href='javascript:void(0)'  onclick='show(this.text)'  class='name'>"+data[i].t_name+"</a></td>"
							+"</tr>");
	}
}, "json");

function add(){
	window.open ('page/toAdd.jsp', 'newwindow', 
	'height=400, width=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no');
}

function show(obj){
	$(".content_links").empty();
	
	$.get("fav.do/select?tag=" + obj,function(data){
		for (var i = 0; i < data.length; i++) {
			$(".content_links").append("<div style='padding: 6px 10px;'> <div>"
					+"<a href='"+data[i]. f_url+"'"
					+"style='color: blue; font-size: 18px;' target='_blank'>"+data[i].f_label+" </a> </div>"
				+"<div style='color: black; font-size: 16px;'>"+data[i].f_desc+"</div>"
				+"<div style='color: green; font-size: 14px;'> "+data[i].f_url+"</div> </div>");
		}

	}, "json");
	return false;
}

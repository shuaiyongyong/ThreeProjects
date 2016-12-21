function add(){
	var params=$("#addForm").serialize();
	$.post("fav.do/add",params ,function(data) {//data是个对象
		if(data.trim() == "true"){
			$.post("fav.do/addTag",params ,function(date) {
				if(date.trim() == "true"){
					alert("添加成功！！");
					location.replace("index.jsp")
					window.close();

				}else{
					alert("添加失败！！");
				}
			}, "json");
		}else{
			alert("添加失败！！")	
		}
	}, "json");
	return false;
}

function cancel(){
	if (confirm("您确定要关闭本页吗？")){
		window.opener=null;
		window.open('','_self');
		window.close();
	}
	else{

	}
}

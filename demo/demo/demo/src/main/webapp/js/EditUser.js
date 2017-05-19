/**
 * 
 */
 $(function(){
 	user.addUser();
 	user.getAll();
 });
 	
 var user={
 	addUser:function(){
 		$("#addUser").on("click",function(){
 			var name=$("#userName").val();
 			var id=$("#userid").val();
 			$.ajax({
 				url:webPath+"/user/saveUser.qbb",
 				data:{name:name},
 				dataType : 'json',
				cache : false,
				success : function(json) {
					if(json.code==200){
						location.reload();
					}else{
						alert("增加失败");
					}
				}
 			});
 		})
 	},
 	getAll:function(){
 		$.ajax({
 				url:webPath+"/user/getAll.qbb",
 				dataType : 'json',
				cache : false,
				success : function(json) {
					var html="";
					$.each(json,function(index,user){
							html+='<tr><td>'+user.id+'</td><td>'+user.name+'</td></tr>';
						});
					$("#usertable").html(html);
				}
 			});
 	}
 };
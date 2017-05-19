/**
 * 
 */
 $(function(){
 	user.addUser();
 	user.getAll(1);
 	user.Page();
 });
 var currpage,pages,nextpage,uppage;
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
 	getAll:function(num){
 		$.ajax({
 				url:webPath+"/user/getAll.qbb",
 				data:{pagenum:num},
 				dataType : 'json',
				cache : false,
				success : function(json) {
					console.log(json);
					var html="";
					$.each(json.list,function(index,user){
							html+='<tr><td>'+user.id+'</td><td>'+user.name+'</td></tr>';
						});
					$("#usertable").html(html);
					currpage=json.pageNum;
					pages=json.pages;
					nextpage=json.nextPage;
					uppage=json.pageNum-1;
				}
 			});
 	},
 	Page:function(){
 		$("#first").on("click",function(){
 			user.getAll(1);
 		});
 		
 		$("#up").on("click",function(){
 			if(currpage==1){uppage=1}
 			user.getAll(uppage);
 		});
 		
 		$("#next").on("click",function(){
 			if(currpage==pages){nextpage=pages}
 			user.getAll(nextpage);
 		});
 		
 		$("#last").on("click",function(){
 			user.getAll(pages);
 		});
 	}
 };
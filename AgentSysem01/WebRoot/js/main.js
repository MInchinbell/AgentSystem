//modifypwdbtna
//modifydiv
//oldpwdtext
//newpwd
//newpwd2
//modifypwdbtn
//modifypwdcancel
  $().ready(function(){
	  $("#modifypwdbtna").click(function(){
		  $("#modifydiv").show();
		  $("#oldpwdtext").val('');
		  $("#newpwd").val('');
		  $("#newpwd2").val('');
	  });
	  $("#newpwd").blur(function(){
		  if($("#newpwd").val()!=null)
			  $("#newpwdtip").css("color","green");
		  else
		  		$("#newpwdtip").css("color","red");
	  });
	  $("#newpwd2").blur(function(){
		  if($("#newpwd2").val()!=null)
			  $("#newpwd2tip").css("color","green");
		  else
		  		$("#newpwd2tip").css("color","red");
	  });
	$("#oldpwdtext").blur(function(){
		  if($("#oldpwdtext").val()!=null)
			  $("#oldpwdtexttip").css("color","green");
		  else
		  		$("#oldpwdtexttip").css("color","red");
	  });
	
	  $("#modifypwdbtn").click(function(){
		var oldpwdtext=$("#oldpwdtext").val();
  		var newpwd=$("#newpwd").val();
  		var newpwd2=$("#newpwd2").val();
  		if(oldpwdtext.length < 6){
  			$("#oldpwdtext").focus();
  			humane.error("请输入原始密码");
  		}else if(newpwd.lenth<6){
  			$("#newpwd").focus();
  			humane.error("密码长度不能小于6");
  		}else if(newpwd2.lenth<6){
  			$("#newpwd2").focus();
  			humane.error("密码长度不能小于6");
  		}else if(newpwd!=newpwd2)
  		{
  			humane.error("密码不一致！");
  		}else{
  			//提交
  			$.post("/modifypwd.action",{"user.userName":oldpwdtext,
  				'user.userPassword':newpwd
  				},function(result){
  				//"success"failed,
  					alert(result);
  				if(result=="success")
  				{
  					humane.success("密码修改成功");
  					 $("#modifydiv").hide();
  				}else{
  					humane.error("密码修改失败");
  				}
  			},'html')
  		}
		  
	  });
	  $("#modifypwdcancel").click(function(){
		  
		  $("#modifydiv").hide();
		  $("#oldpwdtext").val('');
		  $("#newpwd").val('');
		  $("#newpwd2").val('');
	  });
	 
	 
	
  });
var ajax = {};
ajax.post = function(url,data,func,failFunc){
	$.ajax({
	   type: "POST",
	   url: url,
	   dataType:"json",
	   contentType : 'application/json',
	   data: JSON.stringify(data),
	   success: function(rep){
	     if(func){
	        func(rep);
	     }
	   },
	   error:function(req){
	   	 if(failFunc){
	   	   failFunc(req);
	   	 }
	   }
	});
}
ajax.get = function(url,data,func,failFunc){
 	url = url.indexOf('?') > -1 ? url : (url + '?')
	$.ajax({
		  type: "GET",
		  url: url + $.param(data),
		   success: function(rep){
		     if(func){
		        func(rep);
		     }
		   },
		   error:function(req){
		   	 if(failFunc){
		   	   failFunc(req);
		   	 }
		   }
	});
}
var page = {};
page.toPage = function(url){
	window.location.href = url;
}


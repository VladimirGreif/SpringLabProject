<div>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>  
  <script>  
   function doAjaxPost() {  
      
//       alert("doAjaxPost");
    var id = $('#id').val();  

  
    $.ajax({  
     type : "Get",   
     url : "/SpringMVC/searchById",   
     data : "id=" + id,  
     success : function(response) {  
      alert("SUCCESS");   
     },  
     error : function(e) {  
      alert('Error !!!! ');   
     }  
    });  
   }  
  </script>
	<form name="searchForm" method="get" action="/SpringMVC/search/searchById">
		<table>
			<tr>
				<td>ID :</td>
				<td><input name="id" type="text" id="id" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Search by Id" /></td>
			</tr>
		</table>	
	</form>
</div>
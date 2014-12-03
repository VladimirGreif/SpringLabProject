<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%> 
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div>  
<h2>This is Some Company Employee list</h2> 
<h3>Look at these people and their positions now ...</h3>

	<ol class="persone-list"> 
	  <table>
		<c:forEach var="persone" items="${persones}">
		<s:url value="/persones/{personeName}" 
		var="spitter_url" >
			<s:param name="personeName" 
			value="${persone.personeName}" />
		</s:url>

			<tr>
			 <td>
				 <span class="spittleListImage"> 
					<img src='<s:url value="/resources/images"/>/van_small.gif' 
					width="48" 
					border="0" 
					align="middle" /> 
				</span> 
			</td>
			<td>
				<span class="spittleListText">
					<a href="${spitter_url}"> 
					<c:out value="${persone.personeJob}" /></a> 
					- <c:out value="${persone.personeName}" /><br/>
				</span>
				</td>
			 </tr> 
		  </c:forEach> 
		</table>
	</ol>



</div>
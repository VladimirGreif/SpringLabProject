<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div> 
	<h2>Create a new manager account</h2>
	<sf:form method="POST" modelAttribute="user"> 
		<fieldset> 
			<table cellspacing="0">
				<tr> 
				<th><label for="user_full_name">Full name:</label></th> 
					<td><sf:input path="userName" size="15" id="user_full_name"/></td>
				</tr> 
				<tr>
				<th><label for="user_screen_name">Username:</label></th> 
					<td><sf:input path="userNick" size="15" maxlength="15"
					id="user_screen_name"/>
					<small id="username_msg">No spaces, please.</small>
					</td> 
				</tr> 
				<tr>
				<th><label for="user_password">Password:</label></th> 
					<td><sf:password path="userPassword" size="10"
					showPassword="true" 
					id="user_password"/>
					<small>10 characters or more (be tricky!)</small> 
					</td>
				</tr>
				<tr> 
				<th><label for="user_email">Email Address:</label></th>
					<td><sf:input path="userMail" size="30" 
					id="user_email"/>
					<small>In case you forget something</small> 
					</td>
				</tr> 
			</table> 
		</fieldset> 
	</sf:form> 
</div>
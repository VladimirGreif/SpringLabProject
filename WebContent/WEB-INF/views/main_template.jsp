<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<html>
  <head>
    <title>Persone</title>
    <link href="<s:url value="/resources" />/css/persone.css" 
          rel="stylesheet" 
          type="text/css" />
  </head>

  <body>
    <div id="container">
      <a href="<s:url value="/home" />"><img 
          src="<s:url value="/resources" />/images/Vancouver Canucks reflection.png" 
          border="0"/></a>
      <div id="top">
        <t:insertAttribute name="top" /> <!--<co id="co_tile_top" />-->
      </div>
      <div id="side">
        <t:insertAttribute name="side" /> <!--<co id="co_tile_side" />-->
      </div>
      <div id="content">
        <t:insertAttribute name="content" /> <!--<co id="co_tile_content" />-->
      </div>
    </div>
  </body>
</html>
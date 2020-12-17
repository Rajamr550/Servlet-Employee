<%@ page import="java.util.*" %>

<%! int fontSize; %>
<html>
   <head>
      <title>FOR LOOP Example</title>
   </head>
   <body>
   
   
  
   
      <%for ( fontSize = 1; fontSize <= 3; fontSize++){ %>
         <font color = "green" size = "<%= fontSize %>">
            JSP Tutorial
         </font><br />
      <%}%>
   
		 
		  <%for ( Map.Entry<String,String> entry : LoginProcess.map.entrySet()){ %>
		  out.print(i + "." + mapElement.getKey());
        
      <%}%>
   	
   	
   
      
      
   </body>
</html>
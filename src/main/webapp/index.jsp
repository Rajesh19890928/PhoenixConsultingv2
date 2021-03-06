<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Home Page - Phoenix</title>
    </head>
    <body height="100%">
        <h1>Welcome to Phoenix Consulting</h1>
        <h4>Phoenix is one of the largest accounting firms and professional services network in the world by revenue and number of professionals.</h4>
        <br>
        <%
            JavaClasses.DBConnection obj = new JavaClasses.DBConnection();
            ResultSet rs = obj.getSubjects();
        %>

        
            <table border="0">
                <thead>
                    <tr>
                        <th>Please select an area you need help in: </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td height="0">
                            <br>
                            <form action="response.jsp" method="post">
                                <span class="plain-select">
                                <select name="subject_id">
                                    <%
                                    while (rs.next())
                                    {
                                    %>
                                    <option value="<% out.print(rs.getString("subject_id")); %>"> 
                                    <% out.print(rs.getString("name")); %>
                                    </option>
                                    <%
                                    }%>
                                </select>
                                </span>
                                <br>
                                <br>
                                <input type="submit" value="Submit" name="submit" />                                
                            </form>                            
                        </td>
                    </tr>
                </tbody>
            </table>
            <br><br>
            <!--<a href="contactus.jsp" name="contactus"> Contact Us</a>-->
            <%
            JavaClasses.ServerCategory server = new JavaClasses.ServerCategory();
            String servercategory = server.Server(request.getLocalAddr());
            %>
            <div class="topcorner"><% out.print(servercategory); %></div>
            
        <div class="footer" width="100%">
            <center>
                <table class = "footertable">
                    <tr>
                        <td><center><a href="#">about us</a></center></td>
                        <td><center><a href="#">tour</a></center></td>
                        <td><center><a href="#">help</a></center></td>
                        <td><center><a href="#">blog</a></center></td>
                <td><center><a href="#">chat</a></center></td>
                <td><center><a href="#">data</a></center></td>
                <td><center><a href="#">legal</a></center></td>
                <td><center><a href="#">privacy policy</a></center></td>
                <td><center><a href="#">careers</a></center></td>
                <td><center><a href="#">feedback</a></center></td>
                <td><center><a href="contactus.jsp">contact us</a></center></td>
                    </tr>
                </table>
            </center>
        </div>
    </body>
</html>

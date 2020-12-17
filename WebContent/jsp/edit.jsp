<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />



    </head>
    <link href="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css" rel="stylesheet" />

    <body>

        <form method="post" action="/One/UserReg" autocomplete="on">

            <input type="hidden" name="choice" value="1" />
            <div class="login">


                <div class="form-group">
                    <label> Firstname </label>

                    <input type="text" class="form-control" name="fname" size="15" placeholder="<%= session.getAttribute("fname") %>" /> <br>
                </div>

                <div class="form-group">
                    <label> Lastname </label>

                    <input type="text" class="form-control" name="lname" size="15"  placeholder="<%= session.getAttribute("lname") %>"/> <br>
                </div>

                <div class="form-group">
                    <label> Age </label>

                    <input type="number" class="form-control" name="age" min="17" max="65" placeholder="<%= session.getAttribute("age") %>"><br>
                </div>

                <div class="form-group">
                    <label> Mobile </label>

                    <input type="number" class="form-control" name="mobile" min="000000001" max="9999999999" placeholder="<%= session.getAttribute("mobile") %>"><br>
                </div>

                <input type="submit" class="btn btn-info" value="submit" /> <br>

            </div>


        </form>

    </body>

    </html>
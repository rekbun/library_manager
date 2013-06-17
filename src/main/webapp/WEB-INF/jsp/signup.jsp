<%@include file="taglib.jsp"%>
<html>
    <%@include file="header.jsp"%>

    <body>
        <div class="container">
            <form class ="form-signup" action="/signup" method="POST">
            <h2 class="form-signup-heading">Please sign up </h2>
            <input class="input-block-level" type="email" name="email" placeholder="directi email">
            <input class="input-block-level" type="password" name="password" placeholder="set a password">
            <input class="input-block-level" type="password" name="cPassword" placeholder="confirm password">
            <button class="btn btn-large btn-primary" type="submit">Sign up</button>
    </body>
</html>
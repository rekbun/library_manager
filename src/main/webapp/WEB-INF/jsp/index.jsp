<%@include file="taglib.jsp"%>
<html>
    <%@include file="header.jsp"%>
    <body>
        <div class ="container">
        <form class="form-signin" action="/login" method="POST">
                <h2 class="form-signin-heading">Please sign in </h2>
                <input class="input-block-level" type="email" name="email" placeholder="email"/>
                <input class="input-block-level" type="password" name="password" placeholder="password"/>
                <label class="checkbox">
                    <input type="checkbox" value="remember me"/>Remember me
                </label>
                <div class="row">
                <div class="span4">
                    <button class="btn btn-large btn-primary" type="submit">Sign in</button>
                    <a class="a-signup" href="/signup" >new user? <b>Sign up</b>
                </div>
            </form>
        </div>
    </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Waylon
  Date: 2022/11/29
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../../css/login.css">
</head>
<body>
<div>
    <div class="title">Blog Manage</div>
    <div class="banner">
        <form action="/login">
            <div class="user"><i class="icon-u"></i><input type="text" id="user" placeholder="Account" name="account"/>
            </div>
            <div class="password">
                <i class="icon-p"></i>
                <input type="password" placeholder="Password" id="password" name="password"/>
            </div>
            <button class="login" type="submit">Sign In</button>
        </form>
        <div class="remember">
            <el-switch
                    v-model="value"
                    active-color="rgba(58, 98, 215, 1)"
                    inactive-color="rgba(255, 255, 255, 0.25)"
            >
            </el-switch
            >
            <span class="active-text">Remember the password</span>
        </div>
        <div class="more">
            <a class="register" href="/register">Create Account</a>
            <a class="forget" href="#">Forget Password?</a>
        </div>
    </div>
</div>
</body>
</html>

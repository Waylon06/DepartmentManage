<%--
  Created by IntelliJ IDEA.
  User: Waylon
  Date: 2022/11/29
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--    <link rel="stylesheet" href="../../../css/login.css">--%>
    <style>
        * {
            padding: 0;
            margin: 0;
        }

        a {
            text-decoration: none;
        }

        li {
            list-style: none;
        }

        i {
            font-style: normal;
        }

        @font-face {
            font-family: 'icomoon';
            src: url('../../../fonts/icomoon.eot?2adm3n');
            src: url('../../../fonts/icomoon.eot?2adm3n#iefix') format('embedded-opentype'),
            url('../../../fonts/icomoon.ttf?2adm3n') format('truetype'),
            url('../../../fonts/icomoon.woff?2adm3n') format('woff'),
            url('../../../fonts/icomoon.svg?2adm3n#icomoon') format('svg');
            font-weight: normal;
            font-style: normal;
            font-display: block;
        }

        body {
            background: url("../../../img/BackGroundImg.jpg") no-repeat;
            background-size: cover;
        }

        .title {
            margin: 130px 0 auto;
            margin-left: 650px;
            color: rgba(255, 255, 255, 1);
            font-size: 36px;
        }

        .user,
        .password,
        .email {
            height: 60px;
            width: 440px;
            border-radius: 30px;
            opacity: 0.25;
            margin: 0 auto 24px;
            background-color: rgba(255, 255, 255, 1);
            border: 1px solid rgba(255, 255, 255, 1);
        }

        #user,
        #password,
        #email {
            width: 370px;
            height: 60px;
            opacity: 0.25;
            margin-left: 70px;
            border-top-right-radius: 30px;
            border-bottom-right-radius: 30px;
            border: none;
            outline: none;
        }

        .user {
            margin-top: 28px;
            position: relative;
        }

        .icon-u::before {
            font-family: "icomoon";
            content: "\e971";
            position: absolute;
            top: 18px;
            left: 35px;
            font-size: 20px;
        }

        .password {
            position: relative;
        }

        .icon-p::before {
            font-family: "icomoon";
            content: "\e98f";
            position: absolute;
            top: 18px;
            left: 35px;
            font-size: 20px;
        }

        .email {
            position: relative;
        }

        .icon-e::before {
            font-family: "icomoon";
            content: "\ea86";
            position: absolute;
            top: 18px;
            left: 35px;
            font-size: 20px;
        }

        input::-webkit-input-placeholder {
            /* color: rgba(211, 211, 211, 1); */
            font-size: 16px;
            font-family: SourceHanSansSC-regular;
            opacity: 1;
        }

        .register {
            margin: 0 548px;
            height: 60px;
            width: 440px;
            border-radius: 30px;
            margin-bottom: 30px;
            font-size: 16px;
            background-color: rgba(58, 98, 215, 1);
            color: rgba(255, 255, 255, 1);
            border: 1px solid rgba(58, 98, 215, 1);
        }

        .more {
            font-size: 18px;
            text-align: right;
        }

        .login {
            color: rgba(211, 211, 211, 1);
            cursor: pointer;
        }

        .login {
            margin-right: 550px;
        }
    </style>
</head>
<body>
<div class="title">Blog Manage</div>
<div class="banner">
    <form action="/adduser">
        <div class="user">
            <i class="icon-u"></i
            ><input type="text" id="user" placeholder="Account" name="account"/>
        </div>
        <div class="password">
            <i class="icon-p"></i
            ><input type="password" id="password" placeholder="password" name="password"/>
        </div>
        <div class="email">
            <i class="icon-e"></i
            ><input type="email" id="email" placeholder="email" name="email"/>
        </div>
        <button class="register" type="submit">Sign Up</button>
    </form>
    <div class="more">
        <a class="login" href="/">Registered?Here to sign in</a>
    </div>
</div>
</body>
</html>

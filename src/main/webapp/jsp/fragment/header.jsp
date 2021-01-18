<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<fmt:setBundle basename="prop.contentpage"/>

<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<nav class="navbar navbar-light navbar-expand-md navbar navbar-expand-lg fixed-top" id="mainNav">
    <div class="container">
        <a class="navbar-brand shadow-none js-scroll-trigger" id="brandLogo"
                              href="process_controller?command=move_home_page">EIS|Group</a>
        <button data-toggle="collapse" class="navbar-toggler navbar-toggler-right" data-target="#navbarResponsive"
                type="button" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"
                value="Menu"><i class="fa fa-bars"></i></button>
        <div class="collapse navbar-collapse text-success" id="navbarResponsive">
            <ul class="nav navbar-nav ml-auto">
                <li class="nav-item nav-link js-scroll-trigger" role="presentation">
                    <a class="nav-link js-scroll-trigger" href="process_controller?command=move_home_page">HOME</a>
                </li>
                <li class="nav-item nav-link js-scroll-trigger" role="presentation">
                    <a class="nav-link js-scroll-trigger"
                       href="process_controller?command=move_register_page">Contents insurance</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
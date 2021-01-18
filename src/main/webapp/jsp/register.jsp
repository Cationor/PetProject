<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<fmt:setBundle basename="prop.contentpage"/>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>EIS</title>
    <link href="https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Login-Form-Dark.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Pretty-Registration-Form.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body id="page-top" style="background-color: rgb(56,55,57);">
<c:import url="${pageContext.request.contextPath}/jsp/fragment/header.jsp"/>
<header class="masthead">
    <div class="intro-body">
    <div class="row register-form" id="register_form">
    <div class="col-md-8 offset-md-2">
        <form action="process_controller" method="post" class="shadow-lg custom-form" id="register" style="background-color: rgba(0,0,0,0.08); font-family: Nunito">
            <div class="form-row form-group" style="margin: 0px -5px 15px;">
                <div class="col-sm-4 label-column">
                    <label class="col-form-label">Registered object</label></div>
                <div class="col-sm-4 input-column">
                    <input class="form-control" name="registered_object" type="registered_object">
                </div>
            </div>
            <div class="form-row form-group">
                <div class="col-sm-4 label-column">
                    <label class="col-form-label">Sum insured</label></div>
                <div class="col-sm-4 input-column">
                    <input class="form-control" name="sum_insured" type="sum_insured" min="0" max="1000000000000" id="pass">
                </div>
            </div>
            <div class="form-row form-group">
                <div class="col-sm-4 label-column">
                    <label class="col-form-label">Contract currency</label></div>
                <div class="col-sm-4 input-column">
                    <input class="form-control" name="contract_currency" type="contract_currency" minlength="2" maxlength="30" id="passConf">
                </div>
            </div>
            <div class="form-row form-group">
                <div class="col-sm-4 label-column">
                    <label class="col-form-label">First name</label></div>
                <div class="col-sm-4 input-column">
                    <input class="form-control" name="first_name" type="first_name">
                </div>
            </div>
            <div class="form-row form-group">
                <div class="col-sm-4 label-column">
                    <label class="col-form-label label-column">Second name</label>
                </div>
                <div class="col-sm-4 input-column">
                    <input class="form-control" name="second_name" type="second_name">
                </div>
            </div>
            <div class="form-row form-group">
                <div class="col-sm-4 label-column"><label class="col-form-label">
                    Insurance coverage area</label></div>
                <div class="col-sm-4 input-column">
                    <input class="form-control" name="insurance_coverage_area" type="text">
                </div>
            </div>
            <div class="form-row form-group">
                <div class="col-sm-4 label-column"><label class="col-form-label">
                    Term of validity</label></div>
                <div class="col-4 input-column">
                    <input class="form-control form-control--date" type="date" name="term_of_validity" id="df">
                </div>
            </div>
            <div class="form-row form-group">
                <div class="col-sm-4 label-column"> <label class="col-form-label">Insurance type</label></div>
                <div class="col-sm-4 input-column"> <select class="form-control" name="insurance_type" id="orderSelect">
                    <option value="collision_coverage">Collision coverage</option>
                    <option value="comprehensive_coverage">Comprehensive coverage</option>
                </select></div>
            </div>
            <input type="hidden" name="command" value="REGISTER_POLICY">
            <button class="btn btn-light submit-button" type="submit" id="butt">
                Checkout</button>
        </form>
    </div>
    </div>
    </div>
</header>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
<script src="${pageContext.request.contextPath}/js/grayscale.js"></script>
<script src="${pageContext.request.contextPath}/js/date_range.js"></script>
</body>
</html>
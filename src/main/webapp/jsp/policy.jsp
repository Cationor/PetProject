<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<fmt:setBundle basename="prop.contentpage"/>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>EIS</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Login-Form-Dark.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Pretty-Registration-Form.css">
</head>

<body id="page-top" style="background-color: rgb(56,55,57);">
<header class="masthead">
    <div class="intro-body">
    <div class="col-md-6 offset-md-3">
        <form action="process_controller" method="get" class="shadow-lg custom-form" id="register" style="background-color: rgba(0,0,0,0.08); font-family: Nunito">
        <input type="hidden" name="command" value="MOVE_PDFPOLICY">
        <button class="btn btn-dark submit-button" type="submit" id="butt">
            CREATE PDF</button>
        </form>
        <form action="process_controller" method="get" class="shadow-lg custom-form" id="register" style="background-color: rgba(0,0,0,0.08); font-family: Nunito">
        <input type="hidden" name="command" value="MOVE_JSONPOLICY">
            <button class="btn btn-dark submit-button" type="submit" id="butt">
                CREATE JSON</button>
        </form>



    <%--            <div class="col-8">--%>
<%--                <label id="labelPage">Property insurance contract</label>--%>
<%--            ${requestScope.policyList.firstName} ${requestScope.policyList.secondName}, hereinafter referred to as--%>
<%--                the insurer,has entered into an agreement, hereinafter the Agreement, with the company EIS|GROUP about--%>
<%--                the following--%>
<%--                <label id="labelPage">scope of agreement </label>--%>
<%--                According to this contract, the Insurer undertakes upon the occurrence of one of the insured events--%>
<%--                stipulated in the contract that entailed the loss or damage of property of the--%>
<%--                ${requestScope.policyList.registeredObject}, type hereinafter referred to as the type hereinafter--%>
<%--                referred to as the "Insured Property", pay compensation in the amount of--%>
<%--                ${requestScope.policyList.sumInsured} currency units such as--%>
<%--                '${requestScope.policyList.contractCurrency}'. Insurance works only in--%>
<%--                ${requestScope.policyList.insuranceCoverageArea} and until${requestScope.policyList.termOfValidity}--%>
<%--                <label id="labelPage">JSON</label>--%>
<%--            ${requestScope.gsonKey}--%>
<%--                <label id="labelPage">PDF version of the policy was saved in the tomcat folder</label>--%>
            </div>
    </div>
</header>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
<script src="${pageContext.request.contextPath}/js/grayscale.js"></script>
</body>

</html>
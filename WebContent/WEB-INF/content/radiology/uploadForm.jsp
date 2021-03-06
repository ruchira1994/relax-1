<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">

<head>
		<link href="<s:url value="/css/dashboard-component.css" includeParams="none"/>" rel="stylesheet" type="text/css">
		<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
		<title><s:text name="global.application.title" /></title>
		<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>
		<style type="text/css">
			body {
			  background-color: #eee;
			}
			
			.form-signin {
			  max-width: 330px;
			  padding: 15px;
			  margin: 0 auto;
			}
			.form-signin .form-signin-heading,
			.form-signin .checkbox {
			  margin-bottom: 10px;
			}
			.form-signin .checkbox {
			  font-weight: 400;
			}
			.form-signin .form-control {
			  position: relative;
			  box-sizing: border-box;
			  height: auto;
			  padding: 10px;
			  font-size: 16px;
			}
			.form-signin .form-control:focus {
			  z-index: 2;
			}
			.form-signin input[type="email"] {
			  margin-bottom: -1px;
			  border-bottom-right-radius: 0;
			  border-bottom-left-radius: 0;
			}
			.form-signin input[type="password"] {
			  margin-bottom: 10px;
			  border-top-left-radius: 0;
			  border-top-right-radius: 0;
			}
		</style>
		 
</head>

<body class="nav-md">

    <div class="container body">
        <div class="main_container">
            <s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
            <s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>
            
            <div class="row"></div>
                <script>
			      function fileValidation(){
			        var fileInput = document.getElementById('fileUpload');
			        var filePath = fileInput.value;
			        var allowedExtensions = /(\.jpg|\.jpeg|\.png|\.gif)$/i;
			        if(!allowedExtensions.exec(filePath)){
			            alert('Please upload file having extensions .jpeg/.jpg/.png/.gif only.');
			            fileInput.value = '';
			            return false;
			        }
			      }
			    </script>

		<!-- page content -->
		<div class="right_col" role="main" style="margin-bottom:40px;">
		<s:actionerror />
		
		<s:form namespace="/upload" cssClass="form-signin" action="uploaded" method="POST" enctype="multipart/form-data">
	        <h2 class="form-signin-heading">Image Upload</h2>
	        <hr>
	        <s:textfield required="required" title="Patient Id" type="text" cssClass="form-control" id="patientid" name="patientId" placeholder="Patient Id" />
	   		<br>
	        <s:file type="file" required="required" id="fileUpload" name = "fileUpload" cssClass="form-control" onchange="return fileValidation()" placeholder="Image"/>      
	        <br>    
	        <s:submit cssClass="btn btn-lg btn-primary btn-block" value="Upload"></s:submit>
      	</s:form>

      	</div>

		<!-- /page content -->

		</div>
	</div>

    <s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
    <!-- Custom Theme Scripts -->
    <s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

</body>
</html>



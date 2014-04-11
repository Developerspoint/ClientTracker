<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<style>
		* {font-family: 'Segoe UI';}
		.tabbable .tabs {list-style: none; margin: 0 10px; padding: 0;}
		.tabbable .tabs li {list-style: none; margin: 0; padding: 0; display: inline-block; position: relative; z-index: 1;}
		.tabbable .tabs li a {text-decoration: none; color: #000; border: 1px solid #ccc; padding: 5px; display: inline-block; border-radius: 5px 5px 0 0; background: #f5f5f5;}
		.tabbable .tabs li a.active, .tabbable .tabs li a:hover {border-bottom-color: #fff; background: #fff;}
		.tabcontent {border: 1px solid #ccc; margin-top: -1px; padding: 10px;}
	</style>
	
	<script src="resources/js/jquery-1.5.2.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(document).ready(function(){
		    $(".tabbable").find(".tab").hide();
		    $(".tabbable").find(".tab").first().show();
		    $(".tabbable").find(".tabs li").first().find("a").addClass("active");
		    $(".tabbable").find(".tabs").find("a").click(function(){
		        tab = $(this).attr("href");
		        $(".tabbable").find(".tab").hide();
		        $(".tabbable").find(".tabs").find("a").removeClass("active");
		        $(tab).show();
		        $(this).addClass("active");
		        return false;
		    });
		});
	</script>
</head>
<body>
	<div class="tabbable">
	    <ul class="tabs">
	        <li><a href="#addNewClient">Add New Client</a></li>
	        <li><a href="#policyInformation">Policy Information</a></li>
	        <li><a href="#additionalInformation">Additional Information</a></li>
	    </ul>
	    <div class="tabcontent">
	        <div id="addNewClient" class="tab">
	            <div>
	            	<form:form action="addClient.do" commandName="addClient" method="post">
		            	<table>
		            		<tr>
		            			<td><form:label path="name">Client name</form:label></td>
		            			<td><form:input path="name"/></td>
		            		</tr>
		            		<tr>
		            			<td><form:label path="phoneNumber">Phone number</form:label></td>
		            			<td><form:input path="phoneNumber"/></td>
		            		</tr>
		            		<tr>
		            			<td><form:label path="addressLine1">Address</form:label></td>
		            			<td><form:input path="addressLine1"/></td>
		            		</tr>
		            		<tr>
		            			<td><form:label path="userPolicyNumber">User policy number</form:label></td>
		            			<td><form:input path="userPolicyNumber"/></td>
		            		</tr>
		            		<tr>
		            			<td><form:label path="userPolicyType">User policy type</form:label></td>
		            			<td>
		            				<form:select path="userPolicyType">
		            					<form:option value="lic">LIC</form:option>
		            					<form:option value="mediclaim">Mediclaim</form:option>
		            					<form:option value="motor">Motor</form:option>
		            				</form:select>
		            			</td>
		            		</tr>
		            		<tr>
		            			<td><form:label path="referrerName">Referrer name</form:label></td>
		            			<td><form:input path="referrerName"/></td>
		            		</tr>
		            		<tr>
		            			<td><form:label path="referrercontactNumber">Referrer contact number</form:label></td>
		            			<td><form:input path="referrercontactNumber"/></td>
		            		</tr>
		            		<tr>
		            			<td><form:label path="referrerAddressLine1">Referrer address line1</form:label></td>
		            			<td><form:input path="referrerAddressLine1"/></td>
		            		</tr>
		            		<tr>
		            			<td></td>
		            			<td><input type="submit" value="Add Client"/></td>
		            		</tr>
		            	</table>
	            	</form:form>
	            </div>
	        </div>
	        <div id="policyInformation" class="tab">
	            <div>
	            	<form action="#">
		            	<table>
		            		<tr>
		            			<td title="(Plan / Term / Expiry Year)">Table term number</td>
		            			<td><input type="text" name="tableTermNumber"/></td>
		            		</tr>
		            		<tr>
		            			<td title="Start date of policy">Date of commencement (DOC)</td>
		            			<td><input type="text" name="dateOfCommencement"/></td>
		            		</tr>
		            		<tr>
		            			<td>Proposal date</td>
		            			<td><input type="text" name="proposalDate"/></td>
		            		</tr>
		            		<tr>
		            			<td>Proposal number</td>
		            			<td><input type="text" name="proposalNumber"/></td>
		            		</tr>
		            		<tr>
		            			<td>Mode of payment</td>
		            			<td>
		            				<select name="modeOfPayment">
										<option value="quarterly">Quarterly</option>
										<option value="halfyearly">Half Yearly</option>
										<option value="yearly">Yearly</option>		            				
		            				</select>
		            			</td>
		            		</tr>
		            		<tr>
		            			<td>Sum assured (SA)</td>
		            			<td><input type="text" name="sumAssured"/></td>
		            		</tr>
		            		<tr>
		            			<td>Premium amount</td>
		            			<td><input type="text" name="premiumAmount"/></td>
		            		</tr>
		            		<tr>
		            			<td>Party commission amount</td>
		            			<td><input type="text" name="partyCommisionAmount"/></td>
		            		</tr>
		            		<tr>
		            			<td>Policy group name</td>
		            			<td><input type="text" name="policyGroupName"/></td>
		            		</tr>
		            		<tr>
		            			<td></td>
		            			<td><input type="submit" value="Add Client"/></td>
		            		</tr>
		            	</table>
	            	</form>
	            </div>
	        </div>
	        <div id="additionalInformation" class="tab">
	        	<div style="padding: 1% 0% 2% 1%;">
	        		<span>More information of Himanshu (Client)</span>
	            	<form action="#">
	            		<div style="width: 50%; float: left;">
			            	<table>
			            		<tr>
			            			<td>Email ID</td>
			            			<td><input type="text" name="emailId"/></td>
			            		</tr>
			            		<tr>
			            			<td>Date of birth</td>
			            			<td><input type="text" name="dateOfBirth"/></td>
			            		</tr>
			            		<tr>
			            			<td>Address Line1</td>
			            			<td><input type="text" name="addressLine1"/></td>
			            		</tr>
			            		<tr>
			            			<td>Landmark</td>
			            			<td><input type="text" name="landMark"/></td>
			            		</tr>
			            		<tr>
			            			<td>District</td>
			            			<td><input type="text" name="district"/></td>
			            		</tr>
			            		<tr>
			            			<td>Country</td>
			            			<td><input type="text" name="country"/></td>
			            		</tr>
			            	</table>
	            		</div>
	            		<div style="width: 50%; float: right;">
			            	<table>
			            		<tr>
			            			<td>Gender</td>
			            			<td>
			            				<select name="gender">
											<option value="male">Male</option>
											<option value="female">Female</option>
											<option value="common">Common</option>		            				
			            				</select>
			            			</td>
			            		</tr>
			            		<tr>
			            			<td>Anniversary date</td>
			            			<td><input type="text" name="anniversaryDate"/></td>
			            		</tr>
			            		<tr>
			            			<td>Address Line2</td>
			            			<td><input type="text" name="addressLine2"/></td>
			            		</tr>
			            		<tr>
			            			<td>City / Town</td>
			            			<td><input type="text" name="cityOrTown"/></td>
			            		</tr>
			            		<tr>
		            				<td>State</td>
			            			<td><input type="text" name="state"/></td>
			            		</tr>
			            		<tr>
			            			<td>Pin code</td>
			            			<td><input type="text" name="pinCode"/></td>
			            		</tr>
			            	</table>
		            	</div>	
						<div>
							<table>
								<tr><td></td><td><input type="submit" value="Save"/></td></tr>
							</table>
						</div>
					</form>
	        	</div>
	            <div style="border-top: 1px solid #CFCFCF; padding: 1% 0% 0% 1%;">
	            	<span>More information of Mohit (Referrer)</span>
	            	<form action="#">
	            		<div style="width: 50%; float: left;">
			            	<table>
			            		<tr>
			            			<td>Email ID</td>
			            			<td><input type="text" name="emailId"/></td>
			            		</tr>
			            		<tr>
			            			<td>Date of birth</td>
			            			<td><input type="text" name="dateOfBirth"/></td>
			            		</tr>
			            		<tr>
			            			<td>Address Line1</td>
			            			<td><input type="text" name="addressLine1"/></td>
			            		</tr>
			            		<tr>
			            			<td>Landmark</td>
			            			<td><input type="text" name="landMark"/></td>
			            		</tr>
			            		<tr>
			            			<td>District</td>
			            			<td><input type="text" name="district"/></td>
			            		</tr>
			            		<tr>
			            			<td>Country</td>
			            			<td><input type="text" name="country"/></td>
			            		</tr>
			            	</table>
	            		</div>
	            		<div style="width: 50%; float: right;">
			            	<table>
			            		<tr>
			            			<td>Gender</td>
			            			<td>
			            				<select name="gender">
											<option value="male">Male</option>
											<option value="female">Female</option>
											<option value="common">Common</option>		            				
			            				</select>
			            			</td>
			            		</tr>
			            		<tr>
			            			<td>Anniversary date</td>
			            			<td><input type="text" name="anniversaryDate"/></td>
			            		</tr>
			            		<tr>
			            			<td>Address Line2</td>
			            			<td><input type="text" name="addressLine2"/></td>
			            		</tr>
			            		<tr>
			            			<td>City / Town</td>
			            			<td><input type="text" name="cityOrTown"/></td>
			            		</tr>
			            		<tr>
		            				<td>State</td>
			            			<td><input type="text" name="state"/></td>
			            		</tr>
			            		<tr>
			            			<td>Pin code</td>
			            			<td><input type="text" name="pinCode"/></td>
			            		</tr>
			            	</table>
		            	</div>	
						<div>
							<table>
								<tr><td></td><td><input type="submit" value="Save"/></td></tr>
							</table>
						</div>
					</form>
	            </div>
	        </div>
	    </div>
	</div>
	<div>
		<h4><a href="<%=request.getContextPath()%>/listOfClient.do">Get Clients List</a></h4>
	</div>
</body>
</html>
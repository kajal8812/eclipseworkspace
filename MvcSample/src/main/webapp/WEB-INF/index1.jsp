<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

 <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Welcome to Effigo</title>
  
  
  
        
        
        
        
        
        
        
  
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
  <link href="<c:url value="resources/css/Task.css"></c:url>" rel="stylesheet" type="text/css" />
  
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script language="javascript" src="resources/js/jquery-3.7.0.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  
  
  
  
</head>







<body>


 
 <form id="form1" action="requestorname" method="post">

    <div class="body">
   
      <div class="ncc">
        <label><b>NCC</b></label>
      </div>
      <div class="requisitioncreation">
        <h2>Requisition Creation</h2>
      </div>
      <div class="nameimage">
        <div class="name">
          <select id="clientname" name="requestorName" >
            <option value="" disabled selected hidden>Name</option>
             <option>C.Antani Khanjan Kumar </option>
                        <option>R.Antani Khanjan Kumar </option>
                         <option>Smith </option>
                         <option>Allen </option>
                         <option>Jones </option>
          </select>
        </div>
        <div class="image">
                  <img src="resources/images/effigo.jpg" width="55px">
         
        </div>
      </div>

    </div>





    


<div style="margin:8px 8px;border:1px solid lightblue;padding:8px 8px;">
      <h2 class="nr">New Requisition</h2>
      <br>
      <br>
     
      <div class="row1">
        <div class="r1c1">
          <label>Requestor</label>
          <p id="requestor" ></p>
        </div>
          <form:errors path="requisition.businessUnit" /> 
        <div class="r1c2" style="width:300px;">
          <label >Business Unit<span>*</span></label>
          <select name="businessUnit" >
           <option value="" disabled selected hidden>Select</option>
            <option >NCC Ltd-Mines</option>
            <option>NCC Ltd-water</option>
            <option>construction</option>
          </select>
        </div>

        <div class="r1c3" style="width:300px;">
          <label>Requisition Date</label>

          <input type="date" id="date" name="requisitionDate" />
        </div>

        <div class="r1c4" style="width:300px;">
          <label>PO Type<span>*</span></label>

          <select name="poType" >
          <option value="" disabled selected hidden>Select</option>
            <option>Work Order</option>
            <option>Goods</option>
            <option>Regular</option>
          </select>
        </div>
      </div>
      <br />
      <form:errors path="requisition.requisitionTitle" /> 
      <div class="row2">
        <div class="r2c1" style="width:500px;">
          <label>Requisition Title<span>*</span></label>
          <input type="text" name="requisitionTitle" placeholder="title" size="40" class="error"  />
        </div>
        <div class="r2c2" style="width:400px;">
          <label>Requisition Type<span>*</span></label>
          <select name="requisitionType" >
          <option value="" disabled selected hidden>Select</option>

            <option>Goods</option>
            <option>Material</option>
            <option>spares</option>
          </select>
        </div>

        <div class="r2c3" style="width:350px;"><input type="checkbox" />Urgent</div>
      </div>
      <br />

      <div class="row3">
        <div class="r3c1" style="width:500px;">
          <label>Select On Behalf Of User<span>*</span></label>
           <select name="ofUser" >
          <option value="" disabled selected hidden>Select</option>
            <option>Pavani</option>
            <option>Sourabh</option>
            <option>Pavan</option>
          </select>
        </div>

        <div class="r3c2" style="width:500px;">
          <label>Currency<span>*</span></label>
          <select name="currency" >
          <option value="" disabled selected hidden>Select</option>
            <option>INR</option>
            <option>Dollar</option>
            <option>Euro</option>
          </select>
        </div>
      </div>
      <br>

      <div class="row4">
        <div class="r4c1" style="width:700px;">
          <label>Project</label>
          <select >
          <option value="" disabled selected hidden>Select</option>
            <option>MKD OCM WCL</option>
          </select>
        </div>

        <div class="r4c2" style="width:700px;">
          <label>Cost Center Per<span>*</span></label>
          <div class="r4c2f" style="margin-top:-5px;">
            <input type="radio"  name="ccp"  value="Requisition" />Requisition
            <input type="radio" name="ccp"  value="Item"/>Item
          </div>
        </div>

        <div class="r4c3" style="width:700px;">
          <label>Cost Center<span>*</span></label>
          <!-- <i class="bi bi-pencil"></i> -->
          <input type="text" name="costcenter"  />
        </div>
      </div>
      <br />

      <div class="row5">
        <div class="r5c1" style="width:800px;">
          <label>Warehouse Address<span>*</span></label>
          <textarea maxlength="550" rows="9" cols="30" name="warehouseaddress" ></textarea>
        </div>

  <form:errors path="requisition.buildingAddress" /> 
        <div class="r5c2" style="width:800px;">
          <label>Building Address<span>*</span></label>
          <input type="text" size="40" name="buildingAddress"  />
        </div>
      </div>
      <br>
      <button type="submit" form="form1" style="float:center;">Save</button>
      </div>
      </form>
      
      
      
      
      <br>
      
          <br>
      
      
      
      
      <div class="r"  style="float:right;margin-top:-45px;margin-right:10px;" >
                <div class="bs-example">
                    <!-- Button HTML (to Trigger Modal) -->
                    <button type="button" class="btn btn-lg btn-primary">Search</button>
               
                    <!-- Modal HTML -->
                    <div id="myModal" class="modal fade" tabindex="-1">
                        <div class="modal-dialog" style="max-width: 95%;" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title"> Items </h5>
                                    <button type="button" class="close" data-dismiss="modal">
                                        &times;
                                    </button>
                                </div>

                                <div class="modal-body">
                                    <label>Type:<span>*</span></label>
                                    <input type="radio" name="radio" class="type" value="Goods"  >Goods
                                    <input type="radio" name="radio" class="type" value="Services">Services
                                    <br>
                                    <br>
                                    
                                    <div class="row1" style="display:flex;flex-direction:row;">

                                        <div class="selectcategory" style="padding-right:200px;">
                                          <label>Category:</label>  
                                          <input type="text" id="selectcategory">
                                      </div>
                                        
                      <div class="selectsub" style="padding-right:200px;">
                 <label>SubCategory:</label>  
                       <input type="text" id="selectsub">
                          </div>

                                            <div class="name" style="padding-right:150px;padding-top:0px">
                                            <label>ItemName:</label>
                                            <input type="text"  id="itemname" name="itemname" >
                                        </div>
                       
                                        </div> 
                                        <br>


                                       <div class="row2" style="display:flex;flex-direction:row;">
                                        <div class="quantity" style="padding-right:200px;">
                                        <label>Quantity:</label><br>
                                            <input type="text" id="quantity">
                                        </div>

                                        <div class="estimatedprice" style="padding-right:200px;padding-top:0px;">
                                        <label>Estimated Price:</label><br>
                                            <input type="text" id="estimatedprice">
                                        </div>
                                        </div>

                                   
                                    <br>
                                    <br>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">
                                            Close
                                        </button>
                                        <button type="button" class="btn btn-primary" id="add">Add</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>



</div>
                </div>
                
                
                
                
                
                
                
                
           <div id="searchdetails" style="border:1px solid lightblue;background-color:white;margin:20px 10px;padding:8px 8px;">  
           <form id="form2" action="itemdetails" method="post">
           <div class="rrooww1" style="display:flex;flex-direction:row">
           
           <div class="r1c11"  style="padding-right:250px;">
            <label >Type:<span>*</span></label>
            <input type="text" id="gs" name="type" readonly>
        </div>
          
                
   <div class="r1c12"  style="padding-right:250px;">
                <label >Category:<span >*</span></label>
                <input type="text" id="category" name="category" readonly >
            </div>
            
      
      <div class="r1c13" style="padding-right:250px;">
                <label >SubCategory:<span >*</span></label>
                <input type="text" id="subcategory" name="subCategory" readonly>
            </div>
            
          
            
            </div> 
            
            <div class="rrooww2" style="display:flex;flex-direction:row">
            
            <div class="r2c11" style="padding-right:250px;">
                <label >ItemName:<span >*</span></label>
                <input type="text" id="iname" name="itemName" readonly>
            </div>
            
            
            
            <div class="r2c12" style="padding-right:250px;">
                <label >Quantity:<span >*</span></label>
                <input type="text" id="quant" name="quantity" readonly >
            </div>
            
            
            
            <div class="r2c13" style="padding-right:250px;">
                <label >EstimatedPrice:<span >*</span></label>
                <input type="text" id="price" name="estimatedPrice" readonly >
            </div>
            
            
           
      
      
      </div>
      
    
            
       <div class="rrooww3" style="display:flex;flex-direction:row">
             <div class="r3c11" style="padding-right:250px;display:flex;flex-direction:column">
                <label >RequisitionID:<span >*</span></label>
                <input type="text" id="ID" name="requisitionId" >
            </div>
            </div>
      <br>
      <br>
      
      
      
       <button type="submit" form="form2" style="float:center;">Add</button>
      
      
      </form>
      </div>
      
      
      
     
      
      
      
    



  
  









<a href="<c:url value='/getAll'/>" style="text-decoration:none;cursor:pointer;float:right;border:1px solid lightblue;width:100px;height:25px;text-align:center;" > View</a><br>


<form id="uploadForm" enctype="multipart/form-data">
  Select:  <input type="file" name="file" id="fileInput">
   
    <button type="button" id="uploadButton">Upload</button>
  
</form>

 <div id="message" style="color:red;"></div>
 
 
 <br>
 <hr>
              
</body>    
<script language="javascript" src="resources/js/Task.js"></script>    
<script>
$(".btn").click(function () {
    //$("#myModal").modal("show");
    
   
    
    $("#myModal").modal({
        backdrop: 'static',
        keyboard: false
    });
});

var val;
var GetValue1;
var GetValue2;
var GetValue3;
var GetValue4;
var GetValue5;
$(".type") // select the radio by its id
.change(function () { // bind a function to the change event
    if ($(this).is(":checked")) { // check if the radio is checked
        val = $(this).val(); // retrieve the value
        // $("#gs").val(val);
    }

});


$("#selectcategory").on("change", function () {
    GetValue1 = $("#selectcategory").val();

    // $("#category").val(GetValue1);
});


$("#selectsub").on("change", function () {
    GetValue2 = $("#selectsub").val();
    // $("#sub").val(GetValue2);
});
$("#itemname").on("change", function () {
    GetValue3 = $("#itemname").val();
    // $("#sub").val(GetValue2);
});
$("#quantity").on("change", function () {
    GetValue4 = $("#quantity").val();
    // $("#sub").val(GetValue2);
});
$("#estimatedprice").on("change", function () {
    GetValue5 = $("#estimatedprice").val();
    // $("#sub").val(GetValue2);
});

$("#add").click(function () {
    //             
    $("#gs").val(val);
    $("#category").val(GetValue1);
    $("#subcategory").val(GetValue2);
    $("#iname").val(GetValue3);
    $("#quant").val(GetValue4);
    $("#price").val(GetValue5);
    $("#myModal").hide();
    $('body').removeClass('modal-open');       
    $('.modal-backdrop').remove();             
    $(".btn").click();    
});                                
              
                     
                 


    $("#uploadButton").click(function() {
        var formData = new FormData($("#uploadForm")[0]);
       
        $.ajax({
            url: "http://localhost:8080/MvcSample/upload",
            type: "POST",
            data: formData,
            processData: false,
            contentType: false,
            success: function(response) {
            	$("#message").text("File uploaded Successfully");
            },
            error: function() {
            	 $("#message").text("File upload failed.");
            }
        });
    });

</script>
  
</html>
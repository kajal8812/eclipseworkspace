<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Info</title>
  </head>
  <body>
  <!-- <form  method="post" id="myForm"> -->  
    <h2 style="color:red;">Record Have been saved successfully</h2>
    <table class="table" id="mytable">
  <thead>
    <tr>
    <th scope="col">Id</th>
      <th scope="col">BusinessUnit</th>
      
      <th scope="col">RequisitionTitle</th>
     
     
      <th scope="col">Currency</th>
      <th scope="col">BuildingAddress</th>
      <th scope="col">Date</th>
      
  <!--       <th scope="col">Type</th>
        <th scope="col">category</th>
         <th scope="col">SubCategory</th>
          <th scope="col">ItemName</th>
           <th scope="col">Quantity</th>
            <th scope="col">EstimatedPrice</th>
     <th scope="col">view</th>-->
     
      
      
      
     
      
      
    </tr>
  </thead>
            
            
        
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td >${requisition.businessUnit  }</td>
      <td>${requisition.requisitionTitle }</td>
                                                            
      
      <td>${requisition.currency }</td>
      <td>${requisition.buildingAddress }</td>
      <td>${requisition.requisitionDate }</td>
      
      
      
     <!--  
      <td>${details.type }</td>
      <td>${details.category }</td>
      <td>${details.subCategory }</td>
      <td>${details.itemName }</td>
      <td>${details.quantity }</td>
      <td>${details.estimatedPrice }</td>
    <td> <button id="submit">view</button></td>-->
     
    
      </tr>
      
     
            
    
</tbody>
</table>








    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

  <!--  </form> -->
   
   <!--  <form id="form2" >
   
   <h1 style="text-align:center;color:red;">Requisition Details</h1>
   <div id="rc" style="border:2px solid lightblue;margin:10px 10px;padding:5px 5px;">
   <div id="r1" style="display:flex;flex-direction:row;">
   <div id="r1c1" style=" width: 355px;padding-right: 150px;">
   <label style="color:blue;">Business Unit:</label>
   <p>${requisition.businessUnit }</p>
   </div>
   
   <div id="r1c2" style=" width: 355px;padding-right: 150px;">
   <label style="color:blue;">Requisition Title:</label>
   <p>${requisition.requisitionTitle }</p>
   </div>
   
   
   
   
   
   
   
   <div id="r2" style="display:flex;flex-direction:row;">
   <div id="r2c1" style=" width: 355px;padding-right: 200px;">
   <label style="color:blue;">currency:</label>
   <p>${requisition.currency }</p>
   </div>
   
   <div id="r2c2" style=" width: 355px;padding-right: 200px;">
   <label style="color:blue;">Building Address:</label>
   <p>${requisition.buildingAddress }</p>
   </div>
   
   <div id="r2c3" style=" width: 355px;padding-right: 150px;">
  <label style="color:blue;"> Requisition Date:</label>
   <p>${requisition.requisitionDate }</p>
   </div>
          
   </div>
   
   
   
   <div id="r3" style="display:flex;flex-direction:row;">
   <div id="r3c1" style=" width: 355px;padding-right: 200px;">
   <label style="color:blue;">Type:</label>
   <p>${details.type }</p>
   </div>
   
   <div id="r3c2" style=" width: 355px;padding-right: 200px;">
   <label style="color:blue;">Category:</label>
   <p>${details.category }</p>
   </div>
   
   <div id="r3c3" style=" width: 355px;padding-right: 150px;">
  <label style="color:blue;"> SubCategory:</label>
   <p>${details.subCategory }</p>
   </div>
          
   </div>
   
   
   
   <div id="r4" style="display:flex;flex-direction:row;">
   <div id="r4c1" style=" width: 355px;padding-right: 200px;">
   <label style="color:blue;">ItemName:</label>
   <p>${details.itemName}</p>
   </div>
   
   <div id="r4c2" style=" width: 355px;padding-right: 200px;">
   <label style="color:blue;">Quantity:</label>
   <p>${details.category }</p>
   </div>
   
   <div id="r4c3" style=" width: 355px;padding-right: 150px;">
  <label style="color:blue;"> EstimatedPrice:</label>
   <p>${details.estimatedPrice }</p>
   </div>
          
   </div>
   
   
   
   
   
   
   </div>
   
   </form>
   -->
  </body>
  
  
  
</html>
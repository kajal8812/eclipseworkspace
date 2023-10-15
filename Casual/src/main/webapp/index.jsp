<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Welcome to Effigo</title>
  <link href="Task.css" rel="stylesheet" />
  <!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css"> -->
  <!-- <style>
    .body {
      display: flex;
      flex-direction: row;
      border: 1px solid lightgrey;
      margin-top: -6px;
      padding-top: -35px;
      width: 100%;
      margin-left: -6px;
      padding-bottom: -15px;


    }

    .ncc {

      width: 500px;
      padding-top: 10px;
    }

    .requisitioncreation {
     /* color: aqua; */
      color:rgb(27, 160, 165);
      padding-top: -5px;
      width: 555px;
    }

    .nameimage {



      display: flex;
      flex-direction: row;


    }

    .name {

      margin-right: 15px;
      padding-top: 15px;
    }

    .image {
      padding-right: 2px;
      padding-top: -25px;
    }

    #clientname {
      border: none;
      outline: none;
      scroll-behavior: smooth;
    }

    #requestor {

      margin-top: 2px;
    }

    #attr {
      border: 1px solid lightblue;
      margin: 25px 15px;
      padding-left: 10px;
      height: 1055px;
    }
  </style> -->
</head>


<!-- <script>
  $('#jquery-upload-button').click(function(){
    let formData=new FormData();
    let file=$('#file')[0].files[0];
    formData.append('file',file);


  $.ajax({
 url:'upload.php',
 type: 'post',
 data:formData,
 contentType:false,
 processData:false,
 success: function(data){
  if(data!=0){
    alert('successful jquery file upload to: '+ data);
  }
  else{
    alert('jquery file upload error.');
  }
 }

  });








    
  });

    
    


</script> -->





<body>
  <form action="draft" id="frm" method="post">


    <div class="body">
      <div class="ncc">
        <label><b>NCC</b></label>
      </div>
      <div class="requisitioncreation">
        <h2>Requisition Creation</h2>
      </div>
      <div class="nameimage">
        <div class="name">
          <select id="clientname" name="requestorName" required>
            <option value="" disabled selected hidden>Name</option>
             <option>C.Antani Khanjan Kumar </option>
                        <option>R.Antani Khanjan Kumar </option>
                         <option>Smith </option>
                         <option>Allen </option>
                         <option>Jones </option>
          </select>
        </div>
        <div class="image">
          <img src="effigo.jpg" width="55px">
        </div>
      </div>

    </div>





    <div id="attr">

      <h2 class="nr">New Requisition</h2>
      <h2>Basic Information</h2>
      <div class="row1">
        <div class="r1c1">
          <label>Requestor</label>
          <p id="requestor" ></p>
        </div>
        <div class="r1c2">
          <label>Business Unit<span>*</span></label>
          <select name="businessUnit" required>
           <option value="" disabled selected hidden>Select</option>
            <option >NCC Ltd-Mines</option>
            <option>NCC Ltd-water</option>
            <option>construction</option>
          </select>
        </div>

        <div class="r1c3">
          <label>Requisition Date</label>

          <input type="text" id="date" size="15" />
        </div>

        <div class="r1c4">
          <label>PO Type<span>*</span></label>

          <select name="poType" required>
          <option value="" disabled selected hidden>Select</option>
            <option>Work Order</option>
            <option>Goods</option>
            <option>Regular</option>
          </select>
        </div>
      </div>
      <br />
      <div class="row2">
        <div class="r2c1">
          <label>Requisition Title<span>*</span></label>
          <input type="text" name="title" placeholder="title" size="40" class="error" required />
        </div>

        <div class="r2c2">
          <label>Requisition Type<span>*</span></label>
          <select name="requisitionType" required>
          <option value="" disabled selected hidden>Select</option>

            <option>Goods</option>
            <option>Material</option>
            <option>spares</option>
          </select>
        </div>

        <div class="r2c3"><input type="checkbox" />Urgent</div>
      </div>
      <br />

      <div class="row3">
        <div class="r3c1">
          <label>Select On Behalf Of User<span>*</span></label>
          <select>
            <option>Select</option>
          </select>
        </div>

        <div class="r3c2">
          <label>Currency<span>*</span></label>
          <select name="currency" required>
          <option value="" disabled selected hidden>Select</option>
            <option>INR</option>
            <option>Dollar</option>
            <option>Euro</option>
          </select>
        </div>
      </div>
      <br>

      <div class="row4">
        <div class="r4c1">
          <label>Project</label>
          <select >
          <option value="" disabled selected hidden>Select</option>
            <option>MKD OCM WCL</option>
          </select>
        </div>

        <div class="r4c2">
          <label>Cost Center Per<span>*</span></label>
          <div class="r4c2f">
            <input type="radio"  name="ccp"  value="Requisition" required/>Requisition
            <input type="radio" name="ccp"  value="Item"/>Item
          </div>
        </div>

        <div class="r4c3">
          <label>Cost Center<span>*</span></label>
          <!-- <i class="bi bi-pencil"></i> -->
          <input type="text" name="costcenter" required />
        </div>
      </div>
      <br />

      <div class="row5">
        <div class="r5c1">
          <label>Warehouse Address<span>*</span></label>
          <textarea maxlength="550" rows="9" cols="30" name="warehouseaddress" required></textarea>
        </div>

        <div class="r5c2">
          <label>Building Address<span>*</span></label>
          <input type="text" size="40" name="buildingaddress" required />
        </div>
      </div>
      <br>









      <div id="od">
        <h2>Other Details</h2>
        <div class="rc">
          <div class="col1">
            <div class="col1r1">
              <label>Requisition Purpose</label>
              <textarea cols="20" rows="5" maxlength="500"></textarea>
              <br>
            </div>

            <div class="col1r2">
              <label>Notes to Approver</label>
              <textarea cols="20" rows="5" maxlength="500"></textarea>
              <br>
            </div>
            <div class="col1r3">
              <label>Notes to Buyer</label>
              <textarea cols="20" rows="5" maxlength="500"></textarea>
              <br>
            </div>






            <!-- <div class="col1r4">
              <label>BOQ Upload</label>
              <div class="col1r4up">
                <div class="col1r4-1">
                  <label for="imageUpload">Upload</label>
                  <input type="file" id="imageUpload" style="display: none">
                </div>
                <div class="col1r4-2">
                  <label for="imageUpload">Start Upload</label>
                  <input type="file" id="imageUpload" style="display: none">
                </div>
              </div>
            </div> -->

            <!-- <form id='fileUpload' onsubmit="return false;">
              File <input type='file' id='file' multiple="multiple">
              <button onclick="uplaod();">Upload</button>
            </form> -->
           

            <!--  <form action="FileUpload" enctype="multipart/form-data" method="post" id="upload">

             
            </form>
            -->

 Select<input type="file" name="file2" /><br>
              <input type="button" value="upload" id="upload" />





            <br>

            <span>Note:Please upload .xls|.xslx|.doc|.pdf|.jpeg file only!</span>
          </div>





          <div class="col2">
            <div class="col2r1">
              <label>Notes to Supplier</label>
              <textarea cols="20" rows="5" maxlength="500"></textarea>
              <br>
            </div>


            <div class="col2r2">
              <label>Delivery Instructions</label>
              <textarea cols="20" rows="5" maxlength="500"></textarea>
              <br>
            </div>

            <div class="col2r3">
              <label>Terms & Conditions(or Attach Document)</label>
              <textarea cols="20" rows="5" maxlength="500"></textarea>
              <br>
            </div>

          </div>




        </div>
        <hr>




       
        <input type="submit" value="draft" id="draftrequisition" >
        <input type="button" value="Back" id="back">

      </div>
</div>


  </form>

  <script src="jquery-3.7.0.min.js"></script>
  <script src="Task.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"
    integrity="sha512-rstIgDs0xPgmG6RX1Aba4KV5cWJbAMcvRCVmglpam9SoHZiUCyQVDdH2LPlxoHtrv17XWblE/V/PP+Tr04hbtA=="
    crossorigin="anonymous" referrerpolicy="no-referrer"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>








  <!-- // $("form").submit(function (event) {
//   v

//   $.ajax({
//     type: "POST",
//     url: "process.php",
//     data: formData,
//     dataType: "json",
//     encode: true,
//   }).done(function (data) {
//     console.log(data);
//   });

//   event.preventDefault();
// });
//  -->







</body>



</html>

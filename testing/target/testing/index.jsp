<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>



<form id="frm" method="post">


    <div class="body">
      <div class="ncc">
        <label><b>NCC</b></label>
      </div>
      <div class="requisitioncreation">
        <h2>Requisition Creation</h2>
      </div>
      <div class="nameimage">
        <div class="name">
          <select id="clientname">
            <option value="" disabled selected hidden>Name</option>
            <option>C.Antani Khanjan Kumar </option>
            <option>R.Antani Khanjan Kumar </option>
          </select>
        </div>
        
      </div>

    </div>





    <div id="attr">

      <h2 class="nr">New Requisition</h2>
      <h2>Basic Information</h2>
      <div class="row1">
        <div class="r1c1">
          <label>Requestor</label>
          <p id="requestor"></p>
        </div>
        <div class="r1c2">
          <label>Business Unit</label>
          <select>
            <option>NCC Ltd-Mines</option>
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

          <select name="potype">
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
          <input type="text" name="title" placeholder="title" size="40" class="error" />
        </div>

        <div class="r2c2">
          <label>Requisition Type<span>*</span></label>
          <select>

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
          <select>
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
          <select>
            <option>MKD OCM WCL</option>
          </select>
        </div>

        <div class="r4c2">
          <label>Cost Center Per<span>*</span></label>
          <div class="r4c2f">
            <input type="radio" checked="checked" name="ccp" />Requisition
            <input type="radio" name="ccp" />Item
          </div>
        </div>

        <div class="r4c3">
          <label>Cost Center<span>*</span></label>
          <!-- <i class="bi bi-pencil"></i> -->
          <input type="text" name="costcenter" />
        </div>
      </div>
      <br />

      <div class="row5">
        <div class="r5c1">
          <label>Warehouse Address<span>*</span></label>
          <textarea maxlength="550" rows="9" cols="30" name="warehouseaddress"></textarea>
        </div>

        <div class="r5c2">
          <label>Building Address<span>*</span></label>
          <input type="text" size="40" name="buildingaddress" />
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


        

<form id='fileUpload' onsubmit="return false;">
				File <input type='file' id='file' multiple="multiple">
				<button onclick="uplaod();">Upload</button>
			</form>






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




        <input type="submit" value="Draft Requisition" id="draftrequisition">
        <input type="button" value="Back" id="back">

      </div>


  </form>
  

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"
  integrity="sha512-rstIgDs0xPgmG6RX1Aba4KV5cWJbAMcvRCVmglpam9SoHZiUCyQVDdH2LPlxoHtrv17XWblE/V/PP+Tr04hbtA=="
  crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js" ></script>
 <script>
$(document).ready(function () {
  $("#clientname").on("change", function () {
    var Value = $("#clientname").val();


    $("#requestor").text(Value);
  });


 
	
	uplaod = function(){
		
		var data = new FormData();
		jQuery.each(jQuery('#file')[0].files, function(i, file) {
		    data.append('file-'+i, file);
		});
		
		$.ajax({
			url:'fileUpload',
			data: data,
		    cache: false,
		    contentType: false,
		    processData: false,
			type:'POST',
			success: function(response){
				if(response.Status == 200){
					alert(response.SucessfulList);
				}else{
					alert('Error');
				}
			
					
			}				
		});
		
	});
	</script>




















 

 
 
 
 
 
 
 
 
 
 
 
 
 

</body>
</html>


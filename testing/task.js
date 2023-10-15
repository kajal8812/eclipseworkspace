$(document).ready(function () {
  $("#clientname").on("change", function () {
    var Value = $("#clientname").val();


    $("#requestor").text(Value);
  });
  


  $("#frm").validate({

    rules: {
      title: "required",
      costcenter: "required",
      warehouseaddress: "required",
      buildingaddress: "required",

    },
    messages: {

    },
    submitHandler: function (form) {


      alert("Succesfully drafted");

    }

  });
});



  // $('#jquery-upload-button').click(function () {
  //   let formData = new FormData();
  //   let file = $('#file')[0].files[0];
  //   formData.append('file', file);


  //   $.ajax({
  //     url: 'http://localhost:8080/FileUpload/WEB-INF/classes/com/upload/FileuploadController.java',
  //     type: 'post',
  //     data: formData,
  //     contentType: false,
  //     processData: false,
  //     success: function (data) {
  //       if (data != 0) {
  //         alert('successful jquery file upload to: ' + data);
  //       }
  //       else {
  //         alert('jquery file upload error.');
  //       }
  //     }

  //   });

  // })

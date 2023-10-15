$(document).ready(function () {



    $(".btn").click(function () {
        //$("#myModal").modal("show");
        $("#myModal").modal({
            backdrop: 'static',
            keyboard: false
        });
    });



    var GetValue1;
    var GetValue2;
    var GetValue3;
    var GetValue4;
    var val;

    $("#selectcategory").on("change", function () {
        GetValue1 = $("#selectcategory").val();

        // $("#category").val(GetValue1);
    });


    $("#selectsubcategory").on("change", function () {
        GetValue2 = $("#selectsubcategory").val();
        // $("#sub").val(GetValue2);
    });

    $("#selectl3category").on("change", function () {
        GetValue3 = $("#selectl3category").val();
        // $("#l3").val(GetValue3);
    });

    $("#itemname").on("change", function () {
        GetValue4 = $("#itemname").val();
        // $("#name").val(GetValue4);
    });


    $(".type") // select the radio by its id
        .change(function () { // bind a function to the change event
            if ($(this).is(":checked")) { // check if the radio is checked
                val = $(this).val(); // retrieve the value
                // $("#gs").val(val);
            }

        });

    $("#add").click(function () {
        //             var x = document.getElementsByClassName('p2r3')[0];
        // if (x.style.display === "none") {
        // x.style.display = "block";
        // } else {
        // x.style.display = "none";
        // }

        $("#category").text(GetValue1);
        $("#sub").text(GetValue2);
        $("#l3").text(GetValue3);
        $("#name").text(GetValue4);
        $("#gs").text(val);
        $("#myModal").hide();
        $('body').removeClass('modal-open');
        $('.modal-backdrop').remove();
        $(".btn").click();

    })
    
  /*  $("#si").click(function(){
		if(GetValue1==null  )
		alert("Please select category");
		else if(GetValue4==null)
		alert("Please select Itemname");
		else if(val==null)
		alert("Please select TYpe");
	});*/



    // $("#frm").validate({

    //     rules: {


    //        requestorName:"required",
    //        selectcategory:"required",
    //         quantity: {
    //             required: true,
    //             number: true,
    //         },
    //         uom: "required",
    //         estimatedprice: "required",


    //     },
    //     messages: {
	// 		 requestorName:"This field is required",
	// 		  selectcategory:"This field is required",
    //         quantity: {
    //             required: "This field is required",
    //             number: "please enter in number format",
    //         },
    //         uom: "This field is required",
    //         estimatedprice: "This field is required",

    //     },
    //     submitHandler: function (form) {



    //         alert("You have opted this category" + " " + $("#selectcategory").val());

    //     }

    // });

    // var invisibleDiv = document.getElementsByClassName('p2r3')[0];
    // invisibleDiv.style.display = "none";






});

var loginUser;

function showPlaces() { 
	$.ajax({
		type : "GET",		
		url : "../places",
		dataType : "json",
		success : function(data){
			var list = data == null ? [] : (data instanceof Array ? data : [ data ]);
			$('#cinema_theater').empty();
			
			$.each(list, function(index, place) { 
				var li = $('<li class="span3"> </li>');
				var div4 = $('<div class="product-box" id="cinema_theater"> </div>');
				var span1 = $('<span class="sale_tag"> </span>');
				var p1 = $('<p><a href="product_detail.html"><img src="./themes/images/cinemas/croped.jpg" alt="" /></a></p> ');
				var a1 = $('<a href="product_detail.html" class="title">' + place.name + '</a><br/>');
				var a2 = $('<a href="products.html" class="category">' + place.address + '</a>');
				
				div4.append(span1);
				div4.append(p1);
				div4.append(a1);
				div4.append(a2);
				li.append(div4);
				$('#cinema_theater').append(li);
			});
			
			$('#place_list').show();
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("AJAX ERROR: " + errorThrown);
		}
	})
}


function showFriends(){
	$.ajax({
		type : 'GET',
		url : "../users/allFriends",
		dataType : "json",
		success : function(data){
			var list = data == null ? [] : (data instanceof Array ? data : [ data ]);
			$('#my_friends').empty();
			
			$.each(list, function(index, user) {
			
				var li = $('<li class="span3"> </li>');
				var div4 = $('<div class="product-box" id="friends"> </div>');
				var span1 = $('<span class="sale_tag"> </span>');
				var p1 = $('<p><a href="product_detail.html"><img src="./themes/images/user.jpg" alt="" /></a></p> ');
				var a1 = $('<a href="product_detail.html" class="title">' + user.name + " " + user.surname+ ' </a><br/>');
				var a2 = $('<a href="products.html" class="category">'+ user.email + '</a>');
				var a3 = $('<form id="delete_friend"> <input type="button" id="delete_btn" class="btn" value="Delete" >'+
				'<input type="hidden" name="username" id="username" value=' + user.email +'> </form>' );
				
				
				div4.append(span1);
				div4.append(p1);
				div4.append(a1);
				div4.append(a2);
				div4.append(a3);
				li.append(div4);
				$('#myFriends').append(li);
			});
			
			$('#friends_list').show();
			
				
			
		}
	});
}

$(document).on('click', '#delete_friend', function(event){
	var user = {};
	var email = $(this).find("input[type=hidden]").val();
	$.ajax({
		type : "GET",		
		url : "../users/deleteFriendship?email=" + email,
		contentType : "application/json",
		success : function(data){
			alert(data.message);
			location.reload();
		},
		error : function(data){
			alert(data.message);

		}
	})
})


function showReservation(){
	$.ajax({
		type : "GET",		
		url : "../reservation",
		dataType : "json",
		success : function(data){
			var list = data == null ? [] : (data instanceof Array ? data : [ data ]);
			$('#my_reservations').empty();
			
			$.each(list, function(index, r) { 
				var li = $('<li class="span3"> </li>');
				var div4 = $('<div class="product-box" id="my_reservation"> </div>');
				var span1 = $('<span class="sale_tag"> </span>');
				var p1 = $('<p class="title"> Projection name: ' + r.term.projection.name + ' <br/> Place: ' + r.term.projection.place.name + '</p> ');
				var a1 = $('<p> Date: ' + r.term.projectionDate + ' Time: ' + r.term.projectionTime +  '</p><br/>');
				var a2 = $('<p> Row: ' + r.row + ' Seat: ' + r.seatNum + '</p>');
				var a3 = $('<form> <input type="button" id='+ r.id + ' class="btn" value="Cancel" onclick="deleteRes(this)" >'+
						' </form>' );
						
				div4.append(span1);
				div4.append(p1);
				div4.append(a1);
				div4.append(a2);
				div4.append(a3);
				li.append(div4);
				$('#my_reservations').append(li);
			});
			
			$('#reservation_list').show();
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("AJAX ERROR: " + errorThrown);
		}
	})
	
	
}

function deleteRes(button){
	alert(button.id);
	
	var id = button.id;
	$.ajax({
		type : "GET",		
		url : "../reservation/cancelReservation?id=" + id,
		contentType : "application/json",
		success : function(data){
			alert(data.message);
			location.reload();
			
		},
		error : function(data){
			alert("Reservation can not be canceled.");
			location.reload();

		}
	})
}



$(document).ready(function(){
	$.ajax({
		type : 'GET',
		url : '../users/exists',
		dataType : 'json',
		async: false,
		success : function(data){
			loginUser = data.user;
			
			if (loginUser != null) {
				$('#modal_trigger').hide();
				$('#modal_trigger1').hide();
				$('#myAccount').show();
				$('#log-out').show();
				if (loginUser.role == "SYSTEM_ADMIN") {
					$('#modal_trigger_place').show();
					$('#modal_trigger_projection').hide();
				}else if (loginUser.role == "VISITOR"){
					//dodati u meni friends i reservation kartice
					var li1 = $("<li> <a href='./reservation/reservation.html'> Add Reservation </a> </li>");
					var li3 = $("<li> <a href='./reservation/reservation.html'> View Reservation </a> </li>");
					var li2 = $("<li> <a href='myFriends.html'> Friends </a> </li>");
					$("#menu_list").append(li1);
					$("#menu_list").append(li3);
					$("#menu_list").append(li2);
					
					showFriends();
					showReservation();
					
				}
			}
		}
	})
	
	
	
	showPlaces();});

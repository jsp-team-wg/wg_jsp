function pwCheck() {
    if($('.Normal').val() === "" & $('.Check').val() === ""){
        $('.Confirm')
        .text("비밀번호를 입력해주세요")
        .css("color", "gray");
    }else if ($('.Normal').val() === $('.Check').val()) {
      $('.Confirm')
        .text("입력한 비밀번호가 일치합니다")
        .css("color", "green");
    }else if($('.Normal').val() !== $('.Check').val()){
      $('.Confirm')
        .text("입력한 비밀번호와 일치하지 않습니다")
        .css("color", "red");
    }else{
        $('.Confirm')
        .text("비밀번호를 입력해주세요")
        .css("color", "gray");
    }
}

$(document).ready(function(){
    $('.Confirm')
        .text("비밀번호를 입력해주세요")
        .css("color", "gray");
});


function completeRegistration() {
    // 회원가입 폼을 가져옵니다.
    var signUpForm = document.getElementById("signup-form");
    // 회원가입 폼을 서버로 제출합니다.
    signUpForm.submit();
    
    alert("회원가입이 완료되었습니다!");
}


//성별 가져오기
function setGender(gender) {
    var genderInput = document.getElementById("userGender");
    genderInput.value = gender;
}

function idValidation(){
	let $checkMsg = $("#check-id-msg");
	let $idInput = $("#id");
	
	
	 	//중복 검사를 위한 ajax
	 	let checkId = function(){
	 		$.ajax({
	 			url : '/member/checkIdOk.me',
	 			type : 'get',
	 			data : {userId : $idInput.val()},
	 			success : function(result){
	 				console.log(result);
	 			},
	 			error : function(xhr, status, error){
	 				console.log(error);
	 			}
	 		})
	 	};
}
function validation(){
	
	let $idInput = $("#id");
	let $pwInput = $("#password");
	let $checkMsg = $("#check-id-msg");
	let $checkPwMsg = $("#check-pw-msg");
	
	
	$idInput.on('blur', function () {
	 		if($(this).val() == ''){
	 			//console.log('id 입력 안함!')
	 			$checkMsg.text('아이디를 입력하세요!')
	 		}
	 	});
	 	
	 	
	
	 
	 	$idInput.on('change', checkId);
	 
	 	//비밀번호 유효성검사
	 	// 영어 대소문자를 구분하지 않음
		// 영어, 숫자, 특수문자로 이루어진 비밀번호 8글자 이상
		const regex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[a-zA-Z\d!@#$%^&*()_+]{8,}$/;
		
		$pwInput.on('blur', function() {
			if (regex.test($pwInput.val())) {
				//console.log("비밀번호가 유효합니다.");
				$checkPwMsg.text("사용 가능한 비밀번호입니다.")
			} else {
				//console.log("올바른 비밀번호를 입력해주세요.");
				$checkPwMsg.html("사용 불가능한 비밀번호입니다.<br>영어, 숫자, 특수문자를 포함하여 8글자 이상 작성하세요")
			}
		});
	
		//약관확인하기
		$('form').on('submit', function(e) {
			e.preventDefault(); // 기본 이벤트를 막아주는 명령어(지금은 submit 이벤트)
			
			//console.log($('#agree').prop('checked'));
			
			if($('#agree').prop('checked')){
				this.submit(); // 서브밋 이벤트를 발생시키는 메소드(폼 요소에 사용해야 함)
			}else{
				alert('약관에 동의해주세요!')
			}
		});
	
	
}


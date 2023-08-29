function withdraw_confirm(){
	
	if(confirm("정말 탈퇴하시겠습니까?")){
		alert("탈퇴 완료.");
        location.replace('../../mainPage/mainPage.html');
	}else{
		alert("새로 고침");
	}
	
};


function pwCheck() {
    if($('.pwmatch-input').val() === "" && $('.pwmatch-input-check').val() === ""){
        $('.pwmatch-ment-box')
        .text("비밀번호를 입력해주세요")
        .css("color", "gray");
    }else if ($('.pwmatch-input').val() === $('.pwmatch-input-check').val()) {
      $('.pwmatch-ment-box')
        .text("변경할 비밀번호가 일치합니다")
        .css("color", "green");
    }else if($('.pwmatch-input').val() !== $('.pwmatch-input-check').val()){
      $('.pwmatch-ment-box')
        .text("변경할 비밀번호와 일치하지 않습니다")
        .css("color", "red");
    }else{
        $('.pwmatch-ment-box')
        .text("비밀번호를 입력해주세요")
        .css("color", "gray");
    }
}

$(document).ready(function(){
    $('.pwmatch-ment-box')
        .text("비밀번호를 입력해주세요")
        .css("color", "gray");
});



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


//성별 가져오기
function setGender(gender) {
    var genderInput = document.getElementById("userGender");
    genderInput.value = gender;
}


//개인정보처리 모달창으로 불러오기
$(document).ready(function () {
    $("#termOfUse").load("C:/jsp_wg_project/warigariProject/WebContent/include/termOfUse.jsp", function () {

        
    });
})

let termOfUse= document.querySelector(".main-footer-category-termOfUsetag");
let modalTermOfUse = document.querySelector(".modal-termOfUse");
let xBox = document.querySelector('.modal-termOfUse-close');
let section5 = document.querySelector('.main-section5');

termOfUse.addEventListener('click',function(event){
    event.preventDefault();
    modalTermOfUse.style.display="block";
    xBox.style.display="block";
    section5.style.display="flex";
});

xBox.addEventListener('click',function(){
    modalTermOfUse.style.display="none";
    xBox.style.display="none";
    section5.style.display="none";
});
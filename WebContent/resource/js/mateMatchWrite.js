
function updateParentInputs(placeName, roadAddress) {
    var nameInput = document.querySelector('.court-name-input-text');
    var addressInput = document.querySelector('.court-address-input-address');
    
    nameInput.value = placeName;
    addressInput.value = roadAddress;
    
    // mateCourtname 입력 요소의 disabled 속성 제거하고 값을 설정
	var courtNameInput = document.getElementById('mateCourtname');
	courtNameInput.removeAttribute('disabled');
	courtNameInput.value = placeName;
	
	// mateDate 입력 요소의 disabled 속성 제거하고 값을 설정
	var dateInput = document.getElementsByName('mateDate')[0];
	dateInput.removeAttribute('disabled');
	dateInput.value = roadAddress;
    
}

document.getElementById("openPopup").addEventListener("click", function() {
    var popupUrl = "http://localhost:8888/wg_jsp/include/mapApi.jsp";
    
    var popupWindow = window.open(popupUrl, "popupWindow", "width=1000,height=600,top=100,left=100");
    
    // 부모 창의 함수를 자식 창에서 호출할 수 있도록 전달
    popupWindow.updateParentInputs = updateParentInputs;
    popupWindow.onbeforeunload = function() {
      // 부모 창을 갱신하거나 다른 동작 수행
      //updateParentInputs(popupWindow.selectedPlaceName, popupWindow.selectedRoadAddress);
   
    };
});






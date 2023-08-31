//메인 카테고리
let comminity = document.querySelector('.main-header-category-communitytag');
let subMenu = document.querySelector('.main-sub-menu');
comminity.addEventListener('mouseover', () => {
    subMenu.style.display = 'block';
});
subMenu.addEventListener('mouseover', () => {
    subMenu.style.display = 'block';
});

comminity.addEventListener('mouseout', () => {
    subMenu.style.display = 'none';
});
subMenu.addEventListener('mouseout', () => {
    subMenu.style.display = 'none';
});

function confirmLogout() {
    if (confirm("로그아웃 하시겠습니까?")) {
        // Confirm 창에서 "네"를 누른 경우
        alert("로그아웃되었습니다!");
        document.getElementById('logoutForm').submit(); // 폼 전송을 실행합니다.
    }else{
		return false;
	}
}

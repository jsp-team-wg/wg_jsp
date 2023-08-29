
//회원탈퇴 confirm
function confirmOut() {
    if (confirm("회원을 탈퇴시키겠습니까?")) {
        alert("회원정보가 정상적으로 삭제되었습니다");
        return true;
    } else {
        return false;
    }
}
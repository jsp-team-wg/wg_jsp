
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
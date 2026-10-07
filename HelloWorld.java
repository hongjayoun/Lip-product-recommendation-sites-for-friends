<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>색상 선택기</title>
    <style>
        /* 기본 스타일 */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        #colorImages {
            display: flex;
            flex-wrap: wrap;
            gap: 10px;
        }
        .color-option {
            width: 100px; /* 이미지 크기 조정 */
            height: 100px; /* 이미지 크기 조정 */
            cursor: pointer;
            border: 2px solid transparent;
            transition: border 0.3s;
        }
        .color-option.selected {
            border: 2px solid #007BFF; /* 선택된 이미지 테두리 색상 */
        }
        #next3 {
            margin-top: 20px;
        }
    </style>
</head>
<body>

<div id="step4" class="container">
    <h2>4. 마음에 드는 사진을 선택하시오</h2>
    <div id="colorImages">
        <img src="color1.jpg" alt="Color 1" class="color-option">
        <img src="color2.jpg" alt="Color 2" class="color-option">
        <img src="color3.jpg" alt="Color 3" class="color-option">
        <img src="color4.jpg" alt="Color 4" class="color-option">
        <img src="color5.jpg" alt="Color 5" class="color-option">
        <img src="color6.jpg" alt="Color 6" class="color-option">
        <img src="color7.jpg" alt="Color 7" class="color-option">
        <img src="color8.jpg" alt="Color 8" class="color-option">
        <img src="color9.jpg" alt="Color 9" class="color-option">
        <img src="color10.jpg" alt="Color 10" class="color-option">
        <img src="color11.jpg" alt="Color 11" class="color-option">
        <img src="color12.jpg" alt="Color 12" class="color-option">
        <img src="color13.jpg" alt="Color 13" class="color-option">
        <img src="color14.jpg" alt="Color 14" class="color-option">
        <img src="color15.jpg" alt="Color 15" class="color-option">
        <img src="color16.jpg" alt="Color 16" class="color-option">
        <img src="color17.jpg" alt="Color 17" class="color-option">
    </div>
    <button id="next3" class="hidden">다음</button>
    <div id="selectedColor" style="margin-top: 20px;"></div>
</div>

<script>
    const colorOptions = document.querySelectorAll('.color-option');
    const nextButton = document.getElementById('next3');
    const selectedColorDisplay = document.getElementById('selectedColor');
    let selectedColor = '';

    colorOptions.forEach(option => {
        option.addEventListener('click', () => {
            // 선택된 이미지 강조 표시
            colorOptions.forEach(opt => opt.classList.remove('selected'));
            option.classList.add('selected');
            selectedColor = option.alt; // 선택된 색상 이름 저장
            selectedColorDisplay.textContent = `선택된 색상: ${selectedColor}`;
            nextButton.classList.remove('hidden'); // 다음 버튼 표시
        });
    });

    nextButton.addEventListener('click', () => {
        // 다음 단계로 이동하는 로직 추가
        alert(`다음 단계로 이동합니다. 선택된 색상: ${selectedColor}`);
        // 실제로는 다음 단계로 이동하는 코드 추가
    });
</script>

</body>
</html>
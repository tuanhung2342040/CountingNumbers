let addButton = document.getElementById('addbutton');
        addButton.addEventListener('click', addNum);
        function addNum(){
            let add1 = document.getElementById('addbox1');
            let add2 = document.getElementById('addbox2');
            let add3 = document.getElementById('addbox3');
            add3.value = Number(add1.value) + Number(add2.value);
        }
        let subButton = document.getElementById('subbutton');
        subButton.addEventListener('click', subtractNum);
        function subtractNum(){
            let sub1 = document.getElementById('subbox1');
            let sub2 = document.getElementById('subbox2');
            let sub3 = document.getElementById('subbox3');
            sub3.value = Number(sub1.value) - Number(sub2.value);
        }
        let mulButton = document.getElementById('mulbutton');
        mulButton.addEventListener('click', mulNum);
        function mulNum(){
            let mul1 = document.getElementById('mulbox1');
            let nul2 = document.getElementById('mulbox2');
            let mul3 = document.getElementById('mulbox3');
            mul3.value = Number(mul1.value) * Number(mul1.value);
        }
        let divButton = document.getElementById('divbutton');
        divButton.addEventListener('click', divNum)
        function divNum(){
            let div1 = document.getElementById('divbox1');
            let div2 = document.getElementById('divbox2');
            let div3 = document.getElementById('divbox3');
            div3.value = Number(div1.value)/Number(div2.value);
        }
        let sqrtButton = document.getElementById('sqrtButton');
        sqrtButton.addEventListener('click', sqrtNum);
        function sqrtNum(){
            let num = document.getElementById('sqrtbox1');
            let result = document.getElementById('sqrtbox2');
            result.value = Math.sqrt(Number(num.value));
        }
const submitBtn = document.querySelector("#submitBtn");
submitBtn.addEventListener("click", function(){
    data ={
        title : document.querySelector('#title').value,
        content : document.querySelector('#content').value
    };
    console.log(data);
    const url = '/crate/articles';
    fetch(url, {
        method : "POST",
        headers: {
            "Content-Type" : "application/json"},
        body : JSON.stringify(data)
    })
    .then(response => {
        if(!response.ok) { throw new Error("응답실패!") }
        return response.json();
    })
    .then(id => {
        console.log("저장된 엔티티 ID:", id);
        alert("등록성공");
        window.location.href="/";
    })
});

/*
동영상 /이미지 업로드 기능
채팅 기능
oauth 이용자 식별(provider)
oauth 플로우차트

*/
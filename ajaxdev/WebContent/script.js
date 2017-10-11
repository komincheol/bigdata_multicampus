var classmate=[
	{"no ": "1",
		"name":"박병규",
			"say": "화이팅"
	},
	
	{"no ": "2",
		"name":"박종봉",
			"say": "화이팅"
	}
];
var items= [];
$.each(data, function(key, val){
items.push('<li id="'+key+'">'+ val['no']+":"+val['name']+":"+val['say']+"</li>");
});
$('#rcMsg').append(items);

<html>
<head>

<script type="text/javascript" src="./js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function doSearch(){
	$("#result").load("./search.do");
}
function doSearchKey(key){
	var data=encodeURI(key.value);
	$("#result").load("./searchKey.do?key="+data);
}
</script>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="main" style="min-height: 300px;background: white;margin-left: 100px; margin-right:100px;padding: 20px;background: #f1f1f1">

<input class="form-control is-valid" type="text" name="key" placeholder="Enter symptom name" onkeyup="return doSearchKey(this)">
<a href="javascript:void(0);" onclick="return doSearch()">Show All</a>
<div id="result"></div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

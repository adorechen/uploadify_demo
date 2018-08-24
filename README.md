# uploadify_demo

uploadify official document will throw out exception, so I add the attribute fileObjName in uploadify function can solve the problem.


```html
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>UploadiFive Test</title>
    <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
    <script src="static/uploadify/jquery.uploadify.min.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="static/uploadify/uploadify.css">
    <style type="text/css">
        body {
            font: 13px Arial, Helvetica, Sans-serif;
        }
    </style>
</head>

<body>
<h1>Uploadify Demo</h1>
<form>
    <div id="queue"></div>
    <input id="file_upload" type="file" name="file_upload" />
</form>

<script type="text/javascript">
    $(function() {
        $("#file_upload").uploadify({
            'fileObjName' : 'file_upload',
            'swf'         : 'static/uploadify/uploadify.swf',
            'uploader'    : '/upload'
        });
    });
</script>
</body>
</html>
```

接受参数:
Intent intent = getIntent();
if (null != intent && null != intent.getData()) {
    // uri 就相当于 web 页面中的链接
    Uri uri = intent.getData();
    Log.e(TAG, "uri=" +uri);
    String scheme = uri.getScheme();
    String host = uri.getHost();
    int port = uri.getPort();
    String path = uri.getPath();
    String key1 = uri.getQueryParameter("key1");
    String key2 = uri.getQueryParameter("key2");
    Log.e(TAG, "scheme=" + scheme + ",host=" + host
            + ",port=" + port + ",path=" + path
            + ",query=" + uri.getQuery()
            + ",key1=" + key1 + "，key2=" + key2);
}







打印消息:
uri=myscheme://myhost:1024/main?key1=value1&key2=value2
scheme=myscheme,host=myhost,port=1024,path=/main,query=key1=value1&key2=value2,key1=value1，key2=value2


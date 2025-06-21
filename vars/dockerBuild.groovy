def call(String appName, String Image_Tag){
  docker build -t "${appName}:${Image_Tag}"
}

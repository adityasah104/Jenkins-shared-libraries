def call(String appName, String Image_Tag){
  sh "docker build -t ${appName}:${Image_Tag} ."
}

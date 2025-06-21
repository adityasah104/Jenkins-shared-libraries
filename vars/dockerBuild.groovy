def call(String appName, String ImageTag){
  docker build -t "${appName}:${ImageTag}"
}

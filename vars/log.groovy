def info(String msg) {
	echo "INFO: ${msg}"
}

def call(name = "sall") {
	echo "you call me, I answer !!, my name is ${name}"
}

def error(Map config = [name:"simo", age:"18"], script){
	echo "${config.name} called my defore, his age is ${config.age}"
	script.sh "ls -al"
}

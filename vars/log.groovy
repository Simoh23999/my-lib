def info(String msg) {
	echo "INFO: ${msg}"
}

def call(name = "sall") {
	echo "you call me, I answer !!, my name is ${name}"
}

def error(Map config, script){
	echo "${config.name} called my defore"
	script.sh "ls -al"
}

package microservices.study.alfred.microservicesinaction

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleServiceApplication

fun main(args: Array<String>) {
	runApplication<SimpleServiceApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}

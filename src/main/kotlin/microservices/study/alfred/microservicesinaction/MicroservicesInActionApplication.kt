package microservices.study.alfred.microservicesinaction

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroservicesInActionApplication

fun main(args: Array<String>) {
	runApplication<MicroservicesInActionApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}

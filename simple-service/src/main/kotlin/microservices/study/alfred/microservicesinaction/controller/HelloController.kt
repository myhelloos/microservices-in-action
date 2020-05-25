package microservices.study.alfred.microservicesinaction.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping("/{firstName}/{lastName}")
    fun hello(
            @PathVariable("firstName") firstName: String
            , @PathVariable("lastName") lastName: String
    ): String {
        return "{\"message\":\"Hello %s %s\"}".format(firstName, lastName)
    }
}
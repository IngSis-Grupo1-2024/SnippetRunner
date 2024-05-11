package modules.health

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class HealthControlller {
    @GetMapping("")
    fun health(): String {
        return "Working OK!"
    }
}